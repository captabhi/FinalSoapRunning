/*
 * XML Type:  MatchedAddress
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML MatchedAddress(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class MatchedAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress
{
    private static final long serialVersionUID = 1L;
    
    public MatchedAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName IDENTIFICATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identificationType");
    private static final javax.xml.namespace.QName IDENTIFIERS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifiers");
    
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "identificationType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType.Enum getIdentificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "identificationType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType xgetIdentificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType)get_store().find_element_user(IDENTIFICATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identificationType" element
     */
    public void setIdentificationType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType.Enum identificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICATIONTYPE$2);
            }
            target.setEnumValue(identificationType);
        }
    }
    
    /**
     * Sets (as xml) the "identificationType" element
     */
    public void xsetIdentificationType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType identificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType)get_store().find_element_user(IDENTIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentificationType)get_store().add_element_user(IDENTIFICATIONTYPE$2);
            }
            target.set(identificationType);
        }
    }
    
    /**
     * Gets array of all "identifiers" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] getIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIERS$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifiersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifiers" element
     */
    public int sizeOfIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERS$4);
        }
    }
    
    /**
     * Sets array of all "identifiers" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiersArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] identifiersArray)
    {
        check_orphaned();
        arraySetterHelper(identifiersArray, IDENTIFIERS$4);
    }
    
    /**
     * Sets ith "identifiers" element
     */
    public void setIdentifiersArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifiers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier insertNewIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().insert_element_user(IDENTIFIERS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(IDENTIFIERS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifiers" element
     */
    public void removeIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERS$4, i);
        }
    }
}
