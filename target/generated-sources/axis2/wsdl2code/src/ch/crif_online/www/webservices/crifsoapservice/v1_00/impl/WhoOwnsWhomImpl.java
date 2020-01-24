/*
 * XML Type:  WhoOwnsWhom
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML WhoOwnsWhom(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class WhoOwnsWhomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom
{
    private static final long serialVersionUID = 1L;
    
    public WhoOwnsWhomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WOWADDRESSES$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "wowAddresses");
    private static final javax.xml.namespace.QName WOWRELATIONS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "wowRelations");
    
    
    /**
     * Gets array of all "wowAddresses" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[] getWowAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WOWADDRESSES$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wowAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress getWowAddressesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress)get_store().find_element_user(WOWADDRESSES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wowAddresses" element
     */
    public int sizeOfWowAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WOWADDRESSES$0);
        }
    }
    
    /**
     * Sets array of all "wowAddresses" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWowAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[] wowAddressesArray)
    {
        check_orphaned();
        arraySetterHelper(wowAddressesArray, WOWADDRESSES$0);
    }
    
    /**
     * Sets ith "wowAddresses" element
     */
    public void setWowAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress wowAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress)get_store().find_element_user(WOWADDRESSES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wowAddresses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wowAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress insertNewWowAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress)get_store().insert_element_user(WOWADDRESSES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wowAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress addNewWowAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress)get_store().add_element_user(WOWADDRESSES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "wowAddresses" element
     */
    public void removeWowAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WOWADDRESSES$0, i);
        }
    }
    
    /**
     * Gets array of all "wowRelations" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[] getWowRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WOWRELATIONS$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wowRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation getWowRelationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation)get_store().find_element_user(WOWRELATIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wowRelations" element
     */
    public int sizeOfWowRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WOWRELATIONS$2);
        }
    }
    
    /**
     * Sets array of all "wowRelations" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWowRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[] wowRelationsArray)
    {
        check_orphaned();
        arraySetterHelper(wowRelationsArray, WOWRELATIONS$2);
    }
    
    /**
     * Sets ith "wowRelations" element
     */
    public void setWowRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation wowRelations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation)get_store().find_element_user(WOWRELATIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wowRelations);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wowRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation insertNewWowRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation)get_store().insert_element_user(WOWRELATIONS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wowRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation addNewWowRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation)get_store().add_element_user(WOWRELATIONS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "wowRelations" element
     */
    public void removeWowRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WOWRELATIONS$2, i);
        }
    }
}
