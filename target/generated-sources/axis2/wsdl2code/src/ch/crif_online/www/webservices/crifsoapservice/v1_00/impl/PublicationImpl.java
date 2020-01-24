/*
 * XML Type:  Publication
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML Publication(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class PublicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.Publication
{
    private static final long serialVersionUID = 1L;
    
    public PublicationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLICATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationDate");
    private static final javax.xml.namespace.QName PUBLICATIONCATEGORYORIGINAL$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationCategoryOriginal");
    private static final javax.xml.namespace.QName PUBLICATIONCATEGORY$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationCategory");
    private static final javax.xml.namespace.QName PUBLICATIONLABELS$6 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationLabels");
    private static final javax.xml.namespace.QName LANGUAGE$8 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "language");
    private static final javax.xml.namespace.QName PUBLICATIONREGION$10 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "publicationRegion");
    private static final javax.xml.namespace.QName TEXT$12 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "text");
    
    
    /**
     * Gets the "publicationDate" element
     */
    public java.lang.String getPublicationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publicationDate" element
     */
    public void setPublicationDate(java.lang.String publicationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONDATE$0);
            }
            target.setStringValue(publicationDate);
        }
    }
    
    /**
     * Sets (as xml) the "publicationDate" element
     */
    public void xsetPublicationDate(org.apache.xmlbeans.XmlString publicationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICATIONDATE$0);
            }
            target.set(publicationDate);
        }
    }
    
    /**
     * Gets the "publicationCategoryOriginal" element
     */
    public java.lang.String getPublicationCategoryOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONCATEGORYORIGINAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationCategoryOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicationCategoryOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONCATEGORYORIGINAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "publicationCategoryOriginal" element
     */
    public boolean isSetPublicationCategoryOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONCATEGORYORIGINAL$2) != 0;
        }
    }
    
    /**
     * Sets the "publicationCategoryOriginal" element
     */
    public void setPublicationCategoryOriginal(java.lang.String publicationCategoryOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONCATEGORYORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONCATEGORYORIGINAL$2);
            }
            target.setStringValue(publicationCategoryOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "publicationCategoryOriginal" element
     */
    public void xsetPublicationCategoryOriginal(org.apache.xmlbeans.XmlString publicationCategoryOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONCATEGORYORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICATIONCATEGORYORIGINAL$2);
            }
            target.set(publicationCategoryOriginal);
        }
    }
    
    /**
     * Unsets the "publicationCategoryOriginal" element
     */
    public void unsetPublicationCategoryOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONCATEGORYORIGINAL$2, 0);
        }
    }
    
    /**
     * Gets the "publicationCategory" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.Enum getPublicationCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONCATEGORY$4, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationCategory" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory xgetPublicationCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory)get_store().find_element_user(PUBLICATIONCATEGORY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publicationCategory" element
     */
    public void setPublicationCategory(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory.Enum publicationCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONCATEGORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONCATEGORY$4);
            }
            target.setEnumValue(publicationCategory);
        }
    }
    
    /**
     * Sets (as xml) the "publicationCategory" element
     */
    public void xsetPublicationCategory(ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory publicationCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory)get_store().find_element_user(PUBLICATIONCATEGORY$4, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.PublicationCategory)get_store().add_element_user(PUBLICATIONCATEGORY$4);
            }
            target.set(publicationCategory);
        }
    }
    
    /**
     * Gets array of all "publicationLabels" elements
     */
    public java.lang.String[] getPublicationLabelsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLICATIONLABELS$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "publicationLabels" element
     */
    public java.lang.String getPublicationLabelsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONLABELS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "publicationLabels" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPublicationLabelsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLICATIONLABELS$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "publicationLabels" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicationLabelsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONLABELS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "publicationLabels" element
     */
    public int sizeOfPublicationLabelsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONLABELS$6);
        }
    }
    
    /**
     * Sets array of all "publicationLabels" element
     */
    public void setPublicationLabelsArray(java.lang.String[] publicationLabelsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publicationLabelsArray, PUBLICATIONLABELS$6);
        }
    }
    
    /**
     * Sets ith "publicationLabels" element
     */
    public void setPublicationLabelsArray(int i, java.lang.String publicationLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONLABELS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(publicationLabels);
        }
    }
    
    /**
     * Sets (as xml) array of all "publicationLabels" element
     */
    public void xsetPublicationLabelsArray(org.apache.xmlbeans.XmlString[]publicationLabelsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publicationLabelsArray, PUBLICATIONLABELS$6);
        }
    }
    
    /**
     * Sets (as xml) ith "publicationLabels" element
     */
    public void xsetPublicationLabelsArray(int i, org.apache.xmlbeans.XmlString publicationLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONLABELS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publicationLabels);
        }
    }
    
    /**
     * Inserts the value as the ith "publicationLabels" element
     */
    public void insertPublicationLabels(int i, java.lang.String publicationLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PUBLICATIONLABELS$6, i);
            target.setStringValue(publicationLabels);
        }
    }
    
    /**
     * Appends the value as the last "publicationLabels" element
     */
    public void addPublicationLabels(java.lang.String publicationLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONLABELS$6);
            target.setStringValue(publicationLabels);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "publicationLabels" element
     */
    public org.apache.xmlbeans.XmlString insertNewPublicationLabels(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PUBLICATIONLABELS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "publicationLabels" element
     */
    public org.apache.xmlbeans.XmlString addNewPublicationLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICATIONLABELS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "publicationLabels" element
     */
    public void removePublicationLabels(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONLABELS$6, i);
        }
    }
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$8);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$8);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$8, 0);
        }
    }
    
    /**
     * Gets the "publicationRegion" element
     */
    public java.lang.String getPublicationRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONREGION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationRegion" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicationRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONREGION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "publicationRegion" element
     */
    public boolean isSetPublicationRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONREGION$10) != 0;
        }
    }
    
    /**
     * Sets the "publicationRegion" element
     */
    public void setPublicationRegion(java.lang.String publicationRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONREGION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONREGION$10);
            }
            target.setStringValue(publicationRegion);
        }
    }
    
    /**
     * Sets (as xml) the "publicationRegion" element
     */
    public void xsetPublicationRegion(org.apache.xmlbeans.XmlString publicationRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATIONREGION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICATIONREGION$10);
            }
            target.set(publicationRegion);
        }
    }
    
    /**
     * Unsets the "publicationRegion" element
     */
    public void unsetPublicationRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONREGION$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$12, 0);
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
            return get_store().count_elements(TEXT$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$12);
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
            get_store().remove_element(TEXT$12, 0);
        }
    }
}
