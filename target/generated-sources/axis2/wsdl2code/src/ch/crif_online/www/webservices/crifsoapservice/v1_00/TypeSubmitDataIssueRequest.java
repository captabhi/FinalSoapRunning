/*
 * XML Type:  TypeSubmitDataIssueRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeSubmitDataIssueRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeSubmitDataIssueRequest extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeSubmitDataIssueRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typesubmitdataissuerequest0e59type");
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
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
     * Gets the "archiveId" element
     */
    java.math.BigInteger getArchiveId();
    
    /**
     * Gets (as xml) the "archiveId" element
     */
    org.apache.xmlbeans.XmlInteger xgetArchiveId();
    
    /**
     * True if has "archiveId" element
     */
    boolean isSetArchiveId();
    
    /**
     * Sets the "archiveId" element
     */
    void setArchiveId(java.math.BigInteger archiveId);
    
    /**
     * Sets (as xml) the "archiveId" element
     */
    void xsetArchiveId(org.apache.xmlbeans.XmlInteger archiveId);
    
    /**
     * Unsets the "archiveId" element
     */
    void unsetArchiveId();
    
    /**
     * Gets the "contactFullName" element
     */
    java.lang.String getContactFullName();
    
    /**
     * Gets (as xml) the "contactFullName" element
     */
    org.apache.xmlbeans.XmlString xgetContactFullName();
    
    /**
     * True if has "contactFullName" element
     */
    boolean isSetContactFullName();
    
    /**
     * Sets the "contactFullName" element
     */
    void setContactFullName(java.lang.String contactFullName);
    
    /**
     * Sets (as xml) the "contactFullName" element
     */
    void xsetContactFullName(org.apache.xmlbeans.XmlString contactFullName);
    
    /**
     * Unsets the "contactFullName" element
     */
    void unsetContactFullName();
    
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
