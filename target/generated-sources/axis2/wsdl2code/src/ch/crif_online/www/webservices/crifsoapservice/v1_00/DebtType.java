/*
 * XML Type:  DebtType
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML DebtType(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is an atomic type that is a restriction of ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.
 */
public interface DebtType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("debttype8234type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INFORMATION = Enum.forString("INFORMATION");
    static final Enum COLLECTION = Enum.forString("COLLECTION");
    
    static final int INT_INFORMATION = Enum.INT_INFORMATION;
    static final int INT_COLLECTION = Enum.INT_COLLECTION;
    
    /**
     * Enumeration value class for ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INFORMATION
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
        
        static final int INT_INFORMATION = 1;
        static final int INT_COLLECTION = 2;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("INFORMATION", INT_INFORMATION),
                new Enum("COLLECTION", INT_COLLECTION),
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType newValue(java.lang.Object obj) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) type.newValue( obj ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
