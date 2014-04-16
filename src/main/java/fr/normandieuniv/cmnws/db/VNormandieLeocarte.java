package fr.normandieuniv.cmnws.db;

import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(identifierType = VNormandieLeocartePK.class, versionField = "", table = "V_NORMANDIE_LEOCARTE")
@RooDbManaged(automaticallyDelete = true)
public class VNormandieLeocarte {
}
