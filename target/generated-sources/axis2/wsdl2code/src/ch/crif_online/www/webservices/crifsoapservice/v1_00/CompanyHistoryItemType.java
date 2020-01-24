/*
 * XML Type:  CompanyHistoryItemType
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML CompanyHistoryItemType(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is an atomic type that is a restriction of ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType.
 */
public interface CompanyHistoryItemType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyHistoryItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("companyhistoryitemtype9eebtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ACTIVITY_STATUS = Enum.forString("ACTIVITY_STATUS");
    static final Enum AUDITING_COMPANY = Enum.forString("AUDITING_COMPANY");
    static final Enum CAPITAL = Enum.forString("CAPITAL");
    static final Enum CAPITAL_PAYED = Enum.forString("CAPITAL_PAYED");
    static final Enum DOMICIL = Enum.forString("DOMICIL");
    static final Enum LEGAL_FORM = Enum.forString("LEGAL_FORM");
    static final Enum NAME = Enum.forString("NAME");
    static final Enum REGISTERED_OFFICE_CITY = Enum.forString("REGISTERED_OFFICE_CITY");
    static final Enum RESOLUTION = Enum.forString("RESOLUTION");
    static final Enum PURPOSE = Enum.forString("PURPOSE");
    static final Enum OTHER = Enum.forString("OTHER");
    
    static final int INT_ACTIVITY_STATUS = Enum.INT_ACTIVITY_STATUS;
    static final int INT_AUDITING_COMPANY = Enum.INT_AUDITING_COMPANY;
    static final int INT_CAPITAL = Enum.INT_CAPITAL;
    static final int INT_CAPITAL_PAYED = Enum.INT_CAPITAL_PAYED;
    static final int INT_DOMICIL = Enum.INT_DOMICIL;
    static final int INT_LEGAL_FORM = Enum.INT_LEGAL_FORM;
    static final int INT_NAME = Enum.INT_NAME;
    static final int INT_REGISTERED_OFFICE_CITY = Enum.INT_REGISTERED_OFFICE_CITY;
    static final int INT_RESOLUTION = Enum.INT_RESOLUTION;
    static final int INT_PURPOSE = Enum.INT_PURPOSE;
    static final int INT_OTHER = Enum.INT_OTHER;
    
    /**
     * Enumeration value class for ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ACTIVITY_STATUS
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
        
        static final int INT_ACTIVITY_STATUS = 1;
        static final int INT_AUDITING_COMPANY = 2;
        static final int INT_CAPITAL = 3;
        static final int INT_CAPITAL_PAYED = 4;
        static final int INT_DOMICIL = 5;
        static final int INT_LEGAL_FORM = 6;
        static final int INT_NAME = 7;
        static final int INT_REGISTERED_OFFICE_CITY = 8;
        static final int INT_RESOLUTION = 9;
        static final int INT_PURPOSE = 10;
        static final int INT_OTHER = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ACTIVITY_STATUS", INT_ACTIVITY_STATUS),
                new Enum("AUDITING_COMPANY", INT_AUDITING_COMPANY),
                new Enum("CAPITAL", INT_CAPITAL),
                new Enum("CAPITAL_PAYED", INT_CAPITAL_PAYED),
                new Enum("DOMICIL", INT_DOMICIL),
                new Enum("LEGAL_FORM", INT_LEGAL_FORM),
                new Enum("NAME", INT_NAME),
                new Enum("REGISTERED_OFFICE_CITY", INT_REGISTERED_OFFICE_CITY),
                new Enum("RESOLUTION", INT_RESOLUTION),
                new Enum("PURPOSE", INT_PURPOSE),
                new Enum("OTHER", INT_OTHER),
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType newValue(java.lang.Object obj) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) type.newValue( obj ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
