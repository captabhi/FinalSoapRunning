/*
 * XML Type:  CompanyDetailData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML CompanyDetailData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface CompanyDetailData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyDetailData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("companydetaildata7b4dtype");
    
    /**
     * Gets the "ultimateMotherCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getUltimateMotherCompany();
    
    /**
     * True if has "ultimateMotherCompany" element
     */
    boolean isSetUltimateMotherCompany();
    
    /**
     * Sets the "ultimateMotherCompany" element
     */
    void setUltimateMotherCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData ultimateMotherCompany);
    
    /**
     * Appends and returns a new empty "ultimateMotherCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewUltimateMotherCompany();
    
    /**
     * Unsets the "ultimateMotherCompany" element
     */
    void unsetUltimateMotherCompany();
    
    /**
     * Gets array of all "industryCodes" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[] getIndustryCodesArray();
    
    /**
     * Gets ith "industryCodes" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode getIndustryCodesArray(int i);
    
    /**
     * Returns number of "industryCodes" element
     */
    int sizeOfIndustryCodesArray();
    
    /**
     * Sets array of all "industryCodes" element
     */
    void setIndustryCodesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode[] industryCodesArray);
    
    /**
     * Sets ith "industryCodes" element
     */
    void setIndustryCodesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode industryCodes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "industryCodes" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode insertNewIndustryCodes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "industryCodes" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode addNewIndustryCodes();
    
    /**
     * Removes the ith "industryCodes" element
     */
    void removeIndustryCodes(int i);
    
    /**
     * Gets the "nrOfEmployees" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getNrOfEmployees();
    
    /**
     * True if has "nrOfEmployees" element
     */
    boolean isSetNrOfEmployees();
    
    /**
     * Sets the "nrOfEmployees" element
     */
    void setNrOfEmployees(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range nrOfEmployees);
    
    /**
     * Appends and returns a new empty "nrOfEmployees" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewNrOfEmployees();
    
    /**
     * Unsets the "nrOfEmployees" element
     */
    void unsetNrOfEmployees();
    
    /**
     * Gets the "sizeClass" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass.Enum getSizeClass();
    
    /**
     * Gets (as xml) the "sizeClass" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass xgetSizeClass();
    
    /**
     * True if has "sizeClass" element
     */
    boolean isSetSizeClass();
    
    /**
     * Sets the "sizeClass" element
     */
    void setSizeClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass.Enum sizeClass);
    
    /**
     * Sets (as xml) the "sizeClass" element
     */
    void xsetSizeClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanySizeClass sizeClass);
    
    /**
     * Unsets the "sizeClass" element
     */
    void unsetSizeClass();
    
    /**
     * Gets the "turnoverCurrency" element
     */
    java.lang.String getTurnoverCurrency();
    
    /**
     * Gets (as xml) the "turnoverCurrency" element
     */
    org.apache.xmlbeans.XmlString xgetTurnoverCurrency();
    
    /**
     * True if has "turnoverCurrency" element
     */
    boolean isSetTurnoverCurrency();
    
    /**
     * Sets the "turnoverCurrency" element
     */
    void setTurnoverCurrency(java.lang.String turnoverCurrency);
    
    /**
     * Sets (as xml) the "turnoverCurrency" element
     */
    void xsetTurnoverCurrency(org.apache.xmlbeans.XmlString turnoverCurrency);
    
    /**
     * Unsets the "turnoverCurrency" element
     */
    void unsetTurnoverCurrency();
    
    /**
     * Gets the "turnoverRange" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getTurnoverRange();
    
    /**
     * True if has "turnoverRange" element
     */
    boolean isSetTurnoverRange();
    
    /**
     * Sets the "turnoverRange" element
     */
    void setTurnoverRange(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range turnoverRange);
    
    /**
     * Appends and returns a new empty "turnoverRange" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewTurnoverRange();
    
    /**
     * Unsets the "turnoverRange" element
     */
    void unsetTurnoverRange();
    
    /**
     * Gets the "turnoverInExport" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getTurnoverInExport();
    
    /**
     * Gets (as xml) the "turnoverInExport" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetTurnoverInExport();
    
    /**
     * True if has "turnoverInExport" element
     */
    boolean isSetTurnoverInExport();
    
    /**
     * Sets the "turnoverInExport" element
     */
    void setTurnoverInExport(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum turnoverInExport);
    
    /**
     * Sets (as xml) the "turnoverInExport" element
     */
    void xsetTurnoverInExport(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean turnoverInExport);
    
    /**
     * Unsets the "turnoverInExport" element
     */
    void unsetTurnoverInExport();
    
    /**
     * Gets the "activityIndex" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex.Enum getActivityIndex();
    
    /**
     * Gets (as xml) the "activityIndex" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex xgetActivityIndex();
    
    /**
     * True if has "activityIndex" element
     */
    boolean isSetActivityIndex();
    
    /**
     * Sets the "activityIndex" element
     */
    void setActivityIndex(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex.Enum activityIndex);
    
    /**
     * Sets (as xml) the "activityIndex" element
     */
    void xsetActivityIndex(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityIndex activityIndex);
    
    /**
     * Unsets the "activityIndex" element
     */
    void unsetActivityIndex();
    
    /**
     * Gets the "knownSince" element
     */
    java.lang.String getKnownSince();
    
    /**
     * Gets (as xml) the "knownSince" element
     */
    org.apache.xmlbeans.XmlString xgetKnownSince();
    
    /**
     * True if has "knownSince" element
     */
    boolean isSetKnownSince();
    
    /**
     * Sets the "knownSince" element
     */
    void setKnownSince(java.lang.String knownSince);
    
    /**
     * Sets (as xml) the "knownSince" element
     */
    void xsetKnownSince(org.apache.xmlbeans.XmlString knownSince);
    
    /**
     * Unsets the "knownSince" element
     */
    void unsetKnownSince();
    
    /**
     * Gets the "dateFinancialStatement" element
     */
    java.lang.String getDateFinancialStatement();
    
    /**
     * Gets (as xml) the "dateFinancialStatement" element
     */
    org.apache.xmlbeans.XmlString xgetDateFinancialStatement();
    
    /**
     * True if has "dateFinancialStatement" element
     */
    boolean isSetDateFinancialStatement();
    
    /**
     * Sets the "dateFinancialStatement" element
     */
    void setDateFinancialStatement(java.lang.String dateFinancialStatement);
    
    /**
     * Sets (as xml) the "dateFinancialStatement" element
     */
    void xsetDateFinancialStatement(org.apache.xmlbeans.XmlString dateFinancialStatement);
    
    /**
     * Unsets the "dateFinancialStatement" element
     */
    void unsetDateFinancialStatement();
    
    /**
     * Gets the "dateFinancialStatementHandedIn" element
     */
    java.lang.String getDateFinancialStatementHandedIn();
    
    /**
     * Gets (as xml) the "dateFinancialStatementHandedIn" element
     */
    org.apache.xmlbeans.XmlString xgetDateFinancialStatementHandedIn();
    
    /**
     * True if has "dateFinancialStatementHandedIn" element
     */
    boolean isSetDateFinancialStatementHandedIn();
    
    /**
     * Sets the "dateFinancialStatementHandedIn" element
     */
    void setDateFinancialStatementHandedIn(java.lang.String dateFinancialStatementHandedIn);
    
    /**
     * Sets (as xml) the "dateFinancialStatementHandedIn" element
     */
    void xsetDateFinancialStatementHandedIn(org.apache.xmlbeans.XmlString dateFinancialStatementHandedIn);
    
    /**
     * Unsets the "dateFinancialStatementHandedIn" element
     */
    void unsetDateFinancialStatementHandedIn();
    
    /**
     * Gets array of all "bankAccounts" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[] getBankAccountsArray();
    
    /**
     * Gets ith "bankAccounts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount getBankAccountsArray(int i);
    
    /**
     * Returns number of "bankAccounts" element
     */
    int sizeOfBankAccountsArray();
    
    /**
     * Sets array of all "bankAccounts" element
     */
    void setBankAccountsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount[] bankAccountsArray);
    
    /**
     * Sets ith "bankAccounts" element
     */
    void setBankAccountsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount bankAccounts);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bankAccounts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount insertNewBankAccounts(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bankAccounts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount addNewBankAccounts();
    
    /**
     * Removes the ith "bankAccounts" element
     */
    void removeBankAccounts(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
