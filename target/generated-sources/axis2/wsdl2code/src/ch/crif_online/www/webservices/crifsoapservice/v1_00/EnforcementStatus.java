/*
 * XML Type:  EnforcementStatus
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML EnforcementStatus(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is an atomic type that is a restriction of ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.
 */
public interface EnforcementStatus extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnforcementStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("enforcementstatus7ca7type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ENFORCEMENT_DEMAND = Enum.forString("ENFORCEMENT_DEMAND");
    static final Enum ENFORCEMENT_INSPECTION_RESULT = Enum.forString("ENFORCEMENT_INSPECTION_RESULT");
    static final Enum ENFORCEMENT_RECEJTED = Enum.forString("ENFORCEMENT_RECEJTED");
    static final Enum PAYMENT_SUMMON_CONTESTED = Enum.forString("PAYMENT_SUMMON_CONTESTED");
    static final Enum PAYMENT_SUMMON_UNCONTESTED = Enum.forString("PAYMENT_SUMMON_UNCONTESTED");
    static final Enum DEBTOR_MOVED_AWAY = Enum.forString("DEBTOR_MOVED_AWAY");
    static final Enum PAYMENT_SUMMON_UNDELIVERABLE = Enum.forString("PAYMENT_SUMMON_UNDELIVERABLE");
    static final Enum CONTINUATION_REQUEST = Enum.forString("CONTINUATION_REQUEST");
    static final Enum ENFORCEMENT_CANCELED = Enum.forString("ENFORCEMENT_CANCELED");
    static final Enum OTHER = Enum.forString("OTHER");
    
    static final int INT_ENFORCEMENT_DEMAND = Enum.INT_ENFORCEMENT_DEMAND;
    static final int INT_ENFORCEMENT_INSPECTION_RESULT = Enum.INT_ENFORCEMENT_INSPECTION_RESULT;
    static final int INT_ENFORCEMENT_RECEJTED = Enum.INT_ENFORCEMENT_RECEJTED;
    static final int INT_PAYMENT_SUMMON_CONTESTED = Enum.INT_PAYMENT_SUMMON_CONTESTED;
    static final int INT_PAYMENT_SUMMON_UNCONTESTED = Enum.INT_PAYMENT_SUMMON_UNCONTESTED;
    static final int INT_DEBTOR_MOVED_AWAY = Enum.INT_DEBTOR_MOVED_AWAY;
    static final int INT_PAYMENT_SUMMON_UNDELIVERABLE = Enum.INT_PAYMENT_SUMMON_UNDELIVERABLE;
    static final int INT_CONTINUATION_REQUEST = Enum.INT_CONTINUATION_REQUEST;
    static final int INT_ENFORCEMENT_CANCELED = Enum.INT_ENFORCEMENT_CANCELED;
    static final int INT_OTHER = Enum.INT_OTHER;
    
    /**
     * Enumeration value class for ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ENFORCEMENT_DEMAND
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
        
        static final int INT_ENFORCEMENT_DEMAND = 1;
        static final int INT_ENFORCEMENT_INSPECTION_RESULT = 2;
        static final int INT_ENFORCEMENT_RECEJTED = 3;
        static final int INT_PAYMENT_SUMMON_CONTESTED = 4;
        static final int INT_PAYMENT_SUMMON_UNCONTESTED = 5;
        static final int INT_DEBTOR_MOVED_AWAY = 6;
        static final int INT_PAYMENT_SUMMON_UNDELIVERABLE = 7;
        static final int INT_CONTINUATION_REQUEST = 8;
        static final int INT_ENFORCEMENT_CANCELED = 9;
        static final int INT_OTHER = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ENFORCEMENT_DEMAND", INT_ENFORCEMENT_DEMAND),
                new Enum("ENFORCEMENT_INSPECTION_RESULT", INT_ENFORCEMENT_INSPECTION_RESULT),
                new Enum("ENFORCEMENT_RECEJTED", INT_ENFORCEMENT_RECEJTED),
                new Enum("PAYMENT_SUMMON_CONTESTED", INT_PAYMENT_SUMMON_CONTESTED),
                new Enum("PAYMENT_SUMMON_UNCONTESTED", INT_PAYMENT_SUMMON_UNCONTESTED),
                new Enum("DEBTOR_MOVED_AWAY", INT_DEBTOR_MOVED_AWAY),
                new Enum("PAYMENT_SUMMON_UNDELIVERABLE", INT_PAYMENT_SUMMON_UNDELIVERABLE),
                new Enum("CONTINUATION_REQUEST", INT_CONTINUATION_REQUEST),
                new Enum("ENFORCEMENT_CANCELED", INT_ENFORCEMENT_CANCELED),
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
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus newValue(java.lang.Object obj) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) type.newValue( obj ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
