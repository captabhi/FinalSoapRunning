/*
 * XML Type:  SchufaScore
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML SchufaScore(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface SchufaScore extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchufaScore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("schufascore022ftype");
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "scoreValue" element
     */
    java.math.BigInteger getScoreValue();
    
    /**
     * Gets (as xml) the "scoreValue" element
     */
    org.apache.xmlbeans.XmlInteger xgetScoreValue();
    
    /**
     * True if has "scoreValue" element
     */
    boolean isSetScoreValue();
    
    /**
     * Sets the "scoreValue" element
     */
    void setScoreValue(java.math.BigInteger scoreValue);
    
    /**
     * Sets (as xml) the "scoreValue" element
     */
    void xsetScoreValue(org.apache.xmlbeans.XmlInteger scoreValue);
    
    /**
     * Unsets the "scoreValue" element
     */
    void unsetScoreValue();
    
    /**
     * Gets the "riskQuota" element
     */
    java.math.BigDecimal getRiskQuota();
    
    /**
     * Gets (as xml) the "riskQuota" element
     */
    org.apache.xmlbeans.XmlDecimal xgetRiskQuota();
    
    /**
     * True if has "riskQuota" element
     */
    boolean isSetRiskQuota();
    
    /**
     * Sets the "riskQuota" element
     */
    void setRiskQuota(java.math.BigDecimal riskQuota);
    
    /**
     * Sets (as xml) the "riskQuota" element
     */
    void xsetRiskQuota(org.apache.xmlbeans.XmlDecimal riskQuota);
    
    /**
     * Unsets the "riskQuota" element
     */
    void unsetRiskQuota();
    
    /**
     * Gets the "scoreCategory" element
     */
    java.lang.String getScoreCategory();
    
    /**
     * Gets (as xml) the "scoreCategory" element
     */
    org.apache.xmlbeans.XmlString xgetScoreCategory();
    
    /**
     * True if has "scoreCategory" element
     */
    boolean isSetScoreCategory();
    
    /**
     * Sets the "scoreCategory" element
     */
    void setScoreCategory(java.lang.String scoreCategory);
    
    /**
     * Sets (as xml) the "scoreCategory" element
     */
    void xsetScoreCategory(org.apache.xmlbeans.XmlString scoreCategory);
    
    /**
     * Unsets the "scoreCategory" element
     */
    void unsetScoreCategory();
    
    /**
     * Gets the "scoreText" element
     */
    java.lang.String getScoreText();
    
    /**
     * Gets (as xml) the "scoreText" element
     */
    org.apache.xmlbeans.XmlString xgetScoreText();
    
    /**
     * True if has "scoreText" element
     */
    boolean isSetScoreText();
    
    /**
     * Sets the "scoreText" element
     */
    void setScoreText(java.lang.String scoreText);
    
    /**
     * Sets (as xml) the "scoreText" element
     */
    void xsetScoreText(org.apache.xmlbeans.XmlString scoreText);
    
    /**
     * Unsets the "scoreText" element
     */
    void unsetScoreText();
    
    /**
     * Gets array of all "scoreInfoText" elements
     */
    java.lang.String[] getScoreInfoTextArray();
    
    /**
     * Gets ith "scoreInfoText" element
     */
    java.lang.String getScoreInfoTextArray(int i);
    
    /**
     * Gets (as xml) array of all "scoreInfoText" elements
     */
    org.apache.xmlbeans.XmlString[] xgetScoreInfoTextArray();
    
    /**
     * Gets (as xml) ith "scoreInfoText" element
     */
    org.apache.xmlbeans.XmlString xgetScoreInfoTextArray(int i);
    
    /**
     * Returns number of "scoreInfoText" element
     */
    int sizeOfScoreInfoTextArray();
    
    /**
     * Sets array of all "scoreInfoText" element
     */
    void setScoreInfoTextArray(java.lang.String[] scoreInfoTextArray);
    
    /**
     * Sets ith "scoreInfoText" element
     */
    void setScoreInfoTextArray(int i, java.lang.String scoreInfoText);
    
    /**
     * Sets (as xml) array of all "scoreInfoText" element
     */
    void xsetScoreInfoTextArray(org.apache.xmlbeans.XmlString[] scoreInfoTextArray);
    
    /**
     * Sets (as xml) ith "scoreInfoText" element
     */
    void xsetScoreInfoTextArray(int i, org.apache.xmlbeans.XmlString scoreInfoText);
    
    /**
     * Inserts the value as the ith "scoreInfoText" element
     */
    void insertScoreInfoText(int i, java.lang.String scoreInfoText);
    
    /**
     * Appends the value as the last "scoreInfoText" element
     */
    void addScoreInfoText(java.lang.String scoreInfoText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scoreInfoText" element
     */
    org.apache.xmlbeans.XmlString insertNewScoreInfoText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scoreInfoText" element
     */
    org.apache.xmlbeans.XmlString addNewScoreInfoText();
    
    /**
     * Removes the ith "scoreInfoText" element
     */
    void removeScoreInfoText(int i);
    
    /**
     * Gets the "scoreError" element
     */
    java.lang.String getScoreError();
    
    /**
     * Gets (as xml) the "scoreError" element
     */
    org.apache.xmlbeans.XmlString xgetScoreError();
    
    /**
     * True if has "scoreError" element
     */
    boolean isSetScoreError();
    
    /**
     * Sets the "scoreError" element
     */
    void setScoreError(java.lang.String scoreError);
    
    /**
     * Sets (as xml) the "scoreError" element
     */
    void xsetScoreError(org.apache.xmlbeans.XmlString scoreError);
    
    /**
     * Unsets the "scoreError" element
     */
    void unsetScoreError();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
