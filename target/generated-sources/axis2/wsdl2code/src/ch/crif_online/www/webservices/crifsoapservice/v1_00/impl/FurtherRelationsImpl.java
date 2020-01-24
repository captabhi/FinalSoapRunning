/*
 * XML Type:  FurtherRelations
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML FurtherRelations(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class FurtherRelationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.FurtherRelations
{
    private static final long serialVersionUID = 1L;
    
    public FurtherRelationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBVIOUSRELATIONS$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "obviousRelations");
    private static final javax.xml.namespace.QName PROBABLERELATIONS$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "probableRelations");
    private static final javax.xml.namespace.QName SAMEPHONENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "samePhoneNumber");
    
    
    /**
     * Gets array of all "obviousRelations" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getObviousRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBVIOUSRELATIONS$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "obviousRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getObviousRelationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(OBVIOUSRELATIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "obviousRelations" element
     */
    public int sizeOfObviousRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBVIOUSRELATIONS$0);
        }
    }
    
    /**
     * Sets array of all "obviousRelations" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObviousRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] obviousRelationsArray)
    {
        check_orphaned();
        arraySetterHelper(obviousRelationsArray, OBVIOUSRELATIONS$0);
    }
    
    /**
     * Sets ith "obviousRelations" element
     */
    public void setObviousRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData obviousRelations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(OBVIOUSRELATIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(obviousRelations);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "obviousRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewObviousRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().insert_element_user(OBVIOUSRELATIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "obviousRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewObviousRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(OBVIOUSRELATIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "obviousRelations" element
     */
    public void removeObviousRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBVIOUSRELATIONS$0, i);
        }
    }
    
    /**
     * Gets array of all "probableRelations" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getProbableRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROBABLERELATIONS$2, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "probableRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getProbableRelationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(PROBABLERELATIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "probableRelations" element
     */
    public int sizeOfProbableRelationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROBABLERELATIONS$2);
        }
    }
    
    /**
     * Sets array of all "probableRelations" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProbableRelationsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] probableRelationsArray)
    {
        check_orphaned();
        arraySetterHelper(probableRelationsArray, PROBABLERELATIONS$2);
    }
    
    /**
     * Sets ith "probableRelations" element
     */
    public void setProbableRelationsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData probableRelations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(PROBABLERELATIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(probableRelations);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "probableRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewProbableRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().insert_element_user(PROBABLERELATIONS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "probableRelations" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewProbableRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(PROBABLERELATIONS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "probableRelations" element
     */
    public void removeProbableRelations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROBABLERELATIONS$2, i);
        }
    }
    
    /**
     * Gets array of all "samePhoneNumber" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] getSamePhoneNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAMEPHONENUMBER$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "samePhoneNumber" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData getSamePhoneNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(SAMEPHONENUMBER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "samePhoneNumber" element
     */
    public int sizeOfSamePhoneNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMEPHONENUMBER$4);
        }
    }
    
    /**
     * Sets array of all "samePhoneNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSamePhoneNumberArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData[] samePhoneNumberArray)
    {
        check_orphaned();
        arraySetterHelper(samePhoneNumberArray, SAMEPHONENUMBER$4);
    }
    
    /**
     * Sets ith "samePhoneNumber" element
     */
    public void setSamePhoneNumberArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData samePhoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().find_element_user(SAMEPHONENUMBER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(samePhoneNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "samePhoneNumber" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData insertNewSamePhoneNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().insert_element_user(SAMEPHONENUMBER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "samePhoneNumber" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData addNewSamePhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyBaseData)get_store().add_element_user(SAMEPHONENUMBER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "samePhoneNumber" element
     */
    public void removeSamePhoneNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMEPHONENUMBER$4, i);
        }
    }
}
