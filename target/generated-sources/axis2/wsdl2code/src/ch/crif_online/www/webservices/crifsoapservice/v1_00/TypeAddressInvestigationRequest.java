/*
 * XML Type:  TypeAddressInvestigationRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeAddressInvestigationRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeAddressInvestigationRequest extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeAddressInvestigationRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typeaddressinvestigationrequestc63ctype");
    
    /**
     * Gets the "identifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "searchedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getSearchedAddress();
    
    /**
     * True if has "searchedAddress" element
     */
    boolean isSetSearchedAddress();
    
    /**
     * Sets the "searchedAddress" element
     */
    void setSearchedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription searchedAddress);
    
    /**
     * Appends and returns a new empty "searchedAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewSearchedAddress();
    
    /**
     * Unsets the "searchedAddress" element
     */
    void unsetSearchedAddress();
    
    /**
     * Gets the "targetReportFormat" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum getTargetReportFormat();
    
    /**
     * Gets (as xml) the "targetReportFormat" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat xgetTargetReportFormat();
    
    /**
     * True if has "targetReportFormat" element
     */
    boolean isSetTargetReportFormat();
    
    /**
     * Sets the "targetReportFormat" element
     */
    void setTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum targetReportFormat);
    
    /**
     * Sets (as xml) the "targetReportFormat" element
     */
    void xsetTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat targetReportFormat);
    
    /**
     * Unsets the "targetReportFormat" element
     */
    void unsetTargetReportFormat();
    
    /**
     * Gets the "requestHighestDeliverableAddress" element
     */
    boolean getRequestHighestDeliverableAddress();
    
    /**
     * Gets (as xml) the "requestHighestDeliverableAddress" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRequestHighestDeliverableAddress();
    
    /**
     * True if has "requestHighestDeliverableAddress" element
     */
    boolean isSetRequestHighestDeliverableAddress();
    
    /**
     * Sets the "requestHighestDeliverableAddress" element
     */
    void setRequestHighestDeliverableAddress(boolean requestHighestDeliverableAddress);
    
    /**
     * Sets (as xml) the "requestHighestDeliverableAddress" element
     */
    void xsetRequestHighestDeliverableAddress(org.apache.xmlbeans.XmlBoolean requestHighestDeliverableAddress);
    
    /**
     * Unsets the "requestHighestDeliverableAddress" element
     */
    void unsetRequestHighestDeliverableAddress();
    
    /**
     * Gets the "requestHouseholdAddresses" element
     */
    boolean getRequestHouseholdAddresses();
    
    /**
     * Gets (as xml) the "requestHouseholdAddresses" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRequestHouseholdAddresses();
    
    /**
     * True if has "requestHouseholdAddresses" element
     */
    boolean isSetRequestHouseholdAddresses();
    
    /**
     * Sets the "requestHouseholdAddresses" element
     */
    void setRequestHouseholdAddresses(boolean requestHouseholdAddresses);
    
    /**
     * Sets (as xml) the "requestHouseholdAddresses" element
     */
    void xsetRequestHouseholdAddresses(org.apache.xmlbeans.XmlBoolean requestHouseholdAddresses);
    
    /**
     * Unsets the "requestHouseholdAddresses" element
     */
    void unsetRequestHouseholdAddresses();
    
    /**
     * Gets the "requestKnownAddresses" element
     */
    boolean getRequestKnownAddresses();
    
    /**
     * Gets (as xml) the "requestKnownAddresses" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRequestKnownAddresses();
    
    /**
     * True if has "requestKnownAddresses" element
     */
    boolean isSetRequestKnownAddresses();
    
    /**
     * Sets the "requestKnownAddresses" element
     */
    void setRequestKnownAddresses(boolean requestKnownAddresses);
    
    /**
     * Sets (as xml) the "requestKnownAddresses" element
     */
    void xsetRequestKnownAddresses(org.apache.xmlbeans.XmlBoolean requestKnownAddresses);
    
    /**
     * Unsets the "requestKnownAddresses" element
     */
    void unsetRequestKnownAddresses();
    
    /**
     * Gets array of all "additionalInput" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalInputArray();
    
    /**
     * Gets ith "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalInputArray(int i);
    
    /**
     * Returns number of "additionalInput" element
     */
    int sizeOfAdditionalInputArray();
    
    /**
     * Sets array of all "additionalInput" element
     */
    void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray);
    
    /**
     * Sets ith "additionalInput" element
     */
    void setAdditionalInputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalInput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalInput();
    
    /**
     * Removes the ith "additionalInput" element
     */
    void removeAdditionalInput(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
