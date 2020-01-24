/*
 * XML Type:  TypeGetReportResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeGetReportResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeGetReportResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeGetReportResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECISIONMATRIX$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "decisionMatrix");
    private static final javax.xml.namespace.QName ADDRESSMATCHRESULT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressMatchResult");
    private static final javax.xml.namespace.QName REPORTDETAILS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reportDetails");
    private static final javax.xml.namespace.QName REPORT$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "report");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    
    
    /**
     * Gets the "decisionMatrix" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix getDecisionMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix)get_store().find_element_user(DECISIONMATRIX$0, 0);
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
            return get_store().count_elements(DECISIONMATRIX$0) != 0;
        }
    }
    
    /**
     * Sets the "decisionMatrix" element
     */
    public void setDecisionMatrix(ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix decisionMatrix)
    {
        generatedSetterHelperImpl(decisionMatrix, DECISIONMATRIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix)get_store().add_element_user(DECISIONMATRIX$0);
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
            get_store().remove_element(DECISIONMATRIX$0, 0);
        }
    }
    
    /**
     * Gets the "addressMatchResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult getAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult)get_store().find_element_user(ADDRESSMATCHRESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addressMatchResult" element
     */
    public boolean isSetAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSMATCHRESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "addressMatchResult" element
     */
    public void setAddressMatchResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addressMatchResult)
    {
        generatedSetterHelperImpl(addressMatchResult, ADDRESSMATCHRESULT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressMatchResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addNewAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult)get_store().add_element_user(ADDRESSMATCHRESULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "addressMatchResult" element
     */
    public void unsetAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSMATCHRESULT$2, 0);
        }
    }
    
    /**
     * Gets the "reportDetails" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails getReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails)get_store().find_element_user(REPORTDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportDetails" element
     */
    public boolean isSetReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTDETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "reportDetails" element
     */
    public void setReportDetails(ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails reportDetails)
    {
        generatedSetterHelperImpl(reportDetails, REPORTDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reportDetails" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails addNewReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails)get_store().add_element_user(REPORTDETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "reportDetails" element
     */
    public void unsetReportDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTDETAILS$4, 0);
        }
    }
    
    /**
     * Gets the "report" element
     */
    public java.lang.String getReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "report" element
     */
    public org.apache.xmlbeans.XmlString xgetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "report" element
     */
    public boolean isSetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORT$6) != 0;
        }
    }
    
    /**
     * Sets the "report" element
     */
    public void setReport(java.lang.String report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORT$6);
            }
            target.setStringValue(report);
        }
    }
    
    /**
     * Sets (as xml) the "report" element
     */
    public void xsetReport(org.apache.xmlbeans.XmlString report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORT$6);
            }
            target.set(report);
        }
    }
    
    /**
     * Unsets the "report" element
     */
    public void unsetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORT$6, 0);
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
            get_store().find_all_element_users(ADDITIONALOUTPUT$8, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$8, i);
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
            return get_store().count_elements(ADDITIONALOUTPUT$8);
        }
    }
    
    /**
     * Sets array of all "additionalOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalOutputArray, ADDITIONALOUTPUT$8);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$8, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALOUTPUT$8, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALOUTPUT$8);
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
            get_store().remove_element(ADDITIONALOUTPUT$8, i);
        }
    }
}
