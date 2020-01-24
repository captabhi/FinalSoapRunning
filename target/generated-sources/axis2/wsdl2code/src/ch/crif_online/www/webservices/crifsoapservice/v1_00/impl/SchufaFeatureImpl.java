/*
 * XML Type:  SchufaFeature
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaFeature(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaFeatureImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.SchufaBaseFeatureImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaFeature
{
    private static final long serialVersionUID = 1L;
    
    public SchufaFeatureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "date");
    private static final javax.xml.namespace.QName ACCOUNTNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "accountNumber");
    private static final javax.xml.namespace.QName AMOUNT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    private static final javax.xml.namespace.QName NUMBEROFINSTALLMENTS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "numberOfInstallments");
    private static final javax.xml.namespace.QName INSTALLMENTTYPE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "installmentType");
    
    
    /**
     * Gets the "date" element
     */
    public java.lang.String getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlString xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$0) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.lang.String date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
            }
            target.setStringValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlString date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$0, 0);
        }
    }
    
    /**
     * Gets the "accountNumber" element
     */
    public java.lang.String getAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accountNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "accountNumber" element
     */
    public boolean isSetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "accountNumber" element
     */
    public void setAccountNumber(java.lang.String accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNUMBER$2);
            }
            target.setStringValue(accountNumber);
        }
    }
    
    /**
     * Sets (as xml) the "accountNumber" element
     */
    public void xsetAccountNumber(org.apache.xmlbeans.XmlString accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTNUMBER$2);
            }
            target.set(accountNumber);
        }
    }
    
    /**
     * Unsets the "accountNumber" element
     */
    public void unsetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTNUMBER$2, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$4, 0);
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
            return get_store().count_elements(AMOUNT$4) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$4);
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
            get_store().remove_element(AMOUNT$4, 0);
        }
    }
    
    /**
     * Gets the "numberOfInstallments" element
     */
    public java.math.BigInteger getNumberOfInstallments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFINSTALLMENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfInstallments" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNumberOfInstallments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFINSTALLMENTS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberOfInstallments" element
     */
    public boolean isSetNumberOfInstallments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFINSTALLMENTS$6) != 0;
        }
    }
    
    /**
     * Sets the "numberOfInstallments" element
     */
    public void setNumberOfInstallments(java.math.BigInteger numberOfInstallments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFINSTALLMENTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFINSTALLMENTS$6);
            }
            target.setBigIntegerValue(numberOfInstallments);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfInstallments" element
     */
    public void xsetNumberOfInstallments(org.apache.xmlbeans.XmlInteger numberOfInstallments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBEROFINSTALLMENTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMBEROFINSTALLMENTS$6);
            }
            target.set(numberOfInstallments);
        }
    }
    
    /**
     * Unsets the "numberOfInstallments" element
     */
    public void unsetNumberOfInstallments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFINSTALLMENTS$6, 0);
        }
    }
    
    /**
     * Gets the "installmentType" element
     */
    public java.math.BigInteger getInstallmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTALLMENTTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "installmentType" element
     */
    public org.apache.xmlbeans.XmlInteger xgetInstallmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INSTALLMENTTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "installmentType" element
     */
    public boolean isSetInstallmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTALLMENTTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "installmentType" element
     */
    public void setInstallmentType(java.math.BigInteger installmentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTALLMENTTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTALLMENTTYPE$8);
            }
            target.setBigIntegerValue(installmentType);
        }
    }
    
    /**
     * Sets (as xml) the "installmentType" element
     */
    public void xsetInstallmentType(org.apache.xmlbeans.XmlInteger installmentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INSTALLMENTTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INSTALLMENTTYPE$8);
            }
            target.set(installmentType);
        }
    }
    
    /**
     * Unsets the "installmentType" element
     */
    public void unsetInstallmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTALLMENTTYPE$8, 0);
        }
    }
}
