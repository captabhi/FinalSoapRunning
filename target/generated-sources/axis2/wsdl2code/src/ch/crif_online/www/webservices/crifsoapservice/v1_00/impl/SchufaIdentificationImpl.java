/*
 * XML Type:  SchufaIdentification
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaIdentification(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaIdentificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification
{
    private static final long serialVersionUID = 1L;
    
    public SchufaIdentificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTITYRESERVATIONPERSON$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identityReservationPerson");
    private static final javax.xml.namespace.QName IDENTITYRESERVATIONADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identityReservationAddress");
    private static final javax.xml.namespace.QName PERSONWITHOUTBIRTHDATE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "personWithoutBirthdate");
    
    
    /**
     * Gets the "identityReservationPerson" element
     */
    public boolean getIdentityReservationPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTITYRESERVATIONPERSON$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "identityReservationPerson" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIdentityReservationPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IDENTITYRESERVATIONPERSON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identityReservationPerson" element
     */
    public void setIdentityReservationPerson(boolean identityReservationPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTITYRESERVATIONPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTITYRESERVATIONPERSON$0);
            }
            target.setBooleanValue(identityReservationPerson);
        }
    }
    
    /**
     * Sets (as xml) the "identityReservationPerson" element
     */
    public void xsetIdentityReservationPerson(org.apache.xmlbeans.XmlBoolean identityReservationPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IDENTITYRESERVATIONPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(IDENTITYRESERVATIONPERSON$0);
            }
            target.set(identityReservationPerson);
        }
    }
    
    /**
     * Gets the "identityReservationAddress" element
     */
    public boolean getIdentityReservationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTITYRESERVATIONADDRESS$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "identityReservationAddress" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIdentityReservationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IDENTITYRESERVATIONADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identityReservationAddress" element
     */
    public void setIdentityReservationAddress(boolean identityReservationAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTITYRESERVATIONADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTITYRESERVATIONADDRESS$2);
            }
            target.setBooleanValue(identityReservationAddress);
        }
    }
    
    /**
     * Sets (as xml) the "identityReservationAddress" element
     */
    public void xsetIdentityReservationAddress(org.apache.xmlbeans.XmlBoolean identityReservationAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IDENTITYRESERVATIONADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(IDENTITYRESERVATIONADDRESS$2);
            }
            target.set(identityReservationAddress);
        }
    }
    
    /**
     * Gets the "personWithoutBirthdate" element
     */
    public boolean getPersonWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONWITHOUTBIRTHDATE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "personWithoutBirthdate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPersonWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSONWITHOUTBIRTHDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "personWithoutBirthdate" element
     */
    public void setPersonWithoutBirthdate(boolean personWithoutBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONWITHOUTBIRTHDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONWITHOUTBIRTHDATE$4);
            }
            target.setBooleanValue(personWithoutBirthdate);
        }
    }
    
    /**
     * Sets (as xml) the "personWithoutBirthdate" element
     */
    public void xsetPersonWithoutBirthdate(org.apache.xmlbeans.XmlBoolean personWithoutBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSONWITHOUTBIRTHDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PERSONWITHOUTBIRTHDATE$4);
            }
            target.set(personWithoutBirthdate);
        }
    }
}
