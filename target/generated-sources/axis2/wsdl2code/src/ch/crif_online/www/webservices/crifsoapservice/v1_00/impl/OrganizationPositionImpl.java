/*
 * XML Type:  OrganizationPosition
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML OrganizationPosition(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class OrganizationPositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPositionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "firstName");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "name");
    private static final javax.xml.namespace.QName NATIONALITY$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nationality");
    private static final javax.xml.namespace.QName HOMETOWN$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "homeTown");
    private static final javax.xml.namespace.QName CITY$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "city");
    private static final javax.xml.namespace.QName HIGHESTFUNCTION$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "highestFunction");
    private static final javax.xml.namespace.QName FURTHERFUNCTIONS$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "furtherFunctions");
    private static final javax.xml.namespace.QName SHARE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "share");
    private static final javax.xml.namespace.QName SIGNATURETYPE$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "signatureType");
    private static final javax.xml.namespace.QName SIGNATUREORIGINAL$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "signatureOriginal");
    private static final javax.xml.namespace.QName PERIOD$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    private static final javax.xml.namespace.QName ADDRESSID$22 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressId");
    private static final javax.xml.namespace.QName HASDEBTS$24 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "hasDebts");
    private static final javax.xml.namespace.QName NROFPOSITIONS$26 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nrOfPositions");
    private static final javax.xml.namespace.QName NROFPOSITIONSBANKRUPT$28 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nrOfPositionsBankrupt");
    private static final javax.xml.namespace.QName BIRTHDATE$30 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "birthDate");
    private static final javax.xml.namespace.QName ORGANIZATIONPOSITIONS$32 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "organizationPositions");
    
    
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
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$4, 0);
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
            return get_store().count_elements(NATIONALITY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALITY$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALITY$4);
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
            get_store().remove_element(NATIONALITY$4, 0);
        }
    }
    
    /**
     * Gets the "homeTown" element
     */
    public java.lang.String getHomeTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMETOWN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "homeTown" element
     */
    public org.apache.xmlbeans.XmlString xgetHomeTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMETOWN$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "homeTown" element
     */
    public boolean isSetHomeTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMETOWN$6) != 0;
        }
    }
    
    /**
     * Sets the "homeTown" element
     */
    public void setHomeTown(java.lang.String homeTown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMETOWN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMETOWN$6);
            }
            target.setStringValue(homeTown);
        }
    }
    
    /**
     * Sets (as xml) the "homeTown" element
     */
    public void xsetHomeTown(org.apache.xmlbeans.XmlString homeTown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMETOWN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMETOWN$6);
            }
            target.set(homeTown);
        }
    }
    
    /**
     * Unsets the "homeTown" element
     */
    public void unsetHomeTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMETOWN$6, 0);
        }
    }
    
    /**
     * Gets the "city" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "city" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "city" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$8) != 0;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$8);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "city" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$8);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "city" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$8, 0);
        }
    }
    
    /**
     * Gets the "highestFunction" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction getHighestFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().find_element_user(HIGHESTFUNCTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "highestFunction" element
     */
    public void setHighestFunction(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction highestFunction)
    {
        generatedSetterHelperImpl(highestFunction, HIGHESTFUNCTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "highestFunction" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction addNewHighestFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().add_element_user(HIGHESTFUNCTION$10);
            return target;
        }
    }
    
    /**
     * Gets array of all "furtherFunctions" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[] getFurtherFunctionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERFUNCTIONS$12, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "furtherFunctions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction getFurtherFunctionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().find_element_user(FURTHERFUNCTIONS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "furtherFunctions" element
     */
    public int sizeOfFurtherFunctionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FURTHERFUNCTIONS$12);
        }
    }
    
    /**
     * Sets array of all "furtherFunctions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFurtherFunctionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[] furtherFunctionsArray)
    {
        check_orphaned();
        arraySetterHelper(furtherFunctionsArray, FURTHERFUNCTIONS$12);
    }
    
    /**
     * Sets ith "furtherFunctions" element
     */
    public void setFurtherFunctionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction furtherFunctions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().find_element_user(FURTHERFUNCTIONS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(furtherFunctions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherFunctions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction insertNewFurtherFunctions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().insert_element_user(FURTHERFUNCTIONS$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherFunctions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction addNewFurtherFunctions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction)get_store().add_element_user(FURTHERFUNCTIONS$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "furtherFunctions" element
     */
    public void removeFurtherFunctions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FURTHERFUNCTIONS$12, i);
        }
    }
    
    /**
     * Gets the "share" element
     */
    public java.math.BigDecimal getShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "share" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHARE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "share" element
     */
    public boolean isSetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHARE$14) != 0;
        }
    }
    
    /**
     * Sets the "share" element
     */
    public void setShare(java.math.BigDecimal share)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHARE$14);
            }
            target.setBigDecimalValue(share);
        }
    }
    
    /**
     * Sets (as xml) the "share" element
     */
    public void xsetShare(org.apache.xmlbeans.XmlDecimal share)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SHARE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SHARE$14);
            }
            target.set(share);
        }
    }
    
    /**
     * Unsets the "share" element
     */
    public void unsetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHARE$14, 0);
        }
    }
    
    /**
     * Gets the "signatureType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType.Enum getSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "signatureType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType xgetSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType)get_store().find_element_user(SIGNATURETYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "signatureType" element
     */
    public boolean isSetSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATURETYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "signatureType" element
     */
    public void setSignatureType(ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType.Enum signatureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURETYPE$16);
            }
            target.setEnumValue(signatureType);
        }
    }
    
    /**
     * Sets (as xml) the "signatureType" element
     */
    public void xsetSignatureType(ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType signatureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType)get_store().find_element_user(SIGNATURETYPE$16, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType)get_store().add_element_user(SIGNATURETYPE$16);
            }
            target.set(signatureType);
        }
    }
    
    /**
     * Unsets the "signatureType" element
     */
    public void unsetSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATURETYPE$16, 0);
        }
    }
    
    /**
     * Gets the "signatureOriginal" element
     */
    public java.lang.String getSignatureOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREORIGINAL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "signatureOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetSignatureOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREORIGINAL$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "signatureOriginal" element
     */
    public boolean isSetSignatureOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREORIGINAL$18) != 0;
        }
    }
    
    /**
     * Sets the "signatureOriginal" element
     */
    public void setSignatureOriginal(java.lang.String signatureOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREORIGINAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREORIGINAL$18);
            }
            target.setStringValue(signatureOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "signatureOriginal" element
     */
    public void xsetSignatureOriginal(org.apache.xmlbeans.XmlString signatureOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREORIGINAL$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATUREORIGINAL$18);
            }
            target.set(signatureOriginal);
        }
    }
    
    /**
     * Unsets the "signatureOriginal" element
     */
    public void unsetSignatureOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREORIGINAL$18, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$20);
            return target;
        }
    }
    
    /**
     * Gets the "addressId" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(ADDRESSID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addressId" element
     */
    public boolean isSetAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSID$22) != 0;
        }
    }
    
    /**
     * Sets the "addressId" element
     */
    public void setAddressId(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addressId)
    {
        generatedSetterHelperImpl(addressId, ADDRESSID$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressId" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(ADDRESSID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "addressId" element
     */
    public void unsetAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSID$22, 0);
        }
    }
    
    /**
     * Gets the "hasDebts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum getHasDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDEBTS$24, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasDebts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts xgetHasDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().find_element_user(HASDEBTS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "hasDebts" element
     */
    public boolean isSetHasDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASDEBTS$24) != 0;
        }
    }
    
    /**
     * Sets the "hasDebts" element
     */
    public void setHasDebts(ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum hasDebts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDEBTS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASDEBTS$24);
            }
            target.setEnumValue(hasDebts);
        }
    }
    
    /**
     * Sets (as xml) the "hasDebts" element
     */
    public void xsetHasDebts(ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts hasDebts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().find_element_user(HASDEBTS$24, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().add_element_user(HASDEBTS$24);
            }
            target.set(hasDebts);
        }
    }
    
    /**
     * Unsets the "hasDebts" element
     */
    public void unsetHasDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASDEBTS$24, 0);
        }
    }
    
    /**
     * Gets the "nrOfPositions" element
     */
    public java.math.BigInteger getNrOfPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROFPOSITIONS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "nrOfPositions" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNrOfPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NROFPOSITIONS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "nrOfPositions" element
     */
    public boolean isSetNrOfPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NROFPOSITIONS$26) != 0;
        }
    }
    
    /**
     * Sets the "nrOfPositions" element
     */
    public void setNrOfPositions(java.math.BigInteger nrOfPositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROFPOSITIONS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROFPOSITIONS$26);
            }
            target.setBigIntegerValue(nrOfPositions);
        }
    }
    
    /**
     * Sets (as xml) the "nrOfPositions" element
     */
    public void xsetNrOfPositions(org.apache.xmlbeans.XmlInteger nrOfPositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NROFPOSITIONS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NROFPOSITIONS$26);
            }
            target.set(nrOfPositions);
        }
    }
    
    /**
     * Unsets the "nrOfPositions" element
     */
    public void unsetNrOfPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NROFPOSITIONS$26, 0);
        }
    }
    
    /**
     * Gets the "nrOfPositionsBankrupt" element
     */
    public java.math.BigInteger getNrOfPositionsBankrupt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROFPOSITIONSBANKRUPT$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "nrOfPositionsBankrupt" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNrOfPositionsBankrupt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NROFPOSITIONSBANKRUPT$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "nrOfPositionsBankrupt" element
     */
    public boolean isSetNrOfPositionsBankrupt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NROFPOSITIONSBANKRUPT$28) != 0;
        }
    }
    
    /**
     * Sets the "nrOfPositionsBankrupt" element
     */
    public void setNrOfPositionsBankrupt(java.math.BigInteger nrOfPositionsBankrupt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NROFPOSITIONSBANKRUPT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NROFPOSITIONSBANKRUPT$28);
            }
            target.setBigIntegerValue(nrOfPositionsBankrupt);
        }
    }
    
    /**
     * Sets (as xml) the "nrOfPositionsBankrupt" element
     */
    public void xsetNrOfPositionsBankrupt(org.apache.xmlbeans.XmlInteger nrOfPositionsBankrupt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NROFPOSITIONSBANKRUPT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NROFPOSITIONSBANKRUPT$28);
            }
            target.set(nrOfPositionsBankrupt);
        }
    }
    
    /**
     * Unsets the "nrOfPositionsBankrupt" element
     */
    public void unsetNrOfPositionsBankrupt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NROFPOSITIONSBANKRUPT$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATE$30, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATE$30, 0);
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
            return get_store().count_elements(BIRTHDATE$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHDATE$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIRTHDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIRTHDATE$30);
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
            get_store().remove_element(BIRTHDATE$30, 0);
        }
    }
    
    /**
     * Gets array of all "organizationPositions" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] getOrganizationPositionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONPOSITIONS$32, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition getOrganizationPositionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().find_element_user(ORGANIZATIONPOSITIONS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "organizationPositions" element
     */
    public int sizeOfOrganizationPositionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPOSITIONS$32);
        }
    }
    
    /**
     * Sets array of all "organizationPositions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrganizationPositionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] organizationPositionsArray)
    {
        check_orphaned();
        arraySetterHelper(organizationPositionsArray, ORGANIZATIONPOSITIONS$32);
    }
    
    /**
     * Sets ith "organizationPositions" element
     */
    public void setOrganizationPositionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition organizationPositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().find_element_user(ORGANIZATIONPOSITIONS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationPositions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition insertNewOrganizationPositions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().insert_element_user(ORGANIZATIONPOSITIONS$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition addNewOrganizationPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().add_element_user(ORGANIZATIONPOSITIONS$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "organizationPositions" element
     */
    public void removeOrganizationPositions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPOSITIONS$32, i);
        }
    }
}
