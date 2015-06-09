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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;

@RequestMapping("/vnormandieleocarte")
@Controller
@RooWebScaffold(path = "vnormandieleocarte", formBackingObject = VNormandieLeocarte.class, create = false, delete = false, update = false)
@RooWebFinder
public class VNormandieLeocarteController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value = "/{eppn:.+}", produces = "text/html")
    public String show(@PathVariable("eppn") String eppn, Model uiModel) {
        uiModel.addAttribute("vnormandieleocarte_", VNormandieLeocarte.findVNormandieLeocarte(eppn));
        uiModel.addAttribute("itemId", eppn);
        return "vnormandieleocarte/show";
    }
    
    @RequestMapping(produces = "text/html", value="")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("vnormandieleocartes", VNormandieLeocarte.findVNormandieLeocarteEntries(firstResult, sizeNo));
            float nrOfPages = (float) VNormandieLeocarte.countVNormandieLeocartes() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("vnormandieleocartes", VNormandieLeocarte.findAllVNormandieLeocartes());
        }
        return "vnormandieleocarte/list";
    }
}
