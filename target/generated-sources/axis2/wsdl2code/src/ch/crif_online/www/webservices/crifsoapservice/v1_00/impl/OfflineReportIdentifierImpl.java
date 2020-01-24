/*
 * XML Type:  OfflineReportIdentifier
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML OfflineReportIdentifier(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class OfflineReportIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier
{
    private static final long serialVersionUID = 1L;
    
    public OfflineReportIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERREFERENCENUMBER$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderReferenceNumber");
    private static final javax.xml.namespace.QName REFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "referenceNumber");
    
    
    /**
     * Gets the "orderReferenceNumber" element
     */
    public int getOrderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCENUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderReferenceNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERREFERENCENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "orderReferenceNumber" element
     */
    public void setOrderReferenceNumber(int orderReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERREFERENCENUMBER$0);
            }
            target.setIntValue(orderReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "orderReferenceNumber" element
     */
    public void xsetOrderReferenceNumber(org.apache.xmlbeans.XmlInt orderReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDERREFERENCENUMBER$0);
            }
            target.set(orderReferenceNumber);
        }
    }
    
    /**
     * Gets the "referenceNumber" element
     */
    public java.lang.String getReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "referenceNumber" element
     */
    public boolean isSetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "referenceNumber" element
     */
    public void setReferenceNumber(java.lang.String referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENUMBER$2);
            }
            target.setStringValue(referenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "referenceNumber" element
     */
    public void xsetReferenceNumber(org.apache.xmlbeans.XmlString referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCENUMBER$2);
            }
            target.set(referenceNumber);
        }
    }
    
    /**
     * Unsets the "referenceNumber" element
     */
    public void unsetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCENUMBER$2, 0);
        }
    }
}
