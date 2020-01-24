/*
 * XML Type:  CompanyBaseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyBaseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyBaseDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData
{
    private static final long serialVersionUID = 1L;
    
    public CompanyBaseDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "mainAddress");
    private static final javax.xml.namespace.QName COMPANYREGISTRATIONDATA$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyRegistrationData");
    private static final javax.xml.namespace.QName COMPANYDETAILDATA$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyDetailData");
    private static final javax.xml.namespace.QName COMPANYHISTORYITEMS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyHistoryItems");
    private static final javax.xml.namespace.QName REGISTRYTYPE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "registryType");
    private static final javax.xml.namespace.QName ACTIVITYSTATUS$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "activityStatus");
    private static final javax.xml.namespace.QName ACTIVITYSTATUSORIGINAL$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "activityStatusOriginal");
    private static final javax.xml.namespace.QName LEGALFORMTYPE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormType");
    private static final javax.xml.namespace.QName LEGALFORMTYPEORIGINAL$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormTypeOriginal");
    private static final javax.xml.namespace.QName LEGALFORMTEXT$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormText");
    private static final javax.xml.namespace.QName IDENTIFIERS$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifiers");
    
    
    /**
     * Gets the "mainAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription getMainAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().find_element_user(MAINADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mainAddress" element
     */
    public void setMainAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription mainAddress)
    {
        generatedSetterHelperImpl(mainAddress, MAINADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mainAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription addNewMainAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().add_element_user(MAINADDRESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "companyRegistrationData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData getCompanyRegistrationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData)get_store().find_element_user(COMPANYREGISTRATIONDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "companyRegistrationData" element
     */
    public boolean isSetCompanyRegistrationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYREGISTRATIONDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "companyRegistrationData" element
     */
    public void setCompanyRegistrationData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData companyRegistrationData)
    {
        generatedSetterHelperImpl(companyRegistrationData, COMPANYREGISTRATIONDATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "companyRegistrationData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData addNewCompanyRegistrationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData)get_store().add_element_user(COMPANYREGISTRATIONDATA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "companyRegistrationData" element
     */
    public void unsetCompanyRegistrationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYREGISTRATIONDATA$2, 0);
        }
    }
    
    /**
     * Gets the "companyDetailData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData getCompanyDetailData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData)get_store().find_element_user(COMPANYDETAILDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "companyDetailData" element
     */
    public boolean isSetCompanyDetailData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYDETAILDATA$4) != 0;
        }
    }
    
    /**
     * Sets the "companyDetailData" element
     */
    public void setCompanyDetailData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData companyDetailData)
    {
        generatedSetterHelperImpl(companyDetailData, COMPANYDETAILDATA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "companyDetailData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData addNewCompanyDetailData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData)get_store().add_element_user(COMPANYDETAILDATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "companyDetailData" element
     */
    public void unsetCompanyDetailData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYDETAILDATA$4, 0);
        }
    }
    
    /**
     * Gets array of all "companyHistoryItems" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[] getCompanyHistoryItemsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPANYHISTORYITEMS$6, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "companyHistoryItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem getCompanyHistoryItemsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem)get_store().find_element_user(COMPANYHISTORYITEMS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "companyHistoryItems" element
     */
    public int sizeOfCompanyHistoryItemsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYHISTORYITEMS$6);
        }
    }
    
    /**
     * Sets array of all "companyHistoryItems" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCompanyHistoryItemsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[] companyHistoryItemsArray)
    {
        check_orphaned();
        arraySetterHelper(companyHistoryItemsArray, COMPANYHISTORYITEMS$6);
    }
    
    /**
     * Sets ith "companyHistoryItems" element
     */
    public void setCompanyHistoryItemsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem companyHistoryItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem)get_store().find_element_user(COMPANYHISTORYITEMS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(companyHistoryItems);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "companyHistoryItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem insertNewCompanyHistoryItems(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem)get_store().insert_element_user(COMPANYHISTORYITEMS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "companyHistoryItems" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem addNewCompanyHistoryItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem)get_store().add_element_user(COMPANYHISTORYITEMS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "companyHistoryItems" element
     */
    public void removeCompanyHistoryItems(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYHISTORYITEMS$6, i);
        }
    }
    
    /**
     * Gets the "registryType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType.Enum getRegistryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "registryType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType xgetRegistryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType)get_store().find_element_user(REGISTRYTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "registryType" element
     */
    public void setRegistryType(ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType.Enum registryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRYTYPE$8);
            }
            target.setEnumValue(registryType);
        }
    }
    
    /**
     * Sets (as xml) the "registryType" element
     */
    public void xsetRegistryType(ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType registryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType)get_store().find_element_user(REGISTRYTYPE$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType)get_store().add_element_user(REGISTRYTYPE$8);
            }
            target.set(registryType);
        }
    }
    
    /**
     * Gets the "activityStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum getActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus xgetActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().find_element_user(ACTIVITYSTATUS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activityStatus" element
     */
    public void setActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUS$10);
            }
            target.setEnumValue(activityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "activityStatus" element
     */
    public void xsetActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().find_element_user(ACTIVITYSTATUS$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().add_element_user(ACTIVITYSTATUS$10);
            }
            target.set(activityStatus);
        }
    }
    
    /**
     * Gets the "activityStatusOriginal" element
     */
    public java.lang.String getActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityStatusOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "activityStatusOriginal" element
     */
    public boolean isSetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYSTATUSORIGINAL$12) != 0;
        }
    }
    
    /**
     * Sets the "activityStatusOriginal" element
     */
    public void setActivityStatusOriginal(java.lang.String activityStatusOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUSORIGINAL$12);
            }
            target.setStringValue(activityStatusOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "activityStatusOriginal" element
     */
    public void xsetActivityStatusOriginal(org.apache.xmlbeans.XmlString activityStatusOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYSTATUSORIGINAL$12);
            }
            target.set(activityStatusOriginal);
        }
    }
    
    /**
     * Unsets the "activityStatusOriginal" element
     */
    public void unsetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYSTATUSORIGINAL$12, 0);
        }
    }
    
    /**
     * Gets the "legalFormType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum getLegalFormType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType xgetLegalFormType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().find_element_user(LEGALFORMTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "legalFormType" element
     */
    public void setLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum legalFormType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTYPE$14);
            }
            target.setEnumValue(legalFormType);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormType" element
     */
    public void xsetLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType legalFormType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().find_element_user(LEGALFORMTYPE$14, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().add_element_user(LEGALFORMTYPE$14);
            }
            target.set(legalFormType);
        }
    }
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    public java.lang.String getLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    public boolean isSetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALFORMTYPEORIGINAL$16) != 0;
        }
    }
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    public void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTYPEORIGINAL$16);
            }
            target.setStringValue(legalFormTypeOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    public void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTYPEORIGINAL$16);
            }
            target.set(legalFormTypeOriginal);
        }
    }
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    public void unsetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALFORMTYPEORIGINAL$16, 0);
        }
    }
    
    /**
     * Gets the "legalFormText" element
     */
    public java.lang.String getLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTEXT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormText" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTEXT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "legalFormText" element
     */
    public boolean isSetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALFORMTEXT$18) != 0;
        }
    }
    
    /**
     * Sets the "legalFormText" element
     */
    public void setLegalFormText(java.lang.String legalFormText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTEXT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTEXT$18);
            }
            target.setStringValue(legalFormText);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormText" element
     */
    public void xsetLegalFormText(org.apache.xmlbeans.XmlString legalFormText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTEXT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTEXT$18);
            }
            target.set(legalFormText);
        }
    }
    
    /**
     * Unsets the "legalFormText" element
     */
    public void unsetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALFORMTEXT$18, 0);
        }
    }
    
    /**
     * Gets array of all "identifiers" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] getIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIERS$20, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifiersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIERS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifiers" element
     */
    public int sizeOfIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERS$20);
        }
    }
    
    /**
     * Sets array of all "identifiers" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifiersArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] identifiersArray)
    {
        check_orphaned();
        arraySetterHelper(identifiersArray, IDENTIFIERS$20);
    }
    
    /**
     * Sets ith "identifiers" element
     */
    public void setIdentifiersArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIERS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifiers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier insertNewIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().insert_element_user(IDENTIFIERS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(IDENTIFIERS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifiers" element
     */
    public void removeIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERS$20, i);
        }
    }
}
