/*
 * XML Type:  TypeGetListOfReadyOfflineReportsResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML TypeGetListOfReadyOfflineReportsResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class TypeGetListOfReadyOfflineReportsResponseImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.TypeBaseResponseImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse
{
    private static final long serialVersionUID = 1L;
    
    public TypeGetListOfReadyOfflineReportsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFLINEREPORTIDENTIFIERS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "offlineReportIdentifiers");
    private static final javax.xml.namespace.QName ADDITIONALOUTPUT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "additionalOutput");
    
    
    /**
     * Gets array of all "offlineReportIdentifiers" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier[] getOfflineReportIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFLINEREPORTIDENTIFIERS$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "offlineReportIdentifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier getOfflineReportIdentifiersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().find_element_user(OFFLINEREPORTIDENTIFIERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "offlineReportIdentifiers" element
     */
    public int sizeOfOfflineReportIdentifiersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINEREPORTIDENTIFIERS$0);
        }
    }
    
    /**
     * Sets array of all "offlineReportIdentifiers" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOfflineReportIdentifiersArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier[] offlineReportIdentifiersArray)
    {
        check_orphaned();
        arraySetterHelper(offlineReportIdentifiersArray, OFFLINEREPORTIDENTIFIERS$0);
    }
    
    /**
     * Sets ith "offlineReportIdentifiers" element
     */
    public void setOfflineReportIdentifiersArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier offlineReportIdentifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().find_element_user(OFFLINEREPORTIDENTIFIERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offlineReportIdentifiers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "offlineReportIdentifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier insertNewOfflineReportIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().insert_element_user(OFFLINEREPORTIDENTIFIERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "offlineReportIdentifiers" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier addNewOfflineReportIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OfflineReportIdentifier)get_store().add_element_user(OFFLINEREPORTIDENTIFIERS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "offlineReportIdentifiers" element
     */
    public void removeOfflineReportIdentifiers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINEREPORTIDENTIFIERS$0, i);
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
            get_store().find_all_element_users(ADDITIONALOUTPUT$2, targetList);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$2, i);
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
            return get_store().count_elements(ADDITIONALOUTPUT$2);
        }
    }
    
    /**
     * Sets array of all "additionalOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalOutputArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair[] additionalOutputArray)
    {
        check_orphaned();
        arraySetterHelper(additionalOutputArray, ADDITIONALOUTPUT$2);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().find_element_user(ADDITIONALOUTPUT$2, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().insert_element_user(ADDITIONALOUTPUT$2, i);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.KeyValuePair)get_store().add_element_user(ADDITIONALOUTPUT$2);
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
            get_store().remove_element(ADDITIONALOUTPUT$2, i);
        }
    }
}
