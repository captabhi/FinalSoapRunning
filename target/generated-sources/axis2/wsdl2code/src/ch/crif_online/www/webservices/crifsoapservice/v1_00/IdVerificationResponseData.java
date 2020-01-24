/*
 * XML Type:  IdVerificationResponseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML IdVerificationResponseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface IdVerificationResponseData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdVerificationResponseData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("idverificationresponsedata9708type");
    
    /**
     * Gets the "content" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent getContent();
    
    /**
     * True if has "content" element
     */
    boolean isSetContent();
    
    /**
     * Sets the "content" element
     */
    void setContent(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent content);
    
    /**
     * Appends and returns a new empty "content" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent addNewContent();
    
    /**
     * Unsets the "content" element
     */
    void unsetContent();
    
    /**
     * Gets array of all "comparisonElements" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[] getComparisonElementsArray();
    
    /**
     * Gets ith "comparisonElements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement getComparisonElementsArray(int i);
    
    /**
     * Returns number of "comparisonElements" element
     */
    int sizeOfComparisonElementsArray();
    
    /**
     * Sets array of all "comparisonElements" element
     */
    void setComparisonElementsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement[] comparisonElementsArray);
    
    /**
     * Sets ith "comparisonElements" element
     */
    void setComparisonElementsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement comparisonElements);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comparisonElements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement insertNewComparisonElements(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comparisonElements" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement addNewComparisonElements();
    
    /**
     * Removes the ith "comparisonElements" element
     */
    void removeComparisonElements(int i);
    
    /**
     * Gets the "processingResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult.Enum getProcessingResult();
    
    /**
     * Gets (as xml) the "processingResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult xgetProcessingResult();
    
    /**
     * Sets the "processingResult" element
     */
    void setProcessingResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult.Enum processingResult);
    
    /**
     * Sets (as xml) the "processingResult" element
     */
    void xsetProcessingResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationProcessingResult processingResult);
    
    /**
     * Gets array of all "warnings" elements
     */
    java.lang.String[] getWarningsArray();
    
    /**
     * Gets ith "warnings" element
     */
    java.lang.String getWarningsArray(int i);
    
    /**
     * Gets (as xml) array of all "warnings" elements
     */
    org.apache.xmlbeans.XmlString[] xgetWarningsArray();
    
    /**
     * Gets (as xml) ith "warnings" element
     */
    org.apache.xmlbeans.XmlString xgetWarningsArray(int i);
    
    /**
     * Returns number of "warnings" element
     */
    int sizeOfWarningsArray();
    
    /**
     * Sets array of all "warnings" element
     */
    void setWarningsArray(java.lang.String[] warningsArray);
    
    /**
     * Sets ith "warnings" element
     */
    void setWarningsArray(int i, java.lang.String warnings);
    
    /**
     * Sets (as xml) array of all "warnings" element
     */
    void xsetWarningsArray(org.apache.xmlbeans.XmlString[] warningsArray);
    
    /**
     * Sets (as xml) ith "warnings" element
     */
    void xsetWarningsArray(int i, org.apache.xmlbeans.XmlString warnings);
    
    /**
     * Inserts the value as the ith "warnings" element
     */
    void insertWarnings(int i, java.lang.String warnings);
    
    /**
     * Appends the value as the last "warnings" element
     */
    void addWarnings(java.lang.String warnings);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "warnings" element
     */
    org.apache.xmlbeans.XmlString insertNewWarnings(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "warnings" element
     */
    org.apache.xmlbeans.XmlString addNewWarnings();
    
    /**
     * Removes the ith "warnings" element
     */
    void removeWarnings(int i);
    
    /**
     * Gets array of all "rejectionReasons" elements
     */
    java.lang.String[] getRejectionReasonsArray();
    
    /**
     * Gets ith "rejectionReasons" element
     */
    java.lang.String getRejectionReasonsArray(int i);
    
    /**
     * Gets (as xml) array of all "rejectionReasons" elements
     */
    org.apache.xmlbeans.XmlString[] xgetRejectionReasonsArray();
    
    /**
     * Gets (as xml) ith "rejectionReasons" element
     */
    org.apache.xmlbeans.XmlString xgetRejectionReasonsArray(int i);
    
    /**
     * Returns number of "rejectionReasons" element
     */
    int sizeOfRejectionReasonsArray();
    
    /**
     * Sets array of all "rejectionReasons" element
     */
    void setRejectionReasonsArray(java.lang.String[] rejectionReasonsArray);
    
    /**
     * Sets ith "rejectionReasons" element
     */
    void setRejectionReasonsArray(int i, java.lang.String rejectionReasons);
    
    /**
     * Sets (as xml) array of all "rejectionReasons" element
     */
    void xsetRejectionReasonsArray(org.apache.xmlbeans.XmlString[] rejectionReasonsArray);
    
    /**
     * Sets (as xml) ith "rejectionReasons" element
     */
    void xsetRejectionReasonsArray(int i, org.apache.xmlbeans.XmlString rejectionReasons);
    
    /**
     * Inserts the value as the ith "rejectionReasons" element
     */
    void insertRejectionReasons(int i, java.lang.String rejectionReasons);
    
    /**
     * Appends the value as the last "rejectionReasons" element
     */
    void addRejectionReasons(java.lang.String rejectionReasons);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rejectionReasons" element
     */
    org.apache.xmlbeans.XmlString insertNewRejectionReasons(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rejectionReasons" element
     */
    org.apache.xmlbeans.XmlString addNewRejectionReasons();
    
    /**
     * Removes the ith "rejectionReasons" element
     */
    void removeRejectionReasons(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
