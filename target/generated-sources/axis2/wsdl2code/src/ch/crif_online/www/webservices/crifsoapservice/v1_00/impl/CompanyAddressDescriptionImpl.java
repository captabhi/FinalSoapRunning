/*
 * XML Type:  CompanyAddressDescription
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyAddressDescription(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyAddressDescriptionImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.AddressDescriptionImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription
{
    private static final long serialVersionUID = 1L;
    
    public CompanyAddressDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPANYNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyName");
    private static final javax.xml.namespace.QName CONAME$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "coName");
    
    
    /**
     * Gets the "companyName" element
     */
    public java.lang.String getCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "companyName" element
     */
    public org.apache.xmlbeans.XmlString xgetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "companyName" element
     */
    public boolean isSetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "companyName" element
     */
    public void setCompanyName(java.lang.String companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$0);
            }
            target.setStringValue(companyName);
        }
    }
    
    /**
     * Sets (as xml) the "companyName" element
     */
    public void xsetCompanyName(org.apache.xmlbeans.XmlString companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYNAME$0);
            }
            target.set(companyName);
        }
    }
    
    /**
     * Unsets the "companyName" element
     */
    public void unsetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "coName" element
     */
    public java.lang.String getCoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coName" element
     */
    public org.apache.xmlbeans.XmlString xgetCoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "coName" element
     */
    public boolean isSetCoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONAME$2) != 0;
        }
    }
    
    /**
     * Sets the "coName" element
     */
    public void setCoName(java.lang.String coName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONAME$2);
            }
            target.setStringValue(coName);
        }
    }
    
    /**
     * Sets (as xml) the "coName" element
     */
    public void xsetCoName(org.apache.xmlbeans.XmlString coName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONAME$2);
            }
            target.set(coName);
        }
    }
    
    /**
     * Unsets the "coName" element
     */
    public void unsetCoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONAME$2, 0);
        }
    }
}
