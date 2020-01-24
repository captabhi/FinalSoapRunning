/*
 * XML Type:  BranchOfficeList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML BranchOfficeList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface BranchOfficeList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BranchOfficeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("branchofficelistf703type");
    
    /**
     * Gets array of all "branchOffices" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[] getBranchOfficesArray();
    
    /**
     * Gets ith "branchOffices" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem getBranchOfficesArray(int i);
    
    /**
     * Returns number of "branchOffices" element
     */
    int sizeOfBranchOfficesArray();
    
    /**
     * Sets array of all "branchOffices" element
     */
    void setBranchOfficesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[] branchOfficesArray);
    
    /**
     * Sets ith "branchOffices" element
     */
    void setBranchOfficesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem branchOffices);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "branchOffices" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem insertNewBranchOffices(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "branchOffices" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem addNewBranchOffices();
    
    /**
     * Removes the ith "branchOffices" element
     */
    void removeBranchOffices(int i);
    
    /**
     * Gets the "isTruncated" element
     */
    boolean getIsTruncated();
    
    /**
     * Gets (as xml) the "isTruncated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTruncated();
    
    /**
     * Sets the "isTruncated" element
     */
    void setIsTruncated(boolean isTruncated);
    
    /**
     * Sets (as xml) the "isTruncated" element
     */
    void xsetIsTruncated(org.apache.xmlbeans.XmlBoolean isTruncated);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
