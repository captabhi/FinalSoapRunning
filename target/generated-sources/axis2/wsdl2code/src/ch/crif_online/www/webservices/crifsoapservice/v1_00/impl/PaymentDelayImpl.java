/*
 * XML Type:  PaymentDelay
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML PaymentDelay(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class PaymentDelayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentDelay
{
    private static final long serialVersionUID = 1L;
    
    public PaymentDelayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTIMERATIO$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "inTimeRatio");
    private static final javax.xml.namespace.QName AVGDELAYSHORTTERM$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "avgDelayShortTerm");
    private static final javax.xml.namespace.QName AVGDELAYLONGTERM$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "avgDelayLongTerm");
    private static final javax.xml.namespace.QName PAYMENTTYPE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentType");
    private static final javax.xml.namespace.QName PAYMENTEXPECTEDTYPE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "paymentExpectedType");
    
    
    /**
     * Gets the "inTimeRatio" element
     */
    public java.math.BigDecimal getInTimeRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTIMERATIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "inTimeRatio" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetInTimeRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INTIMERATIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "inTimeRatio" element
     */
    public boolean isSetInTimeRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTIMERATIO$0) != 0;
        }
    }
    
    /**
     * Sets the "inTimeRatio" element
     */
    public void setInTimeRatio(java.math.BigDecimal inTimeRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTIMERATIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTIMERATIO$0);
            }
            target.setBigDecimalValue(inTimeRatio);
        }
    }
    
    /**
     * Sets (as xml) the "inTimeRatio" element
     */
    public void xsetInTimeRatio(org.apache.xmlbeans.XmlDecimal inTimeRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(INTIMERATIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(INTIMERATIO$0);
            }
            target.set(inTimeRatio);
        }
    }
    
    /**
     * Unsets the "inTimeRatio" element
     */
    public void unsetInTimeRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTIMERATIO$0, 0);
        }
    }
    
    /**
     * Gets the "avgDelayShortTerm" element
     */
    public java.math.BigInteger getAvgDelayShortTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVGDELAYSHORTTERM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "avgDelayShortTerm" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAvgDelayShortTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVGDELAYSHORTTERM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "avgDelayShortTerm" element
     */
    public boolean isSetAvgDelayShortTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVGDELAYSHORTTERM$2) != 0;
        }
    }
    
    /**
     * Sets the "avgDelayShortTerm" element
     */
    public void setAvgDelayShortTerm(java.math.BigInteger avgDelayShortTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVGDELAYSHORTTERM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVGDELAYSHORTTERM$2);
            }
            target.setBigIntegerValue(avgDelayShortTerm);
        }
    }
    
    /**
     * Sets (as xml) the "avgDelayShortTerm" element
     */
    public void xsetAvgDelayShortTerm(org.apache.xmlbeans.XmlInteger avgDelayShortTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVGDELAYSHORTTERM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVGDELAYSHORTTERM$2);
            }
            target.set(avgDelayShortTerm);
        }
    }
    
    /**
     * Unsets the "avgDelayShortTerm" element
     */
    public void unsetAvgDelayShortTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVGDELAYSHORTTERM$2, 0);
        }
    }
    
    /**
     * Gets the "avgDelayLongTerm" element
     */
    public java.math.BigInteger getAvgDelayLongTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVGDELAYLONGTERM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "avgDelayLongTerm" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAvgDelayLongTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVGDELAYLONGTERM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "avgDelayLongTerm" element
     */
    public boolean isSetAvgDelayLongTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVGDELAYLONGTERM$4) != 0;
        }
    }
    
    /**
     * Sets the "avgDelayLongTerm" element
     */
    public void setAvgDelayLongTerm(java.math.BigInteger avgDelayLongTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVGDELAYLONGTERM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVGDELAYLONGTERM$4);
            }
            target.setBigIntegerValue(avgDelayLongTerm);
        }
    }
    
    /**
     * Sets (as xml) the "avgDelayLongTerm" element
     */
    public void xsetAvgDelayLongTerm(org.apache.xmlbeans.XmlInteger avgDelayLongTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVGDELAYLONGTERM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVGDELAYLONGTERM$4);
            }
            target.set(avgDelayLongTerm);
        }
    }
    
    /**
     * Unsets the "avgDelayLongTerm" element
     */
    public void unsetAvgDelayLongTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVGDELAYLONGTERM$4, 0);
        }
    }
    
    /**
     * Gets the "paymentType" element
     */
    public java.lang.String getPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentType" element
     */
    public org.apache.xmlbeans.XmlString xgetPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "paymentType" element
     */
    public boolean isSetPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "paymentType" element
     */
    public void setPaymentType(java.lang.String paymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTTYPE$6);
            }
            target.setStringValue(paymentType);
        }
    }
    
    /**
     * Sets (as xml) the "paymentType" element
     */
    public void xsetPaymentType(org.apache.xmlbeans.XmlString paymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAYMENTTYPE$6);
            }
            target.set(paymentType);
        }
    }
    
    /**
     * Unsets the "paymentType" element
     */
    public void unsetPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "paymentExpectedType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType.Enum getPaymentExpectedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTEXPECTEDTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentExpectedType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType xgetPaymentExpectedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType)get_store().find_element_user(PAYMENTEXPECTEDTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "paymentExpectedType" element
     */
    public boolean isSetPaymentExpectedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTEXPECTEDTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "paymentExpectedType" element
     */
    public void setPaymentExpectedType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType.Enum paymentExpectedType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTEXPECTEDTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTEXPECTEDTYPE$8);
            }
            target.setEnumValue(paymentExpectedType);
        }
    }
    
    /**
     * Sets (as xml) the "paymentExpectedType" element
     */
    public void xsetPaymentExpectedType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType paymentExpectedType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType)get_store().find_element_user(PAYMENTEXPECTEDTYPE$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentExpectedType)get_store().add_element_user(PAYMENTEXPECTEDTYPE$8);
            }
            target.set(paymentExpectedType);
        }
    }
    
    /**
     * Unsets the "paymentExpectedType" element
     */
    public void unsetPaymentExpectedType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTEXPECTEDTYPE$8, 0);
        }
    }
}
