/*
 * XML Type:  TypeOrderOfflineReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeOrderOfflineReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeOrderOfflineReportRequest extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeOrderOfflineReportRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typeorderofflinereportrequest8ac1type");
    
    /**
     * Gets the "orderAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getOrderAddress();
    
    /**
     * True if has "orderAddress" element
     */
    boolean isSetOrderAddress();
    
    /**
     * Sets the "orderAddress" element
     */
    void setOrderAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription orderAddress);
    
    /**
     * Appends and returns a new empty "orderAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewOrderAddress();
    
    /**
     * Unsets the "orderAddress" element
     */
    void unsetOrderAddress();
    
    /**
     * Gets the "identifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "offlineReportType" element
     */
    java.lang.String getOfflineReportType();
    
    /**
     * Gets (as xml) the "offlineReportType" element
     */
    org.apache.xmlbeans.XmlString xgetOfflineReportType();
    
    /**
     * Sets the "offlineReportType" element
     */
    void setOfflineReportType(java.lang.String offlineReportType);
    
    /**
     * Sets (as xml) the "offlineReportType" element
     */
    void xsetOfflineReportType(org.apache.xmlbeans.XmlString offlineReportType);
    
    /**
     * Gets the "binaryPOI" element
     */
    java.lang.String getBinaryPOI();
    
    /**
     * Gets (as xml) the "binaryPOI" element
     */
    org.apache.xmlbeans.XmlString xgetBinaryPOI();
    
    /**
     * True if has "binaryPOI" element
     */
    boolean isSetBinaryPOI();
    
    /**
     * Sets the "binaryPOI" element
     */
    void setBinaryPOI(java.lang.String binaryPOI);
    
    /**
     * Sets (as xml) the "binaryPOI" element
     */
    void xsetBinaryPOI(org.apache.xmlbeans.XmlString binaryPOI);
    
    /**
     * Unsets the "binaryPOI" element
     */
    void unsetBinaryPOI();
    
    /**
     * Gets the "binaryPOIType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType.Enum getBinaryPOIType();
    
    /**
     * Gets (as xml) the "binaryPOIType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType xgetBinaryPOIType();
    
    /**
     * True if has "binaryPOIType" element
     */
    boolean isSetBinaryPOIType();
    
    /**
     * Sets the "binaryPOIType" element
     */
    void setBinaryPOIType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType.Enum binaryPOIType);
    
    /**
     * Sets (as xml) the "binaryPOIType" element
     */
    void xsetBinaryPOIType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType binaryPOIType);
    
    /**
     * Unsets the "binaryPOIType" element
     */
    void unsetBinaryPOIType();
    
    /**
     * Gets array of all "additionalInput" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalInputArray();
    
    /**
     * Gets ith "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalInputArray(int i);
    
    /**
     * Returns number of "additionalInput" element
     */
    int sizeOfAdditionalInputArray();
    
    /**
     * Sets array of all "additionalInput" element
     */
    void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray);
    
    /**
     * Sets ith "additionalInput" element
     */
    void setAdditionalInputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalInput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalInput();
    
    /**
     * Removes the ith "additionalInput" element
     */
    void removeAdditionalInput(int i);
    
    /**
     * Gets the "contactMail" element
     */
    java.lang.String getContactMail();
    
    /**
     * Gets (as xml) the "contactMail" element
     */
    org.apache.xmlbeans.XmlString xgetContactMail();
    
    /**
     * True if has "contactMail" element
     */
    boolean isSetContactMail();
    
    /**
     * Sets the "contactMail" element
     */
    void setContactMail(java.lang.String contactMail);
    
    /**
     * Sets (as xml) the "contactMail" element
     */
    void xsetContactMail(org.apache.xmlbeans.XmlString contactMail);
    
    /**
     * Unsets the "contactMail" element
     */
    void unsetContactMail();
    
    /**
     * Gets the "contactPhone" element
     */
    java.lang.String getContactPhone();
    
    /**
     * Gets (as xml) the "contactPhone" element
     */
    org.apache.xmlbeans.XmlString xgetContactPhone();
    
    /**
     * True if has "contactPhone" element
     */
    boolean isSetContactPhone();
    
    /**
     * Sets the "contactPhone" element
     */
    void setContactPhone(java.lang.String contactPhone);
    
    /**
     * Sets (as xml) the "contactPhone" element
     */
    void xsetContactPhone(org.apache.xmlbeans.XmlString contactPhone);
    
    /**
     * Unsets the "contactPhone" element
     */
    void unsetContactPhone();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
