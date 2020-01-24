/*
 * XML Type:  eSchKgJobDescription
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML eSchKgJobDescription(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ESchKgJobDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription
{
    private static final long serialVersionUID = 1L;
    
    public ESchKgJobDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "jobId");
    private static final javax.xml.namespace.QName ENFORCEMENTSTATUS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "enforcementStatus");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "description");
    private static final javax.xml.namespace.QName DELIVERYDATE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "deliveryDate");
    private static final javax.xml.namespace.QName STATUSMESSAGE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "statusMessage");
    private static final javax.xml.namespace.QName NOTE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "note");
    private static final javax.xml.namespace.QName CREATED$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "created");
    private static final javax.xml.namespace.QName CREATEDBY$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "createdBy");
    
    
    /**
     * Gets the "jobId" element
     */
    public java.lang.String getJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobId" element
     */
    public org.apache.xmlbeans.XmlString xgetJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "jobId" element
     */
    public boolean isSetJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOBID$0) != 0;
        }
    }
    
    /**
     * Sets the "jobId" element
     */
    public void setJobId(java.lang.String jobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBID$0);
            }
            target.setStringValue(jobId);
        }
    }
    
    /**
     * Sets (as xml) the "jobId" element
     */
    public void xsetJobId(org.apache.xmlbeans.XmlString jobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBID$0);
            }
            target.set(jobId);
        }
    }
    
    /**
     * Unsets the "jobId" element
     */
    public void unsetJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOBID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMENTSTATUS$2, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$2, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMENTSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENFORCEMENTSTATUS$2);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().find_element_user(ENFORCEMENTSTATUS$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.EnforcementStatus)get_store().add_element_user(ENFORCEMENTSTATUS$2);
            }
            target.set(enforcementStatus);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "deliveryDate" element
     */
    public java.lang.String getDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deliveryDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVERYDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "deliveryDate" element
     */
    public boolean isSetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "deliveryDate" element
     */
    public void setDeliveryDate(java.lang.String deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATE$6);
            }
            target.setStringValue(deliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "deliveryDate" element
     */
    public void xsetDeliveryDate(org.apache.xmlbeans.XmlString deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELIVERYDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELIVERYDATE$6);
            }
            target.set(deliveryDate);
        }
    }
    
    /**
     * Unsets the "deliveryDate" element
     */
    public void unsetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYDATE$6, 0);
        }
    }
    
    /**
     * Gets the "statusMessage" element
     */
    public java.lang.String getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusMessage" element
     */
    public boolean isSetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSMESSAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "statusMessage" element
     */
    public void setStatusMessage(java.lang.String statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$8);
            }
            target.setStringValue(statusMessage);
        }
    }
    
    /**
     * Sets (as xml) the "statusMessage" element
     */
    public void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$8);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Unsets the "statusMessage" element
     */
    public void unsetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSMESSAGE$8, 0);
        }
    }
    
    /**
     * Gets the "note" element
     */
    public java.lang.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "note" element
     */
    public org.apache.xmlbeans.XmlString xgetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "note" element
     */
    public boolean isSetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTE$10) != 0;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(java.lang.String note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$10);
            }
            target.setStringValue(note);
        }
    }
    
    /**
     * Sets (as xml) the "note" element
     */
    public void xsetNote(org.apache.xmlbeans.XmlString note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$10);
            }
            target.set(note);
        }
    }
    
    /**
     * Unsets the "note" element
     */
    public void unsetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTE$10, 0);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public java.lang.String getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlString xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$12) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(java.lang.String created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$12);
            }
            target.setStringValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlString created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATED$12);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$12, 0);
        }
    }
    
    /**
     * Gets the "createdBy" element
     */
    public java.lang.String getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdBy" element
     */
    public org.apache.xmlbeans.XmlString xgetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdBy" element
     */
    public boolean isSetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$14) != 0;
        }
    }
    
    /**
     * Sets the "createdBy" element
     */
    public void setCreatedBy(java.lang.String createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$14);
            }
            target.setStringValue(createdBy);
        }
    }
    
    /**
     * Sets (as xml) the "createdBy" element
     */
    public void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEDBY$14);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Unsets the "createdBy" element
     */
    public void unsetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$14, 0);
        }
    }
}
