package fr.normandieuniv.cmnws.db;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
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
@RooJpaActiveRecord(versionField = "", table = "V_NORMANDIE_LEOCARTE", finders = { "findVNormandieLeocartesByAnneeUniversitaireEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike", "findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike" }, identifierField = "eppn")
public class VNormandieLeocarte { 

    @Id
    @Column
    private String eppn;
    
    @Column(columnDefinition = "NUMBER(1)")
    private Boolean autorisationtransmissionCrous;
    
    @Column(columnDefinition = "NUMBER(1)")
    private Boolean autorisationDiffusionPhoto;

    @Column(columnDefinition = "char")
    @NotNull
    private String anneeUniversitaire;

    @Column(columnDefinition = "text")
    private String titreCarteLibelle;

    @Column(columnDefinition = "text")
    private String responsabiliteStruct;

    @Column(name = "typePopulationCode", length = 2)
    private String typePopulationCode;
    
    @Column(name = "typeVisuelCode", length = 1)
    private String typeVisuelCode;
    
    @Column(name = "prefixeLeoCode", length = 5)
    private String prefixeLeoCode;
    
    @Column(name = "codeBaseMetier", length = 8)
    private String codeBaseMetier;
    
    @Column(name = "buNo", length = 8)
    private String buNo;
    
    @Column(name = "ine", length = 11)
    private String ine;
    
    @Column(name = "nomSurCarte", length = 40)
    private String nomSurCarte;
    
    @Column(name = "prenom", length = 255)
    private String prenom;
    
    @Column(name = "dateNaissance")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date dateNaissance;
    
    @Column(name = "email", length = 120)
    private String email;
    
    @Column(name = "dateFinDroits")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date dateFinDroits;
    
    @Column(name = "affectation1Code", length = 6)
    private String affectation1code;
    
    @Column(name = "affectationRNE", length = 8)
    private String affectationRne;
    
    @Column(name = "affectation1Libelle", length = 60)
    private String affectation1libelle;
    
    @Column(name = "affectation2Code", length = 6)
    private String affectation2code;
    
    @Column(name = "affectation2Libelle", length = 60)
    private String affectation2libelle;
    
    @Column(name = "corps", length = 40)
    private String corps;
    
    @Column(name = "indiceInm", length = 6)
    private String indiceInm;
    
    @Column(name = "disciplineLibelle", length = 150)
    private String disciplineLibelle;
    
    @Column(name = "disciplineCode", length = 150)
    private String disciplineCode;
    
    @Column(name = "versionVetCode", length = 40)
    private String versionVetCode;
    
    @Column(name = "etapeLibelle", length = 25)
    private String etapeLibelle;
    
    @Column(name = "etapeCode", length = 6)
    private String etapeCode;
    
    @Column(name = "etapeSecondeCode", length = 6)
    private String etapeSecondeCode;
    
    @Column(name = "versionVETSecondeCode", length = 40)
    private String versionVetsecondeCode;
    
    @Column(name = "etapeSecondeLibelle", length = 25)
    private String etapeSecondeLibelle;
    
    @Column(name = "cgeCode", length = 3)
    private String cgeCode;
    
    @Column(name = "cgeLibelle", length = 40)
    private String cgeLibelle;
    
    @Column(name = "centreSecuCode", length = 3)
    private String centreSecuCode;
    
    @Column(name = "centreSecuLibelle", length = 10)
    private String centreSecuLibelle;
    
    @Column(name = "champlibre1", length = 30)
    private String champlibre1;
    
    @Column(name = "champlibre2", length = 30)
    private String champlibre2;
    
    @Column(name = "champlibre3", length = 30)
    private String champlibre3;
    
    @Column(name = "champlibre4", length = 30)
    private String champlibre4;
    
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

	public Boolean getAutorisationtransmissionCrous() {
		return autorisationtransmissionCrous;
	}

	public void setAutorisationtransmissionCrous(
			Boolean autorisationtransmissionCrous) {
		this.autorisationtransmissionCrous = autorisationtransmissionCrous;
	}

	public Boolean getAutorisationDiffusionPhoto() {
		return autorisationDiffusionPhoto;
	}

	public void setAutorisationDiffusionPhoto(Boolean autorisationDiffusionPhoto) {
		this.autorisationDiffusionPhoto = autorisationDiffusionPhoto;
	}

}
