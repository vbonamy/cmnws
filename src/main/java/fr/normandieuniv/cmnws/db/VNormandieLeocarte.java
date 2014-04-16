package fr.normandieuniv.cmnws.db;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.TypedQuery;

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
 
    
    
    public static TypedQuery<VNormandieLeocarte> findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsOrAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String codeBaseMetier, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (nomSurCarte == null || nomSurCarte.length() == 0) throw new IllegalArgumentException("The nomSurCarte argument is required");
        nomSurCarte = nomSurCarte.replace('*', '%');
        if (nomSurCarte.charAt(0) != '%') {
            nomSurCarte = "%" + nomSurCarte;
        }
        if (nomSurCarte.charAt(nomSurCarte.length() - 1) != '%') {
            nomSurCarte = nomSurCarte + "%";
        }
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier  OR o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }
    
}
