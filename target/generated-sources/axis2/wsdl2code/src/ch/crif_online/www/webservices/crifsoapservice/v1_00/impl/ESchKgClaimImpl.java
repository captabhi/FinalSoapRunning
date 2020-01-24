/*
 * XML Type:  ESchKgClaim
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ESchKgClaim(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgClaimImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgClaimImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLAIMID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "claimId");
    private static final javax.xml.namespace.QName EXTERNALID$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "externalId");
    private static final javax.xml.namespace.QName INVOICENO$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "invoiceNo");
    private static final javax.xml.namespace.QName REASON$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reason");
    private static final javax.xml.namespace.QName DATEOFCLAIM$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "dateOfClaim");
    private static final javax.xml.namespace.QName AMOUNT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    private static final javax.xml.namespace.QName TIMELIMIT$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "timeLimit");
    private static final javax.xml.namespace.QName INTERESTRATE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "interestRate");
    private static final javax.xml.namespace.QName TYPE$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "type");
    private static final javax.xml.namespace.QName JOBID$18 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "jobId");
    private static final javax.xml.namespace.QName COLLOCATION$20 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "collocation");
    
    
    /**
     * Gets the "claimId" element
     */
    public java.lang.String getClaimId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "claimId" element
     */
    public org.apache.xmlbeans.XmlString xgetClaimId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAIMID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "claimId" element
     */
    public boolean isSetClaimId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLAIMID$0) != 0;
        }
    }
    
    /**
     * Sets the "claimId" element
     */
    public void setClaimId(java.lang.String claimId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAIMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAIMID$0);
            }
            target.setStringValue(claimId);
        }
    }
    
    /**
     * Sets (as xml) the "claimId" element
     */
    public void xsetClaimId(org.apache.xmlbeans.XmlString claimId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAIMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLAIMID$0);
            }
            target.set(claimId);
        }
    }
    
    /**
     * Unsets the "claimId" element
     */
    public void unsetClaimId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLAIMID$0, 0);
        }
    }
    
    /**
     * Gets the "externalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalId" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "externalId" element
     */
    public boolean isSetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALID$2) != 0;
        }
    }
    
    /**
     * Sets the "externalId" element
     */
    public void setExternalId(java.lang.String externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$2);
            }
            target.setStringValue(externalId);
        }
    }
    
    /**
     * Sets (as xml) the "externalId" element
     */
    public void xsetExternalId(org.apache.xmlbeans.XmlString externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$2);
            }
            target.set(externalId);
        }
    }
    
    /**
     * Unsets the "externalId" element
     */
    public void unsetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICENO$4, 0);
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
            return get_store().count_elements(INVOICENO$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICENO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICENO$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICENO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVOICENO$4);
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
            get_store().remove_element(INVOICENO$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$6, 0);
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
            return get_store().count_elements(REASON$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$6);
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
            get_store().remove_element(REASON$6, 0);
        }
    }
    
    /**
     * Gets the "dateOfClaim" element
     */
    public java.lang.String getDateOfClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFCLAIM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfClaim" element
     */
    public org.apache.xmlbeans.XmlString xgetDateOfClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFCLAIM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateOfClaim" element
     */
    public boolean isSetDateOfClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEOFCLAIM$8) != 0;
        }
    }
    
    /**
     * Sets the "dateOfClaim" element
     */
    public void setDateOfClaim(java.lang.String dateOfClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFCLAIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFCLAIM$8);
            }
            target.setStringValue(dateOfClaim);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfClaim" element
     */
    public void xsetDateOfClaim(org.apache.xmlbeans.XmlString dateOfClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFCLAIM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEOFCLAIM$8);
            }
            target.set(dateOfClaim);
        }
    }
    
    /**
     * Unsets the "dateOfClaim" element
     */
    public void unsetDateOfClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEOFCLAIM$8, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$10, 0);
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
            return get_store().count_elements(AMOUNT$10) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$10);
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
            get_store().remove_element(AMOUNT$10, 0);
        }
    }
    
    /**
     * Gets the "timeLimit" element
     */
    public java.math.BigInteger getTimeLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMELIMIT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeLimit" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTimeLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TIMELIMIT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeLimit" element
     */
    public boolean isSetTimeLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMELIMIT$12) != 0;
        }
    }
    
    /**
     * Sets the "timeLimit" element
     */
    public void setTimeLimit(java.math.BigInteger timeLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMELIMIT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMELIMIT$12);
            }
            target.setBigIntegerValue(timeLimit);
        }
    }
    
    /**
     * Sets (as xml) the "timeLimit" element
     */
    public void xsetTimeLimit(org.apache.xmlbeans.XmlInteger timeLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TIMELIMIT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TIMELIMIT$12);
            }
            target.set(timeLimit);
        }
    }
    
    /**
     * Unsets the "timeLimit" element
     */
    public void unsetTimeLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMELIMIT$12, 0);
        }
    }
    
    /**
     * Gets the "interestRate" element
     */
    public double getInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTRATE$14, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "interestRate" element
     */
    public org.apache.xmlbeans.XmlDouble xgetInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESTRATE$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "interestRate" element
     */
    public boolean isNilInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESTRATE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "interestRate" element
     */
    public boolean isSetInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTRATE$14) != 0;
        }
    }
    
    /**
     * Sets the "interestRate" element
     */
    public void setInterestRate(double interestRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTRATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTRATE$14);
            }
            target.setDoubleValue(interestRate);
        }
    }
    
    /**
     * Sets (as xml) the "interestRate" element
     */
    public void xsetInterestRate(org.apache.xmlbeans.XmlDouble interestRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESTRATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERESTRATE$14);
            }
            target.set(interestRate);
        }
    }
    
    /**
     * Nils the "interestRate" element
     */
    public void setNilInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INTERESTRATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INTERESTRATE$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "interestRate" element
     */
    public void unsetInterestRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTRATE$14, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().find_element_user(TYPE$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "type" element
     */
    public boolean isNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().find_element_user(TYPE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$16);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().find_element_user(TYPE$16, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().add_element_user(TYPE$16);
            }
            target.set(type);
        }
    }
    
    /**
     * Nils the "type" element
     */
    public void setNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().find_element_user(TYPE$16, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimType)get_store().add_element_user(TYPE$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$16, 0);
        }
    }
    
    /**
     * Gets the "jobId" element
     */
    public java.math.BigInteger getJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(JOBID$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "jobId" element
     */
    public void setJobId(java.math.BigInteger jobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBID$18);
            }
            target.setBigIntegerValue(jobId);
        }
    }
    
    /**
     * Sets (as xml) the "jobId" element
     */
    public void xsetJobId(org.apache.xmlbeans.XmlInteger jobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(JOBID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(JOBID$18);
            }
            target.set(jobId);
        }
    }
    
    /**
     * Gets the "collocation" element
     */
    public java.math.BigInteger getCollocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLOCATION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "collocation" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCollocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COLLOCATION$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "collocation" element
     */
    public void setCollocation(java.math.BigInteger collocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLOCATION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLOCATION$20);
            }
            target.setBigIntegerValue(collocation);
        }
    }
    
    /**
     * Sets (as xml) the "collocation" element
     */
    public void xsetCollocation(org.apache.xmlbeans.XmlInteger collocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COLLOCATION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COLLOCATION$20);
            }
            target.set(collocation);
        }
    }
}
