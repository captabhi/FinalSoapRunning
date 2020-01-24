/*
 * XML Type:  IdVerificationContent
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML IdVerificationContent(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface IdVerificationContent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdVerificationContent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("idverificationcontentba18type");
    
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
     * Gets the "checks" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks getChecks();
    
    /**
     * True if has "checks" element
     */
    boolean isSetChecks();
    
    /**
     * Sets the "checks" element
     */
    void setChecks(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks checks);
    
    /**
     * Appends and returns a new empty "checks" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks addNewChecks();
    
    /**
     * Unsets the "checks" element
     */
    void unsetChecks();
    
    /**
     * Gets array of all "documentImages" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] getDocumentImagesArray();
    
    /**
     * Gets ith "documentImages" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData getDocumentImagesArray(int i);
    
    /**
     * Returns number of "documentImages" element
     */
    int sizeOfDocumentImagesArray();
    
    /**
     * Sets array of all "documentImages" element
     */
    void setDocumentImagesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] documentImagesArray);
    
    /**
     * Sets ith "documentImages" element
     */
    void setDocumentImagesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData documentImages);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentImages" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData insertNewDocumentImages(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentImages" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData addNewDocumentImages();
    
    /**
     * Removes the ith "documentImages" element
     */
    void removeDocumentImages(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
