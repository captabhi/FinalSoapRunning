/*
 * XML Type:  IdVerificationRequestData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML IdVerificationRequestData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface IdVerificationRequestData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdVerificationRequestData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("idverificationrequestdata53f8type");
    
    /**
     * Gets array of all "documentImage" elements
     */
    java.lang.String[] getDocumentImageArray();
    
    /**
     * Gets ith "documentImage" element
     */
    java.lang.String getDocumentImageArray(int i);
    
    /**
     * Gets (as xml) array of all "documentImage" elements
     */
    org.apache.xmlbeans.XmlString[] xgetDocumentImageArray();
    
    /**
     * Gets (as xml) ith "documentImage" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentImageArray(int i);
    
    /**
     * Returns number of "documentImage" element
     */
    int sizeOfDocumentImageArray();
    
    /**
     * Sets array of all "documentImage" element
     */
    void setDocumentImageArray(java.lang.String[] documentImageArray);
    
    /**
     * Sets ith "documentImage" element
     */
    void setDocumentImageArray(int i, java.lang.String documentImage);
    
    /**
     * Sets (as xml) array of all "documentImage" element
     */
    void xsetDocumentImageArray(org.apache.xmlbeans.XmlString[] documentImageArray);
    
    /**
     * Sets (as xml) ith "documentImage" element
     */
    void xsetDocumentImageArray(int i, org.apache.xmlbeans.XmlString documentImage);
    
    /**
     * Inserts the value as the ith "documentImage" element
     */
    void insertDocumentImage(int i, java.lang.String documentImage);
    
    /**
     * Appends the value as the last "documentImage" element
     */
    void addDocumentImage(java.lang.String documentImage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentImage" element
     */
    org.apache.xmlbeans.XmlString insertNewDocumentImage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentImage" element
     */
    org.apache.xmlbeans.XmlString addNewDocumentImage();
    
    /**
     * Removes the ith "documentImage" element
     */
    void removeDocumentImage(int i);
    
    /**
     * Gets the "document" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 getDocument();
    
    /**
     * True if has "document" element
     */
    boolean isSetDocument();
    
    /**
     * Sets the "document" element
     */
    void setDocument(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 document);
    
    /**
     * Appends and returns a new empty "document" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 addNewDocument();
    
    /**
     * Unsets the "document" element
     */
    void unsetDocument();
    
    /**
     * Gets the "person" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson getPerson();
    
    /**
     * True if has "person" element
     */
    boolean isSetPerson();
    
    /**
     * Sets the "person" element
     */
    void setPerson(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson person);
    
    /**
     * Appends and returns a new empty "person" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson addNewPerson();
    
    /**
     * Unsets the "person" element
     */
    void unsetPerson();
    
    /**
     * Gets the "documentType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum getDocumentType();
    
    /**
     * Gets (as xml) the "documentType" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType xgetDocumentType();
    
    /**
     * True if has "documentType" element
     */
    boolean isSetDocumentType();
    
    /**
     * Sets the "documentType" element
     */
    void setDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum documentType);
    
    /**
     * Sets (as xml) the "documentType" element
     */
    void xsetDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType documentType);
    
    /**
     * Unsets the "documentType" element
     */
    void unsetDocumentType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
