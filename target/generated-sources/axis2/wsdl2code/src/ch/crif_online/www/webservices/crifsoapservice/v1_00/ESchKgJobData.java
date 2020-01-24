/*
 * XML Type:  ESchKgJobData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ESchKgJobData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ESchKgJobData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESchKgJobData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("eschkgjobdata0aadtype");
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "claimList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList getClaimList();
    
    /**
     * True if has "claimList" element
     */
    boolean isSetClaimList();
    
    /**
     * Sets the "claimList" element
     */
    void setClaimList(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList claimList);
    
    /**
     * Appends and returns a new empty "claimList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList addNewClaimList();
    
    /**
     * Unsets the "claimList" element
     */
    void unsetClaimList();
    
    /**
     * Gets the "paymentList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList getPaymentList();
    
    /**
     * True if has "paymentList" element
     */
    boolean isSetPaymentList();
    
    /**
     * Sets the "paymentList" element
     */
    void setPaymentList(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList paymentList);
    
    /**
     * Appends and returns a new empty "paymentList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList addNewPaymentList();
    
    /**
     * Unsets the "paymentList" element
     */
    void unsetPaymentList();
    
    /**
     * Gets the "reimbursementData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData getReimbursementData();
    
    /**
     * True if has "reimbursementData" element
     */
    boolean isSetReimbursementData();
    
    /**
     * Sets the "reimbursementData" element
     */
    void setReimbursementData(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData reimbursementData);
    
    /**
     * Appends and returns a new empty "reimbursementData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData addNewReimbursementData();
    
    /**
     * Unsets the "reimbursementData" element
     */
    void unsetReimbursementData();
    
    /**
     * Gets the "interestValuta" element
     */
    java.lang.String getInterestValuta();
    
    /**
     * Gets (as xml) the "interestValuta" element
     */
    org.apache.xmlbeans.XmlString xgetInterestValuta();
    
    /**
     * True if has "interestValuta" element
     */
    boolean isSetInterestValuta();
    
    /**
     * Sets the "interestValuta" element
     */
    void setInterestValuta(java.lang.String interestValuta);
    
    /**
     * Sets (as xml) the "interestValuta" element
     */
    void xsetInterestValuta(org.apache.xmlbeans.XmlString interestValuta);
    
    /**
     * Unsets the "interestValuta" element
     */
    void unsetInterestValuta();
    
    /**
     * Gets the "interestReason" element
     */
    java.lang.String getInterestReason();
    
    /**
     * Gets (as xml) the "interestReason" element
     */
    org.apache.xmlbeans.XmlString xgetInterestReason();
    
    /**
     * True if has "interestReason" element
     */
    boolean isSetInterestReason();
    
    /**
     * Sets the "interestReason" element
     */
    void setInterestReason(java.lang.String interestReason);
    
    /**
     * Sets (as xml) the "interestReason" element
     */
    void xsetInterestReason(org.apache.xmlbeans.XmlString interestReason);
    
    /**
     * Unsets the "interestReason" element
     */
    void unsetInterestReason();
    
    /**
     * Gets array of all "fileList" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] getFileListArray();
    
    /**
     * Gets ith "fileList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData getFileListArray(int i);
    
    /**
     * Returns number of "fileList" element
     */
    int sizeOfFileListArray();
    
    /**
     * Sets array of all "fileList" element
     */
    void setFileListArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] fileListArray);
    
    /**
     * Sets ith "fileList" element
     */
    void setFileListArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData fileList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData insertNewFileList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData addNewFileList();
    
    /**
     * Removes the ith "fileList" element
     */
    void removeFileList(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
