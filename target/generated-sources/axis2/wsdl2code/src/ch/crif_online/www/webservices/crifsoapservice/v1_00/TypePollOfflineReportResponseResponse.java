/*
 * XML Type:  TypePollOfflineReportResponseResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypePollOfflineReportResponseResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypePollOfflineReportResponseResponse extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypePollOfflineReportResponseResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typepollofflinereportresponseresponsea0f5type");
    
    /**
     * Gets the "offlineReportStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus.Enum getOfflineReportStatus();
    
    /**
     * Gets (as xml) the "offlineReportStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus xgetOfflineReportStatus();
    
    /**
     * True if has "offlineReportStatus" element
     */
    boolean isSetOfflineReportStatus();
    
    /**
     * Sets the "offlineReportStatus" element
     */
    void setOfflineReportStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus.Enum offlineReportStatus);
    
    /**
     * Sets (as xml) the "offlineReportStatus" element
     */
    void xsetOfflineReportStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportStatus offlineReportStatus);
    
    /**
     * Unsets the "offlineReportStatus" element
     */
    void unsetOfflineReportStatus();
    
    /**
     * Gets the "report" element
     */
    java.lang.String getReport();
    
    /**
     * Gets (as xml) the "report" element
     */
    org.apache.xmlbeans.XmlString xgetReport();
    
    /**
     * True if has "report" element
     */
    boolean isSetReport();
    
    /**
     * Sets the "report" element
     */
    void setReport(java.lang.String report);
    
    /**
     * Sets (as xml) the "report" element
     */
    void xsetReport(org.apache.xmlbeans.XmlString report);
    
    /**
     * Unsets the "report" element
     */
    void unsetReport();
    
    /**
     * Gets array of all "debts" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] getDebtsArray();
    
    /**
     * Gets ith "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry getDebtsArray(int i);
    
    /**
     * Returns number of "debts" element
     */
    int sizeOfDebtsArray();
    
    /**
     * Sets array of all "debts" element
     */
    void setDebtsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry[] debtsArray);
    
    /**
     * Sets ith "debts" element
     */
    void setDebtsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry debts);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry insertNewDebts(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "debts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry addNewDebts();
    
    /**
     * Removes the ith "debts" element
     */
    void removeDebts(int i);
    
    /**
     * Gets the "offlineReportIdentifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier getOfflineReportIdentifier();
    
    /**
     * True if has "offlineReportIdentifier" element
     */
    boolean isSetOfflineReportIdentifier();
    
    /**
     * Sets the "offlineReportIdentifier" element
     */
    void setOfflineReportIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier offlineReportIdentifier);
    
    /**
     * Appends and returns a new empty "offlineReportIdentifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier addNewOfflineReportIdentifier();
    
    /**
     * Unsets the "offlineReportIdentifier" element
     */
    void unsetOfflineReportIdentifier();
    
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
     * Gets the "rejectionReason" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.Enum getRejectionReason();
    
    /**
     * Gets (as xml) the "rejectionReason" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason xgetRejectionReason();
    
    /**
     * True if has "rejectionReason" element
     */
    boolean isSetRejectionReason();
    
    /**
     * Sets the "rejectionReason" element
     */
    void setRejectionReason(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.Enum rejectionReason);
    
    /**
     * Sets (as xml) the "rejectionReason" element
     */
    void xsetRejectionReason(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason rejectionReason);
    
    /**
     * Unsets the "rejectionReason" element
     */
    void unsetRejectionReason();
    
    /**
     * Gets the "numberOfOriginalDocuments" element
     */
    java.math.BigInteger getNumberOfOriginalDocuments();
    
    /**
     * Gets (as xml) the "numberOfOriginalDocuments" element
     */
    org.apache.xmlbeans.XmlInteger xgetNumberOfOriginalDocuments();
    
    /**
     * True if has "numberOfOriginalDocuments" element
     */
    boolean isSetNumberOfOriginalDocuments();
    
    /**
     * Sets the "numberOfOriginalDocuments" element
     */
    void setNumberOfOriginalDocuments(java.math.BigInteger numberOfOriginalDocuments);
    
    /**
     * Sets (as xml) the "numberOfOriginalDocuments" element
     */
    void xsetNumberOfOriginalDocuments(org.apache.xmlbeans.XmlInteger numberOfOriginalDocuments);
    
    /**
     * Unsets the "numberOfOriginalDocuments" element
     */
    void unsetNumberOfOriginalDocuments();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
