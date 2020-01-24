/*
 * XML Type:  ESchKgPaymentData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ESchKgPaymentData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ESchKgPaymentData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESchKgPaymentData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("eschkgpaymentdata24f6type");
    
    /**
     * Gets the "paymentId" element
     */
    java.lang.String getPaymentId();
    
    /**
     * Gets (as xml) the "paymentId" element
     */
    org.apache.xmlbeans.XmlString xgetPaymentId();
    
    /**
     * True if has "paymentId" element
     */
    boolean isSetPaymentId();
    
    /**
     * Sets the "paymentId" element
     */
    void setPaymentId(java.lang.String paymentId);
    
    /**
     * Sets (as xml) the "paymentId" element
     */
    void xsetPaymentId(org.apache.xmlbeans.XmlString paymentId);
    
    /**
     * Unsets the "paymentId" element
     */
    void unsetPaymentId();
    
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
     * Gets the "dateOfPayment" element
     */
    java.lang.String getDateOfPayment();
    
    /**
     * Gets (as xml) the "dateOfPayment" element
     */
    org.apache.xmlbeans.XmlString xgetDateOfPayment();
    
    /**
     * True if has "dateOfPayment" element
     */
    boolean isSetDateOfPayment();
    
    /**
     * Sets the "dateOfPayment" element
     */
    void setDateOfPayment(java.lang.String dateOfPayment);
    
    /**
     * Sets (as xml) the "dateOfPayment" element
     */
    void xsetDateOfPayment(org.apache.xmlbeans.XmlString dateOfPayment);
    
    /**
     * Unsets the "dateOfPayment" element
     */
    void unsetDateOfPayment();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
