/*
 * XML Type:  ESchKgClaim
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ESchKgClaim(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ESchKgClaim extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESchKgClaim.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("eschkgclaim2e62type");
    
    /**
     * Gets the "claimId" element
     */
    java.lang.String getClaimId();
    
    /**
     * Gets (as xml) the "claimId" element
     */
    org.apache.xmlbeans.XmlString xgetClaimId();
    
    /**
     * True if has "claimId" element
     */
    boolean isSetClaimId();
    
    /**
     * Sets the "claimId" element
     */
    void setClaimId(java.lang.String claimId);
    
    /**
     * Sets (as xml) the "claimId" element
     */
    void xsetClaimId(org.apache.xmlbeans.XmlString claimId);
    
    /**
     * Unsets the "claimId" element
     */
    void unsetClaimId();
    
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
     * Gets the "invoiceNo" element
     */
    java.lang.String getInvoiceNo();
    
    /**
     * Gets (as xml) the "invoiceNo" element
     */
    org.apache.xmlbeans.XmlString xgetInvoiceNo();
    
    /**
     * True if has "invoiceNo" element
     */
    boolean isSetInvoiceNo();
    
    /**
     * Sets the "invoiceNo" element
     */
    void setInvoiceNo(java.lang.String invoiceNo);
    
    /**
     * Sets (as xml) the "invoiceNo" element
     */
    void xsetInvoiceNo(org.apache.xmlbeans.XmlString invoiceNo);
    
    /**
     * Unsets the "invoiceNo" element
     */
    void unsetInvoiceNo();
    
    /**
     * Gets the "reason" element
     */
    java.lang.String getReason();
    
    /**
     * Gets (as xml) the "reason" element
     */
    org.apache.xmlbeans.XmlString xgetReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(java.lang.String reason);
    
    /**
     * Sets (as xml) the "reason" element
     */
    void xsetReason(org.apache.xmlbeans.XmlString reason);
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
    /**
     * Gets the "dateOfClaim" element
     */
    java.lang.String getDateOfClaim();
    
    /**
     * Gets (as xml) the "dateOfClaim" element
     */
    org.apache.xmlbeans.XmlString xgetDateOfClaim();
    
    /**
     * True if has "dateOfClaim" element
     */
    boolean isSetDateOfClaim();
    
    /**
     * Sets the "dateOfClaim" element
     */
    void setDateOfClaim(java.lang.String dateOfClaim);
    
    /**
     * Sets (as xml) the "dateOfClaim" element
     */
    void xsetDateOfClaim(org.apache.xmlbeans.XmlString dateOfClaim);
    
    /**
     * Unsets the "dateOfClaim" element
     */
    void unsetDateOfClaim();
    
    /**
     * Gets the "amount" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmount();
    
    /**
     * True if has "amount" element
     */
    boolean isSetAmount();
    
    /**
     * Sets the "amount" element
     */
    void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount);
    
    /**
     * Appends and returns a new empty "amount" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewAmount();
    
    /**
     * Unsets the "amount" element
     */
    void unsetAmount();
    
    /**
     * Gets the "timeLimit" element
     */
    java.math.BigInteger getTimeLimit();
    
    /**
     * Gets (as xml) the "timeLimit" element
     */
    org.apache.xmlbeans.XmlInteger xgetTimeLimit();
    
    /**
     * True if has "timeLimit" element
     */
    boolean isSetTimeLimit();
    
    /**
     * Sets the "timeLimit" element
     */
    void setTimeLimit(java.math.BigInteger timeLimit);
    
    /**
     * Sets (as xml) the "timeLimit" element
     */
    void xsetTimeLimit(org.apache.xmlbeans.XmlInteger timeLimit);
    
    /**
     * Unsets the "timeLimit" element
     */
    void unsetTimeLimit();
    
    /**
     * Gets the "interestRate" element
     */
    double getInterestRate();
    
    /**
     * Gets (as xml) the "interestRate" element
     */
    org.apache.xmlbeans.XmlDouble xgetInterestRate();
    
    /**
     * Tests for nil "interestRate" element
     */
    boolean isNilInterestRate();
    
    /**
     * True if has "interestRate" element
     */
    boolean isSetInterestRate();
    
    /**
     * Sets the "interestRate" element
     */
    void setInterestRate(double interestRate);
    
    /**
     * Sets (as xml) the "interestRate" element
     */
    void xsetInterestRate(org.apache.xmlbeans.XmlDouble interestRate);
    
    /**
     * Nils the "interestRate" element
     */
    void setNilInterestRate();
    
    /**
     * Unsets the "interestRate" element
     */
    void unsetInterestRate();
    
    /**
     * Gets the "type" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType xgetType();
    
    /**
     * Tests for nil "type" element
     */
    boolean isNilType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType type);
    
    /**
     * Nils the "type" element
     */
    void setNilType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "jobId" element
     */
    java.math.BigInteger getJobId();
    
    /**
     * Gets (as xml) the "jobId" element
     */
    org.apache.xmlbeans.XmlInteger xgetJobId();
    
    /**
     * Sets the "jobId" element
     */
    void setJobId(java.math.BigInteger jobId);
    
    /**
     * Sets (as xml) the "jobId" element
     */
    void xsetJobId(org.apache.xmlbeans.XmlInteger jobId);
    
    /**
     * Gets the "collocation" element
     */
    java.math.BigInteger getCollocation();
    
    /**
     * Gets (as xml) the "collocation" element
     */
    org.apache.xmlbeans.XmlInteger xgetCollocation();
    
    /**
     * Sets the "collocation" element
     */
    void setCollocation(java.math.BigInteger collocation);
    
    /**
     * Sets (as xml) the "collocation" element
     */
    void xsetCollocation(org.apache.xmlbeans.XmlInteger collocation);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
