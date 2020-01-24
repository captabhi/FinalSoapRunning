/*
 * XML Type:  jobList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML jobList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class JobListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.JobList
{
    private static final long serialVersionUID = 1L;
    
    public JobListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCHKGJOBDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "eSchKgJobDescription");
    
    
    /**
     * Gets array of all "eSchKgJobDescription" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription[] getESchKgJobDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCHKGJOBDESCRIPTION$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eSchKgJobDescription" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription getESchKgJobDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription)get_store().find_element_user(ESCHKGJOBDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eSchKgJobDescription" element
     */
    public int sizeOfESchKgJobDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCHKGJOBDESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "eSchKgJobDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setESchKgJobDescriptionArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription[] eSchKgJobDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(eSchKgJobDescriptionArray, ESCHKGJOBDESCRIPTION$0);
    }
    
    /**
     * Sets ith "eSchKgJobDescription" element
     */
    public void setESchKgJobDescriptionArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription eSchKgJobDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription)get_store().find_element_user(ESCHKGJOBDESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eSchKgJobDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eSchKgJobDescription" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription insertNewESchKgJobDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription)get_store().insert_element_user(ESCHKGJOBDESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eSchKgJobDescription" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription addNewESchKgJobDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgJobDescription)get_store().add_element_user(ESCHKGJOBDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "eSchKgJobDescription" element
     */
    public void removeESchKgJobDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCHKGJOBDESCRIPTION$0, i);
        }
    }
}
