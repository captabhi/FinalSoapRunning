/*
 * XML Type:  TypeAddressInvestigationRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeAddressInvestigationRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeAddressInvestigationRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeAddressInvestigationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifier");
    private static final javax.xml.namespace.QName SEARCHEDADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "searchedAddress");
    private static final javax.xml.namespace.QName TARGETREPORTFORMAT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "targetReportFormat");
    private static final javax.xml.namespace.QName REQUESTHIGHESTDELIVERABLEADDRESS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "requestHighestDeliverableAddress");
    private static final javax.xml.namespace.QName REQUESTHOUSEHOLDADDRESSES$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "requestHouseholdAddresses");
    private static final javax.xml.namespace.QName REQUESTKNOWNADDRESSES$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "requestKnownAddresses");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    
    
    /**
     * Gets the "identifier" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().find_element_user(IDENTIFIER$0, 0);
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
            return get_store().count_elements(IDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier)get_store().add_element_user(IDENTIFIER$0);
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
            get_store().remove_element(IDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "searchedAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getSearchedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(SEARCHEDADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "searchedAddress" element
     */
    public boolean isSetSearchedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHEDADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "searchedAddress" element
     */
    public void setSearchedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription searchedAddress)
    {
        generatedSetterHelperImpl(searchedAddress, SEARCHEDADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "searchedAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewSearchedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(SEARCHEDADDRESS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "searchedAddress" element
     */
    public void unsetSearchedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHEDADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "targetReportFormat" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum getTargetReportFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREPORTFORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetReportFormat" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat xgetTargetReportFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().find_element_user(TARGETREPORTFORMAT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetReportFormat" element
     */
    public boolean isSetTargetReportFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETREPORTFORMAT$4) != 0;
        }
    }
    
    /**
     * Sets the "targetReportFormat" element
     */
    public void setTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat.Enum targetReportFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREPORTFORMAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETREPORTFORMAT$4);
            }
            target.setEnumValue(targetReportFormat);
        }
    }
    
    /**
     * Sets (as xml) the "targetReportFormat" element
     */
    public void xsetTargetReportFormat(ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat targetReportFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().find_element_user(TARGETREPORTFORMAT$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().add_element_user(TARGETREPORTFORMAT$4);
            }
            target.set(targetReportFormat);
        }
    }
    
    /**
     * Unsets the "targetReportFormat" element
     */
    public void unsetTargetReportFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETREPORTFORMAT$4, 0);
        }
    }
    
    /**
     * Gets the "requestHighestDeliverableAddress" element
     */
    public boolean getRequestHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestHighestDeliverableAddress" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequestHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestHighestDeliverableAddress" element
     */
    public boolean isSetRequestHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTHIGHESTDELIVERABLEADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "requestHighestDeliverableAddress" element
     */
    public void setRequestHighestDeliverableAddress(boolean requestHighestDeliverableAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6);
            }
            target.setBooleanValue(requestHighestDeliverableAddress);
        }
    }
    
    /**
     * Sets (as xml) the "requestHighestDeliverableAddress" element
     */
    public void xsetRequestHighestDeliverableAddress(org.apache.xmlbeans.XmlBoolean requestHighestDeliverableAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REQUESTHIGHESTDELIVERABLEADDRESS$6);
            }
            target.set(requestHighestDeliverableAddress);
        }
    }
    
    /**
     * Unsets the "requestHighestDeliverableAddress" element
     */
    public void unsetRequestHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTHIGHESTDELIVERABLEADDRESS$6, 0);
        }
    }
    
    /**
     * Gets the "requestHouseholdAddresses" element
     */
    public boolean getRequestHouseholdAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTHOUSEHOLDADDRESSES$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestHouseholdAddresses" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequestHouseholdAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTHOUSEHOLDADDRESSES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestHouseholdAddresses" element
     */
    public boolean isSetRequestHouseholdAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTHOUSEHOLDADDRESSES$8) != 0;
        }
    }
    
    /**
     * Sets the "requestHouseholdAddresses" element
     */
    public void setRequestHouseholdAddresses(boolean requestHouseholdAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTHOUSEHOLDADDRESSES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTHOUSEHOLDADDRESSES$8);
            }
            target.setBooleanValue(requestHouseholdAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "requestHouseholdAddresses" element
     */
    public void xsetRequestHouseholdAddresses(org.apache.xmlbeans.XmlBoolean requestHouseholdAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTHOUSEHOLDADDRESSES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REQUESTHOUSEHOLDADDRESSES$8);
            }
            target.set(requestHouseholdAddresses);
        }
    }
    
    /**
     * Unsets the "requestHouseholdAddresses" element
     */
    public void unsetRequestHouseholdAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTHOUSEHOLDADDRESSES$8, 0);
        }
    }
    
    /**
     * Gets the "requestKnownAddresses" element
     */
    public boolean getRequestKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTKNOWNADDRESSES$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestKnownAddresses" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequestKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTKNOWNADDRESSES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestKnownAddresses" element
     */
    public boolean isSetRequestKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTKNOWNADDRESSES$10) != 0;
        }
    }
    
    /**
     * Sets the "requestKnownAddresses" element
     */
    public void setRequestKnownAddresses(boolean requestKnownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTKNOWNADDRESSES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTKNOWNADDRESSES$10);
            }
            target.setBooleanValue(requestKnownAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "requestKnownAddresses" element
     */
    public void xsetRequestKnownAddresses(org.apache.xmlbeans.XmlBoolean requestKnownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUESTKNOWNADDRESSES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REQUESTKNOWNADDRESSES$10);
            }
            target.set(requestKnownAddresses);
        }
    }
    
    /**
     * Unsets the "requestKnownAddresses" element
     */
    public void unsetRequestKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTKNOWNADDRESSES$10, 0);
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
            get_store().find_all_element_users(ADDITIONALINPUT$12, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$12, i);
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
            return get_store().count_elements(ADDITIONALINPUT$12);
        }
    }
    
    /**
     * Sets array of all "additionalInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalInputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalInputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalInputArray, ADDITIONALINPUT$12);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALINPUT$12, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALINPUT$12, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALINPUT$12);
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
            get_store().remove_element(ADDITIONALINPUT$12, i);
        }
    }
}
