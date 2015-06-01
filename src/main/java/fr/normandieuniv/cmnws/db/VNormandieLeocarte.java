package fr.normandieuniv.cmnws.db;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import fr.normandieuniv.cmnws.services.VNormandieLeocarteWsSearchService;

/**
 * ATTENTION :
 * On surcharge les finders de ROO car on ne souhaite pas que le like rajoute lui-même les % au début et fin de nomSurCarte !
 * @see VNormandieLeocarteWsSearchService
 */
@RooJavaBean
@RooToString
@RooDbManaged(automaticallyDelete = true)
@RooJpaActiveRecord(versionField = "", table = "V_NORMANDIE_LEOCARTE", finders = { "findVNormandieLeocartesByAnneeUniversitaireEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike"})
public class VNormandieLeocarte {

    @Id
    @Column
    private String login;

    @Column(columnDefinition = "char")
    @NotNull
    private String anneeUniversitaire;

    @Column(columnDefinition = "BIT")
    private Boolean autorisationtransmissionCrous;

    @Column(columnDefinition = "BIT")
    private Boolean autorisationDiffusionPhoto;

    @Column(name = "persID", columnDefinition = "text")
    private String persID;

    @Column(columnDefinition = "text")
    private String titreCarteLibelle;

    @Column(columnDefinition = "text")
    private String etablissementLibelle;

    @Column(columnDefinition = "text")
    private String employeur;

    @Column(columnDefinition = "text")
    private String responsabiliteStruct;

    @Column(columnDefinition = "text")
    private String cotisationParticuliere;

    public static TypedQuery<fr.normandieuniv.cmnws.db.VNormandieLeocarte> findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsOrAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String codeBaseMetier, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (nomSurCarte == null || nomSurCarte.length() == 0) throw new IllegalArgumentException("The nomSurCarte argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier  OR o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }

    public static TypedQuery<VNormandieLeocarte> findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike(String anneeUniversitaire, String codeBaseMetier, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }

    public static TypedQuery<VNormandieLeocarte> findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (nomSurCarte == null || nomSurCarte.length() == 0) throw new IllegalArgumentException("The nomSurCarte argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }
}
