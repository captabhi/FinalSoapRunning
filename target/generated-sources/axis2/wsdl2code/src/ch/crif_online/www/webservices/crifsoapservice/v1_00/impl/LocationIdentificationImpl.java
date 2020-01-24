/*
 * XML Type:  LocationIdentification
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML LocationIdentification(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class LocationIdentificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentification
{
    private static final long serialVersionUID = 1L;
    
    public LocationIdentificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONIDENTIFICATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "locationIdentificationType");
    private static final javax.xml.namespace.QName HOUSETYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "houseType");
    private static final javax.xml.namespace.QName REQUESTLOCATIONNORMALIZED$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "requestLocationNormalized");
    
    
    /**
     * Gets the "locationIdentificationType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType.Enum getLocationIdentificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONIDENTIFICATIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationIdentificationType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType xgetLocationIdentificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType)get_store().find_element_user(LOCATIONIDENTIFICATIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "locationIdentificationType" element
     */
    public void setLocationIdentificationType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType.Enum locationIdentificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONIDENTIFICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONIDENTIFICATIONTYPE$0);
            }
            target.setEnumValue(locationIdentificationType);
        }
    }
    
    /**
     * Sets (as xml) the "locationIdentificationType" element
     */
    public void xsetLocationIdentificationType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType locationIdentificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType)get_store().find_element_user(LOCATIONIDENTIFICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LocationIdentificationType)get_store().add_element_user(LOCATIONIDENTIFICATIONTYPE$0);
            }
            target.set(locationIdentificationType);
        }
    }
    
    /**
     * Gets the "houseType" element
     */
    public java.lang.String getHouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUSETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "houseType" element
     */
    public org.apache.xmlbeans.XmlString xgetHouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOUSETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "houseType" element
     */
    public boolean isSetHouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSETYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "houseType" element
     */
    public void setHouseType(java.lang.String houseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUSETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOUSETYPE$2);
            }
            target.setStringValue(houseType);
        }
    }
    
    /**
     * Sets (as xml) the "houseType" element
     */
    public void xsetHouseType(org.apache.xmlbeans.XmlString houseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOUSETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOUSETYPE$2);
            }
            target.set(houseType);
        }
    }
    
    /**
     * Unsets the "houseType" element
     */
    public void unsetHouseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSETYPE$2, 0);
        }
    }
    
    /**
     * Gets the "requestLocationNormalized" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location getRequestLocationNormalized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().find_element_user(REQUESTLOCATIONNORMALIZED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requestLocationNormalized" element
     */
    public boolean isSetRequestLocationNormalized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTLOCATIONNORMALIZED$4) != 0;
        }
    }
    
    /**
     * Sets the "requestLocationNormalized" element
     */
    public void setRequestLocationNormalized(ch.crif_online.www.webservices.crifsoapservice.v1_00.Location requestLocationNormalized)
    {
        generatedSetterHelperImpl(requestLocationNormalized, REQUESTLOCATIONNORMALIZED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestLocationNormalized" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Location addNewRequestLocationNormalized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Location target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Location)get_store().add_element_user(REQUESTLOCATIONNORMALIZED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "requestLocationNormalized" element
     */
    public void unsetRequestLocationNormalized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTLOCATIONNORMALIZED$4, 0);
        }
    }
}
