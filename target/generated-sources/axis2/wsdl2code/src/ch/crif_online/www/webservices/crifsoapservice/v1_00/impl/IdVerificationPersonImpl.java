/*
 * XML Type:  IdVerificationPerson
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationPerson(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationPersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationPersonImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName ADDRESS1$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address1");
    private static final javax.xml.namespace.QName ADDRESS2$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address2");
    private static final javax.xml.namespace.QName NATIONALIDENTIFICATIONNUMBER$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nationalIdentificationNumber");
    private static final javax.xml.namespace.QName PLACEOFBIRTH$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "placeOfBirth");
    private static final javax.xml.namespace.QName NATIONALITY$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nationality");
    
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription)get_store().find_element_user(ADDRESS$0, 0);
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
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription)get_store().add_element_user(ADDRESS$0);
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
     * Gets the "address1" element
     */
    public java.lang.String getAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1" element
     */
    public boolean isSetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1$2) != 0;
        }
    }
    
    /**
     * Sets the "address1" element
     */
    public void setAddress1(java.lang.String address1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1$2);
            }
            target.setStringValue(address1);
        }
    }
    
    /**
     * Sets (as xml) the "address1" element
     */
    public void xsetAddress1(org.apache.xmlbeans.XmlString address1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1$2);
            }
            target.set(address1);
        }
    }
    
    /**
     * Unsets the "address1" element
     */
    public void unsetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1$2, 0);
        }
    }
    
    /**
     * Gets the "address2" element
     */
    public java.lang.String getAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2" element
     */
    public boolean isSetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2$4) != 0;
        }
    }
    
    /**
     * Sets the "address2" element
     */
    public void setAddress2(java.lang.String address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2$4);
            }
            target.setStringValue(address2);
        }
    }
    
    /**
     * Sets (as xml) the "address2" element
     */
    public void xsetAddress2(org.apache.xmlbeans.XmlString address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2$4);
            }
            target.set(address2);
        }
    }
    
    /**
     * Unsets the "address2" element
     */
    public void unsetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2$4, 0);
        }
    }
    
    /**
     * Gets the "nationalIdentificationNumber" element
     */
    public java.lang.String getNationalIdentificationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALIDENTIFICATIONNUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationalIdentificationNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetNationalIdentificationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALIDENTIFICATIONNUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "nationalIdentificationNumber" element
     */
    public boolean isSetNationalIdentificationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATIONALIDENTIFICATIONNUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "nationalIdentificationNumber" element
     */
    public void setNationalIdentificationNumber(java.lang.String nationalIdentificationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALIDENTIFICATIONNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALIDENTIFICATIONNUMBER$6);
            }
            target.setStringValue(nationalIdentificationNumber);
        }
    }
    
    /**
     * Sets (as xml) the "nationalIdentificationNumber" element
     */
    public void xsetNationalIdentificationNumber(org.apache.xmlbeans.XmlString nationalIdentificationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALIDENTIFICATIONNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALIDENTIFICATIONNUMBER$6);
            }
            target.set(nationalIdentificationNumber);
        }
    }
    
    /**
     * Unsets the "nationalIdentificationNumber" element
     */
    public void unsetNationalIdentificationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATIONALIDENTIFICATIONNUMBER$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFBIRTH$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEOFBIRTH$8, 0);
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
            return get_store().count_elements(PLACEOFBIRTH$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFBIRTH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEOFBIRTH$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEOFBIRTH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACEOFBIRTH$8);
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
            get_store().remove_element(PLACEOFBIRTH$8, 0);
        }
    }
    
    /**
     * Gets the "nationality" element
     */
    public java.lang.String getNationality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationality" element
     */
    public org.apache.xmlbeans.XmlString xgetNationality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nationality" element
     */
    public boolean isSetNationality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATIONALITY$10) != 0;
        }
    }
    
    /**
     * Sets the "nationality" element
     */
    public void setNationality(java.lang.String nationality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALITY$10);
            }
            target.setStringValue(nationality);
        }
    }
    
    /**
     * Sets (as xml) the "nationality" element
     */
    public void xsetNationality(org.apache.xmlbeans.XmlString nationality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALITY$10);
            }
            target.set(nationality);
        }
    }
    
    /**
     * Unsets the "nationality" element
     */
    public void unsetNationality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATIONALITY$10, 0);
        }
    }
}
