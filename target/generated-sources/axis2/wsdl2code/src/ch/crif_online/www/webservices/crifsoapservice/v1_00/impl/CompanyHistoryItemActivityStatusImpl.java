/*
 * XML Type:  CompanyHistoryItemActivityStatus
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemActivityStatus
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItemActivityStatus(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemActivityStatusImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.CompanyHistoryItemImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemActivityStatus
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemActivityStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "activityStatus");
    private static final javax.xml.namespace.QName ACTIVITYSTATUSORIGINAL$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "activityStatusOriginal");
    
    
    /**
     * Gets the "activityStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum getActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus xgetActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activityStatus" element
     */
    public void setActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus.Enum activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUS$0);
            }
            target.setEnumValue(activityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "activityStatus" element
     */
    public void xsetActivityStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ActivityStatus)get_store().add_element_user(ACTIVITYSTATUS$0);
            }
            target.set(activityStatus);
        }
    }
    
    /**
     * Gets the "activityStatusOriginal" element
     */
    public java.lang.String getActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityStatusOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "activityStatusOriginal" element
     */
    public boolean isSetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYSTATUSORIGINAL$2) != 0;
        }
    }
    
    /**
     * Sets the "activityStatusOriginal" element
     */
    public void setActivityStatusOriginal(java.lang.String activityStatusOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUSORIGINAL$2);
            }
            target.setStringValue(activityStatusOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "activityStatusOriginal" element
     */
    public void xsetActivityStatusOriginal(org.apache.xmlbeans.XmlString activityStatusOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYSTATUSORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYSTATUSORIGINAL$2);
            }
            target.set(activityStatusOriginal);
        }
    }
    
    /**
     * Unsets the "activityStatusOriginal" element
     */
    public void unsetActivityStatusOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYSTATUSORIGINAL$2, 0);
        }
    }
}
