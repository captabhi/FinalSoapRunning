/*
 * XML Type:  SchufaBaseFeature
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML SchufaBaseFeature(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class SchufaBaseFeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SchufaBaseFeature
{
    private static final long serialVersionUID = 1L;
    
    public SchufaBaseFeatureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "type");
    private static final javax.xml.namespace.QName FEATUREWITHOUTBIRTHDATE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "featureWithoutBirthdate");
    private static final javax.xml.namespace.QName OWNFEATURE$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "ownFeature");
    private static final javax.xml.namespace.QName FEATURECODE$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "featureCode");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "description");
    private static final javax.xml.namespace.QName TEXT$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "text");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "featureWithoutBirthdate" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getFeatureWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATUREWITHOUTBIRTHDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureWithoutBirthdate" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetFeatureWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(FEATUREWITHOUTBIRTHDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "featureWithoutBirthdate" element
     */
    public boolean isSetFeatureWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREWITHOUTBIRTHDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "featureWithoutBirthdate" element
     */
    public void setFeatureWithoutBirthdate(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum featureWithoutBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATUREWITHOUTBIRTHDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATUREWITHOUTBIRTHDATE$2);
            }
            target.setEnumValue(featureWithoutBirthdate);
        }
    }
    
    /**
     * Sets (as xml) the "featureWithoutBirthdate" element
     */
    public void xsetFeatureWithoutBirthdate(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean featureWithoutBirthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(FEATUREWITHOUTBIRTHDATE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(FEATUREWITHOUTBIRTHDATE$2);
            }
            target.set(featureWithoutBirthdate);
        }
    }
    
    /**
     * Unsets the "featureWithoutBirthdate" element
     */
    public void unsetFeatureWithoutBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREWITHOUTBIRTHDATE$2, 0);
        }
    }
    
    /**
     * Gets the "ownFeature" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum getOwnFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNFEATURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownFeature" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean xgetOwnFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(OWNFEATURE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ownFeature" element
     */
    public boolean isSetOwnFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNFEATURE$4) != 0;
        }
    }
    
    /**
     * Sets the "ownFeature" element
     */
    public void setOwnFeature(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean.Enum ownFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNFEATURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNFEATURE$4);
            }
            target.setEnumValue(ownFeature);
        }
    }
    
    /**
     * Sets (as xml) the "ownFeature" element
     */
    public void xsetOwnFeature(ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean ownFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().find_element_user(OWNFEATURE$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.NullableBoolean)get_store().add_element_user(OWNFEATURE$4);
            }
            target.set(ownFeature);
        }
    }
    
    /**
     * Unsets the "ownFeature" element
     */
    public void unsetOwnFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNFEATURE$4, 0);
        }
    }
    
    /**
     * Gets the "featureCode" element
     */
    public java.lang.String getFeatureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureCode" element
     */
    public org.apache.xmlbeans.XmlString xgetFeatureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURECODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "featureCode" element
     */
    public boolean isSetFeatureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "featureCode" element
     */
    public void setFeatureCode(java.lang.String featureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURECODE$6);
            }
            target.setStringValue(featureCode);
        }
    }
    
    /**
     * Sets (as xml) the "featureCode" element
     */
    public void xsetFeatureCode(org.apache.xmlbeans.XmlString featureCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEATURECODE$6);
            }
            target.set(featureCode);
        }
    }
    
    /**
     * Unsets the "featureCode" element
     */
    public void unsetFeatureCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURECODE$6, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
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
            return get_store().count_elements(DESCRIPTION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$10) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$10);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$10);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$10, 0);
        }
    }
}
