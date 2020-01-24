/*
 * XML Type:  TypeIdVerificationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeIdVerificationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeIdVerificationResponse extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeIdVerificationResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typeidverificationresponse2298type");
    
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
     * Gets the "decisionMatrix" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix getDecisionMatrix();
    
    /**
     * True if has "decisionMatrix" element
     */
    boolean isSetDecisionMatrix();
    
    /**
     * Sets the "decisionMatrix" element
     */
    void setDecisionMatrix(ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix decisionMatrix);
    
    /**
     * Appends and returns a new empty "decisionMatrix" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix addNewDecisionMatrix();
    
    /**
     * Unsets the "decisionMatrix" element
     */
    void unsetDecisionMatrix();
    
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
