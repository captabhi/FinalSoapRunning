/*
 * XML Type:  IdVerificationResponseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationResponseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationResponseDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationResponseDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "content");
    private static final javax.xml.namespace.QName COMPARISONELEMENTS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "comparisonElements");
    private static final javax.xml.namespace.QName PROCESSINGRESULT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "processingResult");
    private static final javax.xml.namespace.QName WARNINGS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "warnings");
    private static final javax.xml.namespace.QName REJECTIONREASONS$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "rejectionReasons");
    
    
    /**
     * Gets the "content" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent)get_store().find_element_user(CONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "content" element
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$0) != 0;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent content)
    {
        generatedSetterHelperImpl(content, CONTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "content" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent)get_store().add_element_user(CONTENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "content" element
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "comparisonElements" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[] getComparisonElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPARISONELEMENTS$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comparisonElements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement getComparisonElementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement)get_store().find_element_user(COMPARISONELEMENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comparisonElements" element
     */
    public int sizeOfComparisonElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPARISONELEMENTS$2);
        }
    }
    
    /**
     * Sets array of all "comparisonElements" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComparisonElementsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[] comparisonElementsArray)
    {
        check_orphaned();
        arraySetterHelper(comparisonElementsArray, COMPARISONELEMENTS$2);
    }
    
    /**
     * Sets ith "comparisonElements" element
     */
    public void setComparisonElementsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement comparisonElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement)get_store().find_element_user(COMPARISONELEMENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comparisonElements);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comparisonElements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement insertNewComparisonElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement)get_store().insert_element_user(COMPARISONELEMENTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comparisonElements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement addNewComparisonElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement)get_store().add_element_user(COMPARISONELEMENTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "comparisonElements" element
     */
    public void removeComparisonElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPARISONELEMENTS$2, i);
        }
    }
    
    /**
     * Gets the "processingResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult.Enum getProcessingResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGRESULT$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "processingResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult xgetProcessingResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult)get_store().find_element_user(PROCESSINGRESULT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "processingResult" element
     */
    public void setProcessingResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult.Enum processingResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGRESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSINGRESULT$4);
            }
            target.setEnumValue(processingResult);
        }
    }
    
    /**
     * Sets (as xml) the "processingResult" element
     */
    public void xsetProcessingResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult processingResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult)get_store().find_element_user(PROCESSINGRESULT$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult)get_store().add_element_user(PROCESSINGRESULT$4);
            }
            target.set(processingResult);
        }
    }
    
    /**
     * Gets array of all "warnings" elements
     */
    public java.lang.String[] getWarningsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WARNINGS$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "warnings" element
     */
    public java.lang.String getWarningsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "warnings" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetWarningsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WARNINGS$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "warnings" element
     */
    public org.apache.xmlbeans.XmlString xgetWarningsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "warnings" element
     */
    public int sizeOfWarningsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WARNINGS$6);
        }
    }
    
    /**
     * Sets array of all "warnings" element
     */
    public void setWarningsArray(java.lang.String[] warningsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(warningsArray, WARNINGS$6);
        }
    }
    
    /**
     * Sets ith "warnings" element
     */
    public void setWarningsArray(int i, java.lang.String warnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(warnings);
        }
    }
    
    /**
     * Sets (as xml) array of all "warnings" element
     */
    public void xsetWarningsArray(org.apache.xmlbeans.XmlString[]warningsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(warningsArray, WARNINGS$6);
        }
    }
    
    /**
     * Sets (as xml) ith "warnings" element
     */
    public void xsetWarningsArray(int i, org.apache.xmlbeans.XmlString warnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(warnings);
        }
    }
    
    /**
     * Inserts the value as the ith "warnings" element
     */
    public void insertWarnings(int i, java.lang.String warnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WARNINGS$6, i);
            target.setStringValue(warnings);
        }
    }
    
    /**
     * Appends the value as the last "warnings" element
     */
    public void addWarnings(java.lang.String warnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARNINGS$6);
            target.setStringValue(warnings);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "warnings" element
     */
    public org.apache.xmlbeans.XmlString insertNewWarnings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(WARNINGS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "warnings" element
     */
    public org.apache.xmlbeans.XmlString addNewWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WARNINGS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "warnings" element
     */
    public void removeWarnings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WARNINGS$6, i);
        }
    }
    
    /**
     * Gets array of all "rejectionReasons" elements
     */
    public java.lang.String[] getRejectionReasonsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REJECTIONREASONS$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "rejectionReasons" element
     */
    public java.lang.String getRejectionReasonsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTIONREASONS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "rejectionReasons" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRejectionReasonsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REJECTIONREASONS$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "rejectionReasons" element
     */
    public org.apache.xmlbeans.XmlString xgetRejectionReasonsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REJECTIONREASONS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rejectionReasons" element
     */
    public int sizeOfRejectionReasonsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REJECTIONREASONS$8);
        }
    }
    
    /**
     * Sets array of all "rejectionReasons" element
     */
    public void setRejectionReasonsArray(java.lang.String[] rejectionReasonsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rejectionReasonsArray, REJECTIONREASONS$8);
        }
    }
    
    /**
     * Sets ith "rejectionReasons" element
     */
    public void setRejectionReasonsArray(int i, java.lang.String rejectionReasons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTIONREASONS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(rejectionReasons);
        }
    }
    
    /**
     * Sets (as xml) array of all "rejectionReasons" element
     */
    public void xsetRejectionReasonsArray(org.apache.xmlbeans.XmlString[]rejectionReasonsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rejectionReasonsArray, REJECTIONREASONS$8);
        }
    }
    
    /**
     * Sets (as xml) ith "rejectionReasons" element
     */
    public void xsetRejectionReasonsArray(int i, org.apache.xmlbeans.XmlString rejectionReasons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REJECTIONREASONS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rejectionReasons);
        }
    }
    
    /**
     * Inserts the value as the ith "rejectionReasons" element
     */
    public void insertRejectionReasons(int i, java.lang.String rejectionReasons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REJECTIONREASONS$8, i);
            target.setStringValue(rejectionReasons);
        }
    }
    
    /**
     * Appends the value as the last "rejectionReasons" element
     */
    public void addRejectionReasons(java.lang.String rejectionReasons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REJECTIONREASONS$8);
            target.setStringValue(rejectionReasons);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rejectionReasons" element
     */
    public org.apache.xmlbeans.XmlString insertNewRejectionReasons(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REJECTIONREASONS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rejectionReasons" element
     */
    public org.apache.xmlbeans.XmlString addNewRejectionReasons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REJECTIONREASONS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "rejectionReasons" element
     */
    public void removeRejectionReasons(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REJECTIONREASONS$8, i);
        }
    }
}
