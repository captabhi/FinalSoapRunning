/*
 * XML Type:  SchufaScore
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaScore(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaScoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaScore
{
    private static final long serialVersionUID = 1L;
    
    public SchufaScoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "description");
    private static final javax.xml.namespace.QName SCOREVALUE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreValue");
    private static final javax.xml.namespace.QName RISKQUOTA$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "riskQuota");
    private static final javax.xml.namespace.QName SCORECATEGORY$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreCategory");
    private static final javax.xml.namespace.QName SCORETEXT$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreText");
    private static final javax.xml.namespace.QName SCOREINFOTEXT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreInfoText");
    private static final javax.xml.namespace.QName SCOREERROR$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreError");
    
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "scoreValue" element
     */
    public java.math.BigInteger getScoreValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "scoreValue" element
     */
    public org.apache.xmlbeans.XmlInteger xgetScoreValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCOREVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "scoreValue" element
     */
    public boolean isSetScoreValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOREVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "scoreValue" element
     */
    public void setScoreValue(java.math.BigInteger scoreValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOREVALUE$2);
            }
            target.setBigIntegerValue(scoreValue);
        }
    }
    
    /**
     * Sets (as xml) the "scoreValue" element
     */
    public void xsetScoreValue(org.apache.xmlbeans.XmlInteger scoreValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCOREVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SCOREVALUE$2);
            }
            target.set(scoreValue);
        }
    }
    
    /**
     * Unsets the "scoreValue" element
     */
    public void unsetScoreValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOREVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "riskQuota" element
     */
    public java.math.BigDecimal getRiskQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RISKQUOTA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "riskQuota" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetRiskQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RISKQUOTA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "riskQuota" element
     */
    public boolean isSetRiskQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RISKQUOTA$4) != 0;
        }
    }
    
    /**
     * Sets the "riskQuota" element
     */
    public void setRiskQuota(java.math.BigDecimal riskQuota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RISKQUOTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RISKQUOTA$4);
            }
            target.setBigDecimalValue(riskQuota);
        }
    }
    
    /**
     * Sets (as xml) the "riskQuota" element
     */
    public void xsetRiskQuota(org.apache.xmlbeans.XmlDecimal riskQuota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(RISKQUOTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(RISKQUOTA$4);
            }
            target.set(riskQuota);
        }
    }
    
    /**
     * Unsets the "riskQuota" element
     */
    public void unsetRiskQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RISKQUOTA$4, 0);
        }
    }
    
    /**
     * Gets the "scoreCategory" element
     */
    public java.lang.String getScoreCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORECATEGORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scoreCategory" element
     */
    public org.apache.xmlbeans.XmlString xgetScoreCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORECATEGORY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "scoreCategory" element
     */
    public boolean isSetScoreCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORECATEGORY$6) != 0;
        }
    }
    
    /**
     * Sets the "scoreCategory" element
     */
    public void setScoreCategory(java.lang.String scoreCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORECATEGORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORECATEGORY$6);
            }
            target.setStringValue(scoreCategory);
        }
    }
    
    /**
     * Sets (as xml) the "scoreCategory" element
     */
    public void xsetScoreCategory(org.apache.xmlbeans.XmlString scoreCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORECATEGORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCORECATEGORY$6);
            }
            target.set(scoreCategory);
        }
    }
    
    /**
     * Unsets the "scoreCategory" element
     */
    public void unsetScoreCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORECATEGORY$6, 0);
        }
    }
    
    /**
     * Gets the "scoreText" element
     */
    public java.lang.String getScoreText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORETEXT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scoreText" element
     */
    public org.apache.xmlbeans.XmlString xgetScoreText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORETEXT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "scoreText" element
     */
    public boolean isSetScoreText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORETEXT$8) != 0;
        }
    }
    
    /**
     * Sets the "scoreText" element
     */
    public void setScoreText(java.lang.String scoreText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORETEXT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORETEXT$8);
            }
            target.setStringValue(scoreText);
        }
    }
    
    /**
     * Sets (as xml) the "scoreText" element
     */
    public void xsetScoreText(org.apache.xmlbeans.XmlString scoreText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORETEXT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCORETEXT$8);
            }
            target.set(scoreText);
        }
    }
    
    /**
     * Unsets the "scoreText" element
     */
    public void unsetScoreText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORETEXT$8, 0);
        }
    }
    
    /**
     * Gets array of all "scoreInfoText" elements
     */
    public java.lang.String[] getScoreInfoTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOREINFOTEXT$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "scoreInfoText" element
     */
    public java.lang.String getScoreInfoTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREINFOTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "scoreInfoText" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetScoreInfoTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOREINFOTEXT$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "scoreInfoText" element
     */
    public org.apache.xmlbeans.XmlString xgetScoreInfoTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOREINFOTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scoreInfoText" element
     */
    public int sizeOfScoreInfoTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOREINFOTEXT$10);
        }
    }
    
    /**
     * Sets array of all "scoreInfoText" element
     */
    public void setScoreInfoTextArray(java.lang.String[] scoreInfoTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scoreInfoTextArray, SCOREINFOTEXT$10);
        }
    }
    
    /**
     * Sets ith "scoreInfoText" element
     */
    public void setScoreInfoTextArray(int i, java.lang.String scoreInfoText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREINFOTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(scoreInfoText);
        }
    }
    
    /**
     * Sets (as xml) array of all "scoreInfoText" element
     */
    public void xsetScoreInfoTextArray(org.apache.xmlbeans.XmlString[]scoreInfoTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scoreInfoTextArray, SCOREINFOTEXT$10);
        }
    }
    
    /**
     * Sets (as xml) ith "scoreInfoText" element
     */
    public void xsetScoreInfoTextArray(int i, org.apache.xmlbeans.XmlString scoreInfoText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOREINFOTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scoreInfoText);
        }
    }
    
    /**
     * Inserts the value as the ith "scoreInfoText" element
     */
    public void insertScoreInfoText(int i, java.lang.String scoreInfoText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCOREINFOTEXT$10, i);
            target.setStringValue(scoreInfoText);
        }
    }
    
    /**
     * Appends the value as the last "scoreInfoText" element
     */
    public void addScoreInfoText(java.lang.String scoreInfoText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOREINFOTEXT$10);
            target.setStringValue(scoreInfoText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scoreInfoText" element
     */
    public org.apache.xmlbeans.XmlString insertNewScoreInfoText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SCOREINFOTEXT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scoreInfoText" element
     */
    public org.apache.xmlbeans.XmlString addNewScoreInfoText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOREINFOTEXT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "scoreInfoText" element
     */
    public void removeScoreInfoText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOREINFOTEXT$10, i);
        }
    }
    
    /**
     * Gets the "scoreError" element
     */
    public java.lang.String getScoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREERROR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scoreError" element
     */
    public org.apache.xmlbeans.XmlString xgetScoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOREERROR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "scoreError" element
     */
    public boolean isSetScoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOREERROR$12) != 0;
        }
    }
    
    /**
     * Sets the "scoreError" element
     */
    public void setScoreError(java.lang.String scoreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOREERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOREERROR$12);
            }
            target.setStringValue(scoreError);
        }
    }
    
    /**
     * Sets (as xml) the "scoreError" element
     */
    public void xsetScoreError(org.apache.xmlbeans.XmlString scoreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOREERROR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOREERROR$12);
            }
            target.set(scoreError);
        }
    }
    
    /**
     * Unsets the "scoreError" element
     */
    public void unsetScoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOREERROR$12, 0);
        }
    }
}
