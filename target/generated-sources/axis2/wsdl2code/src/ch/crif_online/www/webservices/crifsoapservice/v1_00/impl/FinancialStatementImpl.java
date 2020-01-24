/*
 * XML Type:  FinancialStatement
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML FinancialStatement(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class FinancialStatementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatement
{
    private static final long serialVersionUID = 1L;
    
    public FinancialStatementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINANCIALREPORTINGSTANDARD$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "financialReportingStandard");
    private static final javax.xml.namespace.QName COMPANYNAME$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "companyName");
    private static final javax.xml.namespace.QName CURRENCYCODE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "currencyCode");
    private static final javax.xml.namespace.QName PERIOD$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    private static final javax.xml.namespace.QName BALANCESHEET$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "balanceSheet");
    private static final javax.xml.namespace.QName PROFITANDLOSS$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "profitAndLoss");
    private static final javax.xml.namespace.QName CASHFLOW$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "cashFlow");
    private static final javax.xml.namespace.QName FURTHERFIGURES$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "furtherFigures");
    private static final javax.xml.namespace.QName CREDITRATIOS$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "creditRatios");
    
    
    /**
     * Gets the "financialReportingStandard" element
     */
    public java.lang.String getFinancialReportingStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCIALREPORTINGSTANDARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "financialReportingStandard" element
     */
    public org.apache.xmlbeans.XmlString xgetFinancialReportingStandard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCIALREPORTINGSTANDARD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "financialReportingStandard" element
     */
    public void setFinancialReportingStandard(java.lang.String financialReportingStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCIALREPORTINGSTANDARD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINANCIALREPORTINGSTANDARD$0);
            }
            target.setStringValue(financialReportingStandard);
        }
    }
    
    /**
     * Sets (as xml) the "financialReportingStandard" element
     */
    public void xsetFinancialReportingStandard(org.apache.xmlbeans.XmlString financialReportingStandard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCIALREPORTINGSTANDARD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINANCIALREPORTINGSTANDARD$0);
            }
            target.set(financialReportingStandard);
        }
    }
    
    /**
     * Gets the "companyName" element
     */
    public java.lang.String getCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "companyName" element
     */
    public org.apache.xmlbeans.XmlString xgetCompanyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "companyName" element
     */
    public void setCompanyName(java.lang.String companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$2);
            }
            target.setStringValue(companyName);
        }
    }
    
    /**
     * Sets (as xml) the "companyName" element
     */
    public void xsetCompanyName(org.apache.xmlbeans.XmlString companyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYNAME$2);
            }
            target.set(companyName);
        }
    }
    
    /**
     * Gets the "currencyCode" element
     */
    public java.lang.String getCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currencyCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "currencyCode" element
     */
    public void setCurrencyCode(java.lang.String currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYCODE$4);
            }
            target.setStringValue(currencyCode);
        }
    }
    
    /**
     * Sets (as xml) the "currencyCode" element
     */
    public void xsetCurrencyCode(org.apache.xmlbeans.XmlString currencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYCODE$4);
            }
            target.set(currencyCode);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "balanceSheet" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getBalanceSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BALANCESHEET$8, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "balanceSheet" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getBalanceSheetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(BALANCESHEET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "balanceSheet" element
     */
    public int sizeOfBalanceSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BALANCESHEET$8);
        }
    }
    
    /**
     * Sets array of all "balanceSheet" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBalanceSheetArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] balanceSheetArray)
    {
        check_orphaned();
        arraySetterHelper(balanceSheetArray, BALANCESHEET$8);
    }
    
    /**
     * Sets ith "balanceSheet" element
     */
    public void setBalanceSheetArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement balanceSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(BALANCESHEET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(balanceSheet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "balanceSheet" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewBalanceSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().insert_element_user(BALANCESHEET$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "balanceSheet" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewBalanceSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().add_element_user(BALANCESHEET$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "balanceSheet" element
     */
    public void removeBalanceSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BALANCESHEET$8, i);
        }
    }
    
    /**
     * Gets array of all "profitAndLoss" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getProfitAndLossArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROFITANDLOSS$10, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "profitAndLoss" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getProfitAndLossArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(PROFITANDLOSS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "profitAndLoss" element
     */
    public int sizeOfProfitAndLossArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFITANDLOSS$10);
        }
    }
    
    /**
     * Sets array of all "profitAndLoss" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProfitAndLossArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] profitAndLossArray)
    {
        check_orphaned();
        arraySetterHelper(profitAndLossArray, PROFITANDLOSS$10);
    }
    
    /**
     * Sets ith "profitAndLoss" element
     */
    public void setProfitAndLossArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement profitAndLoss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(PROFITANDLOSS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(profitAndLoss);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profitAndLoss" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewProfitAndLoss(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().insert_element_user(PROFITANDLOSS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profitAndLoss" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewProfitAndLoss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().add_element_user(PROFITANDLOSS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "profitAndLoss" element
     */
    public void removeProfitAndLoss(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFITANDLOSS$10, i);
        }
    }
    
    /**
     * Gets array of all "cashFlow" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getCashFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CASHFLOW$12, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cashFlow" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getCashFlowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(CASHFLOW$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cashFlow" element
     */
    public int sizeOfCashFlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASHFLOW$12);
        }
    }
    
    /**
     * Sets array of all "cashFlow" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCashFlowArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] cashFlowArray)
    {
        check_orphaned();
        arraySetterHelper(cashFlowArray, CASHFLOW$12);
    }
    
    /**
     * Sets ith "cashFlow" element
     */
    public void setCashFlowArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement cashFlow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(CASHFLOW$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cashFlow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cashFlow" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewCashFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().insert_element_user(CASHFLOW$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cashFlow" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewCashFlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().add_element_user(CASHFLOW$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "cashFlow" element
     */
    public void removeCashFlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASHFLOW$12, i);
        }
    }
    
    /**
     * Gets array of all "furtherFigures" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] getFurtherFiguresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FURTHERFIGURES$14, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "furtherFigures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement getFurtherFiguresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(FURTHERFIGURES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "furtherFigures" element
     */
    public int sizeOfFurtherFiguresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FURTHERFIGURES$14);
        }
    }
    
    /**
     * Sets array of all "furtherFigures" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFurtherFiguresArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement[] furtherFiguresArray)
    {
        check_orphaned();
        arraySetterHelper(furtherFiguresArray, FURTHERFIGURES$14);
    }
    
    /**
     * Sets ith "furtherFigures" element
     */
    public void setFurtherFiguresArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement furtherFigures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().find_element_user(FURTHERFIGURES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(furtherFigures);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "furtherFigures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement insertNewFurtherFigures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().insert_element_user(FURTHERFIGURES$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "furtherFigures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement addNewFurtherFigures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FinancialStatementElement)get_store().add_element_user(FURTHERFIGURES$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "furtherFigures" element
     */
    public void removeFurtherFigures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FURTHERFIGURES$14, i);
        }
    }
    
    /**
     * Gets array of all "creditRatios" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[] getCreditRatiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREDITRATIOS$16, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "creditRatios" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio getCreditRatiosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio)get_store().find_element_user(CREDITRATIOS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "creditRatios" element
     */
    public int sizeOfCreditRatiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITRATIOS$16);
        }
    }
    
    /**
     * Sets array of all "creditRatios" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCreditRatiosArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio[] creditRatiosArray)
    {
        check_orphaned();
        arraySetterHelper(creditRatiosArray, CREDITRATIOS$16);
    }
    
    /**
     * Sets ith "creditRatios" element
     */
    public void setCreditRatiosArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio creditRatios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio)get_store().find_element_user(CREDITRATIOS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(creditRatios);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "creditRatios" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio insertNewCreditRatios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio)get_store().insert_element_user(CREDITRATIOS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "creditRatios" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio addNewCreditRatios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CreditRatio)get_store().add_element_user(CREDITRATIOS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "creditRatios" element
     */
    public void removeCreditRatios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITRATIOS$16, i);
        }
    }
}
