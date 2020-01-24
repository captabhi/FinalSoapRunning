/*
 * XML Type:  ESchKgOrderData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ESchKgOrderData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ESchKgOrderData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESchKgOrderData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("eschkgorderdatad43etype");
    
    /**
     * Gets the "orderId" element
     */
    java.math.BigInteger getOrderId();
    
    /**
     * Gets (as xml) the "orderId" element
     */
    org.apache.xmlbeans.XmlInteger xgetOrderId();
    
    /**
     * Sets the "orderId" element
     */
    void setOrderId(java.math.BigInteger orderId);
    
    /**
     * Sets (as xml) the "orderId" element
     */
    void xsetOrderId(org.apache.xmlbeans.XmlInteger orderId);
    
    /**
     * Gets the "referenceNumber" element
     */
    java.lang.String getReferenceNumber();
    
    /**
     * Gets (as xml) the "referenceNumber" element
     */
    org.apache.xmlbeans.XmlString xgetReferenceNumber();
    
    /**
     * True if has "referenceNumber" element
     */
    boolean isSetReferenceNumber();
    
    /**
     * Sets the "referenceNumber" element
     */
    void setReferenceNumber(java.lang.String referenceNumber);
    
    /**
     * Sets (as xml) the "referenceNumber" element
     */
    void xsetReferenceNumber(org.apache.xmlbeans.XmlString referenceNumber);
    
    /**
     * Unsets the "referenceNumber" element
     */
    void unsetReferenceNumber();
    
    /**
     * Gets the "externalId" element
     */
    java.lang.String getExternalId();
    
    /**
     * Gets (as xml) the "externalId" element
     */
    org.apache.xmlbeans.XmlString xgetExternalId();
    
    /**
     * True if has "externalId" element
     */
    boolean isSetExternalId();
    
    /**
     * Sets the "externalId" element
     */
    void setExternalId(java.lang.String externalId);
    
    /**
     * Sets (as xml) the "externalId" element
     */
    void xsetExternalId(org.apache.xmlbeans.XmlString externalId);
    
    /**
     * Unsets the "externalId" element
     */
    void unsetExternalId();
    
    /**
     * Gets the "caseGroup" element
     */
    java.lang.String getCaseGroup();
    
    /**
     * Gets (as xml) the "caseGroup" element
     */
    org.apache.xmlbeans.XmlString xgetCaseGroup();
    
    /**
     * True if has "caseGroup" element
     */
    boolean isSetCaseGroup();
    
    /**
     * Sets the "caseGroup" element
     */
    void setCaseGroup(java.lang.String caseGroup);
    
    /**
     * Sets (as xml) the "caseGroup" element
     */
    void xsetCaseGroup(org.apache.xmlbeans.XmlString caseGroup);
    
    /**
     * Unsets the "caseGroup" element
     */
    void unsetCaseGroup();
    
    /**
     * Gets the "caseGroupType" element
     */
    java.lang.String getCaseGroupType();
    
    /**
     * Gets (as xml) the "caseGroupType" element
     */
    org.apache.xmlbeans.XmlString xgetCaseGroupType();
    
    /**
     * True if has "caseGroupType" element
     */
    boolean isSetCaseGroupType();
    
    /**
     * Sets the "caseGroupType" element
     */
    void setCaseGroupType(java.lang.String caseGroupType);
    
    /**
     * Sets (as xml) the "caseGroupType" element
     */
    void xsetCaseGroupType(org.apache.xmlbeans.XmlString caseGroupType);
    
    /**
     * Unsets the "caseGroupType" element
     */
    void unsetCaseGroupType();
    
    /**
     * Gets the "representative" element
     */
    java.lang.String getRepresentative();
    
    /**
     * Gets (as xml) the "representative" element
     */
    org.apache.xmlbeans.XmlString xgetRepresentative();
    
    /**
     * True if has "representative" element
     */
    boolean isSetRepresentative();
    
    /**
     * Sets the "representative" element
     */
    void setRepresentative(java.lang.String representative);
    
    /**
     * Sets (as xml) the "representative" element
     */
    void xsetRepresentative(org.apache.xmlbeans.XmlString representative);
    
    /**
     * Unsets the "representative" element
     */
    void unsetRepresentative();
    
    /**
     * Gets the "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewAddress();
    
    /**
     * Gets the "jobList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList getJobList();
    
    /**
     * Sets the "jobList" element
     */
    void setJobList(ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList jobList);
    
    /**
     * Appends and returns a new empty "jobList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList addNewJobList();
    
    /**
     * Gets the "claimList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList getClaimList();
    
    /**
     * Sets the "claimList" element
     */
    void setClaimList(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList claimList);
    
    /**
     * Appends and returns a new empty "claimList" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList addNewClaimList();
    
    /**
     * Gets the "statusMessage" element
     */
    java.lang.String getStatusMessage();
    
    /**
     * Gets (as xml) the "statusMessage" element
     */
    org.apache.xmlbeans.XmlString xgetStatusMessage();
    
    /**
     * True if has "statusMessage" element
     */
    boolean isSetStatusMessage();
    
    /**
     * Sets the "statusMessage" element
     */
    void setStatusMessage(java.lang.String statusMessage);
    
    /**
     * Sets (as xml) the "statusMessage" element
     */
    void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage);
    
    /**
     * Unsets the "statusMessage" element
     */
    void unsetStatusMessage();
    
    /**
     * Gets the "officeCaseNumber" element
     */
    java.lang.String getOfficeCaseNumber();
    
    /**
     * Gets (as xml) the "officeCaseNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOfficeCaseNumber();
    
    /**
     * True if has "officeCaseNumber" element
     */
    boolean isSetOfficeCaseNumber();
    
    /**
     * Sets the "officeCaseNumber" element
     */
    void setOfficeCaseNumber(java.lang.String officeCaseNumber);
    
    /**
     * Sets (as xml) the "officeCaseNumber" element
     */
    void xsetOfficeCaseNumber(org.apache.xmlbeans.XmlString officeCaseNumber);
    
    /**
     * Unsets the "officeCaseNumber" element
     */
    void unsetOfficeCaseNumber();
    
    /**
     * Gets the "officeStatus" element
     */
    java.lang.String getOfficeStatus();
    
    /**
     * Gets (as xml) the "officeStatus" element
     */
    org.apache.xmlbeans.XmlString xgetOfficeStatus();
    
    /**
     * True if has "officeStatus" element
     */
    boolean isSetOfficeStatus();
    
    /**
     * Sets the "officeStatus" element
     */
    void setOfficeStatus(java.lang.String officeStatus);
    
    /**
     * Sets (as xml) the "officeStatus" element
     */
    void xsetOfficeStatus(org.apache.xmlbeans.XmlString officeStatus);
    
    /**
     * Unsets the "officeStatus" element
     */
    void unsetOfficeStatus();
    
    /**
     * Gets the "deadlineFrom" element
     */
    java.lang.String getDeadlineFrom();
    
    /**
     * Gets (as xml) the "deadlineFrom" element
     */
    org.apache.xmlbeans.XmlString xgetDeadlineFrom();
    
    /**
     * True if has "deadlineFrom" element
     */
    boolean isSetDeadlineFrom();
    
    /**
     * Sets the "deadlineFrom" element
     */
    void setDeadlineFrom(java.lang.String deadlineFrom);
    
    /**
     * Sets (as xml) the "deadlineFrom" element
     */
    void xsetDeadlineFrom(org.apache.xmlbeans.XmlString deadlineFrom);
    
    /**
     * Unsets the "deadlineFrom" element
     */
    void unsetDeadlineFrom();
    
    /**
     * Gets the "deadlineTo" element
     */
    java.lang.String getDeadlineTo();
    
    /**
     * Gets (as xml) the "deadlineTo" element
     */
    org.apache.xmlbeans.XmlString xgetDeadlineTo();
    
    /**
     * True if has "deadlineTo" element
     */
    boolean isSetDeadlineTo();
    
    /**
     * Sets the "deadlineTo" element
     */
    void setDeadlineTo(java.lang.String deadlineTo);
    
    /**
     * Sets (as xml) the "deadlineTo" element
     */
    void xsetDeadlineTo(org.apache.xmlbeans.XmlString deadlineTo);
    
    /**
     * Unsets the "deadlineTo" element
     */
    void unsetDeadlineTo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgOrderData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
