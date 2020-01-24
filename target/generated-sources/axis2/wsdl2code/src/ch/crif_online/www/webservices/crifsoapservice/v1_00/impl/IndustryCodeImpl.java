/*
 * XML Type:  IndustryCode
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IndustryCode(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IndustryCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode
{
    private static final long serialVersionUID = 1L;
    
    public IndustryCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "type");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "code");
    private static final javax.xml.namespace.QName CODEDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "codeDescription");
    private static final javax.xml.namespace.QName ISMAININDUSTRYCODE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isMainIndustryCode");
    private static final javax.xml.namespace.QName PERIOD$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "codeDescription" element
     */
    public java.lang.String getCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODEDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "codeDescription" element
     */
    public boolean isSetCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "codeDescription" element
     */
    public void setCodeDescription(java.lang.String codeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEDESCRIPTION$4);
            }
            target.setStringValue(codeDescription);
        }
    }
    
    /**
     * Sets (as xml) the "codeDescription" element
     */
    public void xsetCodeDescription(org.apache.xmlbeans.XmlString codeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODEDESCRIPTION$4);
            }
            target.set(codeDescription);
        }
    }
    
    /**
     * Unsets the "codeDescription" element
     */
    public void unsetCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "isMainIndustryCode" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsMainIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMAININDUSTRYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMainIndustryCode" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsMainIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISMAININDUSTRYCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "isMainIndustryCode" element
     */
    public boolean isSetIsMainIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMAININDUSTRYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "isMainIndustryCode" element
     */
    public void setIsMainIndustryCode(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isMainIndustryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMAININDUSTRYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMAININDUSTRYCODE$6);
            }
            target.setEnumValue(isMainIndustryCode);
        }
    }
    
    /**
     * Sets (as xml) the "isMainIndustryCode" element
     */
    public void xsetIsMainIndustryCode(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isMainIndustryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISMAININDUSTRYCODE$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISMAININDUSTRYCODE$6);
            }
            target.set(isMainIndustryCode);
        }
    }
    
    /**
     * Unsets the "isMainIndustryCode" element
     */
    public void unsetIsMainIndustryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMAININDUSTRYCODE$6, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$8, 0);
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
            return get_store().count_elements(PERIOD$8) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$8);
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
            get_store().remove_element(PERIOD$8, 0);
        }
    }
}
