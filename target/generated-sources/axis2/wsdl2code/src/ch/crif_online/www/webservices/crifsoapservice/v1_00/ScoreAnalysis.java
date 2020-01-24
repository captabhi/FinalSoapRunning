/*
 * XML Type:  ScoreAnalysis
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML ScoreAnalysis(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface ScoreAnalysis extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScoreAnalysis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("scoreanalysis8163type");
    
    /**
     * Gets the "scoreScaleRange" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getScoreScaleRange();
    
    /**
     * True if has "scoreScaleRange" element
     */
    boolean isSetScoreScaleRange();
    
    /**
     * Sets the "scoreScaleRange" element
     */
    void setScoreScaleRange(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range scoreScaleRange);
    
    /**
     * Appends and returns a new empty "scoreScaleRange" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewScoreScaleRange();
    
    /**
     * Unsets the "scoreScaleRange" element
     */
    void unsetScoreScaleRange();
    
    /**
     * Gets the "score" element
     */
    int getScore();
    
    /**
     * Gets (as xml) the "score" element
     */
    org.apache.xmlbeans.XmlInt xgetScore();
    
    /**
     * Sets the "score" element
     */
    void setScore(int score);
    
    /**
     * Sets (as xml) the "score" element
     */
    void xsetScore(org.apache.xmlbeans.XmlInt score);
    
    /**
     * Gets the "averageScoreIndustry" element
     */
    java.math.BigInteger getAverageScoreIndustry();
    
    /**
     * Gets (as xml) the "averageScoreIndustry" element
     */
    org.apache.xmlbeans.XmlInteger xgetAverageScoreIndustry();
    
    /**
     * True if has "averageScoreIndustry" element
     */
    boolean isSetAverageScoreIndustry();
    
    /**
     * Sets the "averageScoreIndustry" element
     */
    void setAverageScoreIndustry(java.math.BigInteger averageScoreIndustry);
    
    /**
     * Sets (as xml) the "averageScoreIndustry" element
     */
    void xsetAverageScoreIndustry(org.apache.xmlbeans.XmlInteger averageScoreIndustry);
    
    /**
     * Unsets the "averageScoreIndustry" element
     */
    void unsetAverageScoreIndustry();
    
    /**
     * Gets the "averageScoreAll" element
     */
    java.math.BigInteger getAverageScoreAll();
    
    /**
     * Gets (as xml) the "averageScoreAll" element
     */
    org.apache.xmlbeans.XmlInteger xgetAverageScoreAll();
    
    /**
     * True if has "averageScoreAll" element
     */
    boolean isSetAverageScoreAll();
    
    /**
     * Sets the "averageScoreAll" element
     */
    void setAverageScoreAll(java.math.BigInteger averageScoreAll);
    
    /**
     * Sets (as xml) the "averageScoreAll" element
     */
    void xsetAverageScoreAll(org.apache.xmlbeans.XmlInteger averageScoreAll);
    
    /**
     * Unsets the "averageScoreAll" element
     */
    void unsetAverageScoreAll();
    
    /**
     * Gets array of all "scoreDecisionRanges" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[] getScoreDecisionRangesArray();
    
    /**
     * Gets ith "scoreDecisionRanges" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange getScoreDecisionRangesArray(int i);
    
    /**
     * Returns number of "scoreDecisionRanges" element
     */
    int sizeOfScoreDecisionRangesArray();
    
    /**
     * Sets array of all "scoreDecisionRanges" element
     */
    void setScoreDecisionRangesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[] scoreDecisionRangesArray);
    
    /**
     * Sets ith "scoreDecisionRanges" element
     */
    void setScoreDecisionRangesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange scoreDecisionRanges);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scoreDecisionRanges" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange insertNewScoreDecisionRanges(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scoreDecisionRanges" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange addNewScoreDecisionRanges();
    
    /**
     * Removes the ith "scoreDecisionRanges" element
     */
    void removeScoreDecisionRanges(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
