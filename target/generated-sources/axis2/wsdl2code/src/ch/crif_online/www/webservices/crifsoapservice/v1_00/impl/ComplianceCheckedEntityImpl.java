/*
 * XML Type:  ComplianceCheckedEntity
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ComplianceCheckedEntity(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ComplianceCheckedEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity
{
    private static final long serialVersionUID = 1L;
    
    public ComplianceCheckedEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKEDADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checkedAddress");
    private static final javax.xml.namespace.QName RELATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "relationType");
    private static final javax.xml.namespace.QName FOUNDENTITIES$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "foundEntities");
    private static final javax.xml.namespace.QName CHECKEDENTITIES$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checkedEntities");
    
    
    /**
     * Gets the "checkedAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription getCheckedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().find_element_user(CHECKEDADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkedAddress" element
     */
    public void setCheckedAddress(ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription checkedAddress)
    {
        generatedSetterHelperImpl(checkedAddress, CHECKEDADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkedAddress" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription addNewCheckedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressDescription)get_store().add_element_user(CHECKEDADDRESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "relationType" element
     */
    public java.lang.String getRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relationType" element
     */
    public void setRelationType(java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$2);
            }
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Sets (as xml) the "relationType" element
     */
    public void xsetRelationType(org.apache.xmlbeans.XmlString relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$2);
            }
            target.set(relationType);
        }
    }
    
    /**
     * Gets array of all "foundEntities" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[] getFoundEntitiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOUNDENTITIES$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "foundEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity getFoundEntitiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity)get_store().find_element_user(FOUNDENTITIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "foundEntities" element
     */
    public int sizeOfFoundEntitiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDENTITIES$4);
        }
    }
    
    /**
     * Sets array of all "foundEntities" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFoundEntitiesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity[] foundEntitiesArray)
    {
        check_orphaned();
        arraySetterHelper(foundEntitiesArray, FOUNDENTITIES$4);
    }
    
    /**
     * Sets ith "foundEntities" element
     */
    public void setFoundEntitiesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity foundEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity)get_store().find_element_user(FOUNDENTITIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(foundEntities);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "foundEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity insertNewFoundEntities(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity)get_store().insert_element_user(FOUNDENTITIES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "foundEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity addNewFoundEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceFoundEntity)get_store().add_element_user(FOUNDENTITIES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "foundEntities" element
     */
    public void removeFoundEntities(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDENTITIES$4, i);
        }
    }
    
    /**
     * Gets array of all "checkedEntities" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[] getCheckedEntitiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHECKEDENTITIES$6, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "checkedEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity getCheckedEntitiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().find_element_user(CHECKEDENTITIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "checkedEntities" element
     */
    public int sizeOfCheckedEntitiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKEDENTITIES$6);
        }
    }
    
    /**
     * Sets array of all "checkedEntities" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCheckedEntitiesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity[] checkedEntitiesArray)
    {
        check_orphaned();
        arraySetterHelper(checkedEntitiesArray, CHECKEDENTITIES$6);
    }
    
    /**
     * Sets ith "checkedEntities" element
     */
    public void setCheckedEntitiesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity checkedEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().find_element_user(CHECKEDENTITIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(checkedEntities);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "checkedEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity insertNewCheckedEntities(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().insert_element_user(CHECKEDENTITIES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "checkedEntities" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity addNewCheckedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ComplianceCheckedEntity)get_store().add_element_user(CHECKEDENTITIES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "checkedEntities" element
     */
    public void removeCheckedEntities(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKEDENTITIES$6, i);
        }
    }
}
