/*
 * XML Type:  IdVerificationRequestData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationRequestData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationRequestDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestData
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationRequestDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTIMAGE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentImage");
    private static final javax.xml.namespace.QName DOCUMENT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "document");
    private static final javax.xml.namespace.QName PERSON$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "person");
    private static final javax.xml.namespace.QName DOCUMENTTYPE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentType");
    
    
    /**
     * Gets array of all "documentImage" elements
     */
    public java.lang.String[] getDocumentImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTIMAGE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "documentImage" element
     */
    public java.lang.String getDocumentImageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTIMAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "documentImage" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDocumentImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTIMAGE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "documentImage" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentImageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTIMAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentImage" element
     */
    public int sizeOfDocumentImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTIMAGE$0);
        }
    }
    
    /**
     * Sets array of all "documentImage" element
     */
    public void setDocumentImageArray(java.lang.String[] documentImageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentImageArray, DOCUMENTIMAGE$0);
        }
    }
    
    /**
     * Sets ith "documentImage" element
     */
    public void setDocumentImageArray(int i, java.lang.String documentImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTIMAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(documentImage);
        }
    }
    
    /**
     * Sets (as xml) array of all "documentImage" element
     */
    public void xsetDocumentImageArray(org.apache.xmlbeans.XmlString[]documentImageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentImageArray, DOCUMENTIMAGE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "documentImage" element
     */
    public void xsetDocumentImageArray(int i, org.apache.xmlbeans.XmlString documentImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTIMAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentImage);
        }
    }
    
    /**
     * Inserts the value as the ith "documentImage" element
     */
    public void insertDocumentImage(int i, java.lang.String documentImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOCUMENTIMAGE$0, i);
            target.setStringValue(documentImage);
        }
    }
    
    /**
     * Appends the value as the last "documentImage" element
     */
    public void addDocumentImage(java.lang.String documentImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTIMAGE$0);
            target.setStringValue(documentImage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentImage" element
     */
    public org.apache.xmlbeans.XmlString insertNewDocumentImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DOCUMENTIMAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentImage" element
     */
    public org.apache.xmlbeans.XmlString addNewDocumentImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTIMAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentImage" element
     */
    public void removeDocumentImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTIMAGE$0, i);
        }
    }
    
    /**
     * Gets the "document" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1)get_store().find_element_user(DOCUMENT$2, 0);
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
            return get_store().count_elements(DOCUMENT$2) != 0;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1 document)
    {
        generatedSetterHelperImpl(document, DOCUMENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocument1)get_store().add_element_user(DOCUMENT$2);
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
            get_store().remove_element(DOCUMENT$2, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson)get_store().find_element_user(PERSON$4, 0);
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
            return get_store().count_elements(PERSON$4) != 0;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson person)
    {
        generatedSetterHelperImpl(person, PERSON$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationPerson)get_store().add_element_user(PERSON$4);
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
            get_store().remove_element(PERSON$4, 0);
        }
    }
    
    /**
     * Gets the "documentType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum getDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType xgetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().find_element_user(DOCUMENTTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentType" element
     */
    public boolean isSetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "documentType" element
     */
    public void setDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType.Enum documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTTYPE$6);
            }
            target.setEnumValue(documentType);
        }
    }
    
    /**
     * Sets (as xml) the "documentType" element
     */
    public void xsetDocumentType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().find_element_user(DOCUMENTTYPE$6, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationDocumentType)get_store().add_element_user(DOCUMENTTYPE$6);
            }
            target.set(documentType);
        }
    }
    
    /**
     * Unsets the "documentType" element
     */
    public void unsetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTTYPE$6, 0);
        }
    }
}
