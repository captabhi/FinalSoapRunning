/*
 * XML Type:  FurtherRelations
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML FurtherRelations(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface FurtherRelations extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FurtherRelations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("furtherrelationsb9fatype");
    
    /**
     * Gets array of all "obviousRelations" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getObviousRelationsArray();
    
    /**
     * Gets ith "obviousRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getObviousRelationsArray(int i);
    
    /**
     * Returns number of "obviousRelations" element
     */
    int sizeOfObviousRelationsArray();
    
    /**
     * Sets array of all "obviousRelations" element
     */
    void setObviousRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] obviousRelationsArray);
    
    /**
     * Sets ith "obviousRelations" element
     */
    void setObviousRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData obviousRelations);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "obviousRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewObviousRelations(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "obviousRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewObviousRelations();
    
    /**
     * Removes the ith "obviousRelations" element
     */
    void removeObviousRelations(int i);
    
    /**
     * Gets array of all "probableRelations" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getProbableRelationsArray();
    
    /**
     * Gets ith "probableRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getProbableRelationsArray(int i);
    
    /**
     * Returns number of "probableRelations" element
     */
    int sizeOfProbableRelationsArray();
    
    /**
     * Sets array of all "probableRelations" element
     */
    void setProbableRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] probableRelationsArray);
    
    /**
     * Sets ith "probableRelations" element
     */
    void setProbableRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData probableRelations);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "probableRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewProbableRelations(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "probableRelations" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewProbableRelations();
    
    /**
     * Removes the ith "probableRelations" element
     */
    void removeProbableRelations(int i);
    
    /**
     * Gets array of all "samePhoneNumber" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getSamePhoneNumberArray();
    
    /**
     * Gets ith "samePhoneNumber" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getSamePhoneNumberArray(int i);
    
    /**
     * Returns number of "samePhoneNumber" element
     */
    int sizeOfSamePhoneNumberArray();
    
    /**
     * Sets array of all "samePhoneNumber" element
     */
    void setSamePhoneNumberArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] samePhoneNumberArray);
    
    /**
     * Sets ith "samePhoneNumber" element
     */
    void setSamePhoneNumberArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData samePhoneNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "samePhoneNumber" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewSamePhoneNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "samePhoneNumber" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewSamePhoneNumber();
    
    /**
     * Removes the ith "samePhoneNumber" element
     */
    void removeSamePhoneNumber(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
