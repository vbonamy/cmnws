// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fr.normandieuniv.cmnws.db;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;
import fr.normandieuniv.cmnws.db.VNormandieLeocartePK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect VNormandieLeocarte_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager VNormandieLeocarte.entityManager;
    
    public static final EntityManager VNormandieLeocarte.entityManager() {
        EntityManager em = new VNormandieLeocarte().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long VNormandieLeocarte.countVNormandieLeocartes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VNormandieLeocarte o", Long.class).getSingleResult();
    }
    
    public static List<VNormandieLeocarte> VNormandieLeocarte.findAllVNormandieLeocartes() {
        return entityManager().createQuery("SELECT o FROM VNormandieLeocarte o", VNormandieLeocarte.class).getResultList();
    }
    
    public static VNormandieLeocarte VNormandieLeocarte.findVNormandieLeocarte(VNormandieLeocartePK id) {
        if (id == null) return null;
        return entityManager().find(VNormandieLeocarte.class, id);
    }
    
    public static List<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocarteEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VNormandieLeocarte o", VNormandieLeocarte.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void VNormandieLeocarte.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void VNormandieLeocarte.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            VNormandieLeocarte attached = VNormandieLeocarte.findVNormandieLeocarte(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void VNormandieLeocarte.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void VNormandieLeocarte.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public VNormandieLeocarte VNormandieLeocarte.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        VNormandieLeocarte merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
