// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fr.normandieuniv.cmnws.db;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

privileged aspect VNormandieLeocarte_Roo_DbManaged {
    
    @Column(name = "TYPEPOPULATIONCODE", length = 2)
    private String VNormandieLeocarte.typepopulationcode;
    
    @Column(name = "TYPEVISUELCODE", length = 1)
    private String VNormandieLeocarte.typevisuelcode;
    
    @Column(name = "TITRECARTELIBELLE", length = 60)
    private String VNormandieLeocarte.titrecartelibelle;
    
    @Column(name = "PREFIXELEOCODE", length = 5)
    private String VNormandieLeocarte.prefixeleocode;
    
    @Column(name = "BUNO", length = 8)
    private String VNormandieLeocarte.buno;
    
    @Column(name = "INE", length = 11)
    private String VNormandieLeocarte.ine;
    
    @Column(name = "NOMSURCARTE", length = 40)
    private String VNormandieLeocarte.nomsurcarte;
    
    @Column(name = "PRENOM", length = 255)
    private String VNormandieLeocarte.prenom;
    
    @Column(name = "DATENAISSANCE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar VNormandieLeocarte.datenaissance;
    
    @Column(name = "EMAIL", length = 120)
    private String VNormandieLeocarte.email;
    
    @Column(name = "DATEFINDROITS")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar VNormandieLeocarte.datefindroits;
    
    @Column(name = "ANNEEUNIVERSITAIRE", length = 4)
    @NotNull
    private String VNormandieLeocarte.anneeuniversitaire;
    
    @Column(name = "AFFECTATION1CODE", length = 6)
    private String VNormandieLeocarte.affectation1code;
    
    @Column(name = "AFFECTATIONRNE", length = 8)
    private String VNormandieLeocarte.affectationrne;
    
    @Column(name = "AFFECTATION1LIBELLE", length = 60)
    private String VNormandieLeocarte.affectation1libelle;
    
    @Column(name = "AFFECTATION2CODE", length = 6)
    private String VNormandieLeocarte.affectation2code;
    
    @Column(name = "AFFECTATION2LIBELLE", length = 60)
    private String VNormandieLeocarte.affectation2libelle;
    
    @Column(name = "CORPS", length = 40)
    private String VNormandieLeocarte.corps;
    
    @Column(name = "RESPONSABILITESTRUCT", length = 60)
    private String VNormandieLeocarte.responsabilitestruct;
    
    @Column(name = "INDICEINM", length = 6)
    private String VNormandieLeocarte.indiceinm;
    
    @Column(name = "DISCIPLINELIBELLE", length = 150)
    private String VNormandieLeocarte.disciplinelibelle;
    
    @Column(name = "DISCIPLINECODE", length = 150)
    private String VNormandieLeocarte.disciplinecode;
    
    @Column(name = "VERSIONVETCODE", length = 40)
    private String VNormandieLeocarte.versionvetcode;
    
    @Column(name = "ETAPELIBELLE", length = 25)
    private String VNormandieLeocarte.etapelibelle;
    
    @Column(name = "ETAPECODE", length = 6)
    private String VNormandieLeocarte.etapecode;
    
    @Column(name = "ETAPESECONDECODE", length = 6)
    private String VNormandieLeocarte.etapesecondecode;
    
    @Column(name = "VERSIONVETSECONDECODE", length = 40)
    private String VNormandieLeocarte.versionvetsecondecode;
    
    @Column(name = "ETAPESECONDELIBELLE", length = 25)
    private String VNormandieLeocarte.etapesecondelibelle;
    
    @Column(name = "CGECODE", length = 3)
    private String VNormandieLeocarte.cgecode;
    
    @Column(name = "CGELIBELLE", length = 40)
    private String VNormandieLeocarte.cgelibelle;
    
    @Column(name = "CENTRESECUCODE", length = 3)
    private String VNormandieLeocarte.centresecucode;
    
    @Column(name = "CENTRESECULIBELLE", length = 10)
    private String VNormandieLeocarte.centreseculibelle;
    
    @Column(name = "AUTORISATIONTRANSMISSIONCROUS", precision = 1)
    private BigDecimal VNormandieLeocarte.autorisationtransmissioncrous;
    
    @Column(name = "AUTORISATIONDIFFUSIONPHOTO", precision = 1)
    private BigDecimal VNormandieLeocarte.autorisationdiffusionphoto;
    
    @Column(name = "CHAMPLIBRE1", length = 30)
    private String VNormandieLeocarte.champlibre1;
    
    @Column(name = "CHAMPLIBRE2", length = 30)
    private String VNormandieLeocarte.champlibre2;
    
    @Column(name = "CHAMPLIBRE3", length = 30)
    private String VNormandieLeocarte.champlibre3;
    
    @Column(name = "CHAMPLIBRE4", length = 30)
    private String VNormandieLeocarte.champlibre4;
    
    public String VNormandieLeocarte.getTypepopulationcode() {
        return typepopulationcode;
    }
    
    public void VNormandieLeocarte.setTypepopulationcode(String typepopulationcode) {
        this.typepopulationcode = typepopulationcode;
    }
    
    public String VNormandieLeocarte.getTypevisuelcode() {
        return typevisuelcode;
    }
    
    public void VNormandieLeocarte.setTypevisuelcode(String typevisuelcode) {
        this.typevisuelcode = typevisuelcode;
    }
    
    public String VNormandieLeocarte.getTitrecartelibelle() {
        return titrecartelibelle;
    }
    
    public void VNormandieLeocarte.setTitrecartelibelle(String titrecartelibelle) {
        this.titrecartelibelle = titrecartelibelle;
    }
    
    public String VNormandieLeocarte.getPrefixeleocode() {
        return prefixeleocode;
    }
    
    public void VNormandieLeocarte.setPrefixeleocode(String prefixeleocode) {
        this.prefixeleocode = prefixeleocode;
    }
    
    public String VNormandieLeocarte.getBuno() {
        return buno;
    }
    
    public void VNormandieLeocarte.setBuno(String buno) {
        this.buno = buno;
    }
    
    public String VNormandieLeocarte.getIne() {
        return ine;
    }
    
    public void VNormandieLeocarte.setIne(String ine) {
        this.ine = ine;
    }
    
    public String VNormandieLeocarte.getNomsurcarte() {
        return nomsurcarte;
    }
    
    public void VNormandieLeocarte.setNomsurcarte(String nomsurcarte) {
        this.nomsurcarte = nomsurcarte;
    }
    
    public String VNormandieLeocarte.getPrenom() {
        return prenom;
    }
    
    public void VNormandieLeocarte.setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public Calendar VNormandieLeocarte.getDatenaissance() {
        return datenaissance;
    }
    
    public void VNormandieLeocarte.setDatenaissance(Calendar datenaissance) {
        this.datenaissance = datenaissance;
    }
    
    public String VNormandieLeocarte.getEmail() {
        return email;
    }
    
    public void VNormandieLeocarte.setEmail(String email) {
        this.email = email;
    }
    
    public Calendar VNormandieLeocarte.getDatefindroits() {
        return datefindroits;
    }
    
    public void VNormandieLeocarte.setDatefindroits(Calendar datefindroits) {
        this.datefindroits = datefindroits;
    }
    
    public String VNormandieLeocarte.getAnneeuniversitaire() {
        return anneeuniversitaire;
    }
    
    public void VNormandieLeocarte.setAnneeuniversitaire(String anneeuniversitaire) {
        this.anneeuniversitaire = anneeuniversitaire;
    }
    
    public String VNormandieLeocarte.getAffectation1code() {
        return affectation1code;
    }
    
    public void VNormandieLeocarte.setAffectation1code(String affectation1code) {
        this.affectation1code = affectation1code;
    }
    
    public String VNormandieLeocarte.getAffectationrne() {
        return affectationrne;
    }
    
    public void VNormandieLeocarte.setAffectationrne(String affectationrne) {
        this.affectationrne = affectationrne;
    }
    
    public String VNormandieLeocarte.getAffectation1libelle() {
        return affectation1libelle;
    }
    
    public void VNormandieLeocarte.setAffectation1libelle(String affectation1libelle) {
        this.affectation1libelle = affectation1libelle;
    }
    
    public String VNormandieLeocarte.getAffectation2code() {
        return affectation2code;
    }
    
    public void VNormandieLeocarte.setAffectation2code(String affectation2code) {
        this.affectation2code = affectation2code;
    }
    
    public String VNormandieLeocarte.getAffectation2libelle() {
        return affectation2libelle;
    }
    
    public void VNormandieLeocarte.setAffectation2libelle(String affectation2libelle) {
        this.affectation2libelle = affectation2libelle;
    }
    
    public String VNormandieLeocarte.getCorps() {
        return corps;
    }
    
    public void VNormandieLeocarte.setCorps(String corps) {
        this.corps = corps;
    }
    
    public String VNormandieLeocarte.getResponsabilitestruct() {
        return responsabilitestruct;
    }
    
    public void VNormandieLeocarte.setResponsabilitestruct(String responsabilitestruct) {
        this.responsabilitestruct = responsabilitestruct;
    }
    
    public String VNormandieLeocarte.getIndiceinm() {
        return indiceinm;
    }
    
    public void VNormandieLeocarte.setIndiceinm(String indiceinm) {
        this.indiceinm = indiceinm;
    }
    
    public String VNormandieLeocarte.getDisciplinelibelle() {
        return disciplinelibelle;
    }
    
    public void VNormandieLeocarte.setDisciplinelibelle(String disciplinelibelle) {
        this.disciplinelibelle = disciplinelibelle;
    }
    
    public String VNormandieLeocarte.getDisciplinecode() {
        return disciplinecode;
    }
    
    public void VNormandieLeocarte.setDisciplinecode(String disciplinecode) {
        this.disciplinecode = disciplinecode;
    }
    
    public String VNormandieLeocarte.getVersionvetcode() {
        return versionvetcode;
    }
    
    public void VNormandieLeocarte.setVersionvetcode(String versionvetcode) {
        this.versionvetcode = versionvetcode;
    }
    
    public String VNormandieLeocarte.getEtapelibelle() {
        return etapelibelle;
    }
    
    public void VNormandieLeocarte.setEtapelibelle(String etapelibelle) {
        this.etapelibelle = etapelibelle;
    }
    
    public String VNormandieLeocarte.getEtapecode() {
        return etapecode;
    }
    
    public void VNormandieLeocarte.setEtapecode(String etapecode) {
        this.etapecode = etapecode;
    }
    
    public String VNormandieLeocarte.getEtapesecondecode() {
        return etapesecondecode;
    }
    
    public void VNormandieLeocarte.setEtapesecondecode(String etapesecondecode) {
        this.etapesecondecode = etapesecondecode;
    }
    
    public String VNormandieLeocarte.getVersionvetsecondecode() {
        return versionvetsecondecode;
    }
    
    public void VNormandieLeocarte.setVersionvetsecondecode(String versionvetsecondecode) {
        this.versionvetsecondecode = versionvetsecondecode;
    }
    
    public String VNormandieLeocarte.getEtapesecondelibelle() {
        return etapesecondelibelle;
    }
    
    public void VNormandieLeocarte.setEtapesecondelibelle(String etapesecondelibelle) {
        this.etapesecondelibelle = etapesecondelibelle;
    }
    
    public String VNormandieLeocarte.getCgecode() {
        return cgecode;
    }
    
    public void VNormandieLeocarte.setCgecode(String cgecode) {
        this.cgecode = cgecode;
    }
    
    public String VNormandieLeocarte.getCgelibelle() {
        return cgelibelle;
    }
    
    public void VNormandieLeocarte.setCgelibelle(String cgelibelle) {
        this.cgelibelle = cgelibelle;
    }
    
    public String VNormandieLeocarte.getCentresecucode() {
        return centresecucode;
    }
    
    public void VNormandieLeocarte.setCentresecucode(String centresecucode) {
        this.centresecucode = centresecucode;
    }
    
    public String VNormandieLeocarte.getCentreseculibelle() {
        return centreseculibelle;
    }
    
    public void VNormandieLeocarte.setCentreseculibelle(String centreseculibelle) {
        this.centreseculibelle = centreseculibelle;
    }
    
    public BigDecimal VNormandieLeocarte.getAutorisationtransmissioncrous() {
        return autorisationtransmissioncrous;
    }
    
    public void VNormandieLeocarte.setAutorisationtransmissioncrous(BigDecimal autorisationtransmissioncrous) {
        this.autorisationtransmissioncrous = autorisationtransmissioncrous;
    }
    
    public BigDecimal VNormandieLeocarte.getAutorisationdiffusionphoto() {
        return autorisationdiffusionphoto;
    }
    
    public void VNormandieLeocarte.setAutorisationdiffusionphoto(BigDecimal autorisationdiffusionphoto) {
        this.autorisationdiffusionphoto = autorisationdiffusionphoto;
    }
    
    public String VNormandieLeocarte.getChamplibre1() {
        return champlibre1;
    }
    
    public void VNormandieLeocarte.setChamplibre1(String champlibre1) {
        this.champlibre1 = champlibre1;
    }
    
    public String VNormandieLeocarte.getChamplibre2() {
        return champlibre2;
    }
    
    public void VNormandieLeocarte.setChamplibre2(String champlibre2) {
        this.champlibre2 = champlibre2;
    }
    
    public String VNormandieLeocarte.getChamplibre3() {
        return champlibre3;
    }
    
    public void VNormandieLeocarte.setChamplibre3(String champlibre3) {
        this.champlibre3 = champlibre3;
    }
    
    public String VNormandieLeocarte.getChamplibre4() {
        return champlibre4;
    }
    
    public void VNormandieLeocarte.setChamplibre4(String champlibre4) {
        this.champlibre4 = champlibre4;
    }
    
}
