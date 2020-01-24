/*
 * XML Type:  TypeGetLastDocumentESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeGetLastDocumentESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeGetLastDocumentESchKgRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeGetLastDocumentESchKgRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "externalId");
    private static final javax.xml.namespace.QName ORDERID$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderId");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    
    
    /**
     * Gets the "externalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalId" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "externalId" element
     */
    public boolean isNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "externalId" element
     */
    public boolean isSetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALID$0) != 0;
        }
    }
    
    /**
     * Sets the "externalId" element
     */
    public void setExternalId(java.lang.String externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$0);
            }
            target.setStringValue(externalId);
        }
    }
    
    /**
     * Sets (as xml) the "externalId" element
     */
    public void xsetExternalId(org.apache.xmlbeans.XmlString externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.set(externalId);
        }
    }
    
    /**
     * Nils the "externalId" element
     */
    public void setNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "externalId" element
     */
    public void unsetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "orderId" element
     */
    public java.lang.String getOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderId" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "orderId" element
     */
    public boolean isNilOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "orderId" element
     */
    public boolean isSetOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERID$2) != 0;
        }
    }
    
    /**
     * Sets the "orderId" element
     */
    public void setOrderId(java.lang.String orderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$2);
            }
            target.setStringValue(orderId);
        }
    }
    
    /**
     * Sets (as xml) the "orderId" element
     */
    public void xsetOrderId(org.apache.xmlbeans.XmlString orderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERID$2);
            }
            target.set(orderId);
        }
    }
    
    /**
     * Nils the "orderId" element
     */
    public void setNilOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "orderId" element
     */
    public void unsetOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERID$2, 0);
        }
    }
    
    /**
     * Gets array of all "additionalInput" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALINPUT$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalInput" element
     */
    public int sizeOfAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINPUT$4);
        }
    }
    
    /**
     * Sets array of all "additionalInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalInputArray, ADDITIONALINPUT$4);
    }
    
    /**
     * Sets ith "additionalInput" element
     */
    public void setAdditionalInputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALINPUT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALINPUT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalInput" element
     */
    public void removeAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINPUT$4, i);
        }
    }
}
