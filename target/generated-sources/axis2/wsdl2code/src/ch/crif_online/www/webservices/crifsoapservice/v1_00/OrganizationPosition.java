/*
 * XML Type:  OrganizationPosition
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML OrganizationPosition(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface OrganizationPosition extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganizationPosition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("organizationposition2d43type");
    
    /**
     * Gets the "firstName" element
     */
    java.lang.String getFirstName();
    
    /**
     * Gets (as xml) the "firstName" element
     */
    org.apache.xmlbeans.XmlString xgetFirstName();
    
    /**
     * True if has "firstName" element
     */
    boolean isSetFirstName();
    
    /**
     * Sets the "firstName" element
     */
    void setFirstName(java.lang.String firstName);
    
    /**
     * Sets (as xml) the "firstName" element
     */
    void xsetFirstName(org.apache.xmlbeans.XmlString firstName);
    
    /**
     * Unsets the "firstName" element
     */
    void unsetFirstName();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "nationality" element
     */
    java.lang.String getNationality();
    
    /**
     * Gets (as xml) the "nationality" element
     */
    org.apache.xmlbeans.XmlString xgetNationality();
    
    /**
     * True if has "nationality" element
     */
    boolean isSetNationality();
    
    /**
     * Sets the "nationality" element
     */
    void setNationality(java.lang.String nationality);
    
    /**
     * Sets (as xml) the "nationality" element
     */
    void xsetNationality(org.apache.xmlbeans.XmlString nationality);
    
    /**
     * Unsets the "nationality" element
     */
    void unsetNationality();
    
    /**
     * Gets the "homeTown" element
     */
    java.lang.String getHomeTown();
    
    /**
     * Gets (as xml) the "homeTown" element
     */
    org.apache.xmlbeans.XmlString xgetHomeTown();
    
    /**
     * True if has "homeTown" element
     */
    boolean isSetHomeTown();
    
    /**
     * Sets the "homeTown" element
     */
    void setHomeTown(java.lang.String homeTown);
    
    /**
     * Sets (as xml) the "homeTown" element
     */
    void xsetHomeTown(org.apache.xmlbeans.XmlString homeTown);
    
    /**
     * Unsets the "homeTown" element
     */
    void unsetHomeTown();
    
    /**
     * Gets the "city" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "city" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "city" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "city" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "city" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "city" element
     */
    void unsetCity();
    
    /**
     * Gets the "highestFunction" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction getHighestFunction();
    
    /**
     * Sets the "highestFunction" element
     */
    void setHighestFunction(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction highestFunction);
    
    /**
     * Appends and returns a new empty "highestFunction" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction addNewHighestFunction();
    
    /**
     * Gets array of all "furtherFunctions" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[] getFurtherFunctionsArray();
    
    /**
     * Gets ith "furtherFunctions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction getFurtherFunctionsArray(int i);
    
    /**
     * Returns number of "furtherFunctions" element
     */
    int sizeOfFurtherFunctionsArray();
    
    /**
     * Sets array of all "furtherFunctions" element
     */
    void setFurtherFunctionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction[] furtherFunctionsArray);
    
    /**
     * Sets ith "furtherFunctions" element
     */
    void setFurtherFunctionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction furtherFunctions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherFunctions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction insertNewFurtherFunctions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherFunctions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction addNewFurtherFunctions();
    
    /**
     * Removes the ith "furtherFunctions" element
     */
    void removeFurtherFunctions(int i);
    
    /**
     * Gets the "share" element
     */
    java.math.BigDecimal getShare();
    
    /**
     * Gets (as xml) the "share" element
     */
    org.apache.xmlbeans.XmlDecimal xgetShare();
    
    /**
     * True if has "share" element
     */
    boolean isSetShare();
    
    /**
     * Sets the "share" element
     */
    void setShare(java.math.BigDecimal share);
    
    /**
     * Sets (as xml) the "share" element
     */
    void xsetShare(org.apache.xmlbeans.XmlDecimal share);
    
    /**
     * Unsets the "share" element
     */
    void unsetShare();
    
    /**
     * Gets the "signatureType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType.Enum getSignatureType();
    
    /**
     * Gets (as xml) the "signatureType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType xgetSignatureType();
    
    /**
     * True if has "signatureType" element
     */
    boolean isSetSignatureType();
    
    /**
     * Sets the "signatureType" element
     */
    void setSignatureType(ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType.Enum signatureType);
    
    /**
     * Sets (as xml) the "signatureType" element
     */
    void xsetSignatureType(ch.crif_online.www.webservices.crifsoapservice.v1_00.SignatureType signatureType);
    
    /**
     * Unsets the "signatureType" element
     */
    void unsetSignatureType();
    
    /**
     * Gets the "signatureOriginal" element
     */
    java.lang.String getSignatureOriginal();
    
    /**
     * Gets (as xml) the "signatureOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetSignatureOriginal();
    
    /**
     * True if has "signatureOriginal" element
     */
    boolean isSetSignatureOriginal();
    
    /**
     * Sets the "signatureOriginal" element
     */
    void setSignatureOriginal(java.lang.String signatureOriginal);
    
    /**
     * Sets (as xml) the "signatureOriginal" element
     */
    void xsetSignatureOriginal(org.apache.xmlbeans.XmlString signatureOriginal);
    
    /**
     * Unsets the "signatureOriginal" element
     */
    void unsetSignatureOriginal();
    
    /**
     * Gets the "period" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Period getPeriod();
    
    /**
     * Sets the "period" element
     */
    void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period);
    
    /**
     * Appends and returns a new empty "period" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Period addNewPeriod();
    
    /**
     * Gets the "addressId" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getAddressId();
    
    /**
     * True if has "addressId" element
     */
    boolean isSetAddressId();
    
    /**
     * Sets the "addressId" element
     */
    void setAddressId(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addressId);
    
    /**
     * Appends and returns a new empty "addressId" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewAddressId();
    
    /**
     * Unsets the "addressId" element
     */
    void unsetAddressId();
    
    /**
     * Gets the "hasDebts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum getHasDebts();
    
    /**
     * Gets (as xml) the "hasDebts" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts xgetHasDebts();
    
    /**
     * True if has "hasDebts" element
     */
    boolean isSetHasDebts();
    
    /**
     * Sets the "hasDebts" element
     */
    void setHasDebts(ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts.Enum hasDebts);
    
    /**
     * Sets (as xml) the "hasDebts" element
     */
    void xsetHasDebts(ch.crif_online.www.webservices.crifsoapservice.v1_00.HasDebts hasDebts);
    
    /**
     * Unsets the "hasDebts" element
     */
    void unsetHasDebts();
    
    /**
     * Gets the "nrOfPositions" element
     */
    java.math.BigInteger getNrOfPositions();
    
    /**
     * Gets (as xml) the "nrOfPositions" element
     */
    org.apache.xmlbeans.XmlInteger xgetNrOfPositions();
    
    /**
     * True if has "nrOfPositions" element
     */
    boolean isSetNrOfPositions();
    
    /**
     * Sets the "nrOfPositions" element
     */
    void setNrOfPositions(java.math.BigInteger nrOfPositions);
    
    /**
     * Sets (as xml) the "nrOfPositions" element
     */
    void xsetNrOfPositions(org.apache.xmlbeans.XmlInteger nrOfPositions);
    
    /**
     * Unsets the "nrOfPositions" element
     */
    void unsetNrOfPositions();
    
    /**
     * Gets the "nrOfPositionsBankrupt" element
     */
    java.math.BigInteger getNrOfPositionsBankrupt();
    
    /**
     * Gets (as xml) the "nrOfPositionsBankrupt" element
     */
    org.apache.xmlbeans.XmlInteger xgetNrOfPositionsBankrupt();
    
    /**
     * True if has "nrOfPositionsBankrupt" element
     */
    boolean isSetNrOfPositionsBankrupt();
    
    /**
     * Sets the "nrOfPositionsBankrupt" element
     */
    void setNrOfPositionsBankrupt(java.math.BigInteger nrOfPositionsBankrupt);
    
    /**
     * Sets (as xml) the "nrOfPositionsBankrupt" element
     */
    void xsetNrOfPositionsBankrupt(org.apache.xmlbeans.XmlInteger nrOfPositionsBankrupt);
    
    /**
     * Unsets the "nrOfPositionsBankrupt" element
     */
    void unsetNrOfPositionsBankrupt();
    
    /**
     * Gets the "birthDate" element
     */
    java.lang.String getBirthDate();
    
    /**
     * Gets (as xml) the "birthDate" element
     */
    org.apache.xmlbeans.XmlString xgetBirthDate();
    
    /**
     * True if has "birthDate" element
     */
    boolean isSetBirthDate();
    
    /**
     * Sets the "birthDate" element
     */
    void setBirthDate(java.lang.String birthDate);
    
    /**
     * Sets (as xml) the "birthDate" element
     */
    void xsetBirthDate(org.apache.xmlbeans.XmlString birthDate);
    
    /**
     * Unsets the "birthDate" element
     */
    void unsetBirthDate();
    
    /**
     * Gets array of all "organizationPositions" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] getOrganizationPositionsArray();
    
    /**
     * Gets ith "organizationPositions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition getOrganizationPositionsArray(int i);
    
    /**
     * Returns number of "organizationPositions" element
     */
    int sizeOfOrganizationPositionsArray();
    
    /**
     * Sets array of all "organizationPositions" element
     */
    void setOrganizationPositionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] organizationPositionsArray);
    
    /**
     * Sets ith "organizationPositions" element
     */
    void setOrganizationPositionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition organizationPositions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "organizationPositions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition insertNewOrganizationPositions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "organizationPositions" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition addNewOrganizationPositions();
    
    /**
     * Removes the ith "organizationPositions" element
     */
    void removeOrganizationPositions(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
