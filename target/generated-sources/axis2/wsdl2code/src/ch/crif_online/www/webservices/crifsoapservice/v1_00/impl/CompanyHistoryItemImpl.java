/*
 * XML Type:  CompanyHistoryItem
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItem(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItem
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "type");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "period");
    
    
    /**
     * Gets the "type" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType.Enum getType()
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
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType.Enum type)
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
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(ch.crif_online.www.webservices.crifsoapservice.v1_00.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Period target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Period)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
}
