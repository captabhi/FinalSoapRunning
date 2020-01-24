/*
 * XML Type:  ControlPerson
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ControlPerson(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ControlPersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPerson
{
    private static final long serialVersionUID = 1L;
    
    public ControlPersonImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLPERSONADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "controlPersonAddress");
    private static final javax.xml.namespace.QName CONTROLPERSONTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "controlPersonType");
    
    
    /**
     * Gets the "controlPersonAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getControlPersonAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(CONTROLPERSONADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "controlPersonAddress" element
     */
    public void setControlPersonAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription controlPersonAddress)
    {
        generatedSetterHelperImpl(controlPersonAddress, CONTROLPERSONADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlPersonAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewControlPersonAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(CONTROLPERSONADDRESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "controlPersonType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType.Enum getControlPersonType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLPERSONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "controlPersonType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType xgetControlPersonType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType)get_store().find_element_user(CONTROLPERSONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "controlPersonType" element
     */
    public void setControlPersonType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType.Enum controlPersonType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLPERSONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLPERSONTYPE$2);
            }
            target.setEnumValue(controlPersonType);
        }
    }
    
    /**
     * Sets (as xml) the "controlPersonType" element
     */
    public void xsetControlPersonType(ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType controlPersonType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType)get_store().find_element_user(CONTROLPERSONTYPE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ControlPersonType)get_store().add_element_user(CONTROLPERSONTYPE$2);
            }
            target.set(controlPersonType);
        }
    }
}
