package fr.normandieuniv.cmnws.db;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(versionField = "", table = "V_NORMANDIE_LEOCARTE", finders = { "findVNormandieLeocartesByAnneeUniversitaireEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsOrAnneeUniversitaireEqualsAndNomSurCarteLike" })
@RooDbManaged(automaticallyDelete = true)
public class VNormandieLeocarte {
	
    @Id
    @Column(name = "leocode")
    private String leocode;
    
}
