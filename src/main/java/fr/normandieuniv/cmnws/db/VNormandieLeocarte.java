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

@RooJavaBean
@RooToString
@RooDbManaged(automaticallyDelete = true)
@RooJpaActiveRecord(versionField = "", table = "V_NORMANDIE_LEOCARTE", finders = { "findVNormandieLeocartesByAnneeUniversitaireEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEqualsAndNomSurCarteLike" }, identifierType = VNormandieLeocartePK.class)
public class VNormandieLeocarte {

    @Id
    @Column
    private String leocode;

    @Column(columnDefinition = "char")
    @NotNull
    private String anneeUniversitaire;

    @Column(columnDefinition = "BIT")
    private Boolean autorisationtransmissionCrous;

    @Column(columnDefinition = "BIT")
    private Boolean autorisationDiffusionPhoto;

    @Column(columnDefinition = "text")
    private String typeContratLibelle;

    @Column(columnDefinition = "text")
    private String typeContratCode;

    @Column(name = "persID", columnDefinition = "text")
    private String persID;

    @Column(columnDefinition = "text")
    private String telPortableNo;

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

    public static TypedQuery<fr.normandieuniv.cmnws.db.VNormandieLeocarte> findVNormandieLeocartesByAnneeUniversitaireEqualsAndEppnEqualsOrAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String eppn, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (eppn == null || eppn.length() == 0) throw new IllegalArgumentException("The eppn argument is required");
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
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.eppn = :eppn  OR o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("eppn", eppn);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }
}
