/*
 * XML Type:  DebtEntry
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML DebtEntry(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface DebtEntry extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebtEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("debtentry6974type");
    
    /**
     * Gets the "riskClass" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass.Enum getRiskClass();
    
    /**
     * Gets (as xml) the "riskClass" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass xgetRiskClass();
    
    /**
     * Sets the "riskClass" element
     */
    void setRiskClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass.Enum riskClass);
    
    /**
     * Sets (as xml) the "riskClass" element
     */
    void xsetRiskClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass riskClass);
    
    /**
     * Gets the "dateOpen" element
     */
    java.lang.String getDateOpen();
    
    /**
     * Gets (as xml) the "dateOpen" element
     */
    org.apache.xmlbeans.XmlString xgetDateOpen();
    
    /**
     * Sets the "dateOpen" element
     */
    void setDateOpen(java.lang.String dateOpen);
    
    /**
     * Sets (as xml) the "dateOpen" element
     */
    void xsetDateOpen(org.apache.xmlbeans.XmlString dateOpen);
    
    /**
     * Gets the "dateClose" element
     */
    java.lang.String getDateClose();
    
    /**
     * Gets (as xml) the "dateClose" element
     */
    org.apache.xmlbeans.XmlString xgetDateClose();
    
    /**
     * True if has "dateClose" element
     */
    boolean isSetDateClose();
    
    /**
     * Sets the "dateClose" element
     */
    void setDateClose(java.lang.String dateClose);
    
    /**
     * Sets (as xml) the "dateClose" element
     */
    void xsetDateClose(org.apache.xmlbeans.XmlString dateClose);
    
    /**
     * Unsets the "dateClose" element
     */
    void unsetDateClose();
    
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
     * Gets the "amountOpen" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmountOpen();
    
    /**
     * True if has "amountOpen" element
     */
    boolean isSetAmountOpen();
    
    /**
     * Sets the "amountOpen" element
     */
    void setAmountOpen(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amountOpen);
    
    /**
     * Appends and returns a new empty "amountOpen" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewAmountOpen();
    
    /**
     * Unsets the "amountOpen" element
     */
    void unsetAmountOpen();
    
    /**
     * Gets the "debtType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.Enum getDebtType();
    
    /**
     * Gets (as xml) the "debtType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType xgetDebtType();
    
    /**
     * Sets the "debtType" element
     */
    void setDebtType(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.Enum debtType);
    
    /**
     * Sets (as xml) the "debtType" element
     */
    void xsetDebtType(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType debtType);
    
    /**
     * Gets the "paymentStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus.Enum getPaymentStatus();
    
    /**
     * Gets (as xml) the "paymentStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus xgetPaymentStatus();
    
    /**
     * Sets the "paymentStatus" element
     */
    void setPaymentStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus.Enum paymentStatus);
    
    /**
     * Sets (as xml) the "paymentStatus" element
     */
    void xsetPaymentStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus paymentStatus);
    
    /**
     * Gets the "paymentStatusText" element
     */
    java.lang.String getPaymentStatusText();
    
    /**
     * Gets (as xml) the "paymentStatusText" element
     */
    org.apache.xmlbeans.XmlString xgetPaymentStatusText();
    
    /**
     * Sets the "paymentStatusText" element
     */
    void setPaymentStatusText(java.lang.String paymentStatusText);
    
    /**
     * Sets (as xml) the "paymentStatusText" element
     */
    void xsetPaymentStatusText(org.apache.xmlbeans.XmlString paymentStatusText);
    
    /**
     * Gets the "origin" element
     */
    java.lang.String getOrigin();
    
    /**
     * Gets (as xml) the "origin" element
     */
    org.apache.xmlbeans.XmlString xgetOrigin();
    
    /**
     * True if has "origin" element
     */
    boolean isSetOrigin();
    
    /**
     * Sets the "origin" element
     */
    void setOrigin(java.lang.String origin);
    
    /**
     * Sets (as xml) the "origin" element
     */
    void xsetOrigin(org.apache.xmlbeans.XmlString origin);
    
    /**
     * Unsets the "origin" element
     */
    void unsetOrigin();
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
