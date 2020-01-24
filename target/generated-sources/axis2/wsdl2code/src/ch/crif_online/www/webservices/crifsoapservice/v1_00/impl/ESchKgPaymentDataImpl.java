/*
 * XML Type:  ESchKgPaymentData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ESchKgPaymentData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgPaymentDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgPaymentDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentId");
    private static final javax.xml.namespace.QName INVOICENO$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "invoiceNo");
    private static final javax.xml.namespace.QName REASON$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reason");
    private static final javax.xml.namespace.QName DATEOFPAYMENT$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateOfPayment");
    private static final javax.xml.namespace.QName AMOUNT$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    
    
    /**
     * Gets the "paymentId" element
     */
    public java.lang.String getPaymentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentId" element
     */
    public org.apache.xmlbeans.XmlString xgetPaymentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "paymentId" element
     */
    public boolean isSetPaymentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "paymentId" element
     */
    public void setPaymentId(java.lang.String paymentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTID$0);
            }
            target.setStringValue(paymentId);
        }
    }
    
    /**
     * Sets (as xml) the "paymentId" element
     */
    public void xsetPaymentId(org.apache.xmlbeans.XmlString paymentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAYMENTID$0);
            }
            target.set(paymentId);
        }
    }
    
    /**
     * Unsets the "paymentId" element
     */
    public void unsetPaymentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTID$0, 0);
        }
    }
    
    /**
     * Gets the "invoiceNo" element
     */
    public java.lang.String getInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "invoiceNo" element
     */
    public org.apache.xmlbeans.XmlString xgetInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICENO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "invoiceNo" element
     */
    public boolean isSetInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOICENO$2) != 0;
        }
    }
    
    /**
     * Sets the "invoiceNo" element
     */
    public void setInvoiceNo(java.lang.String invoiceNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICENO$2);
            }
            target.setStringValue(invoiceNo);
        }
    }
    
    /**
     * Sets (as xml) the "invoiceNo" element
     */
    public void xsetInvoiceNo(org.apache.xmlbeans.XmlString invoiceNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICENO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVOICENO$2);
            }
            target.set(invoiceNo);
        }
    }
    
    /**
     * Unsets the "invoiceNo" element
     */
    public void unsetInvoiceNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOICENO$2, 0);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public java.lang.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reason" element
     */
    public org.apache.xmlbeans.XmlString xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$4) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "reason" element
     */
    public void xsetReason(org.apache.xmlbeans.XmlString reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$4);
            }
            target.set(reason);
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$4, 0);
        }
    }
    
    /**
     * Gets the "dateOfPayment" element
     */
    public java.lang.String getDateOfPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFPAYMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfPayment" element
     */
    public org.apache.xmlbeans.XmlString xgetDateOfPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFPAYMENT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateOfPayment" element
     */
    public boolean isSetDateOfPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEOFPAYMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "dateOfPayment" element
     */
    public void setDateOfPayment(java.lang.String dateOfPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFPAYMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFPAYMENT$6);
            }
            target.setStringValue(dateOfPayment);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfPayment" element
     */
    public void xsetDateOfPayment(org.apache.xmlbeans.XmlString dateOfPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFPAYMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEOFPAYMENT$6);
            }
            target.set(dateOfPayment);
        }
    }
    
    /**
     * Unsets the "dateOfPayment" element
     */
    public void unsetDateOfPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEOFPAYMENT$6, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$8, 0);
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
            return get_store().count_elements(AMOUNT$8) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$8);
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
            get_store().remove_element(AMOUNT$8, 0);
        }
    }
}
