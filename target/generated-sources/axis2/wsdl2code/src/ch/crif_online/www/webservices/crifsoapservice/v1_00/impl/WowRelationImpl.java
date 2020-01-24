/*
 * XML Type:  WowRelation
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML WowRelation(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class WowRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.WowRelation
{
    private static final long serialVersionUID = 1L;
    
    public WowRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNER$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "owner");
    private static final javax.xml.namespace.QName OWNEDSUBJECT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "ownedSubject");
    private static final javax.xml.namespace.QName ISMAJORITYOWNER$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isMajorityOwner");
    private static final javax.xml.namespace.QName CAPITALSHARE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "capitalShare");
    private static final javax.xml.namespace.QName VOTESHARE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "voteShare");
    
    
    /**
     * Gets the "owner" element
     */
    public int getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "owner" element
     */
    public org.apache.xmlbeans.XmlInt xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "owner" element
     */
    public void setOwner(int owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$0);
            }
            target.setIntValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "owner" element
     */
    public void xsetOwner(org.apache.xmlbeans.XmlInt owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OWNER$0);
            }
            target.set(owner);
        }
    }
    
    /**
     * Gets the "ownedSubject" element
     */
    public int getOwnedSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNEDSUBJECT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownedSubject" element
     */
    public org.apache.xmlbeans.XmlInt xgetOwnedSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNEDSUBJECT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ownedSubject" element
     */
    public void setOwnedSubject(int ownedSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNEDSUBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNEDSUBJECT$2);
            }
            target.setIntValue(ownedSubject);
        }
    }
    
    /**
     * Sets (as xml) the "ownedSubject" element
     */
    public void xsetOwnedSubject(org.apache.xmlbeans.XmlInt ownedSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OWNEDSUBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OWNEDSUBJECT$2);
            }
            target.set(ownedSubject);
        }
    }
    
    /**
     * Gets the "isMajorityOwner" element
     */
    public boolean getIsMajorityOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMAJORITYOWNER$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMajorityOwner" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMajorityOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMAJORITYOWNER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isMajorityOwner" element
     */
    public void setIsMajorityOwner(boolean isMajorityOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMAJORITYOWNER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMAJORITYOWNER$4);
            }
            target.setBooleanValue(isMajorityOwner);
        }
    }
    
    /**
     * Sets (as xml) the "isMajorityOwner" element
     */
    public void xsetIsMajorityOwner(org.apache.xmlbeans.XmlBoolean isMajorityOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMAJORITYOWNER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMAJORITYOWNER$4);
            }
            target.set(isMajorityOwner);
        }
    }
    
    /**
     * Gets the "capitalShare" element
     */
    public java.math.BigDecimal getCapitalShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALSHARE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "capitalShare" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetCapitalShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CAPITALSHARE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "capitalShare" element
     */
    public boolean isSetCapitalShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITALSHARE$6) != 0;
        }
    }
    
    /**
     * Sets the "capitalShare" element
     */
    public void setCapitalShare(java.math.BigDecimal capitalShare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALSHARE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITALSHARE$6);
            }
            target.setBigDecimalValue(capitalShare);
        }
    }
    
    /**
     * Sets (as xml) the "capitalShare" element
     */
    public void xsetCapitalShare(org.apache.xmlbeans.XmlDecimal capitalShare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CAPITALSHARE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CAPITALSHARE$6);
            }
            target.set(capitalShare);
        }
    }
    
    /**
     * Unsets the "capitalShare" element
     */
    public void unsetCapitalShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITALSHARE$6, 0);
        }
    }
    
    /**
     * Gets the "voteShare" element
     */
    public java.math.BigDecimal getVoteShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOTESHARE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "voteShare" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetVoteShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VOTESHARE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "voteShare" element
     */
    public boolean isSetVoteShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOTESHARE$8) != 0;
        }
    }
    
    /**
     * Sets the "voteShare" element
     */
    public void setVoteShare(java.math.BigDecimal voteShare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOTESHARE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOTESHARE$8);
            }
            target.setBigDecimalValue(voteShare);
        }
    }
    
    /**
     * Sets (as xml) the "voteShare" element
     */
    public void xsetVoteShare(org.apache.xmlbeans.XmlDecimal voteShare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VOTESHARE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VOTESHARE$8);
            }
            target.set(voteShare);
        }
    }
    
    /**
     * Unsets the "voteShare" element
     */
    public void unsetVoteShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOTESHARE$8, 0);
        }
    }
}
