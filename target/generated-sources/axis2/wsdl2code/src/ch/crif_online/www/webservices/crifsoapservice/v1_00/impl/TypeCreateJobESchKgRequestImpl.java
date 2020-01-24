/*
 * XML Type:  TypeCreateJobESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeCreateJobESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeCreateJobESchKgRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeCreateJobESchKgRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "externalId");
    private static final javax.xml.namespace.QName CASEGROUP$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "caseGroup");
    private static final javax.xml.namespace.QName CASEGROUPTYPE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "caseGroupType");
    private static final javax.xml.namespace.QName REPRESENTATIVE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "representative");
    private static final javax.xml.namespace.QName ENFORCEMENTSTATUS$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "enforcementStatus");
    private static final javax.xml.namespace.QName ADDRESS$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName LEGALFORMTYPEORIGINAL$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormTypeOriginal");
    private static final javax.xml.namespace.QName JOBDATA$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "jobData");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    
    
    /**
     * Gets the "externalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "externalId" element
     */
    public boolean isNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(EXTERNALID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.set(externalId);
        }
    }
    
    /**
     * Nils the "externalId" element
     */
    public void setNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.setNil();
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
            get_store().remove_element(EXTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "caseGroup" element
     */
    public java.lang.String getCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "caseGroup" element
     */
    public boolean isNilCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "caseGroup" element
     */
    public boolean isSetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEGROUP$2) != 0;
        }
    }
    
    /**
     * Sets the "caseGroup" element
     */
    public void setCaseGroup(java.lang.String caseGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEGROUP$2);
            }
            target.setStringValue(caseGroup);
        }
    }
    
    /**
     * Sets (as xml) the "caseGroup" element
     */
    public void xsetCaseGroup(org.apache.xmlbeans.XmlString caseGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUP$2);
            }
            target.set(caseGroup);
        }
    }
    
    /**
     * Nils the "caseGroup" element
     */
    public void setNilCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUP$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "caseGroup" element
     */
    public void unsetCaseGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEGROUP$2, 0);
        }
    }
    
    /**
     * Gets the "caseGroupType" element
     */
    public java.lang.String getCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseGroupType" element
     */
    public org.apache.xmlbeans.XmlString xgetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "caseGroupType" element
     */
    public boolean isNilCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "caseGroupType" element
     */
    public boolean isSetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEGROUPTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "caseGroupType" element
     */
    public void setCaseGroupType(java.lang.String caseGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEGROUPTYPE$4);
            }
            target.setStringValue(caseGroupType);
        }
    }
    
    /**
     * Sets (as xml) the "caseGroupType" element
     */
    public void xsetCaseGroupType(org.apache.xmlbeans.XmlString caseGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUPTYPE$4);
            }
            target.set(caseGroupType);
        }
    }
    
    /**
     * Nils the "caseGroupType" element
     */
    public void setNilCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEGROUPTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEGROUPTYPE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "caseGroupType" element
     */
    public void unsetCaseGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEGROUPTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "representative" element
     */
    public java.lang.String getRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIVE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representative" element
     */
    public org.apache.xmlbeans.XmlString xgetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "representative" element
     */
    public boolean isNilRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "representative" element
     */
    public boolean isSetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIVE$6) != 0;
        }
    }
    
    /**
     * Sets the "representative" element
     */
    public void setRepresentative(java.lang.String representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPRESENTATIVE$6);
            }
            target.setStringValue(representative);
        }
    }
    
    /**
     * Sets (as xml) the "representative" element
     */
    public void xsetRepresentative(org.apache.xmlbeans.XmlString representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPRESENTATIVE$6);
            }
            target.set(representative);
        }
    }
    
    /**
     * Nils the "representative" element
     */
    public void setNilRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPRESENTATIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPRESENTATIVE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "representative" element
     */
    public void unsetRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIVE$6, 0);
        }
    }
    
    /**
     * Gets the "enforcementStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.Enum getEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "enforcementStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus xgetEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "enforcementStatus" element
     */
    public boolean isNilEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "enforcementStatus" element
     */
    public boolean isSetEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENFORCEMENTSTATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "enforcementStatus" element
     */
    public void setEnforcementStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus.Enum enforcementStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENFORCEMENTSTATUS$8);
            }
            target.setEnumValue(enforcementStatus);
        }
    }
    
    /**
     * Sets (as xml) the "enforcementStatus" element
     */
    public void xsetEnforcementStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus enforcementStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().add_element_user(ENFORCEMENTSTATUS$8);
            }
            target.set(enforcementStatus);
        }
    }
    
    /**
     * Nils the "enforcementStatus" element
     */
    public void setNilEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().add_element_user(ENFORCEMENTSTATUS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "enforcementStatus" element
     */
    public void unsetEnforcementStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENFORCEMENTSTATUS$8, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "address" element
     */
    public boolean isNilAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$10);
            return target;
        }
    }
    
    /**
     * Nils the "address" element
     */
    public void setNilAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    public java.lang.String getLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "legalFormTypeOriginal" element
     */
    public boolean isNilLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    public boolean isSetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALFORMTYPEORIGINAL$12) != 0;
        }
    }
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    public void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTYPEORIGINAL$12);
            }
            target.setStringValue(legalFormTypeOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    public void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTYPEORIGINAL$12);
            }
            target.set(legalFormTypeOriginal);
        }
    }
    
    /**
     * Nils the "legalFormTypeOriginal" element
     */
    public void setNilLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTYPEORIGINAL$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    public void unsetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALFORMTYPEORIGINAL$12, 0);
        }
    }
    
    /**
     * Gets the "jobData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData getJobData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData)get_store().find_element_user(JOBDATA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "jobData" element
     */
    public boolean isNilJobData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData)get_store().find_element_user(JOBDATA$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "jobData" element
     */
    public void setJobData(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData jobData)
    {
        generatedSetterHelperImpl(jobData, JOBDATA$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jobData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData addNewJobData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData)get_store().add_element_user(JOBDATA$14);
            return target;
        }
    }
    
    /**
     * Nils the "jobData" element
     */
    public void setNilJobData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData)get_store().find_element_user(JOBDATA$14, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobData)get_store().add_element_user(JOBDATA$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets array of all "additionalInput" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALINPUT$16, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalInput" element
     */
    public int sizeOfAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINPUT$16);
        }
    }
    
    /**
     * Sets array of all "additionalInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalInputArray, ADDITIONALINPUT$16);
    }
    
    /**
     * Sets ith "additionalInput" element
     */
    public void setAdditionalInputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALINPUT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALINPUT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalInput" element
     */
    public void removeAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINPUT$16, i);
        }
    }
}
