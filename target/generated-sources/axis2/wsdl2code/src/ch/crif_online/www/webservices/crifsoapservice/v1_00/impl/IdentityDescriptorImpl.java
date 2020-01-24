/*
 * XML Type:  IdentityDescriptor
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdentityDescriptor(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdentityDescriptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor
{
    private static final long serialVersionUID = 1L;
    
    public IdentityDescriptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "userName");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "password");
    private static final javax.xml.namespace.QName ENDUSERID$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "endUserId");
    private static final javax.xml.namespace.QName COSTGROUPID$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "costGroupId");
    
    
    /**
     * Gets the "userName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
            }
            target.set(userName);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Gets the "endUserId" element
     */
    public java.lang.String getEndUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDUSERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endUserId" element
     */
    public org.apache.xmlbeans.XmlString xgetEndUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDUSERID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "endUserId" element
     */
    public boolean isSetEndUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDUSERID$4) != 0;
        }
    }
    
    /**
     * Sets the "endUserId" element
     */
    public void setEndUserId(java.lang.String endUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDUSERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDUSERID$4);
            }
            target.setStringValue(endUserId);
        }
    }
    
    /**
     * Sets (as xml) the "endUserId" element
     */
    public void xsetEndUserId(org.apache.xmlbeans.XmlString endUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDUSERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDUSERID$4);
            }
            target.set(endUserId);
        }
    }
    
    /**
     * Unsets the "endUserId" element
     */
    public void unsetEndUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDUSERID$4, 0);
        }
    }
    
    /**
     * Gets the "costGroupId" element
     */
    public java.lang.String getCostGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTGROUPID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "costGroupId" element
     */
    public org.apache.xmlbeans.XmlString xgetCostGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTGROUPID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "costGroupId" element
     */
    public boolean isSetCostGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COSTGROUPID$6) != 0;
        }
    }
    
    /**
     * Sets the "costGroupId" element
     */
    public void setCostGroupId(java.lang.String costGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTGROUPID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COSTGROUPID$6);
            }
            target.setStringValue(costGroupId);
        }
    }
    
    /**
     * Sets (as xml) the "costGroupId" element
     */
    public void xsetCostGroupId(org.apache.xmlbeans.XmlString costGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTGROUPID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COSTGROUPID$6);
            }
            target.set(costGroupId);
        }
    }
    
    /**
     * Unsets the "costGroupId" element
     */
    public void unsetCostGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COSTGROUPID$6, 0);
        }
    }
}
