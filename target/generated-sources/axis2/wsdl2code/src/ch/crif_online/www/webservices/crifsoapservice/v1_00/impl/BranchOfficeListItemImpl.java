/*
 * XML Type:  BranchOfficeListItem
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML BranchOfficeListItem(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class BranchOfficeListItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem
{
    private static final long serialVersionUID = 1L;
    
    public BranchOfficeListItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "description");
    private static final javax.xml.namespace.QName PERIOD$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    private static final javax.xml.namespace.QName REGISTERED$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "registered");
    
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$4, 0);
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
            return get_store().count_elements(PERIOD$4) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$4);
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
            get_store().remove_element(PERIOD$4, 0);
        }
    }
    
    /**
     * Gets the "registered" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTERED$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "registered" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(REGISTERED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "registered" element
     */
    public boolean isSetRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTERED$6) != 0;
        }
    }
    
    /**
     * Sets the "registered" element
     */
    public void setRegistered(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum registered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTERED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTERED$6);
            }
            target.setEnumValue(registered);
        }
    }
    
    /**
     * Sets (as xml) the "registered" element
     */
    public void xsetRegistered(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean registered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(REGISTERED$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(REGISTERED$6);
            }
            target.set(registered);
        }
    }
    
    /**
     * Unsets the "registered" element
     */
    public void unsetRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTERED$6, 0);
        }
    }
}
