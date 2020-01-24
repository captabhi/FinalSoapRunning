/*
 * XML Type:  BranchOfficeList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML BranchOfficeList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class BranchOfficeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeList
{
    private static final long serialVersionUID = 1L;
    
    public BranchOfficeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANCHOFFICES$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "branchOffices");
    private static final javax.xml.namespace.QName ISTRUNCATED$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isTruncated");
    
    
    /**
     * Gets array of all "branchOffices" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[] getBranchOfficesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRANCHOFFICES$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "branchOffices" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem getBranchOfficesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem)get_store().find_element_user(BRANCHOFFICES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "branchOffices" element
     */
    public int sizeOfBranchOfficesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANCHOFFICES$0);
        }
    }
    
    /**
     * Sets array of all "branchOffices" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBranchOfficesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem[] branchOfficesArray)
    {
        check_orphaned();
        arraySetterHelper(branchOfficesArray, BRANCHOFFICES$0);
    }
    
    /**
     * Sets ith "branchOffices" element
     */
    public void setBranchOfficesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem branchOffices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem)get_store().find_element_user(BRANCHOFFICES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(branchOffices);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "branchOffices" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem insertNewBranchOffices(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem)get_store().insert_element_user(BRANCHOFFICES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "branchOffices" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem addNewBranchOffices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BranchOfficeListItem)get_store().add_element_user(BRANCHOFFICES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "branchOffices" element
     */
    public void removeBranchOffices(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANCHOFFICES$0, i);
        }
    }
    
    /**
     * Gets the "isTruncated" element
     */
    public boolean getIsTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRUNCATED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isTruncated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTRUNCATED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isTruncated" element
     */
    public void setIsTruncated(boolean isTruncated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRUNCATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTRUNCATED$2);
            }
            target.setBooleanValue(isTruncated);
        }
    }
    
    /**
     * Sets (as xml) the "isTruncated" element
     */
    public void xsetIsTruncated(org.apache.xmlbeans.XmlBoolean isTruncated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTRUNCATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTRUNCATED$2);
            }
            target.set(isTruncated);
        }
    }
}
