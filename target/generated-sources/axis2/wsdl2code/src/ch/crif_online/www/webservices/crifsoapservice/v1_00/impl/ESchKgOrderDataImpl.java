/*
 * XML Type:  ESchKgOrderData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ESchKgOrderData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgOrderDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgOrderDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderId");
    private static final javax.xml.namespace.QName REFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "referenceNumber");
    private static final javax.xml.namespace.QName EXTERNALID$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "externalId");
    private static final javax.xml.namespace.QName CASEGROUP$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "caseGroup");
    private static final javax.xml.namespace.QName CASEGROUPTYPE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "caseGroupType");
    private static final javax.xml.namespace.QName REPRESENTATIVE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "representative");
    private static final javax.xml.namespace.QName ADDRESS$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName JOBLIST$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "jobList");
    private static final javax.xml.namespace.QName CLAIMLIST$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "claimList");
    private static final javax.xml.namespace.QName STATUSMESSAGE$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "statusMessage");
    private static final javax.xml.namespace.QName OFFICECASENUMBER$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "officeCaseNumber");
    private static final javax.xml.namespace.QName OFFICESTATUS$22 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "officeStatus");
    private static final javax.xml.namespace.QName DEADLINEFROM$24 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "deadlineFrom");
    private static final javax.xml.namespace.QName DEADLINETO$26 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "deadlineTo");
    
    
    /**
     * Gets the "orderId" element
     */
    public java.math.BigInteger getOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderId" element
     */
    public void setOrderId(java.math.BigInteger orderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERID$0);
            }
            target.setBigIntegerValue(orderId);
        }
    }
    
    /**
     * Sets (as xml) the "orderId" element
     */
    public void xsetOrderId(org.apache.xmlbeans.XmlInteger orderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORDERID$0);
            }
            target.set(orderId);
        }
    }
    
    /**
     * Gets the "referenceNumber" element
     */
    public java.lang.String getReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "referenceNumber" element
     */
    public boolean isSetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "referenceNumber" element
     */
    public void setReferenceNumber(java.lang.String referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENUMBER$2);
            }
            target.setStringValue(referenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "referenceNumber" element
     */
    public void xsetReferenceNumber(org.apache.xmlbeans.XmlString referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCENUMBER$2);
            }
            target.set(referenceNumber);
        }
    }
    
    /**
     * Unsets the "referenceNumber" element
     */
    public void unsetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "externalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            return target;
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
            return get_store().count_elements(EXTERNALID$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$4);
            }
            target.set(externalId);
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
            get_store().remove_element(EXTERNALID$4, 0);
        }
    }
    
    /**
     * Gets the "caseGroup" element
     */
    public java.lang.String getCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "caseGroup" element
     */
    public boolean isSetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEGROUP$6) != 0;
        }
    }
    
    /**
     * Sets the "caseGroup" element
     */
    public void setCaseGroup(java.lang.String caseGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEGROUP$6);
            }
            target.setStringValue(caseGroup);
        }
    }
    
    /**
     * Sets (as xml) the "caseGroup" element
     */
    public void xsetCaseGroup(org.apache.xmlbeans.XmlString caseGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUP$6);
            }
            target.set(caseGroup);
        }
    }
    
    /**
     * Unsets the "caseGroup" element
     */
    public void unsetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEGROUP$6, 0);
        }
    }
    
    /**
     * Gets the "caseGroupType" element
     */
    public java.lang.String getCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUPTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseGroupType" element
     */
    public org.apache.xmlbeans.XmlString xgetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "caseGroupType" element
     */
    public boolean isSetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEGROUPTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "caseGroupType" element
     */
    public void setCaseGroupType(java.lang.String caseGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUPTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEGROUPTYPE$8);
            }
            target.setStringValue(caseGroupType);
        }
    }
    
    /**
     * Sets (as xml) the "caseGroupType" element
     */
    public void xsetCaseGroupType(org.apache.xmlbeans.XmlString caseGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUPTYPE$8);
            }
            target.set(caseGroupType);
        }
    }
    
    /**
     * Unsets the "caseGroupType" element
     */
    public void unsetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEGROUPTYPE$8, 0);
        }
    }
    
    /**
     * Gets the "representative" element
     */
    public java.lang.String getRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIVE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representative" element
     */
    public org.apache.xmlbeans.XmlString xgetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "representative" element
     */
    public boolean isSetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIVE$10) != 0;
        }
    }
    
    /**
     * Sets the "representative" element
     */
    public void setRepresentative(java.lang.String representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPRESENTATIVE$10);
            }
            target.setStringValue(representative);
        }
    }
    
    /**
     * Sets (as xml) the "representative" element
     */
    public void xsetRepresentative(org.apache.xmlbeans.XmlString representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPRESENTATIVE$10);
            }
            target.set(representative);
        }
    }
    
    /**
     * Unsets the "representative" element
     */
    public void unsetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIVE$10, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$12);
            return target;
        }
    }
    
    /**
     * Gets the "jobList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList getJobList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList)get_store().find_element_user(JOBLIST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jobList" element
     */
    public void setJobList(ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList jobList)
    {
        generatedSetterHelperImpl(jobList, JOBLIST$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jobList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList addNewJobList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList)get_store().add_element_user(JOBLIST$14);
            return target;
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList)get_store().find_element_user(CLAIMLIST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "claimList" element
     */
    public void setClaimList(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList claimList)
    {
        generatedSetterHelperImpl(claimList, CLAIMLIST$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList)get_store().add_element_user(CLAIMLIST$16);
            return target;
        }
    }
    
    /**
     * Gets the "statusMessage" element
     */
    public java.lang.String getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusMessage" element
     */
    public boolean isSetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSMESSAGE$18) != 0;
        }
    }
    
    /**
     * Sets the "statusMessage" element
     */
    public void setStatusMessage(java.lang.String statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$18);
            }
            target.setStringValue(statusMessage);
        }
    }
    
    /**
     * Sets (as xml) the "statusMessage" element
     */
    public void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$18);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Unsets the "statusMessage" element
     */
    public void unsetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSMESSAGE$18, 0);
        }
    }
    
    /**
     * Gets the "officeCaseNumber" element
     */
    public java.lang.String getOfficeCaseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICECASENUMBER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "officeCaseNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOfficeCaseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFICECASENUMBER$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "officeCaseNumber" element
     */
    public boolean isSetOfficeCaseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFICECASENUMBER$20) != 0;
        }
    }
    
    /**
     * Sets the "officeCaseNumber" element
     */
    public void setOfficeCaseNumber(java.lang.String officeCaseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICECASENUMBER$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFICECASENUMBER$20);
            }
            target.setStringValue(officeCaseNumber);
        }
    }
    
    /**
     * Sets (as xml) the "officeCaseNumber" element
     */
    public void xsetOfficeCaseNumber(org.apache.xmlbeans.XmlString officeCaseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFICECASENUMBER$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFICECASENUMBER$20);
            }
            target.set(officeCaseNumber);
        }
    }
    
    /**
     * Unsets the "officeCaseNumber" element
     */
    public void unsetOfficeCaseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFICECASENUMBER$20, 0);
        }
    }
    
    /**
     * Gets the "officeStatus" element
     */
    public java.lang.String getOfficeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICESTATUS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "officeStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetOfficeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFICESTATUS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "officeStatus" element
     */
    public boolean isSetOfficeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFICESTATUS$22) != 0;
        }
    }
    
    /**
     * Sets the "officeStatus" element
     */
    public void setOfficeStatus(java.lang.String officeStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICESTATUS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFICESTATUS$22);
            }
            target.setStringValue(officeStatus);
        }
    }
    
    /**
     * Sets (as xml) the "officeStatus" element
     */
    public void xsetOfficeStatus(org.apache.xmlbeans.XmlString officeStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFICESTATUS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFICESTATUS$22);
            }
            target.set(officeStatus);
        }
    }
    
    /**
     * Unsets the "officeStatus" element
     */
    public void unsetOfficeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFICESTATUS$22, 0);
        }
    }
    
    /**
     * Gets the "deadlineFrom" element
     */
    public java.lang.String getDeadlineFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINEFROM$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deadlineFrom" element
     */
    public org.apache.xmlbeans.XmlString xgetDeadlineFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEADLINEFROM$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "deadlineFrom" element
     */
    public boolean isSetDeadlineFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEADLINEFROM$24) != 0;
        }
    }
    
    /**
     * Sets the "deadlineFrom" element
     */
    public void setDeadlineFrom(java.lang.String deadlineFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINEFROM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEADLINEFROM$24);
            }
            target.setStringValue(deadlineFrom);
        }
    }
    
    /**
     * Sets (as xml) the "deadlineFrom" element
     */
    public void xsetDeadlineFrom(org.apache.xmlbeans.XmlString deadlineFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEADLINEFROM$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEADLINEFROM$24);
            }
            target.set(deadlineFrom);
        }
    }
    
    /**
     * Unsets the "deadlineFrom" element
     */
    public void unsetDeadlineFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEADLINEFROM$24, 0);
        }
    }
    
    /**
     * Gets the "deadlineTo" element
     */
    public java.lang.String getDeadlineTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINETO$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deadlineTo" element
     */
    public org.apache.xmlbeans.XmlString xgetDeadlineTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEADLINETO$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "deadlineTo" element
     */
    public boolean isSetDeadlineTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEADLINETO$26) != 0;
        }
    }
    
    /**
     * Sets the "deadlineTo" element
     */
    public void setDeadlineTo(java.lang.String deadlineTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEADLINETO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEADLINETO$26);
            }
            target.setStringValue(deadlineTo);
        }
    }
    
    /**
     * Sets (as xml) the "deadlineTo" element
     */
    public void xsetDeadlineTo(org.apache.xmlbeans.XmlString deadlineTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEADLINETO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEADLINETO$26);
            }
            target.set(deadlineTo);
        }
    }
    
    /**
     * Unsets the "deadlineTo" element
     */
    public void unsetDeadlineTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEADLINETO$26, 0);
        }
    }
}
