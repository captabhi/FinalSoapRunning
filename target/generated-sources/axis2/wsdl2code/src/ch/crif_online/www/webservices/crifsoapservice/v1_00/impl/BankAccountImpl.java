/*
 * XML Type:  BankAccount
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML BankAccount(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class BankAccountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.BankAccount
{
    private static final long serialVersionUID = 1L;
    
    public BankAccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANK$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "bank");
    private static final javax.xml.namespace.QName BANKDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "bankDescription");
    private static final javax.xml.namespace.QName LOCALACCOUNTNR$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "localAccountNr");
    private static final javax.xml.namespace.QName IBAN$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "iban");
    private static final javax.xml.namespace.QName SWIFTCODE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "swiftCode");
    private static final javax.xml.namespace.QName CURRENCY$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "currency");
    
    
    /**
     * Gets the "bank" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription getBank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().find_element_user(BANK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bank" element
     */
    public boolean isSetBank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANK$0) != 0;
        }
    }
    
    /**
     * Sets the "bank" element
     */
    public void setBank(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription bank)
    {
        generatedSetterHelperImpl(bank, BANK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bank" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription addNewBank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyAddressDescription)get_store().add_element_user(BANK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bank" element
     */
    public void unsetBank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANK$0, 0);
        }
    }
    
    /**
     * Gets the "bankDescription" element
     */
    public java.lang.String getBankDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bankDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetBankDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "bankDescription" element
     */
    public boolean isSetBankDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANKDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "bankDescription" element
     */
    public void setBankDescription(java.lang.String bankDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BANKDESCRIPTION$2);
            }
            target.setStringValue(bankDescription);
        }
    }
    
    /**
     * Sets (as xml) the "bankDescription" element
     */
    public void xsetBankDescription(org.apache.xmlbeans.XmlString bankDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BANKDESCRIPTION$2);
            }
            target.set(bankDescription);
        }
    }
    
    /**
     * Unsets the "bankDescription" element
     */
    public void unsetBankDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANKDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "localAccountNr" element
     */
    public java.lang.String getLocalAccountNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALACCOUNTNR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "localAccountNr" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalAccountNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALACCOUNTNR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "localAccountNr" element
     */
    public boolean isSetLocalAccountNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALACCOUNTNR$4) != 0;
        }
    }
    
    /**
     * Sets the "localAccountNr" element
     */
    public void setLocalAccountNr(java.lang.String localAccountNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALACCOUNTNR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALACCOUNTNR$4);
            }
            target.setStringValue(localAccountNr);
        }
    }
    
    /**
     * Sets (as xml) the "localAccountNr" element
     */
    public void xsetLocalAccountNr(org.apache.xmlbeans.XmlString localAccountNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALACCOUNTNR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALACCOUNTNR$4);
            }
            target.set(localAccountNr);
        }
    }
    
    /**
     * Unsets the "localAccountNr" element
     */
    public void unsetLocalAccountNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALACCOUNTNR$4, 0);
        }
    }
    
    /**
     * Gets the "iban" element
     */
    public java.lang.String getIban()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IBAN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iban" element
     */
    public org.apache.xmlbeans.XmlString xgetIban()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IBAN$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "iban" element
     */
    public boolean isSetIban()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IBAN$6) != 0;
        }
    }
    
    /**
     * Sets the "iban" element
     */
    public void setIban(java.lang.String iban)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IBAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IBAN$6);
            }
            target.setStringValue(iban);
        }
    }
    
    /**
     * Sets (as xml) the "iban" element
     */
    public void xsetIban(org.apache.xmlbeans.XmlString iban)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IBAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IBAN$6);
            }
            target.set(iban);
        }
    }
    
    /**
     * Unsets the "iban" element
     */
    public void unsetIban()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IBAN$6, 0);
        }
    }
    
    /**
     * Gets the "swiftCode" element
     */
    public java.lang.String getSwiftCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "swiftCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSwiftCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "swiftCode" element
     */
    public boolean isSetSwiftCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SWIFTCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "swiftCode" element
     */
    public void setSwiftCode(java.lang.String swiftCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIFTCODE$8);
            }
            target.setStringValue(swiftCode);
        }
    }
    
    /**
     * Sets (as xml) the "swiftCode" element
     */
    public void xsetSwiftCode(org.apache.xmlbeans.XmlString swiftCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIFTCODE$8);
            }
            target.set(swiftCode);
        }
    }
    
    /**
     * Unsets the "swiftCode" element
     */
    public void unsetSwiftCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SWIFTCODE$8, 0);
        }
    }
    
    /**
     * Gets the "currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$10) != 0;
        }
    }
    
    /**
     * Sets the "currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$10);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$10);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$10, 0);
        }
    }
}
