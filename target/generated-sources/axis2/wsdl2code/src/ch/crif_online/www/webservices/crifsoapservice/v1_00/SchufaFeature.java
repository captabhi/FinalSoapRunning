/*
 * XML Type:  SchufaFeature
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML SchufaFeature(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface SchufaFeature extends ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchufaFeature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("schufafeature94d3type");
    
    /**
     * Gets the "date" element
     */
    java.lang.String getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlString xgetDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.lang.String date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlString date);
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "accountNumber" element
     */
    java.lang.String getAccountNumber();
    
    /**
     * Gets (as xml) the "accountNumber" element
     */
    org.apache.xmlbeans.XmlString xgetAccountNumber();
    
    /**
     * True if has "accountNumber" element
     */
    boolean isSetAccountNumber();
    
    /**
     * Sets the "accountNumber" element
     */
    void setAccountNumber(java.lang.String accountNumber);
    
    /**
     * Sets (as xml) the "accountNumber" element
     */
    void xsetAccountNumber(org.apache.xmlbeans.XmlString accountNumber);
    
    /**
     * Unsets the "accountNumber" element
     */
    void unsetAccountNumber();
    
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
     * Gets the "numberOfInstallments" element
     */
    java.math.BigInteger getNumberOfInstallments();
    
    /**
     * Gets (as xml) the "numberOfInstallments" element
     */
    org.apache.xmlbeans.XmlInteger xgetNumberOfInstallments();
    
    /**
     * True if has "numberOfInstallments" element
     */
    boolean isSetNumberOfInstallments();
    
    /**
     * Sets the "numberOfInstallments" element
     */
    void setNumberOfInstallments(java.math.BigInteger numberOfInstallments);
    
    /**
     * Sets (as xml) the "numberOfInstallments" element
     */
    void xsetNumberOfInstallments(org.apache.xmlbeans.XmlInteger numberOfInstallments);
    
    /**
     * Unsets the "numberOfInstallments" element
     */
    void unsetNumberOfInstallments();
    
    /**
     * Gets the "installmentType" element
     */
    java.math.BigInteger getInstallmentType();
    
    /**
     * Gets (as xml) the "installmentType" element
     */
    org.apache.xmlbeans.XmlInteger xgetInstallmentType();
    
    /**
     * True if has "installmentType" element
     */
    boolean isSetInstallmentType();
    
    /**
     * Sets the "installmentType" element
     */
    void setInstallmentType(java.math.BigInteger installmentType);
    
    /**
     * Sets (as xml) the "installmentType" element
     */
    void xsetInstallmentType(org.apache.xmlbeans.XmlInteger installmentType);
    
    /**
     * Unsets the "installmentType" element
     */
    void unsetInstallmentType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
