/*
 * XML Type:  AddressWithDeliverability
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML AddressWithDeliverability(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class AddressWithDeliverabilityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability
{
    private static final long serialVersionUID = 1L;
    
    public AddressWithDeliverabilityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    private static final javax.xml.namespace.QName DELIVERABILITY$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "deliverability");
    private static final javax.xml.namespace.QName ADDRESSINPUTDATE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressInputDate");
    private static final javax.xml.namespace.QName ADDRESSID$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressId");
    
    
    /**
     * Gets the "address" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "deliverability" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum getDeliverability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERABILITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "deliverability" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability xgetDeliverability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().find_element_user(DELIVERABILITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "deliverability" element
     */
    public void setDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum deliverability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERABILITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERABILITY$2);
            }
            target.setEnumValue(deliverability);
        }
    }
    
    /**
     * Sets (as xml) the "deliverability" element
     */
    public void xsetDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability deliverability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().find_element_user(DELIVERABILITY$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().add_element_user(DELIVERABILITY$2);
            }
            target.set(deliverability);
        }
    }
    
    /**
     * Gets the "addressInputDate" element
     */
    public java.lang.String getAddressInputDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSINPUTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressInputDate" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressInputDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSINPUTDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addressInputDate" element
     */
    public void setAddressInputDate(java.lang.String addressInputDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSINPUTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSINPUTDATE$4);
            }
            target.setStringValue(addressInputDate);
        }
    }
    
    /**
     * Sets (as xml) the "addressInputDate" element
     */
    public void xsetAddressInputDate(org.apache.xmlbeans.XmlString addressInputDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSINPUTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSINPUTDATE$4);
            }
            target.set(addressInputDate);
        }
    }
    
    /**
     * Gets the "addressId" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(ADDRESSID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addressId" element
     */
    public void setAddressId(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addressId)
    {
        generatedSetterHelperImpl(addressId, ADDRESSID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressId" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(ADDRESSID$6);
            return target;
        }
    }
}
