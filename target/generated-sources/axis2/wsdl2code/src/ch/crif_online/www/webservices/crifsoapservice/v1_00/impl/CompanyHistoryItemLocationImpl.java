/*
 * XML Type:  CompanyHistoryItemLocation
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLocation
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItemLocation(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemLocationImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.CompanyHistoryItemImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLocation
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemLocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "location");
    
    
    /**
     * Gets the "location" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(ch.crif_online.www.webservices.crifsoapservice.v1_00.Location location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
