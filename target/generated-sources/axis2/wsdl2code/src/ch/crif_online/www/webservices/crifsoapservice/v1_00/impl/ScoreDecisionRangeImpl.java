/*
 * XML Type:  ScoreDecisionRange
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML ScoreDecisionRange(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class ScoreDecisionRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.ScoreDecisionRange
{
    private static final long serialVersionUID = 1L;
    
    public ScoreDecisionRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCORERANGE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "scoreRange");
    private static final javax.xml.namespace.QName DECISION$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "decision");
    
    
    /**
     * Gets the "scoreRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range getScoreRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().find_element_user(SCORERANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scoreRange" element
     */
    public void setScoreRange(ch.crif_online.www.webservices.crifsoapservice.v1_00.Range scoreRange)
    {
        generatedSetterHelperImpl(scoreRange, SCORERANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scoreRange" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Range addNewScoreRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Range target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Range)get_store().add_element_user(SCORERANGE$0);
            return target;
        }
    }
    
    /**
     * Gets the "decision" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum getDecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "decision" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision xgetDecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().find_element_user(DECISION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "decision" element
     */
    public void setDecision(ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum decision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECISION$2);
            }
            target.setEnumValue(decision);
        }
    }
    
    /**
     * Sets (as xml) the "decision" element
     */
    public void xsetDecision(ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision decision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().find_element_user(DECISION$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().add_element_user(DECISION$2);
            }
            target.set(decision);
        }
    }
}
