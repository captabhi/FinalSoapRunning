/*
 * XML Type:  CompanyDetailData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyDetailData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyDetailDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData
{
    private static final long serialVersionUID = 1L;
    
    public CompanyDetailDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULTIMATEMOTHERCOMPANY$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "ultimateMotherCompany");
    private static final javax.xml.namespace.QName INDUSTRYCODES$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "industryCodes");
    private static final javax.xml.namespace.QName NROFEMPLOYEES$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "nrOfEmployees");
    private static final javax.xml.namespace.QName SIZECLASS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "sizeClass");
    private static final javax.xml.namespace.QName TURNOVERCURRENCY$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "turnoverCurrency");
    private static final javax.xml.namespace.QName TURNOVERRANGE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "turnoverRange");
    private static final javax.xml.namespace.QName TURNOVERINEXPORT$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "turnoverInExport");
    private static final javax.xml.namespace.QName ACTIVITYINDEX$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "activityIndex");
    private static final javax.xml.namespace.QName KNOWNSINCE$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "knownSince");
    private static final javax.xml.namespace.QName DATEFINANCIALSTATEMENT$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateFinancialStatement");
    private static final javax.xml.namespace.QName DATEFINANCIALSTATEMENTHANDEDIN$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateFinancialStatementHandedIn");
    private static final javax.xml.namespace.QName BANKACCOUNTS$22 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "bankAccounts");
    
    
    /**
     * Gets the "ultimateMotherCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getUltimateMotherCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(ULTIMATEMOTHERCOMPANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ultimateMotherCompany" element
     */
    public boolean isSetUltimateMotherCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ULTIMATEMOTHERCOMPANY$0) != 0;
        }
    }
    
    /**
     * Sets the "ultimateMotherCompany" element
     */
    public void setUltimateMotherCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData ultimateMotherCompany)
    {
        generatedSetterHelperImpl(ultimateMotherCompany, ULTIMATEMOTHERCOMPANY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ultimateMotherCompany" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewUltimateMotherCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(ULTIMATEMOTHERCOMPANY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ultimateMotherCompany" element
     */
    public void unsetUltimateMotherCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ULTIMATEMOTHERCOMPANY$0, 0);
        }
    }
    
    /**
     * Gets array of all "industryCodes" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[] getIndustryCodesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INDUSTRYCODES$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "industryCodes" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode getIndustryCodesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().find_element_user(INDUSTRYCODES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "industryCodes" element
     */
    public int sizeOfIndustryCodesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDUSTRYCODES$2);
        }
    }
    
    /**
     * Sets array of all "industryCodes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIndustryCodesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[] industryCodesArray)
    {
        check_orphaned();
        arraySetterHelper(industryCodesArray, INDUSTRYCODES$2);
    }
    
    /**
     * Sets ith "industryCodes" element
     */
    public void setIndustryCodesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode industryCodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().find_element_user(INDUSTRYCODES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(industryCodes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "industryCodes" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode insertNewIndustryCodes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().insert_element_user(INDUSTRYCODES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "industryCodes" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode addNewIndustryCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode)get_store().add_element_user(INDUSTRYCODES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "industryCodes" element
     */
    public void removeIndustryCodes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDUSTRYCODES$2, i);
        }
    }
    
    /**
     * Gets the "nrOfEmployees" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getNrOfEmployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().find_element_user(NROFEMPLOYEES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nrOfEmployees" element
     */
    public boolean isSetNrOfEmployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NROFEMPLOYEES$4) != 0;
        }
    }
    
    /**
     * Sets the "nrOfEmployees" element
     */
    public void setNrOfEmployees(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range nrOfEmployees)
    {
        generatedSetterHelperImpl(nrOfEmployees, NROFEMPLOYEES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nrOfEmployees" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewNrOfEmployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().add_element_user(NROFEMPLOYEES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "nrOfEmployees" element
     */
    public void unsetNrOfEmployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NROFEMPLOYEES$4, 0);
        }
    }
    
    /**
     * Gets the "sizeClass" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass.Enum getSizeClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZECLASS$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sizeClass" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass xgetSizeClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass)get_store().find_element_user(SIZECLASS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "sizeClass" element
     */
    public boolean isSetSizeClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZECLASS$6) != 0;
        }
    }
    
    /**
     * Sets the "sizeClass" element
     */
    public void setSizeClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass.Enum sizeClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZECLASS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZECLASS$6);
            }
            target.setEnumValue(sizeClass);
        }
    }
    
    /**
     * Sets (as xml) the "sizeClass" element
     */
    public void xsetSizeClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass sizeClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass)get_store().find_element_user(SIZECLASS$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass)get_store().add_element_user(SIZECLASS$6);
            }
            target.set(sizeClass);
        }
    }
    
    /**
     * Unsets the "sizeClass" element
     */
    public void unsetSizeClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZECLASS$6, 0);
        }
    }
    
    /**
     * Gets the "turnoverCurrency" element
     */
    public java.lang.String getTurnoverCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURNOVERCURRENCY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "turnoverCurrency" element
     */
    public org.apache.xmlbeans.XmlString xgetTurnoverCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURNOVERCURRENCY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "turnoverCurrency" element
     */
    public boolean isSetTurnoverCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TURNOVERCURRENCY$8) != 0;
        }
    }
    
    /**
     * Sets the "turnoverCurrency" element
     */
    public void setTurnoverCurrency(java.lang.String turnoverCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURNOVERCURRENCY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TURNOVERCURRENCY$8);
            }
            target.setStringValue(turnoverCurrency);
        }
    }
    
    /**
     * Sets (as xml) the "turnoverCurrency" element
     */
    public void xsetTurnoverCurrency(org.apache.xmlbeans.XmlString turnoverCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TURNOVERCURRENCY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TURNOVERCURRENCY$8);
            }
            target.set(turnoverCurrency);
        }
    }
    
    /**
     * Unsets the "turnoverCurrency" element
     */
    public void unsetTurnoverCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TURNOVERCURRENCY$8, 0);
        }
    }
    
    /**
     * Gets the "turnoverRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getTurnoverRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().find_element_user(TURNOVERRANGE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "turnoverRange" element
     */
    public boolean isSetTurnoverRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TURNOVERRANGE$10) != 0;
        }
    }
    
    /**
     * Sets the "turnoverRange" element
     */
    public void setTurnoverRange(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range turnoverRange)
    {
        generatedSetterHelperImpl(turnoverRange, TURNOVERRANGE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "turnoverRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewTurnoverRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().add_element_user(TURNOVERRANGE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "turnoverRange" element
     */
    public void unsetTurnoverRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TURNOVERRANGE$10, 0);
        }
    }
    
    /**
     * Gets the "turnoverInExport" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getTurnoverInExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURNOVERINEXPORT$12, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "turnoverInExport" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetTurnoverInExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(TURNOVERINEXPORT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "turnoverInExport" element
     */
    public boolean isSetTurnoverInExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TURNOVERINEXPORT$12) != 0;
        }
    }
    
    /**
     * Sets the "turnoverInExport" element
     */
    public void setTurnoverInExport(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum turnoverInExport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TURNOVERINEXPORT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TURNOVERINEXPORT$12);
            }
            target.setEnumValue(turnoverInExport);
        }
    }
    
    /**
     * Sets (as xml) the "turnoverInExport" element
     */
    public void xsetTurnoverInExport(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean turnoverInExport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(TURNOVERINEXPORT$12, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(TURNOVERINEXPORT$12);
            }
            target.set(turnoverInExport);
        }
    }
    
    /**
     * Unsets the "turnoverInExport" element
     */
    public void unsetTurnoverInExport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TURNOVERINEXPORT$12, 0);
        }
    }
    
    /**
     * Gets the "activityIndex" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex.Enum getActivityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYINDEX$14, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityIndex" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex xgetActivityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex)get_store().find_element_user(ACTIVITYINDEX$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "activityIndex" element
     */
    public boolean isSetActivityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYINDEX$14) != 0;
        }
    }
    
    /**
     * Sets the "activityIndex" element
     */
    public void setActivityIndex(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex.Enum activityIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYINDEX$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYINDEX$14);
            }
            target.setEnumValue(activityIndex);
        }
    }
    
    /**
     * Sets (as xml) the "activityIndex" element
     */
    public void xsetActivityIndex(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex activityIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex)get_store().find_element_user(ACTIVITYINDEX$14, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex)get_store().add_element_user(ACTIVITYINDEX$14);
            }
            target.set(activityIndex);
        }
    }
    
    /**
     * Unsets the "activityIndex" element
     */
    public void unsetActivityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYINDEX$14, 0);
        }
    }
    
    /**
     * Gets the "knownSince" element
     */
    public java.lang.String getKnownSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KNOWNSINCE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "knownSince" element
     */
    public org.apache.xmlbeans.XmlString xgetKnownSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KNOWNSINCE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "knownSince" element
     */
    public boolean isSetKnownSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOWNSINCE$16) != 0;
        }
    }
    
    /**
     * Sets the "knownSince" element
     */
    public void setKnownSince(java.lang.String knownSince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KNOWNSINCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KNOWNSINCE$16);
            }
            target.setStringValue(knownSince);
        }
    }
    
    /**
     * Sets (as xml) the "knownSince" element
     */
    public void xsetKnownSince(org.apache.xmlbeans.XmlString knownSince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KNOWNSINCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KNOWNSINCE$16);
            }
            target.set(knownSince);
        }
    }
    
    /**
     * Unsets the "knownSince" element
     */
    public void unsetKnownSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOWNSINCE$16, 0);
        }
    }
    
    /**
     * Gets the "dateFinancialStatement" element
     */
    public java.lang.String getDateFinancialStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFINANCIALSTATEMENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateFinancialStatement" element
     */
    public org.apache.xmlbeans.XmlString xgetDateFinancialStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFINANCIALSTATEMENT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateFinancialStatement" element
     */
    public boolean isSetDateFinancialStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFINANCIALSTATEMENT$18) != 0;
        }
    }
    
    /**
     * Sets the "dateFinancialStatement" element
     */
    public void setDateFinancialStatement(java.lang.String dateFinancialStatement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFINANCIALSTATEMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEFINANCIALSTATEMENT$18);
            }
            target.setStringValue(dateFinancialStatement);
        }
    }
    
    /**
     * Sets (as xml) the "dateFinancialStatement" element
     */
    public void xsetDateFinancialStatement(org.apache.xmlbeans.XmlString dateFinancialStatement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFINANCIALSTATEMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEFINANCIALSTATEMENT$18);
            }
            target.set(dateFinancialStatement);
        }
    }
    
    /**
     * Unsets the "dateFinancialStatement" element
     */
    public void unsetDateFinancialStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFINANCIALSTATEMENT$18, 0);
        }
    }
    
    /**
     * Gets the "dateFinancialStatementHandedIn" element
     */
    public java.lang.String getDateFinancialStatementHandedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateFinancialStatementHandedIn" element
     */
    public org.apache.xmlbeans.XmlString xgetDateFinancialStatementHandedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateFinancialStatementHandedIn" element
     */
    public boolean isSetDateFinancialStatementHandedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFINANCIALSTATEMENTHANDEDIN$20) != 0;
        }
    }
    
    /**
     * Sets the "dateFinancialStatementHandedIn" element
     */
    public void setDateFinancialStatementHandedIn(java.lang.String dateFinancialStatementHandedIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20);
            }
            target.setStringValue(dateFinancialStatementHandedIn);
        }
    }
    
    /**
     * Sets (as xml) the "dateFinancialStatementHandedIn" element
     */
    public void xsetDateFinancialStatementHandedIn(org.apache.xmlbeans.XmlString dateFinancialStatementHandedIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEFINANCIALSTATEMENTHANDEDIN$20);
            }
            target.set(dateFinancialStatementHandedIn);
        }
    }
    
    /**
     * Unsets the "dateFinancialStatementHandedIn" element
     */
    public void unsetDateFinancialStatementHandedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFINANCIALSTATEMENTHANDEDIN$20, 0);
        }
    }
    
    /**
     * Gets array of all "bankAccounts" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[] getBankAccountsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BANKACCOUNTS$22, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bankAccounts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount getBankAccountsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount)get_store().find_element_user(BANKACCOUNTS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bankAccounts" element
     */
    public int sizeOfBankAccountsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANKACCOUNTS$22);
        }
    }
    
    /**
     * Sets array of all "bankAccounts" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBankAccountsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[] bankAccountsArray)
    {
        check_orphaned();
        arraySetterHelper(bankAccountsArray, BANKACCOUNTS$22);
    }
    
    /**
     * Sets ith "bankAccounts" element
     */
    public void setBankAccountsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount bankAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount)get_store().find_element_user(BANKACCOUNTS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bankAccounts);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bankAccounts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount insertNewBankAccounts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount)get_store().insert_element_user(BANKACCOUNTS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bankAccounts" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount addNewBankAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount)get_store().add_element_user(BANKACCOUNTS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "bankAccounts" element
     */
    public void removeBankAccounts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANKACCOUNTS$22, i);
        }
    }
}
