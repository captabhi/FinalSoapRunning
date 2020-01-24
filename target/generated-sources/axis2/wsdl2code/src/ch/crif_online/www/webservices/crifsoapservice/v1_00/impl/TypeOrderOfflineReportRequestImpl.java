/*
 * XML Type:  TypeOrderOfflineReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeOrderOfflineReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeOrderOfflineReportRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeOrderOfflineReportRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderAddress");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifier");
    private static final javax.xml.namespace.QName OFFLINEREPORTTYPE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "offlineReportType");
    private static final javax.xml.namespace.QName BINARYPOI$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "binaryPOI");
    private static final javax.xml.namespace.QName BINARYPOITYPE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "binaryPOIType");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    private static final javax.xml.namespace.QName CONTACTMAIL$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "contactMail");
    private static final javax.xml.namespace.QName CONTACTPHONE$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "contactPhone");
    
    
    /**
     * Gets the "orderAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getOrderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(ORDERADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderAddress" element
     */
    public boolean isSetOrderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "orderAddress" element
     */
    public void setOrderAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription orderAddress)
    {
        generatedSetterHelperImpl(orderAddress, ORDERADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewOrderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(ORDERADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "orderAddress" element
     */
    public void unsetOrderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets the "offlineReportType" element
     */
    public java.lang.String getOfflineReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINEREPORTTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offlineReportType" element
     */
    public org.apache.xmlbeans.XmlString xgetOfflineReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFLINEREPORTTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offlineReportType" element
     */
    public void setOfflineReportType(java.lang.String offlineReportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINEREPORTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFLINEREPORTTYPE$4);
            }
            target.setStringValue(offlineReportType);
        }
    }
    
    /**
     * Sets (as xml) the "offlineReportType" element
     */
    public void xsetOfflineReportType(org.apache.xmlbeans.XmlString offlineReportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFLINEREPORTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFLINEREPORTTYPE$4);
            }
            target.set(offlineReportType);
        }
    }
    
    /**
     * Gets the "binaryPOI" element
     */
    public java.lang.String getBinaryPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYPOI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "binaryPOI" element
     */
    public org.apache.xmlbeans.XmlString xgetBinaryPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINARYPOI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "binaryPOI" element
     */
    public boolean isSetBinaryPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYPOI$6) != 0;
        }
    }
    
    /**
     * Sets the "binaryPOI" element
     */
    public void setBinaryPOI(java.lang.String binaryPOI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYPOI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYPOI$6);
            }
            target.setStringValue(binaryPOI);
        }
    }
    
    /**
     * Sets (as xml) the "binaryPOI" element
     */
    public void xsetBinaryPOI(org.apache.xmlbeans.XmlString binaryPOI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINARYPOI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BINARYPOI$6);
            }
            target.set(binaryPOI);
        }
    }
    
    /**
     * Unsets the "binaryPOI" element
     */
    public void unsetBinaryPOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYPOI$6, 0);
        }
    }
    
    /**
     * Gets the "binaryPOIType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType.Enum getBinaryPOIType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYPOITYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "binaryPOIType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType xgetBinaryPOIType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType)get_store().find_element_user(BINARYPOITYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "binaryPOIType" element
     */
    public boolean isSetBinaryPOIType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYPOITYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "binaryPOIType" element
     */
    public void setBinaryPOIType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType.Enum binaryPOIType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYPOITYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYPOITYPE$8);
            }
            target.setEnumValue(binaryPOIType);
        }
    }
    
    /**
     * Sets (as xml) the "binaryPOIType" element
     */
    public void xsetBinaryPOIType(ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType binaryPOIType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType)get_store().find_element_user(BINARYPOITYPE$8, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PoiType)get_store().add_element_user(BINARYPOITYPE$8);
            }
            target.set(binaryPOIType);
        }
    }
    
    /**
     * Unsets the "binaryPOIType" element
     */
    public void unsetBinaryPOIType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYPOITYPE$8, 0);
        }
    }
    
    /**
     * Gets array of all "additionalInput" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALINPUT$10, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalInput" element
     */
    public int sizeOfAdditionalInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINPUT$10);
        }
    }
    
    /**
     * Sets array of all "additionalInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalInputArray, ADDITIONALINPUT$10);
    }
    
    /**
     * Sets ith "additionalInput" element
     */
    public void setAdditionalInputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALINPUT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalInput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALINPUT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalInput" element
     */
    public void removeAdditionalInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINPUT$10, i);
        }
    }
    
    /**
     * Gets the "contactMail" element
     */
    public java.lang.String getContactMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTMAIL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contactMail" element
     */
    public org.apache.xmlbeans.XmlString xgetContactMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTMAIL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "contactMail" element
     */
    public boolean isSetContactMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTMAIL$12) != 0;
        }
    }
    
    /**
     * Sets the "contactMail" element
     */
    public void setContactMail(java.lang.String contactMail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTMAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTMAIL$12);
            }
            target.setStringValue(contactMail);
        }
    }
    
    /**
     * Sets (as xml) the "contactMail" element
     */
    public void xsetContactMail(org.apache.xmlbeans.XmlString contactMail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTMAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTMAIL$12);
            }
            target.set(contactMail);
        }
    }
    
    /**
     * Unsets the "contactMail" element
     */
    public void unsetContactMail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTMAIL$12, 0);
        }
    }
    
    /**
     * Gets the "contactPhone" element
     */
    public java.lang.String getContactPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPHONE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contactPhone" element
     */
    public org.apache.xmlbeans.XmlString xgetContactPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPHONE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "contactPhone" element
     */
    public boolean isSetContactPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTPHONE$14) != 0;
        }
    }
    
    /**
     * Sets the "contactPhone" element
     */
    public void setContactPhone(java.lang.String contactPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPHONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTPHONE$14);
            }
            target.setStringValue(contactPhone);
        }
    }
    
    /**
     * Sets (as xml) the "contactPhone" element
     */
    public void xsetContactPhone(org.apache.xmlbeans.XmlString contactPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPHONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTPHONE$14);
            }
            target.set(contactPhone);
        }
    }
    
    /**
     * Unsets the "contactPhone" element
     */
    public void unsetContactPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTPHONE$14, 0);
        }
    }
}
