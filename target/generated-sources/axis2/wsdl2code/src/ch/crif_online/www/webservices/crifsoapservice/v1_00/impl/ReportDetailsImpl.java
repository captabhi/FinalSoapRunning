/*
 * XML Type:  ReportDetails
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ReportDetails(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ReportDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails
{
    private static final long serialVersionUID = 1L;
    
    public ReportDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBTS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "debts");
    private static final javax.xml.namespace.QName COMPANYBASEDATA$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyBaseData");
    private static final javax.xml.namespace.QName PAYMENTDELAY$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentDelay");
    private static final javax.xml.namespace.QName ORGANIZATIONPOSITIONLIST$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "organizationPositionList");
    private static final javax.xml.namespace.QName WHOOWNSWHOM$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "whoOwnsWhom");
    private static final javax.xml.namespace.QName FURTHERRELATIONS$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "furtherRelations");
    private static final javax.xml.namespace.QName PUBLICATIONLIST$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationList");
    private static final javax.xml.namespace.QName BRANCHOFFICELIST$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "branchOfficeList");
    private static final javax.xml.namespace.QName FINANCIALSTATEMENTS$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "financialStatements");
    private static final javax.xml.namespace.QName FINANCIALSTATEMENTSGROUP$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "financialStatementsGroup");
    private static final javax.xml.namespace.QName ADDRESSHISTORY$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressHistory");
    private static final javax.xml.namespace.QName BUSINESSINDUSTRYLICENSES$22 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "businessIndustryLicenses");
    private static final javax.xml.namespace.QName SCOREANALYSIS$24 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreAnalysis");
    private static final javax.xml.namespace.QName COMPLIANCECHECKRESULT$26 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "complianceCheckResult");
    private static final javax.xml.namespace.QName IDVERIFICATIONRESPONSEDATA$28 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationResponseData");
    private static final javax.xml.namespace.QName SCHUFARESPONSEDATA$30 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "schufaResponseData");
    private static final javax.xml.namespace.QName CONTROLPERSONS$32 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "controlPersons");
    private static final javax.xml.namespace.QName CONTROLPERSONSEXT$34 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "controlPersonsExt");
    
    
    /**
     * Gets array of all "debts" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] getDebtsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEBTS$0, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().find_element_user(DEBTS$0, i);
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
            return get_store().count_elements(DEBTS$0);
        }
    }
    
    /**
     * Sets array of all "debts" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDebtsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] debtsArray)
    {
        check_orphaned();
        arraySetterHelper(debtsArray, DEBTS$0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().find_element_user(DEBTS$0, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().insert_element_user(DEBTS$0, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry)get_store().add_element_user(DEBTS$0);
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
            get_store().remove_element(DEBTS$0, i);
        }
    }
    
    /**
     * Gets the "companyBaseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getCompanyBaseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(COMPANYBASEDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "companyBaseData" element
     */
    public boolean isSetCompanyBaseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYBASEDATA$2) != 0;
        }
    }
    
    /**
     * Sets the "companyBaseData" element
     */
    public void setCompanyBaseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData companyBaseData)
    {
        generatedSetterHelperImpl(companyBaseData, COMPANYBASEDATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "companyBaseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewCompanyBaseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(COMPANYBASEDATA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "companyBaseData" element
     */
    public void unsetCompanyBaseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYBASEDATA$2, 0);
        }
    }
    
    /**
     * Gets the "paymentDelay" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay getPaymentDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay)get_store().find_element_user(PAYMENTDELAY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paymentDelay" element
     */
    public boolean isSetPaymentDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTDELAY$4) != 0;
        }
    }
    
    /**
     * Sets the "paymentDelay" element
     */
    public void setPaymentDelay(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay paymentDelay)
    {
        generatedSetterHelperImpl(paymentDelay, PAYMENTDELAY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "paymentDelay" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay addNewPaymentDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay)get_store().add_element_user(PAYMENTDELAY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "paymentDelay" element
     */
    public void unsetPaymentDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTDELAY$4, 0);
        }
    }
    
    /**
     * Gets the "organizationPositionList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList getOrganizationPositionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList)get_store().find_element_user(ORGANIZATIONPOSITIONLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationPositionList" element
     */
    public boolean isSetOrganizationPositionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPOSITIONLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "organizationPositionList" element
     */
    public void setOrganizationPositionList(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList organizationPositionList)
    {
        generatedSetterHelperImpl(organizationPositionList, ORGANIZATIONPOSITIONLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "organizationPositionList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList addNewOrganizationPositionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList)get_store().add_element_user(ORGANIZATIONPOSITIONLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationPositionList" element
     */
    public void unsetOrganizationPositionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPOSITIONLIST$6, 0);
        }
    }
    
    /**
     * Gets the "whoOwnsWhom" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom getWhoOwnsWhom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom)get_store().find_element_user(WHOOWNSWHOM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "whoOwnsWhom" element
     */
    public boolean isSetWhoOwnsWhom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHOOWNSWHOM$8) != 0;
        }
    }
    
    /**
     * Sets the "whoOwnsWhom" element
     */
    public void setWhoOwnsWhom(ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom whoOwnsWhom)
    {
        generatedSetterHelperImpl(whoOwnsWhom, WHOOWNSWHOM$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "whoOwnsWhom" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom addNewWhoOwnsWhom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom)get_store().add_element_user(WHOOWNSWHOM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "whoOwnsWhom" element
     */
    public void unsetWhoOwnsWhom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHOOWNSWHOM$8, 0);
        }
    }
    
    /**
     * Gets the "furtherRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations getFurtherRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations)get_store().find_element_user(FURTHERRELATIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "furtherRelations" element
     */
    public boolean isSetFurtherRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FURTHERRELATIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "furtherRelations" element
     */
    public void setFurtherRelations(ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations furtherRelations)
    {
        generatedSetterHelperImpl(furtherRelations, FURTHERRELATIONS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "furtherRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations addNewFurtherRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations)get_store().add_element_user(FURTHERRELATIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "furtherRelations" element
     */
    public void unsetFurtherRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FURTHERRELATIONS$10, 0);
        }
    }
    
    /**
     * Gets the "publicationList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList getPublicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList)get_store().find_element_user(PUBLICATIONLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "publicationList" element
     */
    public boolean isSetPublicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "publicationList" element
     */
    public void setPublicationList(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList publicationList)
    {
        generatedSetterHelperImpl(publicationList, PUBLICATIONLIST$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "publicationList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList addNewPublicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList)get_store().add_element_user(PUBLICATIONLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "publicationList" element
     */
    public void unsetPublicationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONLIST$12, 0);
        }
    }
    
    /**
     * Gets the "branchOfficeList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList getBranchOfficeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList)get_store().find_element_user(BRANCHOFFICELIST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "branchOfficeList" element
     */
    public boolean isSetBranchOfficeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANCHOFFICELIST$14) != 0;
        }
    }
    
    /**
     * Sets the "branchOfficeList" element
     */
    public void setBranchOfficeList(ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList branchOfficeList)
    {
        generatedSetterHelperImpl(branchOfficeList, BRANCHOFFICELIST$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "branchOfficeList" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList addNewBranchOfficeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList)get_store().add_element_user(BRANCHOFFICELIST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "branchOfficeList" element
     */
    public void unsetBranchOfficeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANCHOFFICELIST$14, 0);
        }
    }
    
    /**
     * Gets array of all "financialStatements" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] getFinancialStatementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FINANCIALSTATEMENTS$16, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "financialStatements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement getFinancialStatementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().find_element_user(FINANCIALSTATEMENTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "financialStatements" element
     */
    public int sizeOfFinancialStatementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINANCIALSTATEMENTS$16);
        }
    }
    
    /**
     * Sets array of all "financialStatements" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFinancialStatementsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] financialStatementsArray)
    {
        check_orphaned();
        arraySetterHelper(financialStatementsArray, FINANCIALSTATEMENTS$16);
    }
    
    /**
     * Sets ith "financialStatements" element
     */
    public void setFinancialStatementsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement financialStatements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().find_element_user(FINANCIALSTATEMENTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(financialStatements);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "financialStatements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement insertNewFinancialStatements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().insert_element_user(FINANCIALSTATEMENTS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "financialStatements" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement addNewFinancialStatements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().add_element_user(FINANCIALSTATEMENTS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "financialStatements" element
     */
    public void removeFinancialStatements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINANCIALSTATEMENTS$16, i);
        }
    }
    
    /**
     * Gets array of all "financialStatementsGroup" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] getFinancialStatementsGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FINANCIALSTATEMENTSGROUP$18, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "financialStatementsGroup" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement getFinancialStatementsGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().find_element_user(FINANCIALSTATEMENTSGROUP$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "financialStatementsGroup" element
     */
    public int sizeOfFinancialStatementsGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINANCIALSTATEMENTSGROUP$18);
        }
    }
    
    /**
     * Sets array of all "financialStatementsGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFinancialStatementsGroupArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] financialStatementsGroupArray)
    {
        check_orphaned();
        arraySetterHelper(financialStatementsGroupArray, FINANCIALSTATEMENTSGROUP$18);
    }
    
    /**
     * Sets ith "financialStatementsGroup" element
     */
    public void setFinancialStatementsGroupArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement financialStatementsGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().find_element_user(FINANCIALSTATEMENTSGROUP$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(financialStatementsGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "financialStatementsGroup" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement insertNewFinancialStatementsGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().insert_element_user(FINANCIALSTATEMENTSGROUP$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "financialStatementsGroup" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement addNewFinancialStatementsGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement)get_store().add_element_user(FINANCIALSTATEMENTSGROUP$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "financialStatementsGroup" element
     */
    public void removeFinancialStatementsGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINANCIALSTATEMENTSGROUP$18, i);
        }
    }
    
    /**
     * Gets array of all "addressHistory" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getAddressHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSHISTORY$20, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addressHistory" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getAddressHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(ADDRESSHISTORY$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addressHistory" element
     */
    public int sizeOfAddressHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSHISTORY$20);
        }
    }
    
    /**
     * Sets array of all "addressHistory" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddressHistoryArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] addressHistoryArray)
    {
        check_orphaned();
        arraySetterHelper(addressHistoryArray, ADDRESSHISTORY$20);
    }
    
    /**
     * Sets ith "addressHistory" element
     */
    public void setAddressHistoryArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addressHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(ADDRESSHISTORY$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressHistory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addressHistory" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewAddressHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().insert_element_user(ADDRESSHISTORY$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressHistory" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewAddressHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().add_element_user(ADDRESSHISTORY$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "addressHistory" element
     */
    public void removeAddressHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSHISTORY$20, i);
        }
    }
    
    /**
     * Gets array of all "businessIndustryLicenses" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[] getBusinessIndustryLicensesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSINDUSTRYLICENSES$22, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "businessIndustryLicenses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense getBusinessIndustryLicensesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense)get_store().find_element_user(BUSINESSINDUSTRYLICENSES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "businessIndustryLicenses" element
     */
    public int sizeOfBusinessIndustryLicensesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSINDUSTRYLICENSES$22);
        }
    }
    
    /**
     * Sets array of all "businessIndustryLicenses" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBusinessIndustryLicensesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[] businessIndustryLicensesArray)
    {
        check_orphaned();
        arraySetterHelper(businessIndustryLicensesArray, BUSINESSINDUSTRYLICENSES$22);
    }
    
    /**
     * Sets ith "businessIndustryLicenses" element
     */
    public void setBusinessIndustryLicensesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense businessIndustryLicenses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense)get_store().find_element_user(BUSINESSINDUSTRYLICENSES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessIndustryLicenses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessIndustryLicenses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense insertNewBusinessIndustryLicenses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense)get_store().insert_element_user(BUSINESSINDUSTRYLICENSES$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessIndustryLicenses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense addNewBusinessIndustryLicenses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense)get_store().add_element_user(BUSINESSINDUSTRYLICENSES$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "businessIndustryLicenses" element
     */
    public void removeBusinessIndustryLicenses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSINDUSTRYLICENSES$22, i);
        }
    }
    
    /**
     * Gets the "scoreAnalysis" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis getScoreAnalysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis)get_store().find_element_user(SCOREANALYSIS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scoreAnalysis" element
     */
    public boolean isSetScoreAnalysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOREANALYSIS$24) != 0;
        }
    }
    
    /**
     * Sets the "scoreAnalysis" element
     */
    public void setScoreAnalysis(ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis scoreAnalysis)
    {
        generatedSetterHelperImpl(scoreAnalysis, SCOREANALYSIS$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scoreAnalysis" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis addNewScoreAnalysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis)get_store().add_element_user(SCOREANALYSIS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "scoreAnalysis" element
     */
    public void unsetScoreAnalysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOREANALYSIS$24, 0);
        }
    }
    
    /**
     * Gets the "complianceCheckResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult getComplianceCheckResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult)get_store().find_element_user(COMPLIANCECHECKRESULT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complianceCheckResult" element
     */
    public boolean isSetComplianceCheckResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLIANCECHECKRESULT$26) != 0;
        }
    }
    
    /**
     * Sets the "complianceCheckResult" element
     */
    public void setComplianceCheckResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult complianceCheckResult)
    {
        generatedSetterHelperImpl(complianceCheckResult, COMPLIANCECHECKRESULT$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complianceCheckResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult addNewComplianceCheckResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult)get_store().add_element_user(COMPLIANCECHECKRESULT$26);
            return target;
        }
    }
    
    /**
     * Unsets the "complianceCheckResult" element
     */
    public void unsetComplianceCheckResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLIANCECHECKRESULT$26, 0);
        }
    }
    
    /**
     * Gets the "idVerificationResponseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData getIdVerificationResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData)get_store().find_element_user(IDVERIFICATIONRESPONSEDATA$28, 0);
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
            return get_store().count_elements(IDVERIFICATIONRESPONSEDATA$28) != 0;
        }
    }
    
    /**
     * Sets the "idVerificationResponseData" element
     */
    public void setIdVerificationResponseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData idVerificationResponseData)
    {
        generatedSetterHelperImpl(idVerificationResponseData, IDVERIFICATIONRESPONSEDATA$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData)get_store().add_element_user(IDVERIFICATIONRESPONSEDATA$28);
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
            get_store().remove_element(IDVERIFICATIONRESPONSEDATA$28, 0);
        }
    }
    
    /**
     * Gets the "schufaResponseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData getSchufaResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData)get_store().find_element_user(SCHUFARESPONSEDATA$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schufaResponseData" element
     */
    public boolean isSetSchufaResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHUFARESPONSEDATA$30) != 0;
        }
    }
    
    /**
     * Sets the "schufaResponseData" element
     */
    public void setSchufaResponseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData schufaResponseData)
    {
        generatedSetterHelperImpl(schufaResponseData, SCHUFARESPONSEDATA$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schufaResponseData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData addNewSchufaResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData)get_store().add_element_user(SCHUFARESPONSEDATA$30);
            return target;
        }
    }
    
    /**
     * Unsets the "schufaResponseData" element
     */
    public void unsetSchufaResponseData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHUFARESPONSEDATA$30, 0);
        }
    }
    
    /**
     * Gets array of all "controlPersons" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[] getControlPersonsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTROLPERSONS$32, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "controlPersons" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getControlPersonsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(CONTROLPERSONS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "controlPersons" element
     */
    public int sizeOfControlPersonsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROLPERSONS$32);
        }
    }
    
    /**
     * Sets array of all "controlPersons" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setControlPersonsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[] controlPersonsArray)
    {
        check_orphaned();
        arraySetterHelper(controlPersonsArray, CONTROLPERSONS$32);
    }
    
    /**
     * Sets ith "controlPersons" element
     */
    public void setControlPersonsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription controlPersons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(CONTROLPERSONS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(controlPersons);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "controlPersons" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription insertNewControlPersons(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().insert_element_user(CONTROLPERSONS$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "controlPersons" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewControlPersons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(CONTROLPERSONS$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "controlPersons" element
     */
    public void removeControlPersons(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROLPERSONS$32, i);
        }
    }
    
    /**
     * Gets array of all "controlPersonsExt" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[] getControlPersonsExtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTROLPERSONSEXT$34, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "controlPersonsExt" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson getControlPersonsExtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson)get_store().find_element_user(CONTROLPERSONSEXT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "controlPersonsExt" element
     */
    public int sizeOfControlPersonsExtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROLPERSONSEXT$34);
        }
    }
    
    /**
     * Sets array of all "controlPersonsExt" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setControlPersonsExtArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[] controlPersonsExtArray)
    {
        check_orphaned();
        arraySetterHelper(controlPersonsExtArray, CONTROLPERSONSEXT$34);
    }
    
    /**
     * Sets ith "controlPersonsExt" element
     */
    public void setControlPersonsExtArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson controlPersonsExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson)get_store().find_element_user(CONTROLPERSONSEXT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(controlPersonsExt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "controlPersonsExt" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson insertNewControlPersonsExt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson)get_store().insert_element_user(CONTROLPERSONSEXT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "controlPersonsExt" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson addNewControlPersonsExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson)get_store().add_element_user(CONTROLPERSONSEXT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "controlPersonsExt" element
     */
    public void removeControlPersonsExt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROLPERSONSEXT$34, i);
        }
    }
}
