/*
 * XML Type:  DecisionMatrix
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML DecisionMatrix(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class DecisionMatrixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.DecisionMatrix
{
    private static final long serialVersionUID = 1L;
    
    public DecisionMatrixImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECISION$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "decision");
    private static final javax.xml.namespace.QName DECISIONTEXT$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "decisionText");
    private static final javax.xml.namespace.QName SUBDECISIONS$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "subdecisions");
    private static final javax.xml.namespace.QName RATINGS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "ratings");
    private static final javax.xml.namespace.QName CREDITLIMIT$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "creditLimit");
    
    
    /**
     * Gets the "decision" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision.Enum getDecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISION$0, 0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().find_element_user(DECISION$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECISION$0);
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
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().find_element_user(DECISION$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Decision)get_store().add_element_user(DECISION$0);
            }
            target.set(decision);
        }
    }
    
    /**
     * Gets the "decisionText" element
     */
    public java.lang.String getDecisionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISIONTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decisionText" element
     */
    public org.apache.xmlbeans.XmlString xgetDecisionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECISIONTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "decisionText" element
     */
    public void setDecisionText(java.lang.String decisionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECISIONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECISIONTEXT$2);
            }
            target.setStringValue(decisionText);
        }
    }
    
    /**
     * Sets (as xml) the "decisionText" element
     */
    public void xsetDecisionText(org.apache.xmlbeans.XmlString decisionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECISIONTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECISIONTEXT$2);
            }
            target.set(decisionText);
        }
    }
    
    /**
     * Gets array of all "subdecisions" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[] getSubdecisionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBDECISIONS$4, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subdecisions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision getSubdecisionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision)get_store().find_element_user(SUBDECISIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subdecisions" element
     */
    public int sizeOfSubdecisionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBDECISIONS$4);
        }
    }
    
    /**
     * Sets array of all "subdecisions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubdecisionsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision[] subdecisionsArray)
    {
        check_orphaned();
        arraySetterHelper(subdecisionsArray, SUBDECISIONS$4);
    }
    
    /**
     * Sets ith "subdecisions" element
     */
    public void setSubdecisionsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision subdecisions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision)get_store().find_element_user(SUBDECISIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subdecisions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subdecisions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision insertNewSubdecisions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision)get_store().insert_element_user(SUBDECISIONS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subdecisions" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision addNewSubdecisions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Subdecision)get_store().add_element_user(SUBDECISIONS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "subdecisions" element
     */
    public void removeSubdecisions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBDECISIONS$4, i);
        }
    }
    
    /**
     * Gets array of all "ratings" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[] getRatingsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RATINGS$6, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ratings" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating getRatingsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating)get_store().find_element_user(RATINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ratings" element
     */
    public int sizeOfRatingsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATINGS$6);
        }
    }
    
    /**
     * Sets array of all "ratings" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRatingsArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating[] ratingsArray)
    {
        check_orphaned();
        arraySetterHelper(ratingsArray, RATINGS$6);
    }
    
    /**
     * Sets ith "ratings" element
     */
    public void setRatingsArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating ratings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating)get_store().find_element_user(RATINGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ratings);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ratings" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating insertNewRatings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating)get_store().insert_element_user(RATINGS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ratings" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating addNewRatings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Rating)get_store().add_element_user(RATINGS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ratings" element
     */
    public void removeRatings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATINGS$6, i);
        }
    }
    
    /**
     * Gets the "creditLimit" element
     */
    public java.math.BigInteger getCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITLIMIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "creditLimit" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CREDITLIMIT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "creditLimit" element
     */
    public boolean isSetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITLIMIT$8) != 0;
        }
    }
    
    /**
     * Sets the "creditLimit" element
     */
    public void setCreditLimit(java.math.BigInteger creditLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITLIMIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITLIMIT$8);
            }
            target.setBigIntegerValue(creditLimit);
        }
    }
    
    /**
     * Sets (as xml) the "creditLimit" element
     */
    public void xsetCreditLimit(org.apache.xmlbeans.XmlInteger creditLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CREDITLIMIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CREDITLIMIT$8);
            }
            target.set(creditLimit);
        }
    }
    
    /**
     * Unsets the "creditLimit" element
     */
    public void unsetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITLIMIT$8, 0);
        }
    }
}
