/*
 * XML Type:  CompanyRegistrationData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML CompanyRegistrationData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface CompanyRegistrationData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyRegistrationData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("companyregistrationdata04b5type");
    
    /**
     * Gets the "registeredOfficeCity" element
     */
    java.lang.String getRegisteredOfficeCity();
    
    /**
     * Gets (as xml) the "registeredOfficeCity" element
     */
    org.apache.xmlbeans.XmlString xgetRegisteredOfficeCity();
    
    /**
     * True if has "registeredOfficeCity" element
     */
    boolean isSetRegisteredOfficeCity();
    
    /**
     * Sets the "registeredOfficeCity" element
     */
    void setRegisteredOfficeCity(java.lang.String registeredOfficeCity);
    
    /**
     * Sets (as xml) the "registeredOfficeCity" element
     */
    void xsetRegisteredOfficeCity(org.apache.xmlbeans.XmlString registeredOfficeCity);
    
    /**
     * Unsets the "registeredOfficeCity" element
     */
    void unsetRegisteredOfficeCity();
    
    /**
     * Gets the "foundingDate" element
     */
    java.lang.String getFoundingDate();
    
    /**
     * Gets (as xml) the "foundingDate" element
     */
    org.apache.xmlbeans.XmlString xgetFoundingDate();
    
    /**
     * True if has "foundingDate" element
     */
    boolean isSetFoundingDate();
    
    /**
     * Sets the "foundingDate" element
     */
    void setFoundingDate(java.lang.String foundingDate);
    
    /**
     * Sets (as xml) the "foundingDate" element
     */
    void xsetFoundingDate(org.apache.xmlbeans.XmlString foundingDate);
    
    /**
     * Unsets the "foundingDate" element
     */
    void unsetFoundingDate();
    
    /**
     * Gets the "capital" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getCapital();
    
    /**
     * True if has "capital" element
     */
    boolean isSetCapital();
    
    /**
     * Sets the "capital" element
     */
    void setCapital(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount capital);
    
    /**
     * Appends and returns a new empty "capital" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewCapital();
    
    /**
     * Unsets the "capital" element
     */
    void unsetCapital();
    
    /**
     * Gets the "capitalPayed" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getCapitalPayed();
    
    /**
     * True if has "capitalPayed" element
     */
    boolean isSetCapitalPayed();
    
    /**
     * Sets the "capitalPayed" element
     */
    void setCapitalPayed(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount capitalPayed);
    
    /**
     * Appends and returns a new empty "capitalPayed" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewCapitalPayed();
    
    /**
     * Unsets the "capitalPayed" element
     */
    void unsetCapitalPayed();
    
    /**
     * Gets the "capitalInKind" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getCapitalInKind();
    
    /**
     * Gets (as xml) the "capitalInKind" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetCapitalInKind();
    
    /**
     * True if has "capitalInKind" element
     */
    boolean isSetCapitalInKind();
    
    /**
     * Sets the "capitalInKind" element
     */
    void setCapitalInKind(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum capitalInKind);
    
    /**
     * Sets (as xml) the "capitalInKind" element
     */
    void xsetCapitalInKind(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean capitalInKind);
    
    /**
     * Unsets the "capitalInKind" element
     */
    void unsetCapitalInKind();
    
    /**
     * Gets the "auditingCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getAuditingCompany();
    
    /**
     * True if has "auditingCompany" element
     */
    boolean isSetAuditingCompany();
    
    /**
     * Sets the "auditingCompany" element
     */
    void setAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData auditingCompany);
    
    /**
     * Appends and returns a new empty "auditingCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewAuditingCompany();
    
    /**
     * Unsets the "auditingCompany" element
     */
    void unsetAuditingCompany();
    
    /**
     * Gets the "hasAuditingCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus.Enum getHasAuditingCompany();
    
    /**
     * Gets (as xml) the "hasAuditingCompany" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus xgetHasAuditingCompany();
    
    /**
     * True if has "hasAuditingCompany" element
     */
    boolean isSetHasAuditingCompany();
    
    /**
     * Sets the "hasAuditingCompany" element
     */
    void setHasAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus.Enum hasAuditingCompany);
    
    /**
     * Sets (as xml) the "hasAuditingCompany" element
     */
    void xsetHasAuditingCompany(ch.crif_online.www.webservices.crifsoapservice.v1_00.AuditingCompanyStatus hasAuditingCompany);
    
    /**
     * Unsets the "hasAuditingCompany" element
     */
    void unsetHasAuditingCompany();
    
    /**
     * Gets the "purpose" element
     */
    java.lang.String getPurpose();
    
    /**
     * Gets (as xml) the "purpose" element
     */
    org.apache.xmlbeans.XmlString xgetPurpose();
    
    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();
    
    /**
     * Sets the "purpose" element
     */
    void setPurpose(java.lang.String purpose);
    
    /**
     * Sets (as xml) the "purpose" element
     */
    void xsetPurpose(org.apache.xmlbeans.XmlString purpose);
    
    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyRegistrationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
