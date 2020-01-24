/*
 * XML Type:  AddressMatchResult
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML AddressMatchResult(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface AddressMatchResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressMatchResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("addressmatchresult3eb5type");
    
    /**
     * Gets the "addressMatchResultType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType.Enum getAddressMatchResultType();
    
    /**
     * Gets (as xml) the "addressMatchResultType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType xgetAddressMatchResultType();
    
    /**
     * Sets the "addressMatchResultType" element
     */
    void setAddressMatchResultType(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType.Enum addressMatchResultType);
    
    /**
     * Sets (as xml) the "addressMatchResultType" element
     */
    void xsetAddressMatchResultType(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResultType addressMatchResultType);
    
    /**
     * Gets the "locationIdentification" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification getLocationIdentification();
    
    /**
     * True if has "locationIdentification" element
     */
    boolean isSetLocationIdentification();
    
    /**
     * Sets the "locationIdentification" element
     */
    void setLocationIdentification(ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification locationIdentification);
    
    /**
     * Appends and returns a new empty "locationIdentification" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification addNewLocationIdentification();
    
    /**
     * Unsets the "locationIdentification" element
     */
    void unsetLocationIdentification();
    
    /**
     * Gets the "nameHint" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint.Enum getNameHint();
    
    /**
     * Gets (as xml) the "nameHint" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint xgetNameHint();
    
    /**
     * True if has "nameHint" element
     */
    boolean isSetNameHint();
    
    /**
     * Sets the "nameHint" element
     */
    void setNameHint(ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint.Enum nameHint);
    
    /**
     * Sets (as xml) the "nameHint" element
     */
    void xsetNameHint(ch.crif_online.www.webservices.crifsoapservice.v1_00.NameHint nameHint);
    
    /**
     * Unsets the "nameHint" element
     */
    void unsetNameHint();
    
    /**
     * Gets the "foundAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress getFoundAddress();
    
    /**
     * True if has "foundAddress" element
     */
    boolean isSetFoundAddress();
    
    /**
     * Sets the "foundAddress" element
     */
    void setFoundAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress foundAddress);
    
    /**
     * Appends and returns a new empty "foundAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.MatchedAddress addNewFoundAddress();
    
    /**
     * Unsets the "foundAddress" element
     */
    void unsetFoundAddress();
    
    /**
     * Gets array of all "candidates" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[] getCandidatesArray();
    
    /**
     * Gets ith "candidates" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate getCandidatesArray(int i);
    
    /**
     * Returns number of "candidates" element
     */
    int sizeOfCandidatesArray();
    
    /**
     * Sets array of all "candidates" element
     */
    void setCandidatesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate[] candidatesArray);
    
    /**
     * Sets ith "candidates" element
     */
    void setCandidatesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate candidates);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "candidates" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate insertNewCandidates(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "candidates" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Candidate addNewCandidates();
    
    /**
     * Removes the ith "candidates" element
     */
    void removeCandidates(int i);
    
    /**
     * Gets the "character" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType.Enum getCharacter();
    
    /**
     * Gets (as xml) the "character" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType xgetCharacter();
    
    /**
     * True if has "character" element
     */
    boolean isSetCharacter();
    
    /**
     * Sets the "character" element
     */
    void setCharacter(ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType.Enum character);
    
    /**
     * Sets (as xml) the "character" element
     */
    void xsetCharacter(ch.crif_online.www.webservices.crifsoapservice.v1_00.CharacterType character);
    
    /**
     * Unsets the "character" element
     */
    void unsetCharacter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
