/*
 * XML Type:  PublicationCategory
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML PublicationCategory(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is an atomic type that is a restriction of ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.
 */
public interface PublicationCategory extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicationCategory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("publicationcategory45dftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NOT_CLASSIFIED = Enum.forString("NOT_CLASSIFIED");
    static final Enum DELETION = Enum.forString("DELETION");
    static final Enum CHANGE = Enum.forString("CHANGE");
    static final Enum NEW_REGISTRATION = Enum.forString("NEW_REGISTRATION");
    static final Enum CORRECTION = Enum.forString("CORRECTION");
    static final Enum LIQUIDATION = Enum.forString("LIQUIDATION");
    static final Enum PROCLAMATION = Enum.forString("PROCLAMATION");
    static final Enum INSOLVENCY = Enum.forString("INSOLVENCY");
    static final Enum REVOCATION = Enum.forString("REVOCATION");
    static final Enum SHAREHOLDER = Enum.forString("SHAREHOLDER");
    static final Enum ANNUAL_BALANCE_SHEET = Enum.forString("ANNUAL_BALANCE_SHEET");
    static final Enum NOTICE_TO_CREDITORS = Enum.forString("NOTICE_TO_CREDITORS");
    static final Enum COMPOSITION_AGREEMENT = Enum.forString("COMPOSITION_AGREEMENT");
    static final Enum LEGAL_COLLECTION = Enum.forString("LEGAL_COLLECTION");
    
    static final int INT_NOT_CLASSIFIED = Enum.INT_NOT_CLASSIFIED;
    static final int INT_DELETION = Enum.INT_DELETION;
    static final int INT_CHANGE = Enum.INT_CHANGE;
    static final int INT_NEW_REGISTRATION = Enum.INT_NEW_REGISTRATION;
    static final int INT_CORRECTION = Enum.INT_CORRECTION;
    static final int INT_LIQUIDATION = Enum.INT_LIQUIDATION;
    static final int INT_PROCLAMATION = Enum.INT_PROCLAMATION;
    static final int INT_INSOLVENCY = Enum.INT_INSOLVENCY;
    static final int INT_REVOCATION = Enum.INT_REVOCATION;
    static final int INT_SHAREHOLDER = Enum.INT_SHAREHOLDER;
    static final int INT_ANNUAL_BALANCE_SHEET = Enum.INT_ANNUAL_BALANCE_SHEET;
    static final int INT_NOTICE_TO_CREDITORS = Enum.INT_NOTICE_TO_CREDITORS;
    static final int INT_COMPOSITION_AGREEMENT = Enum.INT_COMPOSITION_AGREEMENT;
    static final int INT_LEGAL_COLLECTION = Enum.INT_LEGAL_COLLECTION;
    
    /**
     * Enumeration value class for ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NOT_CLASSIFIED
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_NOT_CLASSIFIED = 1;
        static final int INT_DELETION = 2;
        static final int INT_CHANGE = 3;
        static final int INT_NEW_REGISTRATION = 4;
        static final int INT_CORRECTION = 5;
        static final int INT_LIQUIDATION = 6;
        static final int INT_PROCLAMATION = 7;
        static final int INT_INSOLVENCY = 8;
        static final int INT_REVOCATION = 9;
        static final int INT_SHAREHOLDER = 10;
        static final int INT_ANNUAL_BALANCE_SHEET = 11;
        static final int INT_NOTICE_TO_CREDITORS = 12;
        static final int INT_COMPOSITION_AGREEMENT = 13;
        static final int INT_LEGAL_COLLECTION = 14;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("NOT_CLASSIFIED", INT_NOT_CLASSIFIED),
                new Enum("DELETION", INT_DELETION),
                new Enum("CHANGE", INT_CHANGE),
                new Enum("NEW_REGISTRATION", INT_NEW_REGISTRATION),
                new Enum("CORRECTION", INT_CORRECTION),
                new Enum("LIQUIDATION", INT_LIQUIDATION),
                new Enum("PROCLAMATION", INT_PROCLAMATION),
                new Enum("INSOLVENCY", INT_INSOLVENCY),
                new Enum("REVOCATION", INT_REVOCATION),
                new Enum("SHAREHOLDER", INT_SHAREHOLDER),
                new Enum("ANNUAL_BALANCE_SHEET", INT_ANNUAL_BALANCE_SHEET),
                new Enum("NOTICE_TO_CREDITORS", INT_NOTICE_TO_CREDITORS),
                new Enum("COMPOSITION_AGREEMENT", INT_COMPOSITION_AGREEMENT),
                new Enum("LEGAL_COLLECTION", INT_LEGAL_COLLECTION),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory newValue(java.lang.Object obj) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) type.newValue( obj ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
