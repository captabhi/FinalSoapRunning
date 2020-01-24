/*
 * XML Type:  SchufaPersonData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaPersonData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaPersonDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData
{
    private static final long serialVersionUID = 1L;
    
    public SchufaPersonDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "title");
    private static final javax.xml.namespace.QName PLACEOFBIRTH$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "placeOfBirth");
    private static final javax.xml.namespace.QName PREVIOUSADDRESS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "previousAddress");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$0) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$0, 0);
        }
    }
    
    /**
     * Gets the "placeOfBirth" element
     */
    public java.lang.String getPlaceOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFBIRTH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "placeOfBirth" element
     */
    public org.apache.xmlbeans.XmlString xgetPlaceOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEOFBIRTH$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "placeOfBirth" element
     */
    public boolean isSetPlaceOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACEOFBIRTH$2) != 0;
        }
    }
    
    /**
     * Sets the "placeOfBirth" element
     */
    public void setPlaceOfBirth(java.lang.String placeOfBirth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFBIRTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEOFBIRTH$2);
            }
            target.setStringValue(placeOfBirth);
        }
    }
    
    /**
     * Sets (as xml) the "placeOfBirth" element
     */
    public void xsetPlaceOfBirth(org.apache.xmlbeans.XmlString placeOfBirth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEOFBIRTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACEOFBIRTH$2);
            }
            target.set(placeOfBirth);
        }
    }
    
    /**
     * Unsets the "placeOfBirth" element
     */
    public void unsetPlaceOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACEOFBIRTH$2, 0);
        }
    }
    
    /**
     * Gets the "previousAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location getPreviousAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().find_element_user(PREVIOUSADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "previousAddress" element
     */
    public boolean isSetPreviousAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "previousAddress" element
     */
    public void setPreviousAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.Location previousAddress)
    {
        generatedSetterHelperImpl(previousAddress, PREVIOUSADDRESS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "previousAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location addNewPreviousAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().add_element_user(PREVIOUSADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "previousAddress" element
     */
    public void unsetPreviousAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSADDRESS$4, 0);
        }
    }
}
