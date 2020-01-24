/*
 * XML Type:  BusinessIndustryLicense
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML BusinessIndustryLicense(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface BusinessIndustryLicense extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessIndustryLicense.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("businessindustrylicensedc38type");
    
    /**
     * Gets the "industryName" element
     */
    java.lang.String getIndustryName();
    
    /**
     * Gets (as xml) the "industryName" element
     */
    org.apache.xmlbeans.XmlString xgetIndustryName();
    
    /**
     * Sets the "industryName" element
     */
    void setIndustryName(java.lang.String industryName);
    
    /**
     * Sets (as xml) the "industryName" element
     */
    void xsetIndustryName(org.apache.xmlbeans.XmlString industryName);
    
    /**
     * Gets the "industryCode" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode getIndustryCode();
    
    /**
     * True if has "industryCode" element
     */
    boolean isSetIndustryCode();
    
    /**
     * Sets the "industryCode" element
     */
    void setIndustryCode(ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode industryCode);
    
    /**
     * Appends and returns a new empty "industryCode" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IndustryCode addNewIndustryCode();
    
    /**
     * Unsets the "industryCode" element
     */
    void unsetIndustryCode();
    
    /**
     * Gets the "issuedTo" element
     */
    java.lang.String getIssuedTo();
    
    /**
     * Gets (as xml) the "issuedTo" element
     */
    org.apache.xmlbeans.XmlString xgetIssuedTo();
    
    /**
     * True if has "issuedTo" element
     */
    boolean isSetIssuedTo();
    
    /**
     * Sets the "issuedTo" element
     */
    void setIssuedTo(java.lang.String issuedTo);
    
    /**
     * Sets (as xml) the "issuedTo" element
     */
    void xsetIssuedTo(org.apache.xmlbeans.XmlString issuedTo);
    
    /**
     * Unsets the "issuedTo" element
     */
    void unsetIssuedTo();
    
    /**
     * Gets the "period" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Period getPeriod();
    
    /**
     * True if has "period" element
     */
    boolean isSetPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Period addNewPeriod();
    
    /**
     * Unsets the "period" element
     */
    void unsetPeriod();
    
    /**
     * Gets the "status" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicenseStatus status);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BusinessIndustryLicense) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
