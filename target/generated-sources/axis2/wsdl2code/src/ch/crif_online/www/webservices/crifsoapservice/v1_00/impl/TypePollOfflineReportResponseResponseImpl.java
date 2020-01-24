/*
 * XML Type:  TypePollOfflineReportResponseResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypePollOfflineReportResponseResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypePollOfflineReportResponseResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypePollOfflineReportResponseResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFLINEREPORTSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "offlineReportStatus");
    private static final javax.xml.namespace.QName REPORT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "report");
    private static final javax.xml.namespace.QName DEBTS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "debts");
    private static final javax.xml.namespace.QName OFFLINEREPORTIDENTIFIER$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "offlineReportIdentifier");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    private static final javax.xml.namespace.QName REJECTIONREASON$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "rejectionReason");
    private static final javax.xml.namespace.QName NUMBEROFORIGINALDOCUMENTS$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "numberOfOriginalDocuments");
    
    
    /**
     * Gets the "offlineReportStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus.Enum getOfflineReportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINEREPORTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "offlineReportStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus xgetOfflineReportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus)get_store().find_element_user(OFFLINEREPORTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "offlineReportStatus" element
     */
    public boolean isSetOfflineReportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINEREPORTSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "offlineReportStatus" element
     */
    public void setOfflineReportStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus.Enum offlineReportStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINEREPORTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFLINEREPORTSTATUS$0);
            }
            target.setEnumValue(offlineReportStatus);
        }
    }
    
    /**
     * Sets (as xml) the "offlineReportStatus" element
     */
    public void xsetOfflineReportStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus offlineReportStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus)get_store().find_element_user(OFFLINEREPORTSTATUS$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus)get_store().add_element_user(OFFLINEREPORTSTATUS$0);
            }
            target.set(offlineReportStatus);
        }
    }
    
    /**
     * Unsets the "offlineReportStatus" element
     */
    public void unsetOfflineReportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINEREPORTSTATUS$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$2, 0);
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
            return get_store().count_elements(REPORT$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORT$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORT$2);
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
            get_store().remove_element(REPORT$2, 0);
        }
    }
    
    /**
     * Gets array of all "debts" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] getDebtsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEBTS$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "debts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry getDebtsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().find_element_user(DEBTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "debts" element
     */
    public int sizeOfDebtsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEBTS$4);
        }
    }
    
    /**
     * Sets array of all "debts" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDebtsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] debtsArray)
    {
        check_orphaned();
        arraySetterHelper(debtsArray, DEBTS$4);
    }
    
    /**
     * Sets ith "debts" element
     */
    public void setDebtsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry debts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().find_element_user(DEBTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(debts);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "debts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry insertNewDebts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().insert_element_user(DEBTS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "debts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry addNewDebts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().add_element_user(DEBTS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "debts" element
     */
    public void removeDebts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEBTS$4, i);
        }
    }
    
    /**
     * Gets the "offlineReportIdentifier" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier getOfflineReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().find_element_user(OFFLINEREPORTIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offlineReportIdentifier" element
     */
    public boolean isSetOfflineReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINEREPORTIDENTIFIER$6) != 0;
        }
    }
    
    /**
     * Sets the "offlineReportIdentifier" element
     */
    public void setOfflineReportIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier offlineReportIdentifier)
    {
        generatedSetterHelperImpl(offlineReportIdentifier, OFFLINEREPORTIDENTIFIER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "offlineReportIdentifier" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier addNewOfflineReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().add_element_user(OFFLINEREPORTIDENTIFIER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "offlineReportIdentifier" element
     */
    public void unsetOfflineReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINEREPORTIDENTIFIER$6, 0);
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
    
    /**
     * Gets the "rejectionReason" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.Enum getRejectionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTIONREASON$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rejectionReason" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason xgetRejectionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason)get_store().find_element_user(REJECTIONREASON$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "rejectionReason" element
     */
    public boolean isSetRejectionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REJECTIONREASON$10) != 0;
        }
    }
    
    /**
     * Sets the "rejectionReason" element
     */
    public void setRejectionReason(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.Enum rejectionReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTIONREASON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REJECTIONREASON$10);
            }
            target.setEnumValue(rejectionReason);
        }
    }
    
    /**
     * Sets (as xml) the "rejectionReason" element
     */
    public void xsetRejectionReason(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason rejectionReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason)get_store().find_element_user(REJECTIONREASON$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason)get_store().add_element_user(REJECTIONREASON$10);
            }
            target.set(rejectionReason);
        }
    }
    
    /**
     * Unsets the "rejectionReason" element
     */
    public void unsetRejectionReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REJECTIONREASON$10, 0);
        }
    }
    
    /**
     * Gets the "numberOfOriginalDocuments" element
     */
    public java.math.BigInteger getNumberOfOriginalDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFORIGINALDOCUMENTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfOriginalDocuments" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNumberOfOriginalDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFORIGINALDOCUMENTS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberOfOriginalDocuments" element
     */
    public boolean isSetNumberOfOriginalDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFORIGINALDOCUMENTS$12) != 0;
        }
    }
    
    /**
     * Sets the "numberOfOriginalDocuments" element
     */
    public void setNumberOfOriginalDocuments(java.math.BigInteger numberOfOriginalDocuments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFORIGINALDOCUMENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFORIGINALDOCUMENTS$12);
            }
            target.setBigIntegerValue(numberOfOriginalDocuments);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfOriginalDocuments" element
     */
    public void xsetNumberOfOriginalDocuments(org.apache.xmlbeans.XmlInteger numberOfOriginalDocuments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFORIGINALDOCUMENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMBEROFORIGINALDOCUMENTS$12);
            }
            target.set(numberOfOriginalDocuments);
        }
    }
    
    /**
     * Unsets the "numberOfOriginalDocuments" element
     */
    public void unsetNumberOfOriginalDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFORIGINALDOCUMENTS$12, 0);
        }
    }
}
