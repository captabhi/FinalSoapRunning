/*
 * XML Type:  ComplianceMatchInformation
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ComplianceMatchInformation(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ComplianceMatchInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceMatchInformation
{
    private static final long serialVersionUID = 1L;
    
    public ComplianceMatchInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIDENCENAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "confidenceName");
    private static final javax.xml.namespace.QName CONFIDENCEBIRTHDATE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "confidenceBirthdate");
    private static final javax.xml.namespace.QName MATCHEDNAME$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "matchedName");
    private static final javax.xml.namespace.QName MATCHEDBIRTHDATE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "matchedBirthdate");
    
    
    /**
     * Gets the "confidenceName" element
     */
    public int getConfidenceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENCENAME$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "confidenceName" element
     */
    public org.apache.xmlbeans.XmlInt xgetConfidenceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONFIDENCENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "confidenceName" element
     */
    public void setConfidenceName(int confidenceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIDENCENAME$0);
            }
            target.setIntValue(confidenceName);
        }
    }
    
    /**
     * Sets (as xml) the "confidenceName" element
     */
    public void xsetConfidenceName(org.apache.xmlbeans.XmlInt confidenceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONFIDENCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONFIDENCENAME$0);
            }
            target.set(confidenceName);
        }
    }
    
    /**
     * Gets the "confidenceBirthdate" element
     */
    public int getConfidenceBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENCEBIRTHDATE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "confidenceBirthdate" element
     */
    public org.apache.xmlbeans.XmlInt xgetConfidenceBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONFIDENCEBIRTHDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "confidenceBirthdate" element
     */
    public void setConfidenceBirthdate(int confidenceBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENCEBIRTHDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIDENCEBIRTHDATE$2);
            }
            target.setIntValue(confidenceBirthdate);
        }
    }
    
    /**
     * Sets (as xml) the "confidenceBirthdate" element
     */
    public void xsetConfidenceBirthdate(org.apache.xmlbeans.XmlInt confidenceBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONFIDENCEBIRTHDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONFIDENCEBIRTHDATE$2);
            }
            target.set(confidenceBirthdate);
        }
    }
    
    /**
     * Gets the "matchedName" element
     */
    public java.lang.String getMatchedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHEDNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matchedName" element
     */
    public org.apache.xmlbeans.XmlString xgetMatchedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHEDNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "matchedName" element
     */
    public boolean isSetMatchedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHEDNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "matchedName" element
     */
    public void setMatchedName(java.lang.String matchedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHEDNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHEDNAME$4);
            }
            target.setStringValue(matchedName);
        }
    }
    
    /**
     * Sets (as xml) the "matchedName" element
     */
    public void xsetMatchedName(org.apache.xmlbeans.XmlString matchedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHEDNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCHEDNAME$4);
            }
            target.set(matchedName);
        }
    }
    
    /**
     * Unsets the "matchedName" element
     */
    public void unsetMatchedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHEDNAME$4, 0);
        }
    }
    
    /**
     * Gets the "matchedBirthdate" element
     */
    public java.lang.String getMatchedBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHEDBIRTHDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matchedBirthdate" element
     */
    public org.apache.xmlbeans.XmlString xgetMatchedBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHEDBIRTHDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "matchedBirthdate" element
     */
    public boolean isSetMatchedBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHEDBIRTHDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "matchedBirthdate" element
     */
    public void setMatchedBirthdate(java.lang.String matchedBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHEDBIRTHDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHEDBIRTHDATE$6);
            }
            target.setStringValue(matchedBirthdate);
        }
    }
    
    /**
     * Sets (as xml) the "matchedBirthdate" element
     */
    public void xsetMatchedBirthdate(org.apache.xmlbeans.XmlString matchedBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHEDBIRTHDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCHEDBIRTHDATE$6);
            }
            target.set(matchedBirthdate);
        }
    }
    
    /**
     * Unsets the "matchedBirthdate" element
     */
    public void unsetMatchedBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHEDBIRTHDATE$6, 0);
        }
    }
}
