/*
 * XML Type:  OfflineReportRejectionReason
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML OfflineReportRejectionReason(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is an atomic type that is a restriction of ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.
 */
public interface OfflineReportRejectionReason extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfflineReportRejectionReason.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("offlinereportrejectionreasonbb7dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ADDRESS_IS_BUSINESS_ADDRESS = Enum.forString("ADDRESS_IS_BUSINESS_ADDRESS");
    static final Enum ADDRESS_IS_SECONDARY_ADDRES = Enum.forString("ADDRESS_IS_SECONDARY_ADDRES");
    static final Enum CROSS_BORDER_COMMUTER = Enum.forString("CROSS_BORDER_COMMUTER");
    static final Enum DATA_PRIVACY_PROTECTION = Enum.forString("DATA_PRIVACY_PROTECTION");
    static final Enum DISCLOSURE_REJECTED = Enum.forString("DISCLOSURE_REJECTED");
    static final Enum LEGAENTY_ADDRESS_UNKNOWN = Enum.forString("LEGAENTY_ADDRESS_UNKNOWN");
    static final Enum LEGAENTY_DECEASED = Enum.forString("LEGAENTY_DECEASED");
    static final Enum LEGAENTY_UNKNOWN = Enum.forString("LEGAENTY_UNKNOWN");
    static final Enum OFFICE_REQUIRES_EXACT_BIRTHDATE = Enum.forString("OFFICE_REQUIRES_EXACT_BIRTHDATE");
    static final Enum OTHER = Enum.forString("OTHER");
    static final Enum PROOF_OF_BUSINESS_RELATIONSHIP_MISSING = Enum.forString("PROOF_OF_BUSINESS_RELATIONSHIP_MISSING");
    static final Enum PROOF_OF_INTEREST_MISSING = Enum.forString("PROOF_OF_INTEREST_MISSING");
    static final Enum PROOF_OF_INTEREST_UNSIGNED = Enum.forString("PROOF_OF_INTEREST_UNSIGNED");
    static final Enum REGISTRATION_PENDING = Enum.forString("REGISTRATION_PENDING");
    
    static final int INT_ADDRESS_IS_BUSINESS_ADDRESS = Enum.INT_ADDRESS_IS_BUSINESS_ADDRESS;
    static final int INT_ADDRESS_IS_SECONDARY_ADDRES = Enum.INT_ADDRESS_IS_SECONDARY_ADDRES;
    static final int INT_CROSS_BORDER_COMMUTER = Enum.INT_CROSS_BORDER_COMMUTER;
    static final int INT_DATA_PRIVACY_PROTECTION = Enum.INT_DATA_PRIVACY_PROTECTION;
    static final int INT_DISCLOSURE_REJECTED = Enum.INT_DISCLOSURE_REJECTED;
    static final int INT_LEGAENTY_ADDRESS_UNKNOWN = Enum.INT_LEGAENTY_ADDRESS_UNKNOWN;
    static final int INT_LEGAENTY_DECEASED = Enum.INT_LEGAENTY_DECEASED;
    static final int INT_LEGAENTY_UNKNOWN = Enum.INT_LEGAENTY_UNKNOWN;
    static final int INT_OFFICE_REQUIRES_EXACT_BIRTHDATE = Enum.INT_OFFICE_REQUIRES_EXACT_BIRTHDATE;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_PROOF_OF_BUSINESS_RELATIONSHIP_MISSING = Enum.INT_PROOF_OF_BUSINESS_RELATIONSHIP_MISSING;
    static final int INT_PROOF_OF_INTEREST_MISSING = Enum.INT_PROOF_OF_INTEREST_MISSING;
    static final int INT_PROOF_OF_INTEREST_UNSIGNED = Enum.INT_PROOF_OF_INTEREST_UNSIGNED;
    static final int INT_REGISTRATION_PENDING = Enum.INT_REGISTRATION_PENDING;
    
    /**
     * Enumeration value class for ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ADDRESS_IS_BUSINESS_ADDRESS
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
        
        static final int INT_ADDRESS_IS_BUSINESS_ADDRESS = 1;
        static final int INT_ADDRESS_IS_SECONDARY_ADDRES = 2;
        static final int INT_CROSS_BORDER_COMMUTER = 3;
        static final int INT_DATA_PRIVACY_PROTECTION = 4;
        static final int INT_DISCLOSURE_REJECTED = 5;
        static final int INT_LEGAENTY_ADDRESS_UNKNOWN = 6;
        static final int INT_LEGAENTY_DECEASED = 7;
        static final int INT_LEGAENTY_UNKNOWN = 8;
        static final int INT_OFFICE_REQUIRES_EXACT_BIRTHDATE = 9;
        static final int INT_OTHER = 10;
        static final int INT_PROOF_OF_BUSINESS_RELATIONSHIP_MISSING = 11;
        static final int INT_PROOF_OF_INTEREST_MISSING = 12;
        static final int INT_PROOF_OF_INTEREST_UNSIGNED = 13;
        static final int INT_REGISTRATION_PENDING = 14;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ADDRESS_IS_BUSINESS_ADDRESS", INT_ADDRESS_IS_BUSINESS_ADDRESS),
                new Enum("ADDRESS_IS_SECONDARY_ADDRES", INT_ADDRESS_IS_SECONDARY_ADDRES),
                new Enum("CROSS_BORDER_COMMUTER", INT_CROSS_BORDER_COMMUTER),
                new Enum("DATA_PRIVACY_PROTECTION", INT_DATA_PRIVACY_PROTECTION),
                new Enum("DISCLOSURE_REJECTED", INT_DISCLOSURE_REJECTED),
                new Enum("LEGAENTY_ADDRESS_UNKNOWN", INT_LEGAENTY_ADDRESS_UNKNOWN),
                new Enum("LEGAENTY_DECEASED", INT_LEGAENTY_DECEASED),
                new Enum("LEGAENTY_UNKNOWN", INT_LEGAENTY_UNKNOWN),
                new Enum("OFFICE_REQUIRES_EXACT_BIRTHDATE", INT_OFFICE_REQUIRES_EXACT_BIRTHDATE),
                new Enum("OTHER", INT_OTHER),
                new Enum("PROOF_OF_BUSINESS_RELATIONSHIP_MISSING", INT_PROOF_OF_BUSINESS_RELATIONSHIP_MISSING),
                new Enum("PROOF_OF_INTEREST_MISSING", INT_PROOF_OF_INTEREST_MISSING),
                new Enum("PROOF_OF_INTEREST_UNSIGNED", INT_PROOF_OF_INTEREST_UNSIGNED),
                new Enum("REGISTRATION_PENDING", INT_REGISTRATION_PENDING),
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason newValue(java.lang.Object obj) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) type.newValue( obj ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportRejectionReason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
