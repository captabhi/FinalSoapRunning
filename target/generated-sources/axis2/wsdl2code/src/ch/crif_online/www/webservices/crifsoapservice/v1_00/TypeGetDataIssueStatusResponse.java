/*
 * XML Type:  TypeGetDataIssueStatusResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeGetDataIssueStatusResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeGetDataIssueStatusResponse extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeGetDataIssueStatusResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typegetdataissuestatusresponse91adtype");
    
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
     * Gets the "dataIssueStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DataIssueStatus.Enum getDataIssueStatus();
    
    /**
     * Gets (as xml) the "dataIssueStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DataIssueStatus xgetDataIssueStatus();
    
    /**
     * Sets the "dataIssueStatus" element
     */
    void setDataIssueStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.DataIssueStatus.Enum dataIssueStatus);
    
    /**
     * Sets (as xml) the "dataIssueStatus" element
     */
    void xsetDataIssueStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.DataIssueStatus dataIssueStatus);
    
    /**
     * Gets the "comment" element
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "comment" element
     */
    org.apache.xmlbeans.XmlString xgetComment();
    
    /**
     * True if has "comment" element
     */
    boolean isSetComment();
    
    /**
     * Sets the "comment" element
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "comment" element
     */
    void xsetComment(org.apache.xmlbeans.XmlString comment);
    
    /**
     * Unsets the "comment" element
     */
    void unsetComment();
    
    /**
     * Gets array of all "additionalOutput" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalOutputArray();
    
    /**
     * Gets ith "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalOutputArray(int i);
    
    /**
     * Returns number of "additionalOutput" element
     */
    int sizeOfAdditionalOutputArray();
    
    /**
     * Sets array of all "additionalOutput" element
     */
    void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray);
    
    /**
     * Sets ith "additionalOutput" element
     */
    void setAdditionalOutputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalOutput();
    
    /**
     * Removes the ith "additionalOutput" element
     */
    void removeAdditionalOutput(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
