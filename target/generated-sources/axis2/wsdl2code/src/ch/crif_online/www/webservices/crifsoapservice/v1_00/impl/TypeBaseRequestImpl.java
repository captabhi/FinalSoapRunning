/*
 * XML Type:  TypeBaseRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeBaseRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeBaseRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeBaseRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeBaseRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROL$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "control");
    private static final javax.xml.namespace.QName IDENTITYDESCRIPTOR$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identityDescriptor");
    private static final javax.xml.namespace.QName REFERENCENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "referenceNumber");
    
    
    /**
     * Gets the "control" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Control getControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Control target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Control)get_store().find_element_user(CONTROL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "control" element
     */
    public void setControl(ch.crif_online.www.webservices.crifsoapservice.v1_00.Control control)
    {
        generatedSetterHelperImpl(control, CONTROL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "control" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Control addNewControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Control target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Control)get_store().add_element_user(CONTROL$0);
            return target;
        }
    }
    
    /**
     * Gets the "identityDescriptor" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor getIdentityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor)get_store().find_element_user(IDENTITYDESCRIPTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identityDescriptor" element
     */
    public void setIdentityDescriptor(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor identityDescriptor)
    {
        generatedSetterHelperImpl(identityDescriptor, IDENTITYDESCRIPTOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identityDescriptor" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor addNewIdentityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentityDescriptor)get_store().add_element_user(IDENTITYDESCRIPTOR$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$4, 0);
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
            return get_store().count_elements(REFERENCENUMBER$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENUMBER$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCENUMBER$4);
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
            get_store().remove_element(REFERENCENUMBER$4, 0);
        }
    }
}
