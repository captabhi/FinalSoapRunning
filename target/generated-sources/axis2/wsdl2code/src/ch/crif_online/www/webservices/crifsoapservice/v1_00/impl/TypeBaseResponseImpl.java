/*
 * XML Type:  TypeBaseResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeBaseResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeBaseResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeBaseResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVINGID$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "archivingId");
    
    
    /**
     * Gets the "archivingId" element
     */
    public long getArchivingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVINGID$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "archivingId" element
     */
    public org.apache.xmlbeans.XmlLong xgetArchivingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ARCHIVINGID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "archivingId" element
     */
    public boolean isSetArchivingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHIVINGID$0) != 0;
        }
    }
    
    /**
     * Sets the "archivingId" element
     */
    public void setArchivingId(long archivingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHIVINGID$0);
            }
            target.setLongValue(archivingId);
        }
    }
    
    /**
     * Sets (as xml) the "archivingId" element
     */
    public void xsetArchivingId(org.apache.xmlbeans.XmlLong archivingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ARCHIVINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ARCHIVINGID$0);
            }
            target.set(archivingId);
        }
    }
    
    /**
     * Unsets the "archivingId" element
     */
    public void unsetArchivingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHIVINGID$0, 0);
        }
    }
}
