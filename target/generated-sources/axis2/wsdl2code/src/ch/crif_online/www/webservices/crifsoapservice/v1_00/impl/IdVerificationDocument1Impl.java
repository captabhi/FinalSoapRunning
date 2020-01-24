/*
 * XML Type:  IdVerificationDocument
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationDocument(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentNumber");
    private static final javax.xml.namespace.QName DOCUMENTTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentType");
    private static final javax.xml.namespace.QName DOCUMENTDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentDescription");
    private static final javax.xml.namespace.QName ISSUINGSTATEORORGANIZATION$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "issuingStateOrOrganization");
    private static final javax.xml.namespace.QName ISSUINGDATE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "issuingDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "expirationDate");
    private static final javax.xml.namespace.QName VALIDITYFROMDATE$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "validityFromDate");
    private static final javax.xml.namespace.QName SIGNDATE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "signDate");
    private static final javax.xml.namespace.QName MRZ1$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "mrz1");
    private static final javax.xml.namespace.QName MRZ2$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "mrz2");
    private static final javax.xml.namespace.QName MRZ3$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "mrz3");
    
    
    /**
     * Gets the "documentNumber" element
     */
    public java.lang.String getDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentNumber" element
     */
    public boolean isSetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "documentNumber" element
     */
    public void setDocumentNumber(java.lang.String documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$0);
            }
            target.setStringValue(documentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "documentNumber" element
     */
    public void xsetDocumentNumber(org.apache.xmlbeans.XmlString documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTNUMBER$0);
            }
            target.set(documentNumber);
        }
    }
    
    /**
     * Unsets the "documentNumber" element
     */
    public void unsetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "documentType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum getDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType xgetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().find_element_user(DOCUMENTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentType" element
     */
    public boolean isSetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "documentType" element
     */
    public void setDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTTYPE$2);
            }
            target.setEnumValue(documentType);
        }
    }
    
    /**
     * Sets (as xml) the "documentType" element
     */
    public void xsetDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().find_element_user(DOCUMENTTYPE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().add_element_user(DOCUMENTTYPE$2);
            }
            target.set(documentType);
        }
    }
    
    /**
     * Unsets the "documentType" element
     */
    public void unsetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "documentDescription" element
     */
    public java.lang.String getDocumentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentDescription" element
     */
    public boolean isSetDocumentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "documentDescription" element
     */
    public void setDocumentDescription(java.lang.String documentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTDESCRIPTION$4);
            }
            target.setStringValue(documentDescription);
        }
    }
    
    /**
     * Sets (as xml) the "documentDescription" element
     */
    public void xsetDocumentDescription(org.apache.xmlbeans.XmlString documentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTDESCRIPTION$4);
            }
            target.set(documentDescription);
        }
    }
    
    /**
     * Unsets the "documentDescription" element
     */
    public void unsetDocumentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "issuingStateOrOrganization" element
     */
    public java.lang.String getIssuingStateOrOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGSTATEORORGANIZATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issuingStateOrOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetIssuingStateOrOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUINGSTATEORORGANIZATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "issuingStateOrOrganization" element
     */
    public boolean isSetIssuingStateOrOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUINGSTATEORORGANIZATION$6) != 0;
        }
    }
    
    /**
     * Sets the "issuingStateOrOrganization" element
     */
    public void setIssuingStateOrOrganization(java.lang.String issuingStateOrOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGSTATEORORGANIZATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUINGSTATEORORGANIZATION$6);
            }
            target.setStringValue(issuingStateOrOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "issuingStateOrOrganization" element
     */
    public void xsetIssuingStateOrOrganization(org.apache.xmlbeans.XmlString issuingStateOrOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUINGSTATEORORGANIZATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUINGSTATEORORGANIZATION$6);
            }
            target.set(issuingStateOrOrganization);
        }
    }
    
    /**
     * Unsets the "issuingStateOrOrganization" element
     */
    public void unsetIssuingStateOrOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUINGSTATEORORGANIZATION$6, 0);
        }
    }
    
    /**
     * Gets the "issuingDate" element
     */
    public java.lang.String getIssuingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issuingDate" element
     */
    public org.apache.xmlbeans.XmlString xgetIssuingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUINGDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "issuingDate" element
     */
    public boolean isSetIssuingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUINGDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "issuingDate" element
     */
    public void setIssuingDate(java.lang.String issuingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUINGDATE$8);
            }
            target.setStringValue(issuingDate);
        }
    }
    
    /**
     * Sets (as xml) the "issuingDate" element
     */
    public void xsetIssuingDate(org.apache.xmlbeans.XmlString issuingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUINGDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUINGDATE$8);
            }
            target.set(issuingDate);
        }
    }
    
    /**
     * Unsets the "issuingDate" element
     */
    public void unsetIssuingDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUINGDATE$8, 0);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public java.lang.String getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "expirationDate" element
     */
    public boolean isSetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(java.lang.String expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$10);
            }
            target.setStringValue(expirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$10);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Unsets the "expirationDate" element
     */
    public void unsetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATE$10, 0);
        }
    }
    
    /**
     * Gets the "validityFromDate" element
     */
    public java.lang.String getValidityFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDITYFROMDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "validityFromDate" element
     */
    public org.apache.xmlbeans.XmlString xgetValidityFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDITYFROMDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "validityFromDate" element
     */
    public boolean isSetValidityFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDITYFROMDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "validityFromDate" element
     */
    public void setValidityFromDate(java.lang.String validityFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDITYFROMDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDITYFROMDATE$12);
            }
            target.setStringValue(validityFromDate);
        }
    }
    
    /**
     * Sets (as xml) the "validityFromDate" element
     */
    public void xsetValidityFromDate(org.apache.xmlbeans.XmlString validityFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDITYFROMDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDITYFROMDATE$12);
            }
            target.set(validityFromDate);
        }
    }
    
    /**
     * Unsets the "validityFromDate" element
     */
    public void unsetValidityFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDITYFROMDATE$12, 0);
        }
    }
    
    /**
     * Gets the "signDate" element
     */
    public java.lang.String getSignDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "signDate" element
     */
    public org.apache.xmlbeans.XmlString xgetSignDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNDATE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "signDate" element
     */
    public boolean isSetSignDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNDATE$14) != 0;
        }
    }
    
    /**
     * Sets the "signDate" element
     */
    public void setSignDate(java.lang.String signDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNDATE$14);
            }
            target.setStringValue(signDate);
        }
    }
    
    /**
     * Sets (as xml) the "signDate" element
     */
    public void xsetSignDate(org.apache.xmlbeans.XmlString signDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNDATE$14);
            }
            target.set(signDate);
        }
    }
    
    /**
     * Unsets the "signDate" element
     */
    public void unsetSignDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNDATE$14, 0);
        }
    }
    
    /**
     * Gets the "mrz1" element
     */
    public java.lang.String getMrz1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ1$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mrz1" element
     */
    public org.apache.xmlbeans.XmlString xgetMrz1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ1$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "mrz1" element
     */
    public boolean isSetMrz1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRZ1$16) != 0;
        }
    }
    
    /**
     * Sets the "mrz1" element
     */
    public void setMrz1(java.lang.String mrz1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ1$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRZ1$16);
            }
            target.setStringValue(mrz1);
        }
    }
    
    /**
     * Sets (as xml) the "mrz1" element
     */
    public void xsetMrz1(org.apache.xmlbeans.XmlString mrz1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ1$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MRZ1$16);
            }
            target.set(mrz1);
        }
    }
    
    /**
     * Unsets the "mrz1" element
     */
    public void unsetMrz1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRZ1$16, 0);
        }
    }
    
    /**
     * Gets the "mrz2" element
     */
    public java.lang.String getMrz2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ2$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mrz2" element
     */
    public org.apache.xmlbeans.XmlString xgetMrz2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ2$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "mrz2" element
     */
    public boolean isSetMrz2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRZ2$18) != 0;
        }
    }
    
    /**
     * Sets the "mrz2" element
     */
    public void setMrz2(java.lang.String mrz2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ2$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRZ2$18);
            }
            target.setStringValue(mrz2);
        }
    }
    
    /**
     * Sets (as xml) the "mrz2" element
     */
    public void xsetMrz2(org.apache.xmlbeans.XmlString mrz2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ2$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MRZ2$18);
            }
            target.set(mrz2);
        }
    }
    
    /**
     * Unsets the "mrz2" element
     */
    public void unsetMrz2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRZ2$18, 0);
        }
    }
    
    /**
     * Gets the "mrz3" element
     */
    public java.lang.String getMrz3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ3$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mrz3" element
     */
    public org.apache.xmlbeans.XmlString xgetMrz3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ3$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "mrz3" element
     */
    public boolean isSetMrz3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRZ3$20) != 0;
        }
    }
    
    /**
     * Sets the "mrz3" element
     */
    public void setMrz3(java.lang.String mrz3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZ3$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRZ3$20);
            }
            target.setStringValue(mrz3);
        }
    }
    
    /**
     * Sets (as xml) the "mrz3" element
     */
    public void xsetMrz3(org.apache.xmlbeans.XmlString mrz3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZ3$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MRZ3$20);
            }
            target.set(mrz3);
        }
    }
    
    /**
     * Unsets the "mrz3" element
     */
    public void unsetMrz3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRZ3$20, 0);
        }
    }
}
