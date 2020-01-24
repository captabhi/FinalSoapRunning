/*
 * XML Type:  IdVerificationPerson
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML IdVerificationPerson(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface IdVerificationPerson extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdVerificationPerson.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("idverificationpersona312type");
    
    /**
     * Gets the "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription getAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription addNewAddress();
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "address1" element
     */
    java.lang.String getAddress1();
    
    /**
     * Gets (as xml) the "address1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1();
    
    /**
     * True if has "address1" element
     */
    boolean isSetAddress1();
    
    /**
     * Sets the "address1" element
     */
    void setAddress1(java.lang.String address1);
    
    /**
     * Sets (as xml) the "address1" element
     */
    void xsetAddress1(org.apache.xmlbeans.XmlString address1);
    
    /**
     * Unsets the "address1" element
     */
    void unsetAddress1();
    
    /**
     * Gets the "address2" element
     */
    java.lang.String getAddress2();
    
    /**
     * Gets (as xml) the "address2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2();
    
    /**
     * True if has "address2" element
     */
    boolean isSetAddress2();
    
    /**
     * Sets the "address2" element
     */
    void setAddress2(java.lang.String address2);
    
    /**
     * Sets (as xml) the "address2" element
     */
    void xsetAddress2(org.apache.xmlbeans.XmlString address2);
    
    /**
     * Unsets the "address2" element
     */
    void unsetAddress2();
    
    /**
     * Gets the "nationalIdentificationNumber" element
     */
    java.lang.String getNationalIdentificationNumber();
    
    /**
     * Gets (as xml) the "nationalIdentificationNumber" element
     */
    org.apache.xmlbeans.XmlString xgetNationalIdentificationNumber();
    
    /**
     * True if has "nationalIdentificationNumber" element
     */
    boolean isSetNationalIdentificationNumber();
    
    /**
     * Sets the "nationalIdentificationNumber" element
     */
    void setNationalIdentificationNumber(java.lang.String nationalIdentificationNumber);
    
    /**
     * Sets (as xml) the "nationalIdentificationNumber" element
     */
    void xsetNationalIdentificationNumber(org.apache.xmlbeans.XmlString nationalIdentificationNumber);
    
    /**
     * Unsets the "nationalIdentificationNumber" element
     */
    void unsetNationalIdentificationNumber();
    
    /**
     * Gets the "placeOfBirth" element
     */
    java.lang.String getPlaceOfBirth();
    
    /**
     * Gets (as xml) the "placeOfBirth" element
     */
    org.apache.xmlbeans.XmlString xgetPlaceOfBirth();
    
    /**
     * True if has "placeOfBirth" element
     */
    boolean isSetPlaceOfBirth();
    
    /**
     * Sets the "placeOfBirth" element
     */
    void setPlaceOfBirth(java.lang.String placeOfBirth);
    
    /**
     * Sets (as xml) the "placeOfBirth" element
     */
    void xsetPlaceOfBirth(org.apache.xmlbeans.XmlString placeOfBirth);
    
    /**
     * Unsets the "placeOfBirth" element
     */
    void unsetPlaceOfBirth();
    
    /**
     * Gets the "nationality" element
     */
    java.lang.String getNationality();
    
    /**
     * Gets (as xml) the "nationality" element
     */
    org.apache.xmlbeans.XmlString xgetNationality();
    
    /**
     * True if has "nationality" element
     */
    boolean isSetNationality();
    
    /**
     * Sets the "nationality" element
     */
    void setNationality(java.lang.String nationality);
    
    /**
     * Sets (as xml) the "nationality" element
     */
    void xsetNationality(org.apache.xmlbeans.XmlString nationality);
    
    /**
     * Unsets the "nationality" element
     */
    void unsetNationality();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
