/*
 * XML Type:  PersonAddressDescription
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML PersonAddressDescription(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class PersonAddressDescriptionImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.AddressDescriptionImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription
{
    private static final long serialVersionUID = 1L;
    
    public PersonAddressDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "firstName");
    private static final javax.xml.namespace.QName LASTNAME$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "lastName");
    private static final javax.xml.namespace.QName MAIDENNAME$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "maidenName");
    private static final javax.xml.namespace.QName MIDDLENAME$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "middleName");
    private static final javax.xml.namespace.QName CONAME$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "coName");
    private static final javax.xml.namespace.QName SEX$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "sex");
    private static final javax.xml.namespace.QName BIRTHDATE$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "birthDate");
    private static final javax.xml.namespace.QName NATIONALITY$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nationality");
    
    
    /**
     * Gets the "firstName" element
     */
    public java.lang.String getFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstName" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "firstName" element
     */
    public boolean isSetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "firstName" element
     */
    public void setFirstName(java.lang.String firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$0);
            }
            target.setStringValue(firstName);
        }
    }
    
    /**
     * Sets (as xml) the "firstName" element
     */
    public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$0);
            }
            target.set(firstName);
        }
    }
    
    /**
     * Unsets the "firstName" element
     */
    public void unsetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTNAME$0, 0);
        }
    }
    
    /**
     * Gets the "lastName" element
     */
    public java.lang.String getLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastName" element
     */
    public org.apache.xmlbeans.XmlString xgetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastName" element
     */
    public boolean isSetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "lastName" element
     */
    public void setLastName(java.lang.String lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$2);
            }
            target.setStringValue(lastName);
        }
    }
    
    /**
     * Sets (as xml) the "lastName" element
     */
    public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$2);
            }
            target.set(lastName);
        }
    }
    
    /**
     * Unsets the "lastName" element
     */
    public void unsetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "maidenName" element
     */
    public java.lang.String getMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAIDENNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maidenName" element
     */
    public org.apache.xmlbeans.XmlString xgetMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAIDENNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "maidenName" element
     */
    public boolean isSetMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAIDENNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "maidenName" element
     */
    public void setMaidenName(java.lang.String maidenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAIDENNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAIDENNAME$4);
            }
            target.setStringValue(maidenName);
        }
    }
    
    /**
     * Sets (as xml) the "maidenName" element
     */
    public void xsetMaidenName(org.apache.xmlbeans.XmlString maidenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAIDENNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAIDENNAME$4);
            }
            target.set(maidenName);
        }
    }
    
    /**
     * Unsets the "maidenName" element
     */
    public void unsetMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAIDENNAME$4, 0);
        }
    }
    
    /**
     * Gets the "middleName" element
     */
    public java.lang.String getMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "middleName" element
     */
    public org.apache.xmlbeans.XmlString xgetMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "middleName" element
     */
    public boolean isSetMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "middleName" element
     */
    public void setMiddleName(java.lang.String middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLENAME$6);
            }
            target.setStringValue(middleName);
        }
    }
    
    /**
     * Sets (as xml) the "middleName" element
     */
    public void xsetMiddleName(org.apache.xmlbeans.XmlString middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLENAME$6);
            }
            target.set(middleName);
        }
    }
    
    /**
     * Unsets the "middleName" element
     */
    public void unsetMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLENAME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONAME$8, 0);
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
            return get_store().count_elements(CONAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONAME$8);
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
            get_store().remove_element(CONAME$8, 0);
        }
    }
    
    /**
     * Gets the "sex" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex.Enum getSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sex" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex xgetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex)get_store().find_element_user(SEX$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "sex" element
     */
    public boolean isSetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEX$10) != 0;
        }
    }
    
    /**
     * Sets the "sex" element
     */
    public void setSex(ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex.Enum sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEX$10);
            }
            target.setEnumValue(sex);
        }
    }
    
    /**
     * Sets (as xml) the "sex" element
     */
    public void xsetSex(ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex)get_store().find_element_user(SEX$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex)get_store().add_element_user(SEX$10);
            }
            target.set(sex);
        }
    }
    
    /**
     * Unsets the "sex" element
     */
    public void unsetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEX$10, 0);
        }
    }
    
    /**
     * Gets the "birthDate" element
     */
    public java.lang.String getBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "birthDate" element
     */
    public org.apache.xmlbeans.XmlString xgetBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "birthDate" element
     */
    public boolean isSetBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "birthDate" element
     */
    public void setBirthDate(java.lang.String birthDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHDATE$12);
            }
            target.setStringValue(birthDate);
        }
    }
    
    /**
     * Sets (as xml) the "birthDate" element
     */
    public void xsetBirthDate(org.apache.xmlbeans.XmlString birthDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIRTHDATE$12);
            }
            target.set(birthDate);
        }
    }
    
    /**
     * Unsets the "birthDate" element
     */
    public void unsetBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHDATE$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$14, 0);
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
            return get_store().count_elements(NATIONALITY$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALITY$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALITY$14);
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
            get_store().remove_element(NATIONALITY$14, 0);
        }
    }
}
