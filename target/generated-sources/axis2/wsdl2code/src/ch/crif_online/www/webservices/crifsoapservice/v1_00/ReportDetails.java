/*
 * XML Type:  ReportDetails
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ReportDetails(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ReportDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("reportdetails8043type");
    
    /**
     * Gets array of all "debts" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] getDebtsArray();
    
    /**
     * Gets ith "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry getDebtsArray(int i);
    
    /**
     * Returns number of "debts" element
     */
    int sizeOfDebtsArray();
    
    /**
     * Sets array of all "debts" element
     */
    void setDebtsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] debtsArray);
    
    /**
     * Sets ith "debts" element
     */
    void setDebtsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry debts);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry insertNewDebts(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry addNewDebts();
    
    /**
     * Removes the ith "debts" element
     */
    void removeDebts(int i);
    
    /**
     * Gets the "companyBaseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getCompanyBaseData();
    
    /**
     * True if has "companyBaseData" element
     */
    boolean isSetCompanyBaseData();
    
    /**
     * Sets the "companyBaseData" element
     */
    void setCompanyBaseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData companyBaseData);
    
    /**
     * Appends and returns a new empty "companyBaseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewCompanyBaseData();
    
    /**
     * Unsets the "companyBaseData" element
     */
    void unsetCompanyBaseData();
    
    /**
     * Gets the "paymentDelay" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay getPaymentDelay();
    
    /**
     * True if has "paymentDelay" element
     */
    boolean isSetPaymentDelay();
    
    /**
     * Sets the "paymentDelay" element
     */
    void setPaymentDelay(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay paymentDelay);
    
    /**
     * Appends and returns a new empty "paymentDelay" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay addNewPaymentDelay();
    
    /**
     * Unsets the "paymentDelay" element
     */
    void unsetPaymentDelay();
    
    /**
     * Gets the "organizationPositionList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList getOrganizationPositionList();
    
    /**
     * True if has "organizationPositionList" element
     */
    boolean isSetOrganizationPositionList();
    
    /**
     * Sets the "organizationPositionList" element
     */
    void setOrganizationPositionList(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList organizationPositionList);
    
    /**
     * Appends and returns a new empty "organizationPositionList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList addNewOrganizationPositionList();
    
    /**
     * Unsets the "organizationPositionList" element
     */
    void unsetOrganizationPositionList();
    
    /**
     * Gets the "whoOwnsWhom" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom getWhoOwnsWhom();
    
    /**
     * True if has "whoOwnsWhom" element
     */
    boolean isSetWhoOwnsWhom();
    
    /**
     * Sets the "whoOwnsWhom" element
     */
    void setWhoOwnsWhom(ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom whoOwnsWhom);
    
    /**
     * Appends and returns a new empty "whoOwnsWhom" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom addNewWhoOwnsWhom();
    
    /**
     * Unsets the "whoOwnsWhom" element
     */
    void unsetWhoOwnsWhom();
    
    /**
     * Gets the "furtherRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations getFurtherRelations();
    
    /**
     * True if has "furtherRelations" element
     */
    boolean isSetFurtherRelations();
    
    /**
     * Sets the "furtherRelations" element
     */
    void setFurtherRelations(ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations furtherRelations);
    
    /**
     * Appends and returns a new empty "furtherRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations addNewFurtherRelations();
    
    /**
     * Unsets the "furtherRelations" element
     */
    void unsetFurtherRelations();
    
    /**
     * Gets the "publicationList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList getPublicationList();
    
    /**
     * True if has "publicationList" element
     */
    boolean isSetPublicationList();
    
    /**
     * Sets the "publicationList" element
     */
    void setPublicationList(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList publicationList);
    
    /**
     * Appends and returns a new empty "publicationList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList addNewPublicationList();
    
    /**
     * Unsets the "publicationList" element
     */
    void unsetPublicationList();
    
    /**
     * Gets the "branchOfficeList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList getBranchOfficeList();
    
    /**
     * True if has "branchOfficeList" element
     */
    boolean isSetBranchOfficeList();
    
    /**
     * Sets the "branchOfficeList" element
     */
    void setBranchOfficeList(ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList branchOfficeList);
    
    /**
     * Appends and returns a new empty "branchOfficeList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList addNewBranchOfficeList();
    
    /**
     * Unsets the "branchOfficeList" element
     */
    void unsetBranchOfficeList();
    
    /**
     * Gets array of all "financialStatements" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] getFinancialStatementsArray();
    
    /**
     * Gets ith "financialStatements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement getFinancialStatementsArray(int i);
    
    /**
     * Returns number of "financialStatements" element
     */
    int sizeOfFinancialStatementsArray();
    
    /**
     * Sets array of all "financialStatements" element
     */
    void setFinancialStatementsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] financialStatementsArray);
    
    /**
     * Sets ith "financialStatements" element
     */
    void setFinancialStatementsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement financialStatements);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "financialStatements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement insertNewFinancialStatements(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "financialStatements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement addNewFinancialStatements();
    
    /**
     * Removes the ith "financialStatements" element
     */
    void removeFinancialStatements(int i);
    
    /**
     * Gets array of all "financialStatementsGroup" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] getFinancialStatementsGroupArray();
    
    /**
     * Gets ith "financialStatementsGroup" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement getFinancialStatementsGroupArray(int i);
    
    /**
     * Returns number of "financialStatementsGroup" element
     */
    int sizeOfFinancialStatementsGroupArray();
    
    /**
     * Sets array of all "financialStatementsGroup" element
     */
    void setFinancialStatementsGroupArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement[] financialStatementsGroupArray);
    
    /**
     * Sets ith "financialStatementsGroup" element
     */
    void setFinancialStatementsGroupArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement financialStatementsGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "financialStatementsGroup" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement insertNewFinancialStatementsGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "financialStatementsGroup" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement addNewFinancialStatementsGroup();
    
    /**
     * Removes the ith "financialStatementsGroup" element
     */
    void removeFinancialStatementsGroup(int i);
    
    /**
     * Gets array of all "addressHistory" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getAddressHistoryArray();
    
    /**
     * Gets ith "addressHistory" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getAddressHistoryArray(int i);
    
    /**
     * Returns number of "addressHistory" element
     */
    int sizeOfAddressHistoryArray();
    
    /**
     * Sets array of all "addressHistory" element
     */
    void setAddressHistoryArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] addressHistoryArray);
    
    /**
     * Sets ith "addressHistory" element
     */
    void setAddressHistoryArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addressHistory);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addressHistory" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewAddressHistory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressHistory" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewAddressHistory();
    
    /**
     * Removes the ith "addressHistory" element
     */
    void removeAddressHistory(int i);
    
    /**
     * Gets array of all "businessIndustryLicenses" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[] getBusinessIndustryLicensesArray();
    
    /**
     * Gets ith "businessIndustryLicenses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense getBusinessIndustryLicensesArray(int i);
    
    /**
     * Returns number of "businessIndustryLicenses" element
     */
    int sizeOfBusinessIndustryLicensesArray();
    
    /**
     * Sets array of all "businessIndustryLicenses" element
     */
    void setBusinessIndustryLicensesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense[] businessIndustryLicensesArray);
    
    /**
     * Sets ith "businessIndustryLicenses" element
     */
    void setBusinessIndustryLicensesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense businessIndustryLicenses);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessIndustryLicenses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense insertNewBusinessIndustryLicenses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessIndustryLicenses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense addNewBusinessIndustryLicenses();
    
    /**
     * Removes the ith "businessIndustryLicenses" element
     */
    void removeBusinessIndustryLicenses(int i);
    
    /**
     * Gets the "scoreAnalysis" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis getScoreAnalysis();
    
    /**
     * True if has "scoreAnalysis" element
     */
    boolean isSetScoreAnalysis();
    
    /**
     * Sets the "scoreAnalysis" element
     */
    void setScoreAnalysis(ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis scoreAnalysis);
    
    /**
     * Appends and returns a new empty "scoreAnalysis" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis addNewScoreAnalysis();
    
    /**
     * Unsets the "scoreAnalysis" element
     */
    void unsetScoreAnalysis();
    
    /**
     * Gets the "complianceCheckResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult getComplianceCheckResult();
    
    /**
     * True if has "complianceCheckResult" element
     */
    boolean isSetComplianceCheckResult();
    
    /**
     * Sets the "complianceCheckResult" element
     */
    void setComplianceCheckResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult complianceCheckResult);
    
    /**
     * Appends and returns a new empty "complianceCheckResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult addNewComplianceCheckResult();
    
    /**
     * Unsets the "complianceCheckResult" element
     */
    void unsetComplianceCheckResult();
    
    /**
     * Gets the "idVerificationResponseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData getIdVerificationResponseData();
    
    /**
     * True if has "idVerificationResponseData" element
     */
    boolean isSetIdVerificationResponseData();
    
    /**
     * Sets the "idVerificationResponseData" element
     */
    void setIdVerificationResponseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData idVerificationResponseData);
    
    /**
     * Appends and returns a new empty "idVerificationResponseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData addNewIdVerificationResponseData();
    
    /**
     * Unsets the "idVerificationResponseData" element
     */
    void unsetIdVerificationResponseData();
    
    /**
     * Gets the "schufaResponseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData getSchufaResponseData();
    
    /**
     * True if has "schufaResponseData" element
     */
    boolean isSetSchufaResponseData();
    
    /**
     * Sets the "schufaResponseData" element
     */
    void setSchufaResponseData(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData schufaResponseData);
    
    /**
     * Appends and returns a new empty "schufaResponseData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData addNewSchufaResponseData();
    
    /**
     * Unsets the "schufaResponseData" element
     */
    void unsetSchufaResponseData();
    
    /**
     * Gets array of all "controlPersons" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[] getControlPersonsArray();
    
    /**
     * Gets ith "controlPersons" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getControlPersonsArray(int i);
    
    /**
     * Returns number of "controlPersons" element
     */
    int sizeOfControlPersonsArray();
    
    /**
     * Sets array of all "controlPersons" element
     */
    void setControlPersonsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription[] controlPersonsArray);
    
    /**
     * Sets ith "controlPersons" element
     */
    void setControlPersonsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription controlPersons);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "controlPersons" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription insertNewControlPersons(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "controlPersons" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewControlPersons();
    
    /**
     * Removes the ith "controlPersons" element
     */
    void removeControlPersons(int i);
    
    /**
     * Gets array of all "controlPersonsExt" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[] getControlPersonsExtArray();
    
    /**
     * Gets ith "controlPersonsExt" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson getControlPersonsExtArray(int i);
    
    /**
     * Returns number of "controlPersonsExt" element
     */
    int sizeOfControlPersonsExtArray();
    
    /**
     * Sets array of all "controlPersonsExt" element
     */
    void setControlPersonsExtArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson[] controlPersonsExtArray);
    
    /**
     * Sets ith "controlPersonsExt" element
     */
    void setControlPersonsExtArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson controlPersonsExt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "controlPersonsExt" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson insertNewControlPersonsExt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "controlPersonsExt" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson addNewControlPersonsExt();
    
    /**
     * Removes the ith "controlPersonsExt" element
     */
    void removeControlPersonsExt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ReportDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
