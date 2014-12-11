/**
 * Licensed to Universite de Rouen under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * Universite de Rouen licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.normandieuniv.cmnws.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;
import fr.normandieuniv.cmnws.services.VNormandieLeocarteWsSearchService;

@RequestMapping("/searchwstest/**")
@Controller
public class WsSearchServiceTestController {

	@Resource
	VNormandieLeocarteWsSearchService wsSearchService;
    
    @RequestMapping(value="search", method = RequestMethod.GET)
    public String searchWs(@RequestParam(required=false) String anneeUniversitaire, @RequestParam(required=false) String eppn, @RequestParam(required=false) String nomSurCarte, @RequestParam(required=false, value="operator") String operatorStr, Model uiModel) {
    	Integer operator = null;
    	if(operatorStr != null && operatorStr.trim().length()!=0) {
    		operator = Integer.valueOf(operatorStr);
    	}
    	if(eppn != null && eppn.trim().length()==0) {
    		eppn = null;
    	}
    	if(anneeUniversitaire != null && anneeUniversitaire.trim().length()==0) {
    		anneeUniversitaire = null;
    	}
    	List<VNormandieLeocarte> vnormandieleocartes = wsSearchService.search(anneeUniversitaire, eppn, nomSurCarte, operator);
        uiModel.addAttribute("vnormandieleocartes", vnormandieleocartes);
        return "vnormandieleocarte/list";
    }
    
    @RequestMapping
    public String index() {
        return "searchwstest/index";
    }
}
