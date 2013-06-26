// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fr.normandieuniv.cpmnws.db;

import fr.normandieuniv.cpmnws.db.CpmnPerso;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect CpmnPerso_Roo_Finder {
    
    public static TypedQuery<CpmnPerso> CpmnPerso.findCpmnPersoesByAnneeUnivEquals(BigDecimal anneeUniv) {
        if (anneeUniv == null) throw new IllegalArgumentException("The anneeUniv argument is required");
        EntityManager em = CpmnPerso.entityManager();
        TypedQuery<CpmnPerso> q = em.createQuery("SELECT o FROM CpmnPerso AS o WHERE o.anneeUniv = :anneeUniv", CpmnPerso.class);
        q.setParameter("anneeUniv", anneeUniv);
        return q;
    }
    
    public static TypedQuery<CpmnPerso> CpmnPerso.findCpmnPersoesByAnneeUnivEqualsAndNoIndividuEquals(BigDecimal anneeUniv, BigDecimal noIndividu) {
        if (anneeUniv == null) throw new IllegalArgumentException("The anneeUniv argument is required");
        if (noIndividu == null) throw new IllegalArgumentException("The noIndividu argument is required");
        EntityManager em = CpmnPerso.entityManager();
        TypedQuery<CpmnPerso> q = em.createQuery("SELECT o FROM CpmnPerso AS o WHERE o.anneeUniv = :anneeUniv  AND o.noIndividu = :noIndividu", CpmnPerso.class);
        q.setParameter("anneeUniv", anneeUniv);
        q.setParameter("noIndividu", noIndividu);
        return q;
    }
    
}
