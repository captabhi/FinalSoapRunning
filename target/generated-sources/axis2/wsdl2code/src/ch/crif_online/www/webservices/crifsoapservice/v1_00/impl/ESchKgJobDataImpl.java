/*
 * XML Type:  ESchKgJobData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ESchKgJobData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgJobDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgJobDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "language");
    private static final javax.xml.namespace.QName CLAIMLIST$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "claimList");
    private static final javax.xml.namespace.QName PAYMENTLIST$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentList");
    private static final javax.xml.namespace.QName REIMBURSEMENTDATA$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reimbursementData");
    private static final javax.xml.namespace.QName INTERESTVALUTA$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "interestValuta");
    private static final javax.xml.namespace.QName INTERESTREASON$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "interestReason");
    private static final javax.xml.namespace.QName FILELIST$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "fileList");
    
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$0);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$0, 0);
        }
    }
    
    /**
     * Gets the "claimList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList getClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList)get_store().find_element_user(CLAIMLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "claimList" element
     */
    public boolean isSetClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIMLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "claimList" element
     */
    public void setClaimList(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList claimList)
    {
        generatedSetterHelperImpl(claimList, CLAIMLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "claimList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList addNewClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList)get_store().add_element_user(CLAIMLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "claimList" element
     */
    public void unsetClaimList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIMLIST$2, 0);
        }
    }
    
    /**
     * Gets the "paymentList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList getPaymentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList)get_store().find_element_user(PAYMENTLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paymentList" element
     */
    public boolean isSetPaymentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "paymentList" element
     */
    public void setPaymentList(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList paymentList)
    {
        generatedSetterHelperImpl(paymentList, PAYMENTLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "paymentList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList addNewPaymentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList)get_store().add_element_user(PAYMENTLIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "paymentList" element
     */
    public void unsetPaymentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTLIST$4, 0);
        }
    }
    
    /**
     * Gets the "reimbursementData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData getReimbursementData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData)get_store().find_element_user(REIMBURSEMENTDATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reimbursementData" element
     */
    public boolean isSetReimbursementData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REIMBURSEMENTDATA$6) != 0;
        }
    }
    
    /**
     * Sets the "reimbursementData" element
     */
    public void setReimbursementData(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData reimbursementData)
    {
        generatedSetterHelperImpl(reimbursementData, REIMBURSEMENTDATA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reimbursementData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData addNewReimbursementData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData)get_store().add_element_user(REIMBURSEMENTDATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reimbursementData" element
     */
    public void unsetReimbursementData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REIMBURSEMENTDATA$6, 0);
        }
    }
    
    /**
     * Gets the "interestValuta" element
     */
    public java.lang.String getInterestValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTVALUTA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interestValuta" element
     */
    public org.apache.xmlbeans.XmlString xgetInterestValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTVALUTA$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "interestValuta" element
     */
    public boolean isSetInterestValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTVALUTA$8) != 0;
        }
    }
    
    /**
     * Sets the "interestValuta" element
     */
    public void setInterestValuta(java.lang.String interestValuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTVALUTA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTVALUTA$8);
            }
            target.setStringValue(interestValuta);
        }
    }
    
    /**
     * Sets (as xml) the "interestValuta" element
     */
    public void xsetInterestValuta(org.apache.xmlbeans.XmlString interestValuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTVALUTA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERESTVALUTA$8);
            }
            target.set(interestValuta);
        }
    }
    
    /**
     * Unsets the "interestValuta" element
     */
    public void unsetInterestValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTVALUTA$8, 0);
        }
    }
    
    /**
     * Gets the "interestReason" element
     */
    public java.lang.String getInterestReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTREASON$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interestReason" element
     */
    public org.apache.xmlbeans.XmlString xgetInterestReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTREASON$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "interestReason" element
     */
    public boolean isSetInterestReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTREASON$10) != 0;
        }
    }
    
    /**
     * Sets the "interestReason" element
     */
    public void setInterestReason(java.lang.String interestReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTREASON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTREASON$10);
            }
            target.setStringValue(interestReason);
        }
    }
    
    /**
     * Sets (as xml) the "interestReason" element
     */
    public void xsetInterestReason(org.apache.xmlbeans.XmlString interestReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTREASON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERESTREASON$10);
            }
            target.set(interestReason);
        }
    }
    
    /**
     * Unsets the "interestReason" element
     */
    public void unsetInterestReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTREASON$10, 0);
        }
    }
    
    /**
     * Gets array of all "fileList" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] getFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILELIST$12, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fileList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData getFileListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().find_element_user(FILELIST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fileList" element
     */
    public int sizeOfFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILELIST$12);
        }
    }
    
    /**
     * Sets array of all "fileList" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFileListArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] fileListArray)
    {
        check_orphaned();
        arraySetterHelper(fileListArray, FILELIST$12);
    }
    
    /**
     * Sets ith "fileList" element
     */
    public void setFileListArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData fileList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().find_element_user(FILELIST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fileList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData insertNewFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().insert_element_user(FILELIST$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData addNewFileList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().add_element_user(FILELIST$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "fileList" element
     */
    public void removeFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILELIST$12, i);
        }
    }
}
