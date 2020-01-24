/*
 * XML Type:  IdVerificationContent
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationContent(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationContent
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "document");
    private static final javax.xml.namespace.QName PERSON$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "person");
    private static final javax.xml.namespace.QName CHECKS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checks");
    private static final javax.xml.namespace.QName DOCUMENTIMAGES$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentImages");
    
    
    /**
     * Gets the "document" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1)get_store().find_element_user(DOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "document" element
     */
    public boolean isSetDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 document)
    {
        generatedSetterHelperImpl(document, DOCUMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "document" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1)get_store().add_element_user(DOCUMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "document" element
     */
    public void unsetDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENT$0, 0);
        }
    }
    
    /**
     * Gets the "person" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson)get_store().find_element_user(PERSON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "person" element
     */
    public boolean isSetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$2) != 0;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson person)
    {
        generatedSetterHelperImpl(person, PERSON$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson)get_store().add_element_user(PERSON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "person" element
     */
    public void unsetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$2, 0);
        }
    }
    
    /**
     * Gets the "checks" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks getChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks)get_store().find_element_user(CHECKS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checks" element
     */
    public boolean isSetChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKS$4) != 0;
        }
    }
    
    /**
     * Sets the "checks" element
     */
    public void setChecks(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks checks)
    {
        generatedSetterHelperImpl(checks, CHECKS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checks" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks addNewChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationChecks)get_store().add_element_user(CHECKS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "checks" element
     */
    public void unsetChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKS$4, 0);
        }
    }
    
    /**
     * Gets array of all "documentImages" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] getDocumentImagesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTIMAGES$6, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentImages" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData getDocumentImagesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().find_element_user(DOCUMENTIMAGES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentImages" element
     */
    public int sizeOfDocumentImagesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTIMAGES$6);
        }
    }
    
    /**
     * Sets array of all "documentImages" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentImagesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData[] documentImagesArray)
    {
        check_orphaned();
        arraySetterHelper(documentImagesArray, DOCUMENTIMAGES$6);
    }
    
    /**
     * Sets ith "documentImages" element
     */
    public void setDocumentImagesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData documentImages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().find_element_user(DOCUMENTIMAGES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentImages);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentImages" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData insertNewDocumentImages(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().insert_element_user(DOCUMENTIMAGES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentImages" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData addNewDocumentImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.BinaryData)get_store().add_element_user(DOCUMENTIMAGES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentImages" element
     */
    public void removeDocumentImages(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTIMAGES$6, i);
        }
    }
}
