/*
 * XML Type:  IdVerificationChecks
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationChecks(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationChecksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationChecksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISVALID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isValid");
    private static final javax.xml.namespace.QName ISCOMPLETE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isComplete");
    private static final javax.xml.namespace.QName ISCOMPOSITECHECKDIGITVERIFIED$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isCompositeCheckDigitVerified");
    private static final javax.xml.namespace.QName ISBIRTHDATEVERIFIED$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isBirthDateVerified");
    private static final javax.xml.namespace.QName ISEXPIRATIONDATEVERIFIED$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isExpirationDateVerified");
    private static final javax.xml.namespace.QName ISDOCUMENTNUMBERVERIFIED$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isDocumentNumberVerified");
    private static final javax.xml.namespace.QName ISISSUINGSTATEORORGANIZATIONVERIFIED$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isIssuingStateOrOrganizationVerified");
    private static final javax.xml.namespace.QName ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isNationalIdentificationNumberVerified");
    private static final javax.xml.namespace.QName ISNATIONALITYVERIFIED$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isNationalityVerified");
    
    
    /**
     * Gets the "isValid" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isValid" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISVALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "isValid" element
     */
    public boolean isSetIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALID$0) != 0;
        }
    }
    
    /**
     * Sets the "isValid" element
     */
    public void setIsValid(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALID$0);
            }
            target.setEnumValue(isValid);
        }
    }
    
    /**
     * Sets (as xml) the "isValid" element
     */
    public void xsetIsValid(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISVALID$0);
            }
            target.set(isValid);
        }
    }
    
    /**
     * Unsets the "isValid" element
     */
    public void unsetIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALID$0, 0);
        }
    }
    
    /**
     * Gets the "isComplete" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPLETE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isComplete" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISCOMPLETE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "isComplete" element
     */
    public boolean isSetIsComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCOMPLETE$2) != 0;
        }
    }
    
    /**
     * Sets the "isComplete" element
     */
    public void setIsComplete(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPLETE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCOMPLETE$2);
            }
            target.setEnumValue(isComplete);
        }
    }
    
    /**
     * Sets (as xml) the "isComplete" element
     */
    public void xsetIsComplete(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISCOMPLETE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISCOMPLETE$2);
            }
            target.set(isComplete);
        }
    }
    
    /**
     * Unsets the "isComplete" element
     */
    public void unsetIsComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCOMPLETE$2, 0);
        }
    }
    
    /**
     * Gets the "isCompositeCheckDigitVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsCompositeCheckDigitVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCompositeCheckDigitVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsCompositeCheckDigitVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "isCompositeCheckDigitVerified" element
     */
    public boolean isSetIsCompositeCheckDigitVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCOMPOSITECHECKDIGITVERIFIED$4) != 0;
        }
    }
    
    /**
     * Sets the "isCompositeCheckDigitVerified" element
     */
    public void setIsCompositeCheckDigitVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isCompositeCheckDigitVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4);
            }
            target.setEnumValue(isCompositeCheckDigitVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isCompositeCheckDigitVerified" element
     */
    public void xsetIsCompositeCheckDigitVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isCompositeCheckDigitVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISCOMPOSITECHECKDIGITVERIFIED$4);
            }
            target.set(isCompositeCheckDigitVerified);
        }
    }
    
    /**
     * Unsets the "isCompositeCheckDigitVerified" element
     */
    public void unsetIsCompositeCheckDigitVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCOMPOSITECHECKDIGITVERIFIED$4, 0);
        }
    }
    
    /**
     * Gets the "isBirthDateVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsBirthDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBIRTHDATEVERIFIED$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isBirthDateVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsBirthDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISBIRTHDATEVERIFIED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "isBirthDateVerified" element
     */
    public boolean isSetIsBirthDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBIRTHDATEVERIFIED$6) != 0;
        }
    }
    
    /**
     * Sets the "isBirthDateVerified" element
     */
    public void setIsBirthDateVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isBirthDateVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBIRTHDATEVERIFIED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBIRTHDATEVERIFIED$6);
            }
            target.setEnumValue(isBirthDateVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isBirthDateVerified" element
     */
    public void xsetIsBirthDateVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isBirthDateVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISBIRTHDATEVERIFIED$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISBIRTHDATEVERIFIED$6);
            }
            target.set(isBirthDateVerified);
        }
    }
    
    /**
     * Unsets the "isBirthDateVerified" element
     */
    public void unsetIsBirthDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBIRTHDATEVERIFIED$6, 0);
        }
    }
    
    /**
     * Gets the "isExpirationDateVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsExpirationDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEXPIRATIONDATEVERIFIED$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExpirationDateVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsExpirationDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISEXPIRATIONDATEVERIFIED$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "isExpirationDateVerified" element
     */
    public boolean isSetIsExpirationDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISEXPIRATIONDATEVERIFIED$8) != 0;
        }
    }
    
    /**
     * Sets the "isExpirationDateVerified" element
     */
    public void setIsExpirationDateVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isExpirationDateVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEXPIRATIONDATEVERIFIED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISEXPIRATIONDATEVERIFIED$8);
            }
            target.setEnumValue(isExpirationDateVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isExpirationDateVerified" element
     */
    public void xsetIsExpirationDateVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isExpirationDateVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISEXPIRATIONDATEVERIFIED$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISEXPIRATIONDATEVERIFIED$8);
            }
            target.set(isExpirationDateVerified);
        }
    }
    
    /**
     * Unsets the "isExpirationDateVerified" element
     */
    public void unsetIsExpirationDateVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISEXPIRATIONDATEVERIFIED$8, 0);
        }
    }
    
    /**
     * Gets the "isDocumentNumberVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsDocumentNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOCUMENTNUMBERVERIFIED$10, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isDocumentNumberVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsDocumentNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISDOCUMENTNUMBERVERIFIED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "isDocumentNumberVerified" element
     */
    public boolean isSetIsDocumentNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDOCUMENTNUMBERVERIFIED$10) != 0;
        }
    }
    
    /**
     * Sets the "isDocumentNumberVerified" element
     */
    public void setIsDocumentNumberVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isDocumentNumberVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDOCUMENTNUMBERVERIFIED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDOCUMENTNUMBERVERIFIED$10);
            }
            target.setEnumValue(isDocumentNumberVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isDocumentNumberVerified" element
     */
    public void xsetIsDocumentNumberVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isDocumentNumberVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISDOCUMENTNUMBERVERIFIED$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISDOCUMENTNUMBERVERIFIED$10);
            }
            target.set(isDocumentNumberVerified);
        }
    }
    
    /**
     * Unsets the "isDocumentNumberVerified" element
     */
    public void unsetIsDocumentNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDOCUMENTNUMBERVERIFIED$10, 0);
        }
    }
    
    /**
     * Gets the "isIssuingStateOrOrganizationVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsIssuingStateOrOrganizationVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIssuingStateOrOrganizationVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsIssuingStateOrOrganizationVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "isIssuingStateOrOrganizationVerified" element
     */
    public boolean isSetIsIssuingStateOrOrganizationVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISISSUINGSTATEORORGANIZATIONVERIFIED$12) != 0;
        }
    }
    
    /**
     * Sets the "isIssuingStateOrOrganizationVerified" element
     */
    public void setIsIssuingStateOrOrganizationVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isIssuingStateOrOrganizationVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12);
            }
            target.setEnumValue(isIssuingStateOrOrganizationVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isIssuingStateOrOrganizationVerified" element
     */
    public void xsetIsIssuingStateOrOrganizationVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isIssuingStateOrOrganizationVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISISSUINGSTATEORORGANIZATIONVERIFIED$12);
            }
            target.set(isIssuingStateOrOrganizationVerified);
        }
    }
    
    /**
     * Unsets the "isIssuingStateOrOrganizationVerified" element
     */
    public void unsetIsIssuingStateOrOrganizationVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISISSUINGSTATEORORGANIZATIONVERIFIED$12, 0);
        }
    }
    
    /**
     * Gets the "isNationalIdentificationNumberVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsNationalIdentificationNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNationalIdentificationNumberVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsNationalIdentificationNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "isNationalIdentificationNumberVerified" element
     */
    public boolean isSetIsNationalIdentificationNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14) != 0;
        }
    }
    
    /**
     * Sets the "isNationalIdentificationNumberVerified" element
     */
    public void setIsNationalIdentificationNumberVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isNationalIdentificationNumberVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14);
            }
            target.setEnumValue(isNationalIdentificationNumberVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isNationalIdentificationNumberVerified" element
     */
    public void xsetIsNationalIdentificationNumberVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isNationalIdentificationNumberVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14);
            }
            target.set(isNationalIdentificationNumberVerified);
        }
    }
    
    /**
     * Unsets the "isNationalIdentificationNumberVerified" element
     */
    public void unsetIsNationalIdentificationNumberVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNATIONALIDENTIFICATIONNUMBERVERIFIED$14, 0);
        }
    }
    
    /**
     * Gets the "isNationalityVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getIsNationalityVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNATIONALITYVERIFIED$16, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNationalityVerified" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetIsNationalityVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISNATIONALITYVERIFIED$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "isNationalityVerified" element
     */
    public boolean isSetIsNationalityVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISNATIONALITYVERIFIED$16) != 0;
        }
    }
    
    /**
     * Sets the "isNationalityVerified" element
     */
    public void setIsNationalityVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum isNationalityVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISNATIONALITYVERIFIED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISNATIONALITYVERIFIED$16);
            }
            target.setEnumValue(isNationalityVerified);
        }
    }
    
    /**
     * Sets (as xml) the "isNationalityVerified" element
     */
    public void xsetIsNationalityVerified(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean isNationalityVerified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(ISNATIONALITYVERIFIED$16, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(ISNATIONALITYVERIFIED$16);
            }
            target.set(isNationalityVerified);
        }
    }
    
    /**
     * Unsets the "isNationalityVerified" element
     */
    public void unsetIsNationalityVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISNATIONALITYVERIFIED$16, 0);
        }
    }
}
