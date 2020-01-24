/*
 * XML Type:  Location
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.Location
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML Location(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface Location extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Location.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("location477ctype");
    
    /**
     * Gets the "street" element
     */
    java.lang.String getStreet();
    
    /**
     * Gets (as xml) the "street" element
     */
    org.apache.xmlbeans.XmlString xgetStreet();
    
    /**
     * True if has "street" element
     */
    boolean isSetStreet();
    
    /**
     * Sets the "street" element
     */
    void setStreet(java.lang.String street);
    
    /**
     * Sets (as xml) the "street" element
     */
    void xsetStreet(org.apache.xmlbeans.XmlString street);
    
    /**
     * Unsets the "street" element
     */
    void unsetStreet();
    
    /**
     * Gets the "houseNumber" element
     */
    java.lang.String getHouseNumber();
    
    /**
     * Gets (as xml) the "houseNumber" element
     */
    org.apache.xmlbeans.XmlString xgetHouseNumber();
    
    /**
     * True if has "houseNumber" element
     */
    boolean isSetHouseNumber();
    
    /**
     * Sets the "houseNumber" element
     */
    void setHouseNumber(java.lang.String houseNumber);
    
    /**
     * Sets (as xml) the "houseNumber" element
     */
    void xsetHouseNumber(org.apache.xmlbeans.XmlString houseNumber);
    
    /**
     * Unsets the "houseNumber" element
     */
    void unsetHouseNumber();
    
    /**
     * Gets the "apartment" element
     */
    java.lang.String getApartment();
    
    /**
     * Gets (as xml) the "apartment" element
     */
    org.apache.xmlbeans.XmlString xgetApartment();
    
    /**
     * True if has "apartment" element
     */
    boolean isSetApartment();
    
    /**
     * Sets the "apartment" element
     */
    void setApartment(java.lang.String apartment);
    
    /**
     * Sets (as xml) the "apartment" element
     */
    void xsetApartment(org.apache.xmlbeans.XmlString apartment);
    
    /**
     * Unsets the "apartment" element
     */
    void unsetApartment();
    
    /**
     * Gets the "zip" element
     */
    java.lang.String getZip();
    
    /**
     * Gets (as xml) the "zip" element
     */
    org.apache.xmlbeans.XmlString xgetZip();
    
    /**
     * True if has "zip" element
     */
    boolean isSetZip();
    
    /**
     * Sets the "zip" element
     */
    void setZip(java.lang.String zip);
    
    /**
     * Sets (as xml) the "zip" element
     */
    void xsetZip(org.apache.xmlbeans.XmlString zip);
    
    /**
     * Unsets the "zip" element
     */
    void unsetZip();
    
    /**
     * Gets the "city" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "city" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "city" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "city" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "city" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "city" element
     */
    void unsetCity();
    
    /**
     * Gets the "regionCode" element
     */
    java.lang.String getRegionCode();
    
    /**
     * Gets (as xml) the "regionCode" element
     */
    org.apache.xmlbeans.XmlString xgetRegionCode();
    
    /**
     * True if has "regionCode" element
     */
    boolean isSetRegionCode();
    
    /**
     * Sets the "regionCode" element
     */
    void setRegionCode(java.lang.String regionCode);
    
    /**
     * Sets (as xml) the "regionCode" element
     */
    void xsetRegionCode(org.apache.xmlbeans.XmlString regionCode);
    
    /**
     * Unsets the "regionCode" element
     */
    void unsetRegionCode();
    
    /**
     * Gets the "subRegionCode" element
     */
    java.lang.String getSubRegionCode();
    
    /**
     * Gets (as xml) the "subRegionCode" element
     */
    org.apache.xmlbeans.XmlString xgetSubRegionCode();
    
    /**
     * True if has "subRegionCode" element
     */
    boolean isSetSubRegionCode();
    
    /**
     * Sets the "subRegionCode" element
     */
    void setSubRegionCode(java.lang.String subRegionCode);
    
    /**
     * Sets (as xml) the "subRegionCode" element
     */
    void xsetSubRegionCode(org.apache.xmlbeans.XmlString subRegionCode);
    
    /**
     * Unsets the "subRegionCode" element
     */
    void unsetSubRegionCode();
    
    /**
     * Gets the "country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "country" element
     */
    void unsetCountry();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Location parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
