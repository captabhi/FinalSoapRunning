/*
 * XML Type:  ContactItem
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ContactItem(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ContactItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem
{
    private static final long serialVersionUID = 1L;
    
    public ContactItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTTEXT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "contactText");
    private static final javax.xml.namespace.QName CONTACTTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "contactType");
    
    
    /**
     * Gets the "contactText" element
     */
    public java.lang.String getContactText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contactText" element
     */
    public org.apache.xmlbeans.XmlString xgetContactText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "contactText" element
     */
    public boolean isSetContactText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "contactText" element
     */
    public void setContactText(java.lang.String contactText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTTEXT$0);
            }
            target.setStringValue(contactText);
        }
    }
    
    /**
     * Sets (as xml) the "contactText" element
     */
    public void xsetContactText(org.apache.xmlbeans.XmlString contactText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTTEXT$0);
            }
            target.set(contactText);
        }
    }
    
    /**
     * Unsets the "contactText" element
     */
    public void unsetContactText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTTEXT$0, 0);
        }
    }
    
    /**
     * Gets the "contactType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType.Enum getContactType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "contactType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType xgetContactType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType)get_store().find_element_user(CONTACTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "contactType" element
     */
    public boolean isSetContactType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "contactType" element
     */
    public void setContactType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType.Enum contactType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTTYPE$2);
            }
            target.setEnumValue(contactType);
        }
    }
    
    /**
     * Sets (as xml) the "contactType" element
     */
    public void xsetContactType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType contactType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType)get_store().find_element_user(CONTACTTYPE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactType)get_store().add_element_user(CONTACTTYPE$2);
            }
            target.set(contactType);
        }
    }
    
    /**
     * Unsets the "contactType" element
     */
    public void unsetContactType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTTYPE$2, 0);
        }
    }
}
