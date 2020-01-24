/*
 * XML Type:  DecisionMatrix
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML DecisionMatrix(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface DecisionMatrix extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DecisionMatrix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("decisionmatrix1fc4type");
    
    /**
     * Gets the "decision" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum getDecision();
    
    /**
     * Gets (as xml) the "decision" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision xgetDecision();
    
    /**
     * Sets the "decision" element
     */
    void setDecision(ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum decision);
    
    /**
     * Sets (as xml) the "decision" element
     */
    void xsetDecision(ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision decision);
    
    /**
     * Gets the "decisionText" element
     */
    java.lang.String getDecisionText();
    
    /**
     * Gets (as xml) the "decisionText" element
     */
    org.apache.xmlbeans.XmlString xgetDecisionText();
    
    /**
     * Sets the "decisionText" element
     */
    void setDecisionText(java.lang.String decisionText);
    
    /**
     * Sets (as xml) the "decisionText" element
     */
    void xsetDecisionText(org.apache.xmlbeans.XmlString decisionText);
    
    /**
     * Gets array of all "subdecisions" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[] getSubdecisionsArray();
    
    /**
     * Gets ith "subdecisions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision getSubdecisionsArray(int i);
    
    /**
     * Returns number of "subdecisions" element
     */
    int sizeOfSubdecisionsArray();
    
    /**
     * Sets array of all "subdecisions" element
     */
    void setSubdecisionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[] subdecisionsArray);
    
    /**
     * Sets ith "subdecisions" element
     */
    void setSubdecisionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision subdecisions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subdecisions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision insertNewSubdecisions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subdecisions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision addNewSubdecisions();
    
    /**
     * Removes the ith "subdecisions" element
     */
    void removeSubdecisions(int i);
    
    /**
     * Gets array of all "ratings" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[] getRatingsArray();
    
    /**
     * Gets ith "ratings" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating getRatingsArray(int i);
    
    /**
     * Returns number of "ratings" element
     */
    int sizeOfRatingsArray();
    
    /**
     * Sets array of all "ratings" element
     */
    void setRatingsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[] ratingsArray);
    
    /**
     * Sets ith "ratings" element
     */
    void setRatingsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating ratings);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ratings" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating insertNewRatings(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ratings" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating addNewRatings();
    
    /**
     * Removes the ith "ratings" element
     */
    void removeRatings(int i);
    
    /**
     * Gets the "creditLimit" element
     */
    java.math.BigInteger getCreditLimit();
    
    /**
     * Gets (as xml) the "creditLimit" element
     */
    org.apache.xmlbeans.XmlInteger xgetCreditLimit();
    
    /**
     * True if has "creditLimit" element
     */
    boolean isSetCreditLimit();
    
    /**
     * Sets the "creditLimit" element
     */
    void setCreditLimit(java.math.BigInteger creditLimit);
    
    /**
     * Sets (as xml) the "creditLimit" element
     */
    void xsetCreditLimit(org.apache.xmlbeans.XmlInteger creditLimit);
    
    /**
     * Unsets the "creditLimit" element
     */
    void unsetCreditLimit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
