/*
 * XML Type:  CompanyHistoryItemAddress
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemAddress
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItemAddress(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemAddressImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.CompanyHistoryItemImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemAddress
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "address");
    
    
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
}
