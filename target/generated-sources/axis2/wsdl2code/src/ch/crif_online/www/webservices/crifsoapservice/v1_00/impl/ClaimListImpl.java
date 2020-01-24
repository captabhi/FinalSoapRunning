/*
 * XML Type:  claimList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML claimList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ClaimListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ClaimList
{
    private static final long serialVersionUID = 1L;
    
    public ClaimListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCHKGCLAIM$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "eSchKgClaim");
    
    
    /**
     * Gets array of all "eSchKgClaim" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim[] getESchKgClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCHKGCLAIM$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eSchKgClaim" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim getESchKgClaimArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim)get_store().find_element_user(ESCHKGCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eSchKgClaim" element
     */
    public int sizeOfESchKgClaimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCHKGCLAIM$0);
        }
    }
    
    /**
     * Sets array of all "eSchKgClaim" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setESchKgClaimArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim[] eSchKgClaimArray)
    {
        check_orphaned();
        arraySetterHelper(eSchKgClaimArray, ESCHKGCLAIM$0);
    }
    
    /**
     * Sets ith "eSchKgClaim" element
     */
    public void setESchKgClaimArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim eSchKgClaim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim)get_store().find_element_user(ESCHKGCLAIM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eSchKgClaim);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eSchKgClaim" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim insertNewESchKgClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim)get_store().insert_element_user(ESCHKGCLAIM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eSchKgClaim" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim addNewESchKgClaim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgClaim)get_store().add_element_user(ESCHKGCLAIM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "eSchKgClaim" element
     */
    public void removeESchKgClaim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCHKGCLAIM$0, i);
        }
    }
}
