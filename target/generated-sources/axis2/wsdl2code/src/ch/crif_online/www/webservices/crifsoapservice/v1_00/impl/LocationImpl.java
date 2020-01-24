/*
 * XML Type:  Location
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.Location
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML Location(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.Location
{
    private static final long serialVersionUID = 1L;
    
    public LocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREET$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "street");
    private static final javax.xml.namespace.QName HOUSENUMBER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "houseNumber");
    private static final javax.xml.namespace.QName APARTMENT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "apartment");
    private static final javax.xml.namespace.QName ZIP$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "zip");
    private static final javax.xml.namespace.QName CITY$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "city");
    private static final javax.xml.namespace.QName REGIONCODE$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "regionCode");
    private static final javax.xml.namespace.QName SUBREGIONCODE$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "subRegionCode");
    private static final javax.xml.namespace.QName COUNTRY$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "country");
    
    
    /**
     * Gets the "street" element
     */
    public java.lang.String getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "street" element
     */
    public org.apache.xmlbeans.XmlString xgetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "street" element
     */
    public boolean isSetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREET$0) != 0;
        }
    }
    
    /**
     * Sets the "street" element
     */
    public void setStreet(java.lang.String street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$0);
            }
            target.setStringValue(street);
        }
    }
    
    /**
     * Sets (as xml) the "street" element
     */
    public void xsetStreet(org.apache.xmlbeans.XmlString street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREET$0);
            }
            target.set(street);
        }
    }
    
    /**
     * Unsets the "street" element
     */
    public void unsetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREET$0, 0);
        }
    }
    
    /**
     * Gets the "houseNumber" element
     */
    public java.lang.String getHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUSENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "houseNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOUSENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "houseNumber" element
     */
    public boolean isSetHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "houseNumber" element
     */
    public void setHouseNumber(java.lang.String houseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUSENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOUSENUMBER$2);
            }
            target.setStringValue(houseNumber);
        }
    }
    
    /**
     * Sets (as xml) the "houseNumber" element
     */
    public void xsetHouseNumber(org.apache.xmlbeans.XmlString houseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOUSENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOUSENUMBER$2);
            }
            target.set(houseNumber);
        }
    }
    
    /**
     * Unsets the "houseNumber" element
     */
    public void unsetHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "apartment" element
     */
    public java.lang.String getApartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APARTMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apartment" element
     */
    public org.apache.xmlbeans.XmlString xgetApartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APARTMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "apartment" element
     */
    public boolean isSetApartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APARTMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "apartment" element
     */
    public void setApartment(java.lang.String apartment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APARTMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APARTMENT$4);
            }
            target.setStringValue(apartment);
        }
    }
    
    /**
     * Sets (as xml) the "apartment" element
     */
    public void xsetApartment(org.apache.xmlbeans.XmlString apartment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APARTMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APARTMENT$4);
            }
            target.set(apartment);
        }
    }
    
    /**
     * Unsets the "apartment" element
     */
    public void unsetApartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APARTMENT$4, 0);
        }
    }
    
    /**
     * Gets the "zip" element
     */
    public java.lang.String getZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "zip" element
     */
    public org.apache.xmlbeans.XmlString xgetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "zip" element
     */
    public boolean isSetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIP$6) != 0;
        }
    }
    
    /**
     * Sets the "zip" element
     */
    public void setZip(java.lang.String zip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIP$6);
            }
            target.setStringValue(zip);
        }
    }
    
    /**
     * Sets (as xml) the "zip" element
     */
    public void xsetZip(org.apache.xmlbeans.XmlString zip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIP$6);
            }
            target.set(zip);
        }
    }
    
    /**
     * Unsets the "zip" element
     */
    public void unsetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIP$6, 0);
        }
    }
    
    /**
     * Gets the "city" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "city" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "city" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$8) != 0;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$8);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "city" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$8);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "city" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$8, 0);
        }
    }
    
    /**
     * Gets the "regionCode" element
     */
    public java.lang.String getRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIONCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "regionCode" element
     */
    public org.apache.xmlbeans.XmlString xgetRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGIONCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "regionCode" element
     */
    public boolean isSetRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "regionCode" element
     */
    public void setRegionCode(java.lang.String regionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGIONCODE$10);
            }
            target.setStringValue(regionCode);
        }
    }
    
    /**
     * Sets (as xml) the "regionCode" element
     */
    public void xsetRegionCode(org.apache.xmlbeans.XmlString regionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGIONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGIONCODE$10);
            }
            target.set(regionCode);
        }
    }
    
    /**
     * Unsets the "regionCode" element
     */
    public void unsetRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONCODE$10, 0);
        }
    }
    
    /**
     * Gets the "subRegionCode" element
     */
    public java.lang.String getSubRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREGIONCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subRegionCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSubRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBREGIONCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "subRegionCode" element
     */
    public boolean isSetSubRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBREGIONCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "subRegionCode" element
     */
    public void setSubRegionCode(java.lang.String subRegionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREGIONCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBREGIONCODE$12);
            }
            target.setStringValue(subRegionCode);
        }
    }
    
    /**
     * Sets (as xml) the "subRegionCode" element
     */
    public void xsetSubRegionCode(org.apache.xmlbeans.XmlString subRegionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBREGIONCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBREGIONCODE$12);
            }
            target.set(subRegionCode);
        }
    }
    
    /**
     * Unsets the "subRegionCode" element
     */
    public void unsetSubRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBREGIONCODE$12, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$14) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$14);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$14);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$14, 0);
        }
    }
}
