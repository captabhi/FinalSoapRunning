/*
 * XML Type:  IdVerificationComparisonElement
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML IdVerificationComparisonElement(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdVerificationComparisonElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationComparisonElement
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationComparisonElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNAME$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "fieldName");
    private static final javax.xml.namespace.QName PROVIDEDVALUE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "providedValue");
    private static final javax.xml.namespace.QName DOCUMENTVALUE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentValue");
    private static final javax.xml.namespace.QName PERCENTAGE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "percentage");
    private static final javax.xml.namespace.QName MRZVALUE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "mrzValue");
    private static final javax.xml.namespace.QName PROVIDEDVSDOCUMENTSIMILARITY$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "providedVsDocumentSimilarity");
    private static final javax.xml.namespace.QName PROVIDEDVSMRZSIMILARITY$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "providedVsMrzSimilarity");
    private static final javax.xml.namespace.QName DOCUMENTVSMRZSIMILARITY$14 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "documentVsMrzSimilarity");
    
    
    /**
     * Gets the "fieldName" element
     */
    public java.lang.String getFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldName" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fieldName" element
     */
    public void setFieldName(java.lang.String fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNAME$0);
            }
            target.setStringValue(fieldName);
        }
    }
    
    /**
     * Sets (as xml) the "fieldName" element
     */
    public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNAME$0);
            }
            target.set(fieldName);
        }
    }
    
    /**
     * Gets the "providedValue" element
     */
    public java.lang.String getProvidedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "providedValue" element
     */
    public org.apache.xmlbeans.XmlString xgetProvidedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDEDVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "providedValue" element
     */
    public boolean isSetProvidedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDEDVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "providedValue" element
     */
    public void setProvidedValue(java.lang.String providedValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDEDVALUE$2);
            }
            target.setStringValue(providedValue);
        }
    }
    
    /**
     * Sets (as xml) the "providedValue" element
     */
    public void xsetProvidedValue(org.apache.xmlbeans.XmlString providedValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDEDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDEDVALUE$2);
            }
            target.set(providedValue);
        }
    }
    
    /**
     * Unsets the "providedValue" element
     */
    public void unsetProvidedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDEDVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "documentValue" element
     */
    public java.lang.String getDocumentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTVALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentValue" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTVALUE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentValue" element
     */
    public boolean isSetDocumentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "documentValue" element
     */
    public void setDocumentValue(java.lang.String documentValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTVALUE$4);
            }
            target.setStringValue(documentValue);
        }
    }
    
    /**
     * Sets (as xml) the "documentValue" element
     */
    public void xsetDocumentValue(org.apache.xmlbeans.XmlString documentValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTVALUE$4);
            }
            target.set(documentValue);
        }
    }
    
    /**
     * Unsets the "documentValue" element
     */
    public void unsetDocumentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTVALUE$4, 0);
        }
    }
    
    /**
     * Gets the "percentage" element
     */
    public java.math.BigInteger getPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "percentage" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PERCENTAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "percentage" element
     */
    public boolean isSetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERCENTAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "percentage" element
     */
    public void setPercentage(java.math.BigInteger percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTAGE$6);
            }
            target.setBigIntegerValue(percentage);
        }
    }
    
    /**
     * Sets (as xml) the "percentage" element
     */
    public void xsetPercentage(org.apache.xmlbeans.XmlInteger percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PERCENTAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PERCENTAGE$6);
            }
            target.set(percentage);
        }
    }
    
    /**
     * Unsets the "percentage" element
     */
    public void unsetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERCENTAGE$6, 0);
        }
    }
    
    /**
     * Gets the "mrzValue" element
     */
    public java.lang.String getMrzValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZVALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mrzValue" element
     */
    public org.apache.xmlbeans.XmlString xgetMrzValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZVALUE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "mrzValue" element
     */
    public boolean isSetMrzValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRZVALUE$8) != 0;
        }
    }
    
    /**
     * Sets the "mrzValue" element
     */
    public void setMrzValue(java.lang.String mrzValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRZVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRZVALUE$8);
            }
            target.setStringValue(mrzValue);
        }
    }
    
    /**
     * Sets (as xml) the "mrzValue" element
     */
    public void xsetMrzValue(org.apache.xmlbeans.XmlString mrzValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRZVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MRZVALUE$8);
            }
            target.set(mrzValue);
        }
    }
    
    /**
     * Unsets the "mrzValue" element
     */
    public void unsetMrzValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRZVALUE$8, 0);
        }
    }
    
    /**
     * Gets the "providedVsDocumentSimilarity" element
     */
    public java.math.BigInteger getProvidedVsDocumentSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "providedVsDocumentSimilarity" element
     */
    public org.apache.xmlbeans.XmlInteger xgetProvidedVsDocumentSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "providedVsDocumentSimilarity" element
     */
    public boolean isSetProvidedVsDocumentSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDEDVSDOCUMENTSIMILARITY$10) != 0;
        }
    }
    
    /**
     * Sets the "providedVsDocumentSimilarity" element
     */
    public void setProvidedVsDocumentSimilarity(java.math.BigInteger providedVsDocumentSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10);
            }
            target.setBigIntegerValue(providedVsDocumentSimilarity);
        }
    }
    
    /**
     * Sets (as xml) the "providedVsDocumentSimilarity" element
     */
    public void xsetProvidedVsDocumentSimilarity(org.apache.xmlbeans.XmlInteger providedVsDocumentSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROVIDEDVSDOCUMENTSIMILARITY$10);
            }
            target.set(providedVsDocumentSimilarity);
        }
    }
    
    /**
     * Unsets the "providedVsDocumentSimilarity" element
     */
    public void unsetProvidedVsDocumentSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDEDVSDOCUMENTSIMILARITY$10, 0);
        }
    }
    
    /**
     * Gets the "providedVsMrzSimilarity" element
     */
    public java.math.BigInteger getProvidedVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVSMRZSIMILARITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "providedVsMrzSimilarity" element
     */
    public org.apache.xmlbeans.XmlInteger xgetProvidedVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROVIDEDVSMRZSIMILARITY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "providedVsMrzSimilarity" element
     */
    public boolean isSetProvidedVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDEDVSMRZSIMILARITY$12) != 0;
        }
    }
    
    /**
     * Sets the "providedVsMrzSimilarity" element
     */
    public void setProvidedVsMrzSimilarity(java.math.BigInteger providedVsMrzSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDEDVSMRZSIMILARITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDEDVSMRZSIMILARITY$12);
            }
            target.setBigIntegerValue(providedVsMrzSimilarity);
        }
    }
    
    /**
     * Sets (as xml) the "providedVsMrzSimilarity" element
     */
    public void xsetProvidedVsMrzSimilarity(org.apache.xmlbeans.XmlInteger providedVsMrzSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROVIDEDVSMRZSIMILARITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROVIDEDVSMRZSIMILARITY$12);
            }
            target.set(providedVsMrzSimilarity);
        }
    }
    
    /**
     * Unsets the "providedVsMrzSimilarity" element
     */
    public void unsetProvidedVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDEDVSMRZSIMILARITY$12, 0);
        }
    }
    
    /**
     * Gets the "documentVsMrzSimilarity" element
     */
    public java.math.BigInteger getDocumentVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTVSMRZSIMILARITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentVsMrzSimilarity" element
     */
    public org.apache.xmlbeans.XmlInteger xgetDocumentVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOCUMENTVSMRZSIMILARITY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentVsMrzSimilarity" element
     */
    public boolean isSetDocumentVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTVSMRZSIMILARITY$14) != 0;
        }
    }
    
    /**
     * Sets the "documentVsMrzSimilarity" element
     */
    public void setDocumentVsMrzSimilarity(java.math.BigInteger documentVsMrzSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTVSMRZSIMILARITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTVSMRZSIMILARITY$14);
            }
            target.setBigIntegerValue(documentVsMrzSimilarity);
        }
    }
    
    /**
     * Sets (as xml) the "documentVsMrzSimilarity" element
     */
    public void xsetDocumentVsMrzSimilarity(org.apache.xmlbeans.XmlInteger documentVsMrzSimilarity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DOCUMENTVSMRZSIMILARITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DOCUMENTVSMRZSIMILARITY$14);
            }
            target.set(documentVsMrzSimilarity);
        }
    }
    
    /**
     * Unsets the "documentVsMrzSimilarity" element
     */
    public void unsetDocumentVsMrzSimilarity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTVSMRZSIMILARITY$14, 0);
        }
    }
}
