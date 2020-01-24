/*
 * XML Type:  TypeGetReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeGetReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeGetReportRequest extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeGetReportRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typegetreportrequest05a6type");
    
    /**
     * Gets the "searchedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getSearchedAddress();
    
    /**
     * True if has "searchedAddress" element
     */
    boolean isSetSearchedAddress();
    
    /**
     * Sets the "searchedAddress" element
     */
    void setSearchedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription searchedAddress);
    
    /**
     * Appends and returns a new empty "searchedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewSearchedAddress();
    
    /**
     * Unsets the "searchedAddress" element
     */
    void unsetSearchedAddress();
    
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
     * Gets the "reportType" element
     */
    java.lang.String getReportType();
    
    /**
     * Gets (as xml) the "reportType" element
     */
    org.apache.xmlbeans.XmlString xgetReportType();
    
    /**
     * Sets the "reportType" element
     */
    void setReportType(java.lang.String reportType);
    
    /**
     * Sets (as xml) the "reportType" element
     */
    void xsetReportType(org.apache.xmlbeans.XmlString reportType);
    
    /**
     * Gets the "targetReportFormat" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum getTargetReportFormat();
    
    /**
     * Gets (as xml) the "targetReportFormat" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat xgetTargetReportFormat();
    
    /**
     * True if has "targetReportFormat" element
     */
    boolean isSetTargetReportFormat();
    
    /**
     * Sets the "targetReportFormat" element
     */
    void setTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum targetReportFormat);
    
    /**
     * Sets (as xml) the "targetReportFormat" element
     */
    void xsetTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat targetReportFormat);
    
    /**
     * Unsets the "targetReportFormat" element
     */
    void unsetTargetReportFormat();
    
    /**
     * Gets the "idVerificationRequestData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData getIdVerificationRequestData();
    
    /**
     * True if has "idVerificationRequestData" element
     */
    boolean isSetIdVerificationRequestData();
    
    /**
     * Sets the "idVerificationRequestData" element
     */
    void setIdVerificationRequestData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData idVerificationRequestData);
    
    /**
     * Appends and returns a new empty "idVerificationRequestData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData addNewIdVerificationRequestData();
    
    /**
     * Unsets the "idVerificationRequestData" element
     */
    void unsetIdVerificationRequestData();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
