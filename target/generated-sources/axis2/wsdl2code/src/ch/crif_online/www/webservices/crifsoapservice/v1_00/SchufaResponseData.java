/*
 * XML Type:  SchufaResponseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML SchufaResponseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface SchufaResponseData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchufaResponseData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("schufaresponsedata480atype");
    
    /**
     * Gets the "schufaIdentification" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification getSchufaIdentification();
    
    /**
     * True if has "schufaIdentification" element
     */
    boolean isSetSchufaIdentification();
    
    /**
     * Sets the "schufaIdentification" element
     */
    void setSchufaIdentification(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification schufaIdentification);
    
    /**
     * Appends and returns a new empty "schufaIdentification" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification addNewSchufaIdentification();
    
    /**
     * Unsets the "schufaIdentification" element
     */
    void unsetSchufaIdentification();
    
    /**
     * Gets the "schufaScore" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore getSchufaScore();
    
    /**
     * True if has "schufaScore" element
     */
    boolean isSetSchufaScore();
    
    /**
     * Sets the "schufaScore" element
     */
    void setSchufaScore(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore schufaScore);
    
    /**
     * Appends and returns a new empty "schufaScore" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore addNewSchufaScore();
    
    /**
     * Unsets the "schufaScore" element
     */
    void unsetSchufaScore();
    
    /**
     * Gets array of all "schufaFeatures" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[] getSchufaFeaturesArray();
    
    /**
     * Gets ith "schufaFeatures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature getSchufaFeaturesArray(int i);
    
    /**
     * Returns number of "schufaFeatures" element
     */
    int sizeOfSchufaFeaturesArray();
    
    /**
     * Sets array of all "schufaFeatures" element
     */
    void setSchufaFeaturesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[] schufaFeaturesArray);
    
    /**
     * Sets ith "schufaFeatures" element
     */
    void setSchufaFeaturesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature schufaFeatures);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schufaFeatures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature insertNewSchufaFeatures(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schufaFeatures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature addNewSchufaFeatures();
    
    /**
     * Removes the ith "schufaFeatures" element
     */
    void removeSchufaFeatures(int i);
    
    /**
     * Gets the "schufaPersonData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData getSchufaPersonData();
    
    /**
     * True if has "schufaPersonData" element
     */
    boolean isSetSchufaPersonData();
    
    /**
     * Sets the "schufaPersonData" element
     */
    void setSchufaPersonData(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData schufaPersonData);
    
    /**
     * Appends and returns a new empty "schufaPersonData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData addNewSchufaPersonData();
    
    /**
     * Unsets the "schufaPersonData" element
     */
    void unsetSchufaPersonData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
