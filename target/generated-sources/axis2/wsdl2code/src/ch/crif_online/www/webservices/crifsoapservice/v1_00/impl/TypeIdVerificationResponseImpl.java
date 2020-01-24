/*
 * XML Type:  TypeIdVerificationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeIdVerificationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeIdVerificationResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeIdVerificationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDVERIFICATIONRESPONSEDATA$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationResponseData");
    private static final javax.xml.namespace.QName DECISIONMATRIX$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "decisionMatrix");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    
    
    /**
     * Gets the "idVerificationResponseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData getIdVerificationResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData)get_store().find_element_user(IDVERIFICATIONRESPONSEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "idVerificationResponseData" element
     */
    public boolean isSetIdVerificationResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDVERIFICATIONRESPONSEDATA$0) != 0;
        }
    }
    
    /**
     * Sets the "idVerificationResponseData" element
     */
    public void setIdVerificationResponseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData idVerificationResponseData)
    {
        generatedSetterHelperImpl(idVerificationResponseData, IDVERIFICATIONRESPONSEDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "idVerificationResponseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData addNewIdVerificationResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData)get_store().add_element_user(IDVERIFICATIONRESPONSEDATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "idVerificationResponseData" element
     */
    public void unsetIdVerificationResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDVERIFICATIONRESPONSEDATA$0, 0);
        }
    }
    
    /**
     * Gets the "decisionMatrix" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix getDecisionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix)get_store().find_element_user(DECISIONMATRIX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "decisionMatrix" element
     */
    public boolean isSetDecisionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECISIONMATRIX$2) != 0;
        }
    }
    
    /**
     * Sets the "decisionMatrix" element
     */
    public void setDecisionMatrix(ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix decisionMatrix)
    {
        generatedSetterHelperImpl(decisionMatrix, DECISIONMATRIX$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "decisionMatrix" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix addNewDecisionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix)get_store().add_element_user(DECISIONMATRIX$2);
            return target;
        }
    }
    
    /**
     * Unsets the "decisionMatrix" element
     */
    public void unsetDecisionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECISIONMATRIX$2, 0);
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
            get_store().find_all_element_users(ADDITIONALOUTPUT$4, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$4, i);
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
            return get_store().count_elements(ADDITIONALOUTPUT$4);
        }
    }
    
    /**
     * Sets array of all "additionalOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalOutputArray, ADDITIONALOUTPUT$4);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$4, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALOUTPUT$4, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALOUTPUT$4);
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
            get_store().remove_element(ADDITIONALOUTPUT$4, i);
        }
    }
}
