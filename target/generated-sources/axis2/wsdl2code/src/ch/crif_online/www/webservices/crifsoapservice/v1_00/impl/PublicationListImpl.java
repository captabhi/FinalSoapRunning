/*
 * XML Type:  PublicationList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML PublicationList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class PublicationListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationList
{
    private static final long serialVersionUID = 1L;
    
    public PublicationListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLICATIONS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publications");
    private static final javax.xml.namespace.QName ISTRUNCATED$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "isTruncated");
    
    
    /**
     * Gets array of all "publications" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication[] getPublicationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLICATIONS$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "publications" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication getPublicationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication)get_store().find_element_user(PUBLICATIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "publications" element
     */
    public int sizeOfPublicationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONS$0);
        }
    }
    
    /**
     * Sets array of all "publications" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPublicationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication[] publicationsArray)
    {
        check_orphaned();
        arraySetterHelper(publicationsArray, PUBLICATIONS$0);
    }
    
    /**
     * Sets ith "publications" element
     */
    public void setPublicationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication publications)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication)get_store().find_element_user(PUBLICATIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publications);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "publications" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication insertNewPublications(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication)get_store().insert_element_user(PUBLICATIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "publications" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication addNewPublications()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication)get_store().add_element_user(PUBLICATIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "publications" element
     */
    public void removePublications(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONS$0, i);
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
