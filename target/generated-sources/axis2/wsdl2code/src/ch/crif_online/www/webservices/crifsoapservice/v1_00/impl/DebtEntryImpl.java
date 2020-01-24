/*
 * XML Type:  DebtEntry
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML DebtEntry(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class DebtEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtEntry
{
    private static final long serialVersionUID = 1L;
    
    public DebtEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RISKCLASS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "riskClass");
    private static final javax.xml.namespace.QName DATEOPEN$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateOpen");
    private static final javax.xml.namespace.QName DATECLOSE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateClose");
    private static final javax.xml.namespace.QName AMOUNT$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    private static final javax.xml.namespace.QName AMOUNTOPEN$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amountOpen");
    private static final javax.xml.namespace.QName DEBTTYPE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "debtType");
    private static final javax.xml.namespace.QName PAYMENTSTATUS$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentStatus");
    private static final javax.xml.namespace.QName PAYMENTSTATUSTEXT$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentStatusText");
    private static final javax.xml.namespace.QName ORIGIN$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "origin");
    private static final javax.xml.namespace.QName TEXT$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "text");
    
    
    /**
     * Gets the "riskClass" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass.Enum getRiskClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RISKCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "riskClass" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass xgetRiskClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass)get_store().find_element_user(RISKCLASS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "riskClass" element
     */
    public void setRiskClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass.Enum riskClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RISKCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RISKCLASS$0);
            }
            target.setEnumValue(riskClass);
        }
    }
    
    /**
     * Sets (as xml) the "riskClass" element
     */
    public void xsetRiskClass(ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass riskClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass)get_store().find_element_user(RISKCLASS$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.RiskClass)get_store().add_element_user(RISKCLASS$0);
            }
            target.set(riskClass);
        }
    }
    
    /**
     * Gets the "dateOpen" element
     */
    public java.lang.String getDateOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOPEN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOpen" element
     */
    public org.apache.xmlbeans.XmlString xgetDateOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOPEN$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateOpen" element
     */
    public void setDateOpen(java.lang.String dateOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOPEN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOPEN$2);
            }
            target.setStringValue(dateOpen);
        }
    }
    
    /**
     * Sets (as xml) the "dateOpen" element
     */
    public void xsetDateOpen(org.apache.xmlbeans.XmlString dateOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOPEN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEOPEN$2);
            }
            target.set(dateOpen);
        }
    }
    
    /**
     * Gets the "dateClose" element
     */
    public java.lang.String getDateClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECLOSE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateClose" element
     */
    public org.apache.xmlbeans.XmlString xgetDateClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATECLOSE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateClose" element
     */
    public boolean isSetDateClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATECLOSE$4) != 0;
        }
    }
    
    /**
     * Sets the "dateClose" element
     */
    public void setDateClose(java.lang.String dateClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECLOSE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECLOSE$4);
            }
            target.setStringValue(dateClose);
        }
    }
    
    /**
     * Sets (as xml) the "dateClose" element
     */
    public void xsetDateClose(org.apache.xmlbeans.XmlString dateClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATECLOSE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATECLOSE$4);
            }
            target.set(dateClose);
        }
    }
    
    /**
     * Unsets the "dateClose" element
     */
    public void unsetDateClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATECLOSE$4, 0);
        }
    }
    
    /**
     * Gets the "amount" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "amount" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$6, 0);
        }
    }
    
    /**
     * Gets the "amountOpen" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmountOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNTOPEN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amountOpen" element
     */
    public boolean isSetAmountOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNTOPEN$8) != 0;
        }
    }
    
    /**
     * Sets the "amountOpen" element
     */
    public void setAmountOpen(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amountOpen)
    {
        generatedSetterHelperImpl(amountOpen, AMOUNTOPEN$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "amountOpen" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewAmountOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNTOPEN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "amountOpen" element
     */
    public void unsetAmountOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNTOPEN$8, 0);
        }
    }
    
    /**
     * Gets the "debtType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.Enum getDebtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "debtType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType xgetDebtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType)get_store().find_element_user(DEBTTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "debtType" element
     */
    public void setDebtType(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType.Enum debtType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTTYPE$10);
            }
            target.setEnumValue(debtType);
        }
    }
    
    /**
     * Sets (as xml) the "debtType" element
     */
    public void xsetDebtType(ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType debtType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType)get_store().find_element_user(DEBTTYPE$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.DebtType)get_store().add_element_user(DEBTTYPE$10);
            }
            target.set(debtType);
        }
    }
    
    /**
     * Gets the "paymentStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus.Enum getPaymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus xgetPaymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paymentStatus" element
     */
    public void setPaymentStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus.Enum paymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUS$12);
            }
            target.setEnumValue(paymentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "paymentStatus" element
     */
    public void xsetPaymentStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus paymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus)get_store().find_element_user(PAYMENTSTATUS$12, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentStatus)get_store().add_element_user(PAYMENTSTATUS$12);
            }
            target.set(paymentStatus);
        }
    }
    
    /**
     * Gets the "paymentStatusText" element
     */
    public java.lang.String getPaymentStatusText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSTEXT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentStatusText" element
     */
    public org.apache.xmlbeans.XmlString xgetPaymentStatusText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTSTATUSTEXT$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paymentStatusText" element
     */
    public void setPaymentStatusText(java.lang.String paymentStatusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTSTATUSTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTSTATUSTEXT$14);
            }
            target.setStringValue(paymentStatusText);
        }
    }
    
    /**
     * Sets (as xml) the "paymentStatusText" element
     */
    public void xsetPaymentStatusText(org.apache.xmlbeans.XmlString paymentStatusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTSTATUSTEXT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAYMENTSTATUSTEXT$14);
            }
            target.set(paymentStatusText);
        }
    }
    
    /**
     * Gets the "origin" element
     */
    public java.lang.String getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" element
     */
    public org.apache.xmlbeans.XmlString xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGIN$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "origin" element
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGIN$16) != 0;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(java.lang.String origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGIN$16);
            }
            target.setStringValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" element
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlString origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGIN$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGIN$16);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" element
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGIN$16, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$18) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$18);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$18);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$18, 0);
        }
    }
}
