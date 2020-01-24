/*
 * XML Type:  BusinessIndustryLicense
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML BusinessIndustryLicense(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class BusinessIndustryLicenseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense
{
    private static final long serialVersionUID = 1L;
    
    public BusinessIndustryLicenseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDUSTRYNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "industryName");
    private static final javax.xml.namespace.QName INDUSTRYCODE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "industryCode");
    private static final javax.xml.namespace.QName ISSUEDTO$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "issuedTo");
    private static final javax.xml.namespace.QName PERIOD$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "status");
    
    
    /**
     * Gets the "industryName" element
     */
    public java.lang.String getIndustryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDUSTRYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "industryName" element
     */
    public org.apache.xmlbeans.XmlString xgetIndustryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INDUSTRYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "industryName" element
     */
    public void setIndustryName(java.lang.String industryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDUSTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDUSTRYNAME$0);
            }
            target.setStringValue(industryName);
        }
    }
    
    /**
     * Sets (as xml) the "industryName" element
     */
    public void xsetIndustryName(org.apache.xmlbeans.XmlString industryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INDUSTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INDUSTRYNAME$0);
            }
            target.set(industryName);
        }
    }
    
    /**
     * Gets the "industryCode" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode getIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().find_element_user(INDUSTRYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "industryCode" element
     */
    public boolean isSetIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDUSTRYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "industryCode" element
     */
    public void setIndustryCode(ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode industryCode)
    {
        generatedSetterHelperImpl(industryCode, INDUSTRYCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "industryCode" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode addNewIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().add_element_user(INDUSTRYCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "industryCode" element
     */
    public void unsetIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDUSTRYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "issuedTo" element
     */
    public java.lang.String getIssuedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEDTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issuedTo" element
     */
    public org.apache.xmlbeans.XmlString xgetIssuedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUEDTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "issuedTo" element
     */
    public boolean isSetIssuedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUEDTO$4) != 0;
        }
    }
    
    /**
     * Sets the "issuedTo" element
     */
    public void setIssuedTo(java.lang.String issuedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUEDTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUEDTO$4);
            }
            target.setStringValue(issuedTo);
        }
    }
    
    /**
     * Sets (as xml) the "issuedTo" element
     */
    public void xsetIssuedTo(org.apache.xmlbeans.XmlString issuedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUEDTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUEDTO$4);
            }
            target.set(issuedTo);
        }
    }
    
    /**
     * Unsets the "issuedTo" element
     */
    public void unsetIssuedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUEDTO$4, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$6, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus)get_store().find_element_user(STATUS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus)get_store().add_element_user(STATUS$8);
            }
            target.set(status);
        }
    }
}
