/*
 * XML Type:  Identifier
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML Identifier(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.Identifier
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERTEXT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifierText");
    private static final javax.xml.namespace.QName IDENTIFIERTYPE$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifierType");
    
    
    /**
     * Gets the "identifierText" element
     */
    public java.lang.String getIdentifierText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierText" element
     */
    public org.apache.xmlbeans.XmlString xgetIdentifierText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIERTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identifierText" element
     */
    public void setIdentifierText(java.lang.String identifierText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERTEXT$0);
            }
            target.setStringValue(identifierText);
        }
    }
    
    /**
     * Sets (as xml) the "identifierText" element
     */
    public void xsetIdentifierText(org.apache.xmlbeans.XmlString identifierText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIERTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFIERTEXT$0);
            }
            target.set(identifierText);
        }
    }
    
    /**
     * Gets the "identifierType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType.Enum getIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType xgetIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType)get_store().find_element_user(IDENTIFIERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identifierType" element
     */
    public void setIdentifierType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType.Enum identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERTYPE$2);
            }
            target.setEnumValue(identifierType);
        }
    }
    
    /**
     * Sets (as xml) the "identifierType" element
     */
    public void xsetIdentifierType(ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType)get_store().find_element_user(IDENTIFIERTYPE$2, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifierType)get_store().add_element_user(IDENTIFIERTYPE$2);
            }
            target.set(identifierType);
        }
    }
}
