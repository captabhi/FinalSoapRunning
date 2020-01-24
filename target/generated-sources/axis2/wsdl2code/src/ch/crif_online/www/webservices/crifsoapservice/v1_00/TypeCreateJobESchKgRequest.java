/*
 * XML Type:  TypeCreateJobESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML TypeCreateJobESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface TypeCreateJobESchKgRequest extends ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeCreateJobESchKgRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("typecreatejobeschkgrequestdb20type");
    
    /**
     * Gets the "externalId" element
     */
    java.lang.String getExternalId();
    
    /**
     * Gets (as xml) the "externalId" element
     */
    org.apache.xmlbeans.XmlString xgetExternalId();
    
    /**
     * Tests for nil "externalId" element
     */
    boolean isNilExternalId();
    
    /**
     * True if has "externalId" element
     */
    boolean isSetExternalId();
    
    /**
     * Sets the "externalId" element
     */
    void setExternalId(java.lang.String externalId);
    
    /**
     * Sets (as xml) the "externalId" element
     */
    void xsetExternalId(org.apache.xmlbeans.XmlString externalId);
    
    /**
     * Nils the "externalId" element
     */
    void setNilExternalId();
    
    /**
     * Unsets the "externalId" element
     */
    void unsetExternalId();
    
    /**
     * Gets the "caseGroup" element
     */
    java.lang.String getCaseGroup();
    
    /**
     * Gets (as xml) the "caseGroup" element
     */
    org.apache.xmlbeans.XmlString xgetCaseGroup();
    
    /**
     * Tests for nil "caseGroup" element
     */
    boolean isNilCaseGroup();
    
    /**
     * True if has "caseGroup" element
     */
    boolean isSetCaseGroup();
    
    /**
     * Sets the "caseGroup" element
     */
    void setCaseGroup(java.lang.String caseGroup);
    
    /**
     * Sets (as xml) the "caseGroup" element
     */
    void xsetCaseGroup(org.apache.xmlbeans.XmlString caseGroup);
    
    /**
     * Nils the "caseGroup" element
     */
    void setNilCaseGroup();
    
    /**
     * Unsets the "caseGroup" element
     */
    void unsetCaseGroup();
    
    /**
     * Gets the "caseGroupType" element
     */
    java.lang.String getCaseGroupType();
    
    /**
     * Gets (as xml) the "caseGroupType" element
     */
    org.apache.xmlbeans.XmlString xgetCaseGroupType();
    
    /**
     * Tests for nil "caseGroupType" element
     */
    boolean isNilCaseGroupType();
    
    /**
     * True if has "caseGroupType" element
     */
    boolean isSetCaseGroupType();
    
    /**
     * Sets the "caseGroupType" element
     */
    void setCaseGroupType(java.lang.String caseGroupType);
    
    /**
     * Sets (as xml) the "caseGroupType" element
     */
    void xsetCaseGroupType(org.apache.xmlbeans.XmlString caseGroupType);
    
    /**
     * Nils the "caseGroupType" element
     */
    void setNilCaseGroupType();
    
    /**
     * Unsets the "caseGroupType" element
     */
    void unsetCaseGroupType();
    
    /**
     * Gets the "representative" element
     */
    java.lang.String getRepresentative();
    
    /**
     * Gets (as xml) the "representative" element
     */
    org.apache.xmlbeans.XmlString xgetRepresentative();
    
    /**
     * Tests for nil "representative" element
     */
    boolean isNilRepresentative();
    
    /**
     * True if has "representative" element
     */
    boolean isSetRepresentative();
    
    /**
     * Sets the "representative" element
     */
    void setRepresentative(java.lang.String representative);
    
    /**
     * Sets (as xml) the "representative" element
     */
    void xsetRepresentative(org.apache.xmlbeans.XmlString representative);
    
    /**
     * Nils the "representative" element
     */
    void setNilRepresentative();
    
    /**
     * Unsets the "representative" element
     */
    void unsetRepresentative();
    
    /**
     * Gets the "enforcementStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.Enum getEnforcementStatus();
    
    /**
     * Gets (as xml) the "enforcementStatus" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus xgetEnforcementStatus();
    
    /**
     * Tests for nil "enforcementStatus" element
     */
    boolean isNilEnforcementStatus();
    
    /**
     * True if has "enforcementStatus" element
     */
    boolean isSetEnforcementStatus();
    
    /**
     * Sets the "enforcementStatus" element
     */
    void setEnforcementStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.Enum enforcementStatus);
    
    /**
     * Sets (as xml) the "enforcementStatus" element
     */
    void xsetEnforcementStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus enforcementStatus);
    
    /**
     * Nils the "enforcementStatus" element
     */
    void setNilEnforcementStatus();
    
    /**
     * Unsets the "enforcementStatus" element
     */
    void unsetEnforcementStatus();
    
    /**
     * Gets the "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress();
    
    /**
     * Tests for nil "address" element
     */
    boolean isNilAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewAddress();
    
    /**
     * Nils the "address" element
     */
    void setNilAddress();
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    java.lang.String getLegalFormTypeOriginal();
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal();
    
    /**
     * Tests for nil "legalFormTypeOriginal" element
     */
    boolean isNilLegalFormTypeOriginal();
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    boolean isSetLegalFormTypeOriginal();
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal);
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal);
    
    /**
     * Nils the "legalFormTypeOriginal" element
     */
    void setNilLegalFormTypeOriginal();
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    void unsetLegalFormTypeOriginal();
    
    /**
     * Gets the "jobData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData getJobData();
    
    /**
     * Tests for nil "jobData" element
     */
    boolean isNilJobData();
    
    /**
     * Sets the "jobData" element
     */
    void setJobData(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData jobData);
    
    /**
     * Appends and returns a new empty "jobData" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData addNewJobData();
    
    /**
     * Nils the "jobData" element
     */
    void setNilJobData();
    
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
