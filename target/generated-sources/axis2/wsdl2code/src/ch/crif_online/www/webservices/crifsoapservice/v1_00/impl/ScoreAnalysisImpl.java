/*
 * XML Type:  ScoreAnalysis
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ScoreAnalysis(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ScoreAnalysisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreAnalysis
{
    private static final long serialVersionUID = 1L;
    
    public ScoreAnalysisImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCORESCALERANGE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreScaleRange");
    private static final javax.xml.namespace.QName SCORE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "score");
    private static final javax.xml.namespace.QName AVERAGESCOREINDUSTRY$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "averageScoreIndustry");
    private static final javax.xml.namespace.QName AVERAGESCOREALL$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "averageScoreAll");
    private static final javax.xml.namespace.QName SCOREDECISIONRANGES$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreDecisionRanges");
    
    
    /**
     * Gets the "scoreScaleRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getScoreScaleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().find_element_user(SCORESCALERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scoreScaleRange" element
     */
    public boolean isSetScoreScaleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORESCALERANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "scoreScaleRange" element
     */
    public void setScoreScaleRange(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range scoreScaleRange)
    {
        generatedSetterHelperImpl(scoreScaleRange, SCORESCALERANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scoreScaleRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewScoreScaleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().add_element_user(SCORESCALERANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "scoreScaleRange" element
     */
    public void unsetScoreScaleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORESCALERANGE$0, 0);
        }
    }
    
    /**
     * Gets the "score" element
     */
    public int getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "score" element
     */
    public org.apache.xmlbeans.XmlInt xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCORE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "score" element
     */
    public void setScore(int score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$2);
            }
            target.setIntValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlInt score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCORE$2);
            }
            target.set(score);
        }
    }
    
    /**
     * Gets the "averageScoreIndustry" element
     */
    public java.math.BigInteger getAverageScoreIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVERAGESCOREINDUSTRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "averageScoreIndustry" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAverageScoreIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVERAGESCOREINDUSTRY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "averageScoreIndustry" element
     */
    public boolean isSetAverageScoreIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVERAGESCOREINDUSTRY$4) != 0;
        }
    }
    
    /**
     * Sets the "averageScoreIndustry" element
     */
    public void setAverageScoreIndustry(java.math.BigInteger averageScoreIndustry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVERAGESCOREINDUSTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVERAGESCOREINDUSTRY$4);
            }
            target.setBigIntegerValue(averageScoreIndustry);
        }
    }
    
    /**
     * Sets (as xml) the "averageScoreIndustry" element
     */
    public void xsetAverageScoreIndustry(org.apache.xmlbeans.XmlInteger averageScoreIndustry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVERAGESCOREINDUSTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVERAGESCOREINDUSTRY$4);
            }
            target.set(averageScoreIndustry);
        }
    }
    
    /**
     * Unsets the "averageScoreIndustry" element
     */
    public void unsetAverageScoreIndustry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVERAGESCOREINDUSTRY$4, 0);
        }
    }
    
    /**
     * Gets the "averageScoreAll" element
     */
    public java.math.BigInteger getAverageScoreAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVERAGESCOREALL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "averageScoreAll" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAverageScoreAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVERAGESCOREALL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "averageScoreAll" element
     */
    public boolean isSetAverageScoreAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVERAGESCOREALL$6) != 0;
        }
    }
    
    /**
     * Sets the "averageScoreAll" element
     */
    public void setAverageScoreAll(java.math.BigInteger averageScoreAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVERAGESCOREALL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVERAGESCOREALL$6);
            }
            target.setBigIntegerValue(averageScoreAll);
        }
    }
    
    /**
     * Sets (as xml) the "averageScoreAll" element
     */
    public void xsetAverageScoreAll(org.apache.xmlbeans.XmlInteger averageScoreAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVERAGESCOREALL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVERAGESCOREALL$6);
            }
            target.set(averageScoreAll);
        }
    }
    
    /**
     * Unsets the "averageScoreAll" element
     */
    public void unsetAverageScoreAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVERAGESCOREALL$6, 0);
        }
    }
    
    /**
     * Gets array of all "scoreDecisionRanges" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[] getScoreDecisionRangesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOREDECISIONRANGES$8, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scoreDecisionRanges" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange getScoreDecisionRangesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange)get_store().find_element_user(SCOREDECISIONRANGES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scoreDecisionRanges" element
     */
    public int sizeOfScoreDecisionRangesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOREDECISIONRANGES$8);
        }
    }
    
    /**
     * Sets array of all "scoreDecisionRanges" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setScoreDecisionRangesArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange[] scoreDecisionRangesArray)
    {
        check_orphaned();
        arraySetterHelper(scoreDecisionRangesArray, SCOREDECISIONRANGES$8);
    }
    
    /**
     * Sets ith "scoreDecisionRanges" element
     */
    public void setScoreDecisionRangesArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange scoreDecisionRanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange)get_store().find_element_user(SCOREDECISIONRANGES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scoreDecisionRanges);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scoreDecisionRanges" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange insertNewScoreDecisionRanges(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange)get_store().insert_element_user(SCOREDECISIONRANGES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scoreDecisionRanges" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange addNewScoreDecisionRanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange)get_store().add_element_user(SCOREDECISIONRANGES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "scoreDecisionRanges" element
     */
    public void removeScoreDecisionRanges(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOREDECISIONRANGES$8, i);
        }
    }
}
