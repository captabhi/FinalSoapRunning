/*
 * XML Type:  Publication
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML Publication(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface Publication extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Publication.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("publication08c1type");
    
    /**
     * Gets the "publicationDate" element
     */
    java.lang.String getPublicationDate();
    
    /**
     * Gets (as xml) the "publicationDate" element
     */
    org.apache.xmlbeans.XmlString xgetPublicationDate();
    
    /**
     * Sets the "publicationDate" element
     */
    void setPublicationDate(java.lang.String publicationDate);
    
    /**
     * Sets (as xml) the "publicationDate" element
     */
    void xsetPublicationDate(org.apache.xmlbeans.XmlString publicationDate);
    
    /**
     * Gets the "publicationCategoryOriginal" element
     */
    java.lang.String getPublicationCategoryOriginal();
    
    /**
     * Gets (as xml) the "publicationCategoryOriginal" element
     */
    org.apache.xmlbeans.XmlString xgetPublicationCategoryOriginal();
    
    /**
     * True if has "publicationCategoryOriginal" element
     */
    boolean isSetPublicationCategoryOriginal();
    
    /**
     * Sets the "publicationCategoryOriginal" element
     */
    void setPublicationCategoryOriginal(java.lang.String publicationCategoryOriginal);
    
    /**
     * Sets (as xml) the "publicationCategoryOriginal" element
     */
    void xsetPublicationCategoryOriginal(org.apache.xmlbeans.XmlString publicationCategoryOriginal);
    
    /**
     * Unsets the "publicationCategoryOriginal" element
     */
    void unsetPublicationCategoryOriginal();
    
    /**
     * Gets the "publicationCategory" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.Enum getPublicationCategory();
    
    /**
     * Gets (as xml) the "publicationCategory" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory xgetPublicationCategory();
    
    /**
     * Sets the "publicationCategory" element
     */
    void setPublicationCategory(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.Enum publicationCategory);
    
    /**
     * Sets (as xml) the "publicationCategory" element
     */
    void xsetPublicationCategory(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory publicationCategory);
    
    /**
     * Gets array of all "publicationLabels" elements
     */
    java.lang.String[] getPublicationLabelsArray();
    
    /**
     * Gets ith "publicationLabels" element
     */
    java.lang.String getPublicationLabelsArray(int i);
    
    /**
     * Gets (as xml) array of all "publicationLabels" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPublicationLabelsArray();
    
    /**
     * Gets (as xml) ith "publicationLabels" element
     */
    org.apache.xmlbeans.XmlString xgetPublicationLabelsArray(int i);
    
    /**
     * Returns number of "publicationLabels" element
     */
    int sizeOfPublicationLabelsArray();
    
    /**
     * Sets array of all "publicationLabels" element
     */
    void setPublicationLabelsArray(java.lang.String[] publicationLabelsArray);
    
    /**
     * Sets ith "publicationLabels" element
     */
    void setPublicationLabelsArray(int i, java.lang.String publicationLabels);
    
    /**
     * Sets (as xml) array of all "publicationLabels" element
     */
    void xsetPublicationLabelsArray(org.apache.xmlbeans.XmlString[] publicationLabelsArray);
    
    /**
     * Sets (as xml) ith "publicationLabels" element
     */
    void xsetPublicationLabelsArray(int i, org.apache.xmlbeans.XmlString publicationLabels);
    
    /**
     * Inserts the value as the ith "publicationLabels" element
     */
    void insertPublicationLabels(int i, java.lang.String publicationLabels);
    
    /**
     * Appends the value as the last "publicationLabels" element
     */
    void addPublicationLabels(java.lang.String publicationLabels);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "publicationLabels" element
     */
    org.apache.xmlbeans.XmlString insertNewPublicationLabels(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "publicationLabels" element
     */
    org.apache.xmlbeans.XmlString addNewPublicationLabels();
    
    /**
     * Removes the ith "publicationLabels" element
     */
    void removePublicationLabels(int i);
    
    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "publicationRegion" element
     */
    java.lang.String getPublicationRegion();
    
    /**
     * Gets (as xml) the "publicationRegion" element
     */
    org.apache.xmlbeans.XmlString xgetPublicationRegion();
    
    /**
     * True if has "publicationRegion" element
     */
    boolean isSetPublicationRegion();
    
    /**
     * Sets the "publicationRegion" element
     */
    void setPublicationRegion(java.lang.String publicationRegion);
    
    /**
     * Sets (as xml) the "publicationRegion" element
     */
    void xsetPublicationRegion(org.apache.xmlbeans.XmlString publicationRegion);
    
    /**
     * Unsets the "publicationRegion" element
     */
    void unsetPublicationRegion();
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
