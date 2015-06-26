// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fr.normandieuniv.cmnws.db;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect VNormandieLeocarte_Roo_Finder {
    
    public static Long VNormandieLeocarte.countFindVNormandieLeocartesByAnneeUniversitaireEquals(String anneeUniversitaire) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire", Long.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        return ((Long) q.getSingleResult());
    }
    
    public static Long VNormandieLeocarte.countFindVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals(String anneeUniversitaire, String codeBaseMetier) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier", Long.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        return ((Long) q.getSingleResult());
    }
    
    public static Long VNormandieLeocarte.countFindVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike(String anneeUniversitaire, String codeBaseMetier, String nomSurCarte) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        if (nomSurCarte == null || nomSurCarte.length() == 0) throw new IllegalArgumentException("The nomSurCarte argument is required");
        nomSurCarte = nomSurCarte.replace('*', '%');
        if (nomSurCarte.charAt(0) != '%') {
            nomSurCarte = "%" + nomSurCarte;
        }
        if (nomSurCarte.charAt(nomSurCarte.length() - 1) != '%') {
            nomSurCarte = nomSurCarte + "%";
        }
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", Long.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        q.setParameter("nomSurCarte", nomSurCarte);
        return ((Long) q.getSingleResult());
    }
    
    public static Long VNormandieLeocarte.countFindVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String nomSurCarte) {
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
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)", Long.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEquals(String anneeUniversitaire) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        return q;
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEquals(String anneeUniversitaire, String sortFieldName, String sortOrder) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<VNormandieLeocarte> q = em.createQuery(queryBuilder.toString(), VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        return q;
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals(String anneeUniversitaire, String codeBaseMetier) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        TypedQuery<VNormandieLeocarte> q = em.createQuery("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier", VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        return q;
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEquals(String anneeUniversitaire, String codeBaseMetier, String sortFieldName, String sortOrder) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        EntityManager em = VNormandieLeocarte.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<VNormandieLeocarte> q = em.createQuery(queryBuilder.toString(), VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        return q;
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndCodeBaseMetierEqualsAndNomSurCarteLike(String anneeUniversitaire, String codeBaseMetier, String nomSurCarte, String sortFieldName, String sortOrder) {
        if (anneeUniversitaire == null || anneeUniversitaire.length() == 0) throw new IllegalArgumentException("The anneeUniversitaire argument is required");
        if (codeBaseMetier == null || codeBaseMetier.length() == 0) throw new IllegalArgumentException("The codeBaseMetier argument is required");
        if (nomSurCarte == null || nomSurCarte.length() == 0) throw new IllegalArgumentException("The nomSurCarte argument is required");
        nomSurCarte = nomSurCarte.replace('*', '%');
        if (nomSurCarte.charAt(0) != '%') {
            nomSurCarte = "%" + nomSurCarte;
        }
        if (nomSurCarte.charAt(nomSurCarte.length() - 1) != '%') {
            nomSurCarte = nomSurCarte + "%";
        }
        EntityManager em = VNormandieLeocarte.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND o.codeBaseMetier = :codeBaseMetier  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<VNormandieLeocarte> q = em.createQuery(queryBuilder.toString(), VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("codeBaseMetier", codeBaseMetier);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }
    
    public static TypedQuery<VNormandieLeocarte> VNormandieLeocarte.findVNormandieLeocartesByAnneeUniversitaireEqualsAndNomSurCarteLike(String anneeUniversitaire, String nomSurCarte, String sortFieldName, String sortOrder) {
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
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM VNormandieLeocarte AS o WHERE o.anneeUniversitaire = :anneeUniversitaire  AND LOWER(o.nomSurCarte) LIKE LOWER(:nomSurCarte)");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<VNormandieLeocarte> q = em.createQuery(queryBuilder.toString(), VNormandieLeocarte.class);
        q.setParameter("anneeUniversitaire", anneeUniversitaire);
        q.setParameter("nomSurCarte", nomSurCarte);
        return q;
    }
    
}
