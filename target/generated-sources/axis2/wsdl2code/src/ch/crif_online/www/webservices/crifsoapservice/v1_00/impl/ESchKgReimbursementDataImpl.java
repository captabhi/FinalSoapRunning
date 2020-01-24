/*
 * XML Type:  ESchKgReimbursementData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ESchKgReimbursementData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgReimbursementDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgReimbursementData
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgReimbursementDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    private static final javax.xml.namespace.QName VALUTA$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "valuta");
    private static final javax.xml.namespace.QName REASON$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reason");
    
    
    /**
     * Gets the "amount" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$0, 0);
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
            return get_store().count_elements(AMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$0);
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
            get_store().remove_element(AMOUNT$0, 0);
        }
    }
    
    /**
     * Gets the "valuta" element
     */
    public java.lang.String getValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUTA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valuta" element
     */
    public org.apache.xmlbeans.XmlString xgetValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUTA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "valuta" element
     */
    public boolean isSetValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUTA$2) != 0;
        }
    }
    
    /**
     * Sets the "valuta" element
     */
    public void setValuta(java.lang.String valuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUTA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUTA$2);
            }
            target.setStringValue(valuta);
        }
    }
    
    /**
     * Sets (as xml) the "valuta" element
     */
    public void xsetValuta(org.apache.xmlbeans.XmlString valuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUTA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUTA$2);
            }
            target.set(valuta);
        }
    }
    
    /**
     * Unsets the "valuta" element
     */
    public void unsetValuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUTA$2, 0);
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
}
