/*
 * XML Type:  TypeAddressInvestigationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeAddressInvestigationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeAddressInvestigationResponse extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeAddressInvestigationResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typeaddressinvestigationresponse6cf0type");
    
    /**
     * Gets the "addressMatchResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult getAddressMatchResult();
    
    /**
     * Sets the "addressMatchResult" element
     */
    void setAddressMatchResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addressMatchResult);
    
    /**
     * Appends and returns a new empty "addressMatchResult" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addNewAddressMatchResult();
    
    /**
     * Gets the "searchedAddressDeliverability" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum getSearchedAddressDeliverability();
    
    /**
     * Gets (as xml) the "searchedAddressDeliverability" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability xgetSearchedAddressDeliverability();
    
    /**
     * Sets the "searchedAddressDeliverability" element
     */
    void setSearchedAddressDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum searchedAddressDeliverability);
    
    /**
     * Sets (as xml) the "searchedAddressDeliverability" element
     */
    void xsetSearchedAddressDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability searchedAddressDeliverability);
    
    /**
     * Gets the "highestDeliverableAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getHighestDeliverableAddress();
    
    /**
     * True if has "highestDeliverableAddress" element
     */
    boolean isSetHighestDeliverableAddress();
    
    /**
     * Sets the "highestDeliverableAddress" element
     */
    void setHighestDeliverableAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability highestDeliverableAddress);
    
    /**
     * Appends and returns a new empty "highestDeliverableAddress" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewHighestDeliverableAddress();
    
    /**
     * Unsets the "highestDeliverableAddress" element
     */
    void unsetHighestDeliverableAddress();
    
    /**
     * Gets array of all "knownAddresses" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getKnownAddressesArray();
    
    /**
     * Gets ith "knownAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getKnownAddressesArray(int i);
    
    /**
     * Returns number of "knownAddresses" element
     */
    int sizeOfKnownAddressesArray();
    
    /**
     * Sets array of all "knownAddresses" element
     */
    void setKnownAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] knownAddressesArray);
    
    /**
     * Sets ith "knownAddresses" element
     */
    void setKnownAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability knownAddresses);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knownAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewKnownAddresses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knownAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewKnownAddresses();
    
    /**
     * Removes the ith "knownAddresses" element
     */
    void removeKnownAddresses(int i);
    
    /**
     * Gets array of all "householdAddresses" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getHouseholdAddressesArray();
    
    /**
     * Gets ith "householdAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getHouseholdAddressesArray(int i);
    
    /**
     * Returns number of "householdAddresses" element
     */
    int sizeOfHouseholdAddressesArray();
    
    /**
     * Sets array of all "householdAddresses" element
     */
    void setHouseholdAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] householdAddressesArray);
    
    /**
     * Sets ith "householdAddresses" element
     */
    void setHouseholdAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability householdAddresses);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "householdAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewHouseholdAddresses(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "householdAddresses" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewHouseholdAddresses();
    
    /**
     * Removes the ith "householdAddresses" element
     */
    void removeHouseholdAddresses(int i);
    
    /**
     * Gets the "report" element
     */
    java.lang.String getReport();
    
    /**
     * Gets (as xml) the "report" element
     */
    org.apache.xmlbeans.XmlString xgetReport();
    
    /**
     * True if has "report" element
     */
    boolean isSetReport();
    
    /**
     * Sets the "report" element
     */
    void setReport(java.lang.String report);
    
    /**
     * Sets (as xml) the "report" element
     */
    void xsetReport(org.apache.xmlbeans.XmlString report);
    
    /**
     * Unsets the "report" element
     */
    void unsetReport();
    
    /**
     * Gets the "deceasedDate" element
     */
    java.lang.String getDeceasedDate();
    
    /**
     * Gets (as xml) the "deceasedDate" element
     */
    org.apache.xmlbeans.XmlString xgetDeceasedDate();
    
    /**
     * True if has "deceasedDate" element
     */
    boolean isSetDeceasedDate();
    
    /**
     * Sets the "deceasedDate" element
     */
    void setDeceasedDate(java.lang.String deceasedDate);
    
    /**
     * Sets (as xml) the "deceasedDate" element
     */
    void xsetDeceasedDate(org.apache.xmlbeans.XmlString deceasedDate);
    
    /**
     * Unsets the "deceasedDate" element
     */
    void unsetDeceasedDate();
    
    /**
     * Gets the "personStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus.Enum getPersonStatus();
    
    /**
     * Gets (as xml) the "personStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus xgetPersonStatus();
    
    /**
     * True if has "personStatus" element
     */
    boolean isSetPersonStatus();
    
    /**
     * Sets the "personStatus" element
     */
    void setPersonStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus.Enum personStatus);
    
    /**
     * Sets (as xml) the "personStatus" element
     */
    void xsetPersonStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus personStatus);
    
    /**
     * Unsets the "personStatus" element
     */
    void unsetPersonStatus();
    
    /**
     * Gets array of all "additionalOutput" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalOutputArray();
    
    /**
     * Gets ith "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalOutputArray(int i);
    
    /**
     * Returns number of "additionalOutput" element
     */
    int sizeOfAdditionalOutputArray();
    
    /**
     * Sets array of all "additionalOutput" element
     */
    void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray);
    
    /**
     * Sets ith "additionalOutput" element
     */
    void setAdditionalOutputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalOutput" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalOutput();
    
    /**
     * Removes the ith "additionalOutput" element
     */
    void removeAdditionalOutput(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
