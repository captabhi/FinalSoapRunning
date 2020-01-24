/*
 * XML Type:  CompanyBaseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML CompanyBaseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface CompanyBaseData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyBaseData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("companybasedata96cdtype");
    
    /**
     * Gets the "mainAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription getMainAddress();
    
    /**
     * Sets the "mainAddress" element
     */
    void setMainAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription mainAddress);
    
    /**
     * Appends and returns a new empty "mainAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription addNewMainAddress();
    
    /**
     * Gets the "companyRegistrationData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData getCompanyRegistrationData();
    
    /**
     * True if has "companyRegistrationData" element
     */
    boolean isSetCompanyRegistrationData();
    
    /**
     * Sets the "companyRegistrationData" element
     */
    void setCompanyRegistrationData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData companyRegistrationData);
    
    /**
     * Appends and returns a new empty "companyRegistrationData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData addNewCompanyRegistrationData();
    
    /**
     * Unsets the "companyRegistrationData" element
     */
    void unsetCompanyRegistrationData();
    
    /**
     * Gets the "companyDetailData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData getCompanyDetailData();
    
    /**
     * True if has "companyDetailData" element
     */
    boolean isSetCompanyDetailData();
    
    /**
     * Sets the "companyDetailData" element
     */
    void setCompanyDetailData(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData companyDetailData);
    
    /**
     * Appends and returns a new empty "companyDetailData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyDetailData addNewCompanyDetailData();
    
    /**
     * Unsets the "companyDetailData" element
     */
    void unsetCompanyDetailData();
    
    /**
     * Gets array of all "companyHistoryItems" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[] getCompanyHistoryItemsArray();
    
    /**
     * Gets ith "companyHistoryItems" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem getCompanyHistoryItemsArray(int i);
    
    /**
     * Returns number of "companyHistoryItems" element
     */
    int sizeOfCompanyHistoryItemsArray();
    
    /**
     * Sets array of all "companyHistoryItems" element
     */
    void setCompanyHistoryItemsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem[] companyHistoryItemsArray);
    
    /**
     * Sets ith "companyHistoryItems" element
     */
    void setCompanyHistoryItemsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem companyHistoryItems);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "companyHistoryItems" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem insertNewCompanyHistoryItems(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "companyHistoryItems" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem addNewCompanyHistoryItems();
    
    /**
     * Removes the ith "companyHistoryItems" element
     */
    void removeCompanyHistoryItems(int i);
    
    /**
     * Gets the "registryType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType.Enum getRegistryType();
    
    /**
     * Gets (as xml) the "registryType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType xgetRegistryType();
    
    /**
     * Sets the "registryType" element
     */
    void setRegistryType(ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType.Enum registryType);
    
    /**
     * Sets (as xml) the "registryType" element
     */
    void xsetRegistryType(ch.crif_online.www.webservices.crifsoapservice.v1_00.RegistryType registryType);
    
    /**
     * Gets the "activityStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum getActivityStatus();
    
    /**
     * Gets (as xml) the "activityStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus xgetActivityStatus();
    
    /**
     * Sets the "activityStatus" element
     */
    void setActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum activityStatus);
    
    /**
     * Sets (as xml) the "activityStatus" element
     */
    void xsetActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus activityStatus);
    
    /**
     * Gets the "activityStatusOriginal" element
     */
    java.lang.String getActivityStatusOriginal();
    
    /**
     * Gets (as xml) the "activityStatusOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetActivityStatusOriginal();
    
    /**
     * True if has "activityStatusOriginal" element
     */
    boolean isSetActivityStatusOriginal();
    
    /**
     * Sets the "activityStatusOriginal" element
     */
    void setActivityStatusOriginal(java.lang.String activityStatusOriginal);
    
    /**
     * Sets (as xml) the "activityStatusOriginal" element
     */
    void xsetActivityStatusOriginal(org.apache.xmlbeans.XmlString activityStatusOriginal);
    
    /**
     * Unsets the "activityStatusOriginal" element
     */
    void unsetActivityStatusOriginal();
    
    /**
     * Gets the "legalFormType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum getLegalFormType();
    
    /**
     * Gets (as xml) the "legalFormType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType xgetLegalFormType();
    
    /**
     * Sets the "legalFormType" element
     */
    void setLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum legalFormType);
    
    /**
     * Sets (as xml) the "legalFormType" element
     */
    void xsetLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType legalFormType);
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    java.lang.String getLegalFormTypeOriginal();
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal();
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    boolean isSetLegalFormTypeOriginal();
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal);
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal);
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    void unsetLegalFormTypeOriginal();
    
    /**
     * Gets the "legalFormText" element
     */
    java.lang.String getLegalFormText();
    
    /**
     * Gets (as xml) the "legalFormText" element
     */
    org.apache.xmlbeans.XmlString xgetLegalFormText();
    
    /**
     * True if has "legalFormText" element
     */
    boolean isSetLegalFormText();
    
    /**
     * Sets the "legalFormText" element
     */
    void setLegalFormText(java.lang.String legalFormText);
    
    /**
     * Sets (as xml) the "legalFormText" element
     */
    void xsetLegalFormText(org.apache.xmlbeans.XmlString legalFormText);
    
    /**
     * Unsets the "legalFormText" element
     */
    void unsetLegalFormText();
    
    /**
     * Gets array of all "identifiers" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] getIdentifiersArray();
    
    /**
     * Gets ith "identifiers" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifiersArray(int i);
    
    /**
     * Returns number of "identifiers" element
     */
    int sizeOfIdentifiersArray();
    
    /**
     * Sets array of all "identifiers" element
     */
    void setIdentifiersArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier[] identifiersArray);
    
    /**
     * Sets ith "identifiers" element
     */
    void setIdentifiersArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifiers);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifiers" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier insertNewIdentifiers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifiers" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifiers();
    
    /**
     * Removes the ith "identifiers" element
     */
    void removeIdentifiers(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
