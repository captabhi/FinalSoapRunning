/*
 * XML Type:  PaymentDelay
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML PaymentDelay(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface PaymentDelay extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentDelay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("paymentdelay1a64type");
    
    /**
     * Gets the "inTimeRatio" element
     */
    java.math.BigDecimal getInTimeRatio();
    
    /**
     * Gets (as xml) the "inTimeRatio" element
     */
    org.apache.xmlbeans.XmlDecimal xgetInTimeRatio();
    
    /**
     * True if has "inTimeRatio" element
     */
    boolean isSetInTimeRatio();
    
    /**
     * Sets the "inTimeRatio" element
     */
    void setInTimeRatio(java.math.BigDecimal inTimeRatio);
    
    /**
     * Sets (as xml) the "inTimeRatio" element
     */
    void xsetInTimeRatio(org.apache.xmlbeans.XmlDecimal inTimeRatio);
    
    /**
     * Unsets the "inTimeRatio" element
     */
    void unsetInTimeRatio();
    
    /**
     * Gets the "avgDelayShortTerm" element
     */
    java.math.BigInteger getAvgDelayShortTerm();
    
    /**
     * Gets (as xml) the "avgDelayShortTerm" element
     */
    org.apache.xmlbeans.XmlInteger xgetAvgDelayShortTerm();
    
    /**
     * True if has "avgDelayShortTerm" element
     */
    boolean isSetAvgDelayShortTerm();
    
    /**
     * Sets the "avgDelayShortTerm" element
     */
    void setAvgDelayShortTerm(java.math.BigInteger avgDelayShortTerm);
    
    /**
     * Sets (as xml) the "avgDelayShortTerm" element
     */
    void xsetAvgDelayShortTerm(org.apache.xmlbeans.XmlInteger avgDelayShortTerm);
    
    /**
     * Unsets the "avgDelayShortTerm" element
     */
    void unsetAvgDelayShortTerm();
    
    /**
     * Gets the "avgDelayLongTerm" element
     */
    java.math.BigInteger getAvgDelayLongTerm();
    
    /**
     * Gets (as xml) the "avgDelayLongTerm" element
     */
    org.apache.xmlbeans.XmlInteger xgetAvgDelayLongTerm();
    
    /**
     * True if has "avgDelayLongTerm" element
     */
    boolean isSetAvgDelayLongTerm();
    
    /**
     * Sets the "avgDelayLongTerm" element
     */
    void setAvgDelayLongTerm(java.math.BigInteger avgDelayLongTerm);
    
    /**
     * Sets (as xml) the "avgDelayLongTerm" element
     */
    void xsetAvgDelayLongTerm(org.apache.xmlbeans.XmlInteger avgDelayLongTerm);
    
    /**
     * Unsets the "avgDelayLongTerm" element
     */
    void unsetAvgDelayLongTerm();
    
    /**
     * Gets the "paymentType" element
     */
    java.lang.String getPaymentType();
    
    /**
     * Gets (as xml) the "paymentType" element
     */
    org.apache.xmlbeans.XmlString xgetPaymentType();
    
    /**
     * True if has "paymentType" element
     */
    boolean isSetPaymentType();
    
    /**
     * Sets the "paymentType" element
     */
    void setPaymentType(java.lang.String paymentType);
    
    /**
     * Sets (as xml) the "paymentType" element
     */
    void xsetPaymentType(org.apache.xmlbeans.XmlString paymentType);
    
    /**
     * Unsets the "paymentType" element
     */
    void unsetPaymentType();
    
    /**
     * Gets the "paymentExpectedType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType.Enum getPaymentExpectedType();
    
    /**
     * Gets (as xml) the "paymentExpectedType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType xgetPaymentExpectedType();
    
    /**
     * True if has "paymentExpectedType" element
     */
    boolean isSetPaymentExpectedType();
    
    /**
     * Sets the "paymentExpectedType" element
     */
    void setPaymentExpectedType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType.Enum paymentExpectedType);
    
    /**
     * Sets (as xml) the "paymentExpectedType" element
     */
    void xsetPaymentExpectedType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType paymentExpectedType);
    
    /**
     * Unsets the "paymentExpectedType" element
     */
    void unsetPaymentExpectedType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
