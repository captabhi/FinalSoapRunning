/*
 * XML Type:  PersonAddressDescription
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML PersonAddressDescription(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface PersonAddressDescription extends ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonAddressDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("personaddressdescriptionc564type");
    
    /**
     * Gets the "firstName" element
     */
    java.lang.String getFirstName();
    
    /**
     * Gets (as xml) the "firstName" element
     */
    org.apache.xmlbeans.XmlString xgetFirstName();
    
    /**
     * True if has "firstName" element
     */
    boolean isSetFirstName();
    
    /**
     * Sets the "firstName" element
     */
    void setFirstName(java.lang.String firstName);
    
    /**
     * Sets (as xml) the "firstName" element
     */
    void xsetFirstName(org.apache.xmlbeans.XmlString firstName);
    
    /**
     * Unsets the "firstName" element
     */
    void unsetFirstName();
    
    /**
     * Gets the "lastName" element
     */
    java.lang.String getLastName();
    
    /**
     * Gets (as xml) the "lastName" element
     */
    org.apache.xmlbeans.XmlString xgetLastName();
    
    /**
     * True if has "lastName" element
     */
    boolean isSetLastName();
    
    /**
     * Sets the "lastName" element
     */
    void setLastName(java.lang.String lastName);
    
    /**
     * Sets (as xml) the "lastName" element
     */
    void xsetLastName(org.apache.xmlbeans.XmlString lastName);
    
    /**
     * Unsets the "lastName" element
     */
    void unsetLastName();
    
    /**
     * Gets the "maidenName" element
     */
    java.lang.String getMaidenName();
    
    /**
     * Gets (as xml) the "maidenName" element
     */
    org.apache.xmlbeans.XmlString xgetMaidenName();
    
    /**
     * True if has "maidenName" element
     */
    boolean isSetMaidenName();
    
    /**
     * Sets the "maidenName" element
     */
    void setMaidenName(java.lang.String maidenName);
    
    /**
     * Sets (as xml) the "maidenName" element
     */
    void xsetMaidenName(org.apache.xmlbeans.XmlString maidenName);
    
    /**
     * Unsets the "maidenName" element
     */
    void unsetMaidenName();
    
    /**
     * Gets the "middleName" element
     */
    java.lang.String getMiddleName();
    
    /**
     * Gets (as xml) the "middleName" element
     */
    org.apache.xmlbeans.XmlString xgetMiddleName();
    
    /**
     * True if has "middleName" element
     */
    boolean isSetMiddleName();
    
    /**
     * Sets the "middleName" element
     */
    void setMiddleName(java.lang.String middleName);
    
    /**
     * Sets (as xml) the "middleName" element
     */
    void xsetMiddleName(org.apache.xmlbeans.XmlString middleName);
    
    /**
     * Unsets the "middleName" element
     */
    void unsetMiddleName();
    
    /**
     * Gets the "coName" element
     */
    java.lang.String getCoName();
    
    /**
     * Gets (as xml) the "coName" element
     */
    org.apache.xmlbeans.XmlString xgetCoName();
    
    /**
     * True if has "coName" element
     */
    boolean isSetCoName();
    
    /**
     * Sets the "coName" element
     */
    void setCoName(java.lang.String coName);
    
    /**
     * Sets (as xml) the "coName" element
     */
    void xsetCoName(org.apache.xmlbeans.XmlString coName);
    
    /**
     * Unsets the "coName" element
     */
    void unsetCoName();
    
    /**
     * Gets the "sex" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex.Enum getSex();
    
    /**
     * Gets (as xml) the "sex" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex xgetSex();
    
    /**
     * True if has "sex" element
     */
    boolean isSetSex();
    
    /**
     * Sets the "sex" element
     */
    void setSex(ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex.Enum sex);
    
    /**
     * Sets (as xml) the "sex" element
     */
    void xsetSex(ch.crif_online.www.webservices.crifsoapservice.v1_00.Sex sex);
    
    /**
     * Unsets the "sex" element
     */
    void unsetSex();
    
    /**
     * Gets the "birthDate" element
     */
    java.lang.String getBirthDate();
    
    /**
     * Gets (as xml) the "birthDate" element
     */
    org.apache.xmlbeans.XmlString xgetBirthDate();
    
    /**
     * True if has "birthDate" element
     */
    boolean isSetBirthDate();
    
    /**
     * Sets the "birthDate" element
     */
    void setBirthDate(java.lang.String birthDate);
    
    /**
     * Sets (as xml) the "birthDate" element
     */
    void xsetBirthDate(org.apache.xmlbeans.XmlString birthDate);
    
    /**
     * Unsets the "birthDate" element
     */
    void unsetBirthDate();
    
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
