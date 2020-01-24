/*
 * XML Type:  CompanyHistoryItemLegalForm
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItemLegalForm(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemLegalFormImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.CompanyHistoryItemImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemLegalForm
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemLegalFormImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGALFORMTYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormType");
    private static final javax.xml.namespace.QName LEGALFORMTYPEORIGINAL$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormTypeOriginal");
    private static final javax.xml.namespace.QName LEGALFORMTEXT$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "legalFormText");
    
    
    /**
     * Gets the "legalFormType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum getLegalFormType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType xgetLegalFormType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().find_element_user(LEGALFORMTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "legalFormType" element
     */
    public void setLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType.Enum legalFormType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTYPE$0);
            }
            target.setEnumValue(legalFormType);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormType" element
     */
    public void xsetLegalFormType(ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType legalFormType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().find_element_user(LEGALFORMTYPE$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.LegalFormType)get_store().add_element_user(LEGALFORMTYPE$0);
            }
            target.set(legalFormType);
        }
    }
    
    /**
     * Gets the "legalFormTypeOriginal" element
     */
    public java.lang.String getLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormTypeOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "legalFormTypeOriginal" element
     */
    public boolean isSetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALFORMTYPEORIGINAL$2) != 0;
        }
    }
    
    /**
     * Sets the "legalFormTypeOriginal" element
     */
    public void setLegalFormTypeOriginal(java.lang.String legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTYPEORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTYPEORIGINAL$2);
            }
            target.setStringValue(legalFormTypeOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormTypeOriginal" element
     */
    public void xsetLegalFormTypeOriginal(org.apache.xmlbeans.XmlString legalFormTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTYPEORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTYPEORIGINAL$2);
            }
            target.set(legalFormTypeOriginal);
        }
    }
    
    /**
     * Unsets the "legalFormTypeOriginal" element
     */
    public void unsetLegalFormTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALFORMTYPEORIGINAL$2, 0);
        }
    }
    
    /**
     * Gets the "legalFormText" element
     */
    public java.lang.String getLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalFormText" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "legalFormText" element
     */
    public boolean isSetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALFORMTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "legalFormText" element
     */
    public void setLegalFormText(java.lang.String legalFormText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALFORMTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALFORMTEXT$4);
            }
            target.setStringValue(legalFormText);
        }
    }
    
    /**
     * Sets (as xml) the "legalFormText" element
     */
    public void xsetLegalFormText(org.apache.xmlbeans.XmlString legalFormText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALFORMTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALFORMTEXT$4);
            }
            target.set(legalFormText);
        }
    }
    
    /**
     * Unsets the "legalFormText" element
     */
    public void unsetLegalFormText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALFORMTEXT$4, 0);
        }
    }
}
