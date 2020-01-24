/*
 * XML Type:  BankAccount
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML BankAccount(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface BankAccount extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BankAccount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("bankaccount7966type");
    
    /**
     * Gets the "bank" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription getBank();
    
    /**
     * True if has "bank" element
     */
    boolean isSetBank();
    
    /**
     * Sets the "bank" element
     */
    void setBank(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription bank);
    
    /**
     * Appends and returns a new empty "bank" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription addNewBank();
    
    /**
     * Unsets the "bank" element
     */
    void unsetBank();
    
    /**
     * Gets the "bankDescription" element
     */
    java.lang.String getBankDescription();
    
    /**
     * Gets (as xml) the "bankDescription" element
     */
    org.apache.xmlbeans.XmlString xgetBankDescription();
    
    /**
     * True if has "bankDescription" element
     */
    boolean isSetBankDescription();
    
    /**
     * Sets the "bankDescription" element
     */
    void setBankDescription(java.lang.String bankDescription);
    
    /**
     * Sets (as xml) the "bankDescription" element
     */
    void xsetBankDescription(org.apache.xmlbeans.XmlString bankDescription);
    
    /**
     * Unsets the "bankDescription" element
     */
    void unsetBankDescription();
    
    /**
     * Gets the "localAccountNr" element
     */
    java.lang.String getLocalAccountNr();
    
    /**
     * Gets (as xml) the "localAccountNr" element
     */
    org.apache.xmlbeans.XmlString xgetLocalAccountNr();
    
    /**
     * True if has "localAccountNr" element
     */
    boolean isSetLocalAccountNr();
    
    /**
     * Sets the "localAccountNr" element
     */
    void setLocalAccountNr(java.lang.String localAccountNr);
    
    /**
     * Sets (as xml) the "localAccountNr" element
     */
    void xsetLocalAccountNr(org.apache.xmlbeans.XmlString localAccountNr);
    
    /**
     * Unsets the "localAccountNr" element
     */
    void unsetLocalAccountNr();
    
    /**
     * Gets the "iban" element
     */
    java.lang.String getIban();
    
    /**
     * Gets (as xml) the "iban" element
     */
    org.apache.xmlbeans.XmlString xgetIban();
    
    /**
     * True if has "iban" element
     */
    boolean isSetIban();
    
    /**
     * Sets the "iban" element
     */
    void setIban(java.lang.String iban);
    
    /**
     * Sets (as xml) the "iban" element
     */
    void xsetIban(org.apache.xmlbeans.XmlString iban);
    
    /**
     * Unsets the "iban" element
     */
    void unsetIban();
    
    /**
     * Gets the "swiftCode" element
     */
    java.lang.String getSwiftCode();
    
    /**
     * Gets (as xml) the "swiftCode" element
     */
    org.apache.xmlbeans.XmlString xgetSwiftCode();
    
    /**
     * True if has "swiftCode" element
     */
    boolean isSetSwiftCode();
    
    /**
     * Sets the "swiftCode" element
     */
    void setSwiftCode(java.lang.String swiftCode);
    
    /**
     * Sets (as xml) the "swiftCode" element
     */
    void xsetSwiftCode(org.apache.xmlbeans.XmlString swiftCode);
    
    /**
     * Unsets the "swiftCode" element
     */
    void unsetSwiftCode();
    
    /**
     * Gets the "currency" element
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "currency" element
     */
    org.apache.xmlbeans.XmlString xgetCurrency();
    
    /**
     * True if has "currency" element
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "currency" element
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "currency" element
     */
    void xsetCurrency(org.apache.xmlbeans.XmlString currency);
    
    /**
     * Unsets the "currency" element
     */
    void unsetCurrency();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
