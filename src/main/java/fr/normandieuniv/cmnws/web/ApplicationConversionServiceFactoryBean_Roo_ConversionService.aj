// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fr.normandieuniv.cmnws.web;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;
import fr.normandieuniv.cmnws.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<VNormandieLeocarte, String> ApplicationConversionServiceFactoryBean.getVNormandieLeocarteToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<fr.normandieuniv.cmnws.db.VNormandieLeocarte, java.lang.String>() {
            public String convert(VNormandieLeocarte vNormandieLeocarte) {
                return new StringBuilder().append(vNormandieLeocarte.getEppn()).toString();
            }
        };
    }
    
    public Converter<String, VNormandieLeocarte> ApplicationConversionServiceFactoryBean.getIdToVNormandieLeocarteConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, fr.normandieuniv.cmnws.db.VNormandieLeocarte>() {
            public fr.normandieuniv.cmnws.db.VNormandieLeocarte convert(java.lang.String id) {
                return VNormandieLeocarte.findVNormandieLeocarte(id);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getVNormandieLeocarteToStringConverter());
        registry.addConverter(getIdToVNormandieLeocarteConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
