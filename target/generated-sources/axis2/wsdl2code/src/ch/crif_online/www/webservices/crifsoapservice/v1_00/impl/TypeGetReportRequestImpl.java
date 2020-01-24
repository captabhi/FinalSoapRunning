/*
 * XML Type:  TypeGetReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeGetReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeGetReportRequestImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseRequestImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest
{
    private static final long serialVersionUID = 1L;
    
    public TypeGetReportRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHEDADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "searchedAddress");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifier");
    private static final javax.xml.namespace.QName REPORTTYPE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "reportType");
    private static final javax.xml.namespace.QName TARGETREPORTFORMAT$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "targetReportFormat");
    private static final javax.xml.namespace.QName IDVERIFICATIONREQUESTDATA$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationRequestData");
    private static final javax.xml.namespace.QName ADDITIONALINPUT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalInput");
    
    
    /**
     * Gets the "searchedAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getSearchedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(SEARCHEDADDRESS$0, 0);
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
            return get_store().count_elements(SEARCHEDADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "searchedAddress" element
     */
    public void setSearchedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription searchedAddress)
    {
        generatedSetterHelperImpl(searchedAddress, SEARCHEDADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(SEARCHEDADDRESS$0);
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
            get_store().remove_element(SEARCHEDADDRESS$0, 0);
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
     * Gets the "reportType" element
     */
    public java.lang.String getReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportType" element
     */
    public org.apache.xmlbeans.XmlString xgetReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportType" element
     */
    public void setReportType(java.lang.String reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTYPE$4);
            }
            target.setStringValue(reportType);
        }
    }
    
    /**
     * Sets (as xml) the "reportType" element
     */
    public void xsetReportType(org.apache.xmlbeans.XmlString reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORTTYPE$4);
            }
            target.set(reportType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREPORTFORMAT$6, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().find_element_user(TARGETREPORTFORMAT$6, 0);
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
            return get_store().count_elements(TARGETREPORTFORMAT$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREPORTFORMAT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETREPORTFORMAT$6);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().find_element_user(TARGETREPORTFORMAT$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TargetReportFormat)get_store().add_element_user(TARGETREPORTFORMAT$6);
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
            get_store().remove_element(TARGETREPORTFORMAT$6, 0);
        }
    }
    
    /**
     * Gets the "idVerificationRequestData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData getIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData)get_store().find_element_user(IDVERIFICATIONREQUESTDATA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "idVerificationRequestData" element
     */
    public boolean isSetIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDVERIFICATIONREQUESTDATA$8) != 0;
        }
    }
    
    /**
     * Sets the "idVerificationRequestData" element
     */
    public void setIdVerificationRequestData(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData idVerificationRequestData)
    {
        generatedSetterHelperImpl(idVerificationRequestData, IDVERIFICATIONREQUESTDATA$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "idVerificationRequestData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData addNewIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData)get_store().add_element_user(IDVERIFICATIONREQUESTDATA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "idVerificationRequestData" element
     */
    public void unsetIdVerificationRequestData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDVERIFICATIONREQUESTDATA$8, 0);
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
}
