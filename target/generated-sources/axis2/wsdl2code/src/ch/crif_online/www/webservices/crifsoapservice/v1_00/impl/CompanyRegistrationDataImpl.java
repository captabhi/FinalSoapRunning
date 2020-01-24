/*
 * XML Type:  CompanyRegistrationData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyRegistrationData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyRegistrationDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData
{
    private static final long serialVersionUID = 1L;
    
    public CompanyRegistrationDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTEREDOFFICECITY$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "registeredOfficeCity");
    private static final javax.xml.namespace.QName FOUNDINGDATE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "foundingDate");
    private static final javax.xml.namespace.QName CAPITAL$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "capital");
    private static final javax.xml.namespace.QName CAPITALPAYED$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "capitalPayed");
    private static final javax.xml.namespace.QName CAPITALINKIND$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "capitalInKind");
    private static final javax.xml.namespace.QName AUDITINGCOMPANY$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "auditingCompany");
    private static final javax.xml.namespace.QName HASAUDITINGCOMPANY$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "hasAuditingCompany");
    private static final javax.xml.namespace.QName PURPOSE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "purpose");
    
    
    /**
     * Gets the "registeredOfficeCity" element
     */
    public java.lang.String getRegisteredOfficeCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTEREDOFFICECITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "registeredOfficeCity" element
     */
    public org.apache.xmlbeans.XmlString xgetRegisteredOfficeCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTEREDOFFICECITY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "registeredOfficeCity" element
     */
    public boolean isSetRegisteredOfficeCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTEREDOFFICECITY$0) != 0;
        }
    }
    
    /**
     * Sets the "registeredOfficeCity" element
     */
    public void setRegisteredOfficeCity(java.lang.String registeredOfficeCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTEREDOFFICECITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTEREDOFFICECITY$0);
            }
            target.setStringValue(registeredOfficeCity);
        }
    }
    
    /**
     * Sets (as xml) the "registeredOfficeCity" element
     */
    public void xsetRegisteredOfficeCity(org.apache.xmlbeans.XmlString registeredOfficeCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTEREDOFFICECITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGISTEREDOFFICECITY$0);
            }
            target.set(registeredOfficeCity);
        }
    }
    
    /**
     * Unsets the "registeredOfficeCity" element
     */
    public void unsetRegisteredOfficeCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTEREDOFFICECITY$0, 0);
        }
    }
    
    /**
     * Gets the "foundingDate" element
     */
    public java.lang.String getFoundingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOUNDINGDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "foundingDate" element
     */
    public org.apache.xmlbeans.XmlString xgetFoundingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOUNDINGDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "foundingDate" element
     */
    public boolean isSetFoundingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDINGDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "foundingDate" element
     */
    public void setFoundingDate(java.lang.String foundingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOUNDINGDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOUNDINGDATE$2);
            }
            target.setStringValue(foundingDate);
        }
    }
    
    /**
     * Sets (as xml) the "foundingDate" element
     */
    public void xsetFoundingDate(org.apache.xmlbeans.XmlString foundingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOUNDINGDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FOUNDINGDATE$2);
            }
            target.set(foundingDate);
        }
    }
    
    /**
     * Unsets the "foundingDate" element
     */
    public void unsetFoundingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDINGDATE$2, 0);
        }
    }
    
    /**
     * Gets the "capital" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(CAPITAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "capital" element
     */
    public boolean isSetCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITAL$4) != 0;
        }
    }
    
    /**
     * Sets the "capital" element
     */
    public void setCapital(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount capital)
    {
        generatedSetterHelperImpl(capital, CAPITAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "capital" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(CAPITAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "capital" element
     */
    public void unsetCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITAL$4, 0);
        }
    }
    
    /**
     * Gets the "capitalPayed" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getCapitalPayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(CAPITALPAYED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "capitalPayed" element
     */
    public boolean isSetCapitalPayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITALPAYED$6) != 0;
        }
    }
    
    /**
     * Sets the "capitalPayed" element
     */
    public void setCapitalPayed(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount capitalPayed)
    {
        generatedSetterHelperImpl(capitalPayed, CAPITALPAYED$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "capitalPayed" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewCapitalPayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(CAPITALPAYED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "capitalPayed" element
     */
    public void unsetCapitalPayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITALPAYED$6, 0);
        }
    }
    
    /**
     * Gets the "capitalInKind" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getCapitalInKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALINKIND$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "capitalInKind" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetCapitalInKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(CAPITALINKIND$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "capitalInKind" element
     */
    public boolean isSetCapitalInKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITALINKIND$8) != 0;
        }
    }
    
    /**
     * Sets the "capitalInKind" element
     */
    public void setCapitalInKind(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum capitalInKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALINKIND$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITALINKIND$8);
            }
            target.setEnumValue(capitalInKind);
        }
    }
    
    /**
     * Sets (as xml) the "capitalInKind" element
     */
    public void xsetCapitalInKind(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean capitalInKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(CAPITALINKIND$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(CAPITALINKIND$8);
            }
            target.set(capitalInKind);
        }
    }
    
    /**
     * Unsets the "capitalInKind" element
     */
    public void unsetCapitalInKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITALINKIND$8, 0);
        }
    }
    
    /**
     * Gets the "auditingCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(AUDITINGCOMPANY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auditingCompany" element
     */
    public boolean isSetAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITINGCOMPANY$10) != 0;
        }
    }
    
    /**
     * Sets the "auditingCompany" element
     */
    public void setAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData auditingCompany)
    {
        generatedSetterHelperImpl(auditingCompany, AUDITINGCOMPANY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auditingCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(AUDITINGCOMPANY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "auditingCompany" element
     */
    public void unsetAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITINGCOMPANY$10, 0);
        }
    }
    
    /**
     * Gets the "hasAuditingCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus.Enum getHasAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASAUDITINGCOMPANY$12, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasAuditingCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus xgetHasAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus)get_store().find_element_user(HASAUDITINGCOMPANY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasAuditingCompany" element
     */
    public boolean isSetHasAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASAUDITINGCOMPANY$12) != 0;
        }
    }
    
    /**
     * Sets the "hasAuditingCompany" element
     */
    public void setHasAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus.Enum hasAuditingCompany)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASAUDITINGCOMPANY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASAUDITINGCOMPANY$12);
            }
            target.setEnumValue(hasAuditingCompany);
        }
    }
    
    /**
     * Sets (as xml) the "hasAuditingCompany" element
     */
    public void xsetHasAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus hasAuditingCompany)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus)get_store().find_element_user(HASAUDITINGCOMPANY$12, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus)get_store().add_element_user(HASAUDITINGCOMPANY$12);
            }
            target.set(hasAuditingCompany);
        }
    }
    
    /**
     * Unsets the "hasAuditingCompany" element
     */
    public void unsetHasAuditingCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASAUDITINGCOMPANY$12, 0);
        }
    }
    
    /**
     * Gets the "purpose" element
     */
    public java.lang.String getPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURPOSE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "purpose" element
     */
    public org.apache.xmlbeans.XmlString xgetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURPOSE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "purpose" element
     */
    public boolean isSetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURPOSE$14) != 0;
        }
    }
    
    /**
     * Sets the "purpose" element
     */
    public void setPurpose(java.lang.String purpose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURPOSE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURPOSE$14);
            }
            target.setStringValue(purpose);
        }
    }
    
    /**
     * Sets (as xml) the "purpose" element
     */
    public void xsetPurpose(org.apache.xmlbeans.XmlString purpose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURPOSE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PURPOSE$14);
            }
            target.set(purpose);
        }
    }
    
    /**
     * Unsets the "purpose" element
     */
    public void unsetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURPOSE$14, 0);
        }
    }
}
