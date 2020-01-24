/*
 * XML Type:  ComplianceCheckResult
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ComplianceCheckResult(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ComplianceCheckResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckResult
{
    private static final long serialVersionUID = 1L;
    
    public ComplianceCheckResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKEDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checkedEntity");
    private static final javax.xml.namespace.QName LISTDESCRIPTIONS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "listDescriptions");
    
    
    /**
     * Gets the "checkedEntity" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity getCheckedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().find_element_user(CHECKEDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checkedEntity" element
     */
    public boolean isSetCheckedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKEDENTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "checkedEntity" element
     */
    public void setCheckedEntity(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity checkedEntity)
    {
        generatedSetterHelperImpl(checkedEntity, CHECKEDENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkedEntity" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity addNewCheckedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().add_element_user(CHECKEDENTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "checkedEntity" element
     */
    public void unsetCheckedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKEDENTITY$0, 0);
        }
    }
    
    /**
     * Gets array of all "listDescriptions" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription[] getListDescriptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTDESCRIPTIONS$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listDescriptions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription getListDescriptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().find_element_user(LISTDESCRIPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listDescriptions" element
     */
    public int sizeOfListDescriptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTDESCRIPTIONS$2);
        }
    }
    
    /**
     * Sets array of all "listDescriptions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setListDescriptionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription[] listDescriptionsArray)
    {
        check_orphaned();
        arraySetterHelper(listDescriptionsArray, LISTDESCRIPTIONS$2);
    }
    
    /**
     * Sets ith "listDescriptions" element
     */
    public void setListDescriptionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription listDescriptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().find_element_user(LISTDESCRIPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listDescriptions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listDescriptions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription insertNewListDescriptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().insert_element_user(LISTDESCRIPTIONS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listDescriptions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription addNewListDescriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceListDescription)get_store().add_element_user(LISTDESCRIPTIONS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "listDescriptions" element
     */
    public void removeListDescriptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTDESCRIPTIONS$2, i);
        }
    }
}
