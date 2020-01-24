/*
 * XML Type:  TypeCreateJobESchKgResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeCreateJobESchKgResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeCreateJobESchKgResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeCreateJobESchKgResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERDATA$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderData");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    
    
    /**
     * Gets the "orderData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData getOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData)get_store().find_element_user(ORDERDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderData" element
     */
    public boolean isSetOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERDATA$0) != 0;
        }
    }
    
    /**
     * Sets the "orderData" element
     */
    public void setOrderData(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData orderData)
    {
        generatedSetterHelperImpl(orderData, ORDERDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData addNewOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData)get_store().add_element_user(ORDERDATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "orderData" element
     */
    public void unsetOrderData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERDATA$0, 0);
        }
    }
    
    /**
     * Gets array of all "additionalOutput" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALOUTPUT$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalOutput" element
     */
    public int sizeOfAdditionalOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALOUTPUT$2);
        }
    }
    
    /**
     * Sets array of all "additionalOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalOutputArray, ADDITIONALOUTPUT$2);
    }
    
    /**
     * Sets ith "additionalOutput" element
     */
    public void setAdditionalOutputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALOUTPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALOUTPUT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalOutput" element
     */
    public void removeAdditionalOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALOUTPUT$2, i);
        }
    }
}
