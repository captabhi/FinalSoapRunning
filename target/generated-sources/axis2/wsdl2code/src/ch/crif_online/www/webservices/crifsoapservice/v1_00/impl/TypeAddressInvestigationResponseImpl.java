/*
 * XML Type:  TypeAddressInvestigationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeAddressInvestigationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeAddressInvestigationResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeAddressInvestigationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSMATCHRESULT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressMatchResult");
    private static final javax.xml.namespace.QName SEARCHEDADDRESSDELIVERABILITY$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "searchedAddressDeliverability");
    private static final javax.xml.namespace.QName HIGHESTDELIVERABLEADDRESS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "highestDeliverableAddress");
    private static final javax.xml.namespace.QName KNOWNADDRESSES$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "knownAddresses");
    private static final javax.xml.namespace.QName HOUSEHOLDADDRESSES$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "householdAddresses");
    private static final javax.xml.namespace.QName REPORT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "report");
    private static final javax.xml.namespace.QName DECEASEDDATE$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "deceasedDate");
    private static final javax.xml.namespace.QName PERSONSTATUS$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "personStatus");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$16 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    
    
    /**
     * Gets the "addressMatchResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult getAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult)get_store().find_element_user(ADDRESSMATCHRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addressMatchResult" element
     */
    public void setAddressMatchResult(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addressMatchResult)
    {
        generatedSetterHelperImpl(addressMatchResult, ADDRESSMATCHRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressMatchResult" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult addNewAddressMatchResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressMatchResult)get_store().add_element_user(ADDRESSMATCHRESULT$0);
            return target;
        }
    }
    
    /**
     * Gets the "searchedAddressDeliverability" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum getSearchedAddressDeliverability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHEDADDRESSDELIVERABILITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchedAddressDeliverability" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability xgetSearchedAddressDeliverability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().find_element_user(SEARCHEDADDRESSDELIVERABILITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "searchedAddressDeliverability" element
     */
    public void setSearchedAddressDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability.Enum searchedAddressDeliverability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHEDADDRESSDELIVERABILITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHEDADDRESSDELIVERABILITY$2);
            }
            target.setEnumValue(searchedAddressDeliverability);
        }
    }
    
    /**
     * Sets (as xml) the "searchedAddressDeliverability" element
     */
    public void xsetSearchedAddressDeliverability(ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability searchedAddressDeliverability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().find_element_user(SEARCHEDADDRESSDELIVERABILITY$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Deliverability)get_store().add_element_user(SEARCHEDADDRESSDELIVERABILITY$2);
            }
            target.set(searchedAddressDeliverability);
        }
    }
    
    /**
     * Gets the "highestDeliverableAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(HIGHESTDELIVERABLEADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "highestDeliverableAddress" element
     */
    public boolean isSetHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGHESTDELIVERABLEADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "highestDeliverableAddress" element
     */
    public void setHighestDeliverableAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability highestDeliverableAddress)
    {
        generatedSetterHelperImpl(highestDeliverableAddress, HIGHESTDELIVERABLEADDRESS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "highestDeliverableAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().add_element_user(HIGHESTDELIVERABLEADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "highestDeliverableAddress" element
     */
    public void unsetHighestDeliverableAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGHESTDELIVERABLEADDRESS$4, 0);
        }
    }
    
    /**
     * Gets array of all "knownAddresses" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getKnownAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KNOWNADDRESSES$6, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "knownAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getKnownAddressesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(KNOWNADDRESSES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "knownAddresses" element
     */
    public int sizeOfKnownAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOWNADDRESSES$6);
        }
    }
    
    /**
     * Sets array of all "knownAddresses" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKnownAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] knownAddressesArray)
    {
        check_orphaned();
        arraySetterHelper(knownAddressesArray, KNOWNADDRESSES$6);
    }
    
    /**
     * Sets ith "knownAddresses" element
     */
    public void setKnownAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability knownAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(KNOWNADDRESSES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(knownAddresses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knownAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewKnownAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().insert_element_user(KNOWNADDRESSES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knownAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewKnownAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().add_element_user(KNOWNADDRESSES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "knownAddresses" element
     */
    public void removeKnownAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOWNADDRESSES$6, i);
        }
    }
    
    /**
     * Gets array of all "householdAddresses" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] getHouseholdAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOUSEHOLDADDRESSES$8, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "householdAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability getHouseholdAddressesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(HOUSEHOLDADDRESSES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "householdAddresses" element
     */
    public int sizeOfHouseholdAddressesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSEHOLDADDRESSES$8);
        }
    }
    
    /**
     * Sets array of all "householdAddresses" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHouseholdAddressesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability[] householdAddressesArray)
    {
        check_orphaned();
        arraySetterHelper(householdAddressesArray, HOUSEHOLDADDRESSES$8);
    }
    
    /**
     * Sets ith "householdAddresses" element
     */
    public void setHouseholdAddressesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability householdAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().find_element_user(HOUSEHOLDADDRESSES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(householdAddresses);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "householdAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability insertNewHouseholdAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().insert_element_user(HOUSEHOLDADDRESSES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "householdAddresses" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability addNewHouseholdAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressWithDeliverability)get_store().add_element_user(HOUSEHOLDADDRESSES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "householdAddresses" element
     */
    public void removeHouseholdAddresses(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSEHOLDADDRESSES$8, i);
        }
    }
    
    /**
     * Gets the "report" element
     */
    public java.lang.String getReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "report" element
     */
    public org.apache.xmlbeans.XmlString xgetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "report" element
     */
    public boolean isSetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORT$10) != 0;
        }
    }
    
    /**
     * Sets the "report" element
     */
    public void setReport(java.lang.String report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORT$10);
            }
            target.setStringValue(report);
        }
    }
    
    /**
     * Sets (as xml) the "report" element
     */
    public void xsetReport(org.apache.xmlbeans.XmlString report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORT$10);
            }
            target.set(report);
        }
    }
    
    /**
     * Unsets the "report" element
     */
    public void unsetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORT$10, 0);
        }
    }
    
    /**
     * Gets the "deceasedDate" element
     */
    public java.lang.String getDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECEASEDDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deceasedDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECEASEDDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "deceasedDate" element
     */
    public boolean isSetDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "deceasedDate" element
     */
    public void setDeceasedDate(java.lang.String deceasedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECEASEDDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECEASEDDATE$12);
            }
            target.setStringValue(deceasedDate);
        }
    }
    
    /**
     * Sets (as xml) the "deceasedDate" element
     */
    public void xsetDeceasedDate(org.apache.xmlbeans.XmlString deceasedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECEASEDDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECEASEDDATE$12);
            }
            target.set(deceasedDate);
        }
    }
    
    /**
     * Unsets the "deceasedDate" element
     */
    public void unsetDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDDATE$12, 0);
        }
    }
    
    /**
     * Gets the "personStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus.Enum getPersonStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONSTATUS$14, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "personStatus" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus xgetPersonStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus)get_store().find_element_user(PERSONSTATUS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "personStatus" element
     */
    public boolean isSetPersonStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONSTATUS$14) != 0;
        }
    }
    
    /**
     * Sets the "personStatus" element
     */
    public void setPersonStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus.Enum personStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONSTATUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONSTATUS$14);
            }
            target.setEnumValue(personStatus);
        }
    }
    
    /**
     * Sets (as xml) the "personStatus" element
     */
    public void xsetPersonStatus(ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus personStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus)get_store().find_element_user(PERSONSTATUS$14, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonStatus)get_store().add_element_user(PERSONSTATUS$14);
            }
            target.set(personStatus);
        }
    }
    
    /**
     * Unsets the "personStatus" element
     */
    public void unsetPersonStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONSTATUS$14, 0);
        }
    }
    
    /**
     * Gets array of all "additionalOutput" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] getAdditionalOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALOUTPUT$16, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair getAdditionalOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalOutput" element
     */
    public int sizeOfAdditionalOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALOUTPUT$16);
        }
    }
    
    /**
     * Sets array of all "additionalOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalOutputArray, ADDITIONALOUTPUT$16);
    }
    
    /**
     * Sets ith "additionalOutput" element
     */
    public void setAdditionalOutputArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair additionalOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair insertNewAdditionalOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALOUTPUT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalOutput" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair addNewAdditionalOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALOUTPUT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalOutput" element
     */
    public void removeAdditionalOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALOUTPUT$16, i);
        }
    }
}
