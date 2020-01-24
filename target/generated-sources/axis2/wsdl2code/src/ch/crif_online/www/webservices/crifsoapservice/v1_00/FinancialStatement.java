/*
 * XML Type:  FinancialStatement
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00;


/**
 * An XML FinancialStatement(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public interface FinancialStatement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinancialStatement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2E63A6D34488CC503B5176E37E47E568").resolveHandle("financialstatement1fedtype");
    
    /**
     * Gets the "financialReportingStandard" element
     */
    java.lang.String getFinancialReportingStandard();
    
    /**
     * Gets (as xml) the "financialReportingStandard" element
     */
    org.apache.xmlbeans.XmlString xgetFinancialReportingStandard();
    
    /**
     * Sets the "financialReportingStandard" element
     */
    void setFinancialReportingStandard(java.lang.String financialReportingStandard);
    
    /**
     * Sets (as xml) the "financialReportingStandard" element
     */
    void xsetFinancialReportingStandard(org.apache.xmlbeans.XmlString financialReportingStandard);
    
    /**
     * Gets the "companyName" element
     */
    java.lang.String getCompanyName();
    
    /**
     * Gets (as xml) the "companyName" element
     */
    org.apache.xmlbeans.XmlString xgetCompanyName();
    
    /**
     * Sets the "companyName" element
     */
    void setCompanyName(java.lang.String companyName);
    
    /**
     * Sets (as xml) the "companyName" element
     */
    void xsetCompanyName(org.apache.xmlbeans.XmlString companyName);
    
    /**
     * Gets the "currencyCode" element
     */
    java.lang.String getCurrencyCode();
    
    /**
     * Gets (as xml) the "currencyCode" element
     */
    org.apache.xmlbeans.XmlString xgetCurrencyCode();
    
    /**
     * Sets the "currencyCode" element
     */
    void setCurrencyCode(java.lang.String currencyCode);
    
    /**
     * Sets (as xml) the "currencyCode" element
     */
    void xsetCurrencyCode(org.apache.xmlbeans.XmlString currencyCode);
    
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
     * Gets array of all "balanceSheet" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getBalanceSheetArray();
    
    /**
     * Gets ith "balanceSheet" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getBalanceSheetArray(int i);
    
    /**
     * Returns number of "balanceSheet" element
     */
    int sizeOfBalanceSheetArray();
    
    /**
     * Sets array of all "balanceSheet" element
     */
    void setBalanceSheetArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] balanceSheetArray);
    
    /**
     * Sets ith "balanceSheet" element
     */
    void setBalanceSheetArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement balanceSheet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "balanceSheet" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewBalanceSheet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "balanceSheet" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewBalanceSheet();
    
    /**
     * Removes the ith "balanceSheet" element
     */
    void removeBalanceSheet(int i);
    
    /**
     * Gets array of all "profitAndLoss" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getProfitAndLossArray();
    
    /**
     * Gets ith "profitAndLoss" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getProfitAndLossArray(int i);
    
    /**
     * Returns number of "profitAndLoss" element
     */
    int sizeOfProfitAndLossArray();
    
    /**
     * Sets array of all "profitAndLoss" element
     */
    void setProfitAndLossArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] profitAndLossArray);
    
    /**
     * Sets ith "profitAndLoss" element
     */
    void setProfitAndLossArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement profitAndLoss);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profitAndLoss" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewProfitAndLoss(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profitAndLoss" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewProfitAndLoss();
    
    /**
     * Removes the ith "profitAndLoss" element
     */
    void removeProfitAndLoss(int i);
    
    /**
     * Gets array of all "cashFlow" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getCashFlowArray();
    
    /**
     * Gets ith "cashFlow" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getCashFlowArray(int i);
    
    /**
     * Returns number of "cashFlow" element
     */
    int sizeOfCashFlowArray();
    
    /**
     * Sets array of all "cashFlow" element
     */
    void setCashFlowArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] cashFlowArray);
    
    /**
     * Sets ith "cashFlow" element
     */
    void setCashFlowArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement cashFlow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cashFlow" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewCashFlow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cashFlow" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewCashFlow();
    
    /**
     * Removes the ith "cashFlow" element
     */
    void removeCashFlow(int i);
    
    /**
     * Gets array of all "furtherFigures" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getFurtherFiguresArray();
    
    /**
     * Gets ith "furtherFigures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getFurtherFiguresArray(int i);
    
    /**
     * Returns number of "furtherFigures" element
     */
    int sizeOfFurtherFiguresArray();
    
    /**
     * Sets array of all "furtherFigures" element
     */
    void setFurtherFiguresArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] furtherFiguresArray);
    
    /**
     * Sets ith "furtherFigures" element
     */
    void setFurtherFiguresArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement furtherFigures);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherFigures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewFurtherFigures(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherFigures" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewFurtherFigures();
    
    /**
     * Removes the ith "furtherFigures" element
     */
    void removeFurtherFigures(int i);
    
    /**
     * Gets array of all "creditRatios" elements
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[] getCreditRatiosArray();
    
    /**
     * Gets ith "creditRatios" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio getCreditRatiosArray(int i);
    
    /**
     * Returns number of "creditRatios" element
     */
    int sizeOfCreditRatiosArray();
    
    /**
     * Sets array of all "creditRatios" element
     */
    void setCreditRatiosArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[] creditRatiosArray);
    
    /**
     * Sets ith "creditRatios" element
     */
    void setCreditRatiosArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio creditRatios);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "creditRatios" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio insertNewCreditRatios(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "creditRatios" element
     */
    ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio addNewCreditRatios();
    
    /**
     * Removes the ith "creditRatios" element
     */
    void removeCreditRatios(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement newInstance() {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
