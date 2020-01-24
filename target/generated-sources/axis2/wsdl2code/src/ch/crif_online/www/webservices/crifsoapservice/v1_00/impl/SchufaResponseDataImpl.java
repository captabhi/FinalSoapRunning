/*
 * XML Type:  SchufaResponseData
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaResponseData(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaResponseDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaResponseData
{
    private static final long serialVersionUID = 1L;
    
    public SchufaResponseDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHUFAIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "schufaIdentification");
    private static final javax.xml.namespace.QName SCHUFASCORE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "schufaScore");
    private static final javax.xml.namespace.QName SCHUFAFEATURES$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "schufaFeatures");
    private static final javax.xml.namespace.QName SCHUFAPERSONDATA$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "schufaPersonData");
    
    
    /**
     * Gets the "schufaIdentification" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification getSchufaIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification)get_store().find_element_user(SCHUFAIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schufaIdentification" element
     */
    public boolean isSetSchufaIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHUFAIDENTIFICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "schufaIdentification" element
     */
    public void setSchufaIdentification(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification schufaIdentification)
    {
        generatedSetterHelperImpl(schufaIdentification, SCHUFAIDENTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schufaIdentification" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification addNewSchufaIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaIdentification)get_store().add_element_user(SCHUFAIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "schufaIdentification" element
     */
    public void unsetSchufaIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHUFAIDENTIFICATION$0, 0);
        }
    }
    
    /**
     * Gets the "schufaScore" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore getSchufaScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore)get_store().find_element_user(SCHUFASCORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schufaScore" element
     */
    public boolean isSetSchufaScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHUFASCORE$2) != 0;
        }
    }
    
    /**
     * Sets the "schufaScore" element
     */
    public void setSchufaScore(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore schufaScore)
    {
        generatedSetterHelperImpl(schufaScore, SCHUFASCORE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schufaScore" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore addNewSchufaScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore)get_store().add_element_user(SCHUFASCORE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "schufaScore" element
     */
    public void unsetSchufaScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHUFASCORE$2, 0);
        }
    }
    
    /**
     * Gets array of all "schufaFeatures" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[] getSchufaFeaturesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHUFAFEATURES$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schufaFeatures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature getSchufaFeaturesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature)get_store().find_element_user(SCHUFAFEATURES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "schufaFeatures" element
     */
    public int sizeOfSchufaFeaturesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHUFAFEATURES$4);
        }
    }
    
    /**
     * Sets array of all "schufaFeatures" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSchufaFeaturesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature[] schufaFeaturesArray)
    {
        check_orphaned();
        arraySetterHelper(schufaFeaturesArray, SCHUFAFEATURES$4);
    }
    
    /**
     * Sets ith "schufaFeatures" element
     */
    public void setSchufaFeaturesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature schufaFeatures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature)get_store().find_element_user(SCHUFAFEATURES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schufaFeatures);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schufaFeatures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature insertNewSchufaFeatures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature)get_store().insert_element_user(SCHUFAFEATURES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schufaFeatures" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature addNewSchufaFeatures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature)get_store().add_element_user(SCHUFAFEATURES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "schufaFeatures" element
     */
    public void removeSchufaFeatures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHUFAFEATURES$4, i);
        }
    }
    
    /**
     * Gets the "schufaPersonData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData getSchufaPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData)get_store().find_element_user(SCHUFAPERSONDATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schufaPersonData" element
     */
    public boolean isSetSchufaPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHUFAPERSONDATA$6) != 0;
        }
    }
    
    /**
     * Sets the "schufaPersonData" element
     */
    public void setSchufaPersonData(ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData schufaPersonData)
    {
        generatedSetterHelperImpl(schufaPersonData, SCHUFAPERSONDATA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schufaPersonData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData addNewSchufaPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaPersonData)get_store().add_element_user(SCHUFAPERSONDATA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "schufaPersonData" element
     */
    public void unsetSchufaPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHUFAPERSONDATA$6, 0);
        }
    }
}
