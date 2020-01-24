/*
 * XML Type:  OrganizationPositionList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML OrganizationPositionList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class OrganizationPositionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionList
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPositionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONPOSITIONS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "organizationPositions");
    private static final javax.xml.namespace.QName ISTRUNCATED$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isTruncated");
    
    
    /**
     * Gets array of all "organizationPositions" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] getOrganizationPositionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONPOSITIONS$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition getOrganizationPositionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().find_element_user(ORGANIZATIONPOSITIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "organizationPositions" element
     */
    public int sizeOfOrganizationPositionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPOSITIONS$0);
        }
    }
    
    /**
     * Sets array of all "organizationPositions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrganizationPositionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition[] organizationPositionsArray)
    {
        check_orphaned();
        arraySetterHelper(organizationPositionsArray, ORGANIZATIONPOSITIONS$0);
    }
    
    /**
     * Sets ith "organizationPositions" element
     */
    public void setOrganizationPositionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition organizationPositions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().find_element_user(ORGANIZATIONPOSITIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationPositions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition insertNewOrganizationPositions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().insert_element_user(ORGANIZATIONPOSITIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "organizationPositions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition addNewOrganizationPositions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPosition)get_store().add_element_user(ORGANIZATIONPOSITIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "organizationPositions" element
     */
    public void removeOrganizationPositions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPOSITIONS$0, i);
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
