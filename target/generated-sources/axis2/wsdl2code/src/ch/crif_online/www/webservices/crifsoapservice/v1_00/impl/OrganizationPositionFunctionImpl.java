/*
 * XML Type:  OrganizationPositionFunction
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML OrganizationPositionFunction(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class OrganizationPositionFunctionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OrganizationPositionFunction
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPositionFunctionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCTIONTYPE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "functionType");
    private static final javax.xml.namespace.QName FUNCTIONTYPEORIGINAL$2 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "functionTypeOriginal");
    private static final javax.xml.namespace.QName FUNCTIONPRIORITY$4 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "functionPriority");
    
    
    /**
     * Gets the "functionType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType.Enum getFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "functionType" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType xgetFunctionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType)get_store().find_element_user(FUNCTIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "functionType" element
     */
    public void setFunctionType(ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType.Enum functionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNCTIONTYPE$0);
            }
            target.setEnumValue(functionType);
        }
    }
    
    /**
     * Sets (as xml) the "functionType" element
     */
    public void xsetFunctionType(ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType functionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType)get_store().find_element_user(FUNCTIONTYPE$0, 0);
            if (target == null)
            {
                target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.FunctionType)get_store().add_element_user(FUNCTIONTYPE$0);
            }
            target.set(functionType);
        }
    }
    
    /**
     * Gets the "functionTypeOriginal" element
     */
    public java.lang.String getFunctionTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONTYPEORIGINAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "functionTypeOriginal" element
     */
    public org.apache.xmlbeans.XmlString xgetFunctionTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONTYPEORIGINAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "functionTypeOriginal" element
     */
    public boolean isSetFunctionTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTIONTYPEORIGINAL$2) != 0;
        }
    }
    
    /**
     * Sets the "functionTypeOriginal" element
     */
    public void setFunctionTypeOriginal(java.lang.String functionTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONTYPEORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNCTIONTYPEORIGINAL$2);
            }
            target.setStringValue(functionTypeOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "functionTypeOriginal" element
     */
    public void xsetFunctionTypeOriginal(org.apache.xmlbeans.XmlString functionTypeOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTIONTYPEORIGINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FUNCTIONTYPEORIGINAL$2);
            }
            target.set(functionTypeOriginal);
        }
    }
    
    /**
     * Unsets the "functionTypeOriginal" element
     */
    public void unsetFunctionTypeOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTIONTYPEORIGINAL$2, 0);
        }
    }
    
    /**
     * Gets the "functionPriority" element
     */
    public java.math.BigInteger getFunctionPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONPRIORITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "functionPriority" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFunctionPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FUNCTIONPRIORITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "functionPriority" element
     */
    public boolean isSetFunctionPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTIONPRIORITY$4) != 0;
        }
    }
    
    /**
     * Sets the "functionPriority" element
     */
    public void setFunctionPriority(java.math.BigInteger functionPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTIONPRIORITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNCTIONPRIORITY$4);
            }
            target.setBigIntegerValue(functionPriority);
        }
    }
    
    /**
     * Sets (as xml) the "functionPriority" element
     */
    public void xsetFunctionPriority(org.apache.xmlbeans.XmlInteger functionPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FUNCTIONPRIORITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FUNCTIONPRIORITY$4);
            }
            target.set(functionPriority);
        }
    }
    
    /**
     * Unsets the "functionPriority" element
     */
    public void unsetFunctionPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTIONPRIORITY$4, 0);
        }
    }
}
