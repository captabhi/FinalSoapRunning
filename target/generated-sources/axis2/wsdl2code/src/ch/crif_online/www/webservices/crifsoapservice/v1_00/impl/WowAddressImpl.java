/*
 * XML Type:  WowAddress
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML WowAddress(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class WowAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress
{
    private static final long serialVersionUID = 1L;
    
    public WowAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "id");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName IDENTIFIERS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifiers");
    private static final javax.xml.namespace.QName HASDEBTS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "hasDebts");
    
    
    /**
     * Gets the "id" element
     */
    public int getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$2, 0);
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
        generatedSetterHelperImpl(address, ADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$2);
            return target;
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
    
    /**
     * Gets the "hasDebts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum getHasDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDEBTS$6, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().find_element_user(HASDEBTS$6, 0);
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
            return get_store().count_elements(HASDEBTS$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASDEBTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASDEBTS$6);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().find_element_user(HASDEBTS$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts)get_store().add_element_user(HASDEBTS$6);
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
            get_store().remove_element(HASDEBTS$6, 0);
        }
    }
}
