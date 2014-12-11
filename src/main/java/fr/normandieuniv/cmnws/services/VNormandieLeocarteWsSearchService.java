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
package fr.normandieuniv.cmnws.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;

@WebService
@Service("wsSearchService")
public class VNormandieLeocarteWsSearchService {

	private static Logger log = Logger.getLogger(VNormandieLeocarteWsSearchService.class);

	@WebMethod
	public List<VNormandieLeocarte> search(@WebParam(name = "anneeUniversitaire") String anneeUniversitaire, @WebParam(name = "eppn") String eppn, @WebParam(name = "nomSurCarte") String nom,
			@WebParam(name = "operator") Integer operator) {

		long startTime = System.currentTimeMillis();	
		log.info("search(" + anneeUniversitaire + ", " + eppn + ", " + nom + ", " + operator + ")");
		
		if(nom != null && nom.trim().isEmpty())
			nom = null;
		
		
		if(eppn != null && eppn.trim().isEmpty())
			eppn = null;
		
		List<VNormandieLeocarte> urcpmns = null;

		if (anneeUniversitaire == null) {
			throw new RuntimeException("Le paramètre anneeUniversitaire doit être renseigné");
		}

		if (eppn == null && nom == null) {
			urcpmns = VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEquals(anneeUniversitaire)
					.getResultList();
		}

		else if (eppn != null && nom == null) {
			urcpmns = VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEquals(anneeUniversitaire, eppn).getResultList();
		}

		else if (eppn == null && nom != null) {
			if (nom.length() >= 4) {
				nom = nom + '%';
			}
			urcpmns = VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike(
						anneeUniversitaire, nom).getResultList();
		}

		else if (eppn != null && nom != null) {
			if (operator == null) {
				throw new RuntimeException("eppn et nom sont renseignés, operator doit être renseigné et doit être égal à 0 ou 1");
			}
			if (operator.equals(0)) {
				if (nom.length() >= 4) {
					nom = nom + '%';
				}
				urcpmns = VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEqualsAndNomSurCarteLike(
									anneeUniversitaire, eppn, nom).getResultList();
			} else if (operator.equals(1)) {
				if (nom.length() >= 4) {
					nom = nom + '%';
				}
				urcpmns = VNormandieLeocarte
							.findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEqualsOrAnneeUniversitaireEqualsAndNomSurCarteLike(
									anneeUniversitaire, eppn, nom).getResultList();
			}
		}

		long endTime = System.currentTimeMillis();	
		double duration = (endTime - startTime)/1000.0;
		
		log.info("return " + urcpmns.size() + " in " + duration + " seconds.");
		
		return urcpmns;
	}

}
