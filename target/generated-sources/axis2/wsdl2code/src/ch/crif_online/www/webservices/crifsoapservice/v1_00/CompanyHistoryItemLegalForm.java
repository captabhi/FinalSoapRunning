/*
 * XML Type:  CompanyHistoryItemLegalForm
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML CompanyHistoryItemLegalForm(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface CompanyHistoryItemLegalForm extends ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyHistoryItemLegalForm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("companyhistoryitemlegalformb148type");
    
    /**
     * Gets the "legalFormType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum getLegalFormType();
    
    /**
     * Gets (as xml) the "legalFormType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType xgetLegalFormType();
    
    /**
     * Sets the "legalFormType" element
     */
    void setLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum legalFormType);
    
    /**
     * Sets (as xml) the "legalFormType" element
     */
    void xsetLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType legalFormType);
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    java.lang.String getLegalFormTypeOriginal();
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal();
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    boolean isSetLegalFormTypeOriginal();
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal);
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal);
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    void unsetLegalFormTypeOriginal();
    
    /**
     * Gets the "legalFormText" element
     */
    java.lang.String getLegalFormText();
    
    /**
     * Gets (as xml) the "legalFormText" element
     */
    org.apache.xmlbeans.XmlString xgetLegalFormText();
    
    /**
     * True if has "legalFormText" element
     */
    boolean isSetLegalFormText();
    
    /**
     * Sets the "legalFormText" element
     */
    void setLegalFormText(java.lang.String legalFormText);
    
    /**
     * Sets (as xml) the "legalFormText" element
     */
    void xsetLegalFormText(org.apache.xmlbeans.XmlString legalFormText);
    
    /**
     * Unsets the "legalFormText" element
     */
    void unsetLegalFormText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
