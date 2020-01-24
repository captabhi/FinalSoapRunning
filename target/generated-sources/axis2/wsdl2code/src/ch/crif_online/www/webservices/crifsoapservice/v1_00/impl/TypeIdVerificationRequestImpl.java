/*
 * XML Type:  TypeIdVerificationRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeIdVerificationRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeIdVerificationRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeIdVerificationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDVERIFICATIONREQUESTDATA$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationRequestData");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    
    
    /**
     * Gets the "idVerificationRequestData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData getIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData)get_store().find_element_user(IDVERIFICATIONREQUESTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "idVerificationRequestData" element
     */
    public boolean isSetIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDVERIFICATIONREQUESTDATA$0) != 0;
        }
    }
    
    /**
     * Sets the "idVerificationRequestData" element
     */
    public void setIdVerificationRequestData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData idVerificationRequestData)
    {
        generatedSetterHelperImpl(idVerificationRequestData, IDVERIFICATIONREQUESTDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "idVerificationRequestData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData addNewIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData)get_store().add_element_user(IDVERIFICATIONREQUESTDATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "idVerificationRequestData" element
     */
    public void unsetIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDVERIFICATIONREQUESTDATA$0, 0);
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
            get_store().find_all_element_users(ADDITIONALINPUT$2, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$2, i);
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
            return get_store().count_elements(ADDITIONALINPUT$2);
        }
    }
    
    /**
     * Sets array of all "additionalInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalInputArray, ADDITIONALINPUT$2);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$2, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALINPUT$2, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALINPUT$2);
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
            get_store().remove_element(ADDITIONALINPUT$2, i);
        }
    }
}
