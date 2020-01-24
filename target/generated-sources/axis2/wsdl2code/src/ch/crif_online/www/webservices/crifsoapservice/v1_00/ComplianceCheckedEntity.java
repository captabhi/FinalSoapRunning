/*
 * XML Type:  ComplianceCheckedEntity
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ComplianceCheckedEntity(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ComplianceCheckedEntity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComplianceCheckedEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("compliancecheckedentityb7a4type");
    
    /**
     * Gets the "checkedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getCheckedAddress();
    
    /**
     * Sets the "checkedAddress" element
     */
    void setCheckedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription checkedAddress);
    
    /**
     * Appends and returns a new empty "checkedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewCheckedAddress();
    
    /**
     * Gets the "relationType" element
     */
    java.lang.String getRelationType();
    
    /**
     * Gets (as xml) the "relationType" element
     */
    org.apache.xmlbeans.XmlString xgetRelationType();
    
    /**
     * Sets the "relationType" element
     */
    void setRelationType(java.lang.String relationType);
    
    /**
     * Sets (as xml) the "relationType" element
     */
    void xsetRelationType(org.apache.xmlbeans.XmlString relationType);
    
    /**
     * Gets array of all "foundEntities" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[] getFoundEntitiesArray();
    
    /**
     * Gets ith "foundEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity getFoundEntitiesArray(int i);
    
    /**
     * Returns number of "foundEntities" element
     */
    int sizeOfFoundEntitiesArray();
    
    /**
     * Sets array of all "foundEntities" element
     */
    void setFoundEntitiesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[] foundEntitiesArray);
    
    /**
     * Sets ith "foundEntities" element
     */
    void setFoundEntitiesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity foundEntities);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "foundEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity insertNewFoundEntities(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "foundEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity addNewFoundEntities();
    
    /**
     * Removes the ith "foundEntities" element
     */
    void removeFoundEntities(int i);
    
    /**
     * Gets array of all "checkedEntities" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[] getCheckedEntitiesArray();
    
    /**
     * Gets ith "checkedEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity getCheckedEntitiesArray(int i);
    
    /**
     * Returns number of "checkedEntities" element
     */
    int sizeOfCheckedEntitiesArray();
    
    /**
     * Sets array of all "checkedEntities" element
     */
    void setCheckedEntitiesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[] checkedEntitiesArray);
    
    /**
     * Sets ith "checkedEntities" element
     */
    void setCheckedEntitiesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity checkedEntities);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "checkedEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity insertNewCheckedEntities(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "checkedEntities" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity addNewCheckedEntities();
    
    /**
     * Removes the ith "checkedEntities" element
     */
    void removeCheckedEntities(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
