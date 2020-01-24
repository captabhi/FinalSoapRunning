/*
 * XML Type:  AddressDescription
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML AddressDescription(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class AddressDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription
{
    private static final long serialVersionUID = 1L;
    
    public AddressDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "location");
    private static final javax.xml.namespace.QName CONTACTITEMS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "contactItems");
    
    
    /**
     * Gets the "location" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$0) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(ch.crif_online.www.webservices.crifsoapservice.v1_00.Location location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$0, 0);
        }
    }
    
    /**
     * Gets array of all "contactItems" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem[] getContactItemsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTITEMS$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contactItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem getContactItemsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem)get_store().find_element_user(CONTACTITEMS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contactItems" element
     */
    public int sizeOfContactItemsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTITEMS$2);
        }
    }
    
    /**
     * Sets array of all "contactItems" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContactItemsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem[] contactItemsArray)
    {
        check_orphaned();
        arraySetterHelper(contactItemsArray, CONTACTITEMS$2);
    }
    
    /**
     * Sets ith "contactItems" element
     */
    public void setContactItemsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem contactItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem)get_store().find_element_user(CONTACTITEMS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactItems);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contactItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem insertNewContactItems(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem)get_store().insert_element_user(CONTACTITEMS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contactItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem addNewContactItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ContactItem)get_store().add_element_user(CONTACTITEMS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "contactItems" element
     */
    public void removeContactItems(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTITEMS$2, i);
        }
    }
}
