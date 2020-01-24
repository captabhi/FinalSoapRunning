/*
 * XML Type:  WhoOwnsWhom
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML WhoOwnsWhom(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface WhoOwnsWhom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WhoOwnsWhom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("whoownswhom332ftype");
    
    /**
     * Gets array of all "wowAddresses" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[] getWowAddressesArray();
    
    /**
     * Gets ith "wowAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress getWowAddressesArray(int i);
    
    /**
     * Returns number of "wowAddresses" element
     */
    int sizeOfWowAddressesArray();
    
    /**
     * Sets array of all "wowAddresses" element
     */
    void setWowAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress[] wowAddressesArray);
    
    /**
     * Sets ith "wowAddresses" element
     */
    void setWowAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress wowAddresses);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wowAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress insertNewWowAddresses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wowAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowAddress addNewWowAddresses();
    
    /**
     * Removes the ith "wowAddresses" element
     */
    void removeWowAddresses(int i);
    
    /**
     * Gets array of all "wowRelations" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[] getWowRelationsArray();
    
    /**
     * Gets ith "wowRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation getWowRelationsArray(int i);
    
    /**
     * Returns number of "wowRelations" element
     */
    int sizeOfWowRelationsArray();
    
    /**
     * Sets array of all "wowRelations" element
     */
    void setWowRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation[] wowRelationsArray);
    
    /**
     * Sets ith "wowRelations" element
     */
    void setWowRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation wowRelations);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wowRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation insertNewWowRelations(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wowRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation addNewWowRelations();
    
    /**
     * Removes the ith "wowRelations" element
     */
    void removeWowRelations(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.WhoOwnsWhom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
