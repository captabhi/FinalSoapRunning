/*
 * An XML document type.
 * Localname: getStatusESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetStatusESchKgRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getStatusESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetStatusESchKgRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetStatusESchKgRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetStatusESchKgRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSESCHKGREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getStatusESchKgRequest");
    
    
    /**
     * Gets the "getStatusESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest getGetStatusESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest)get_store().find_element_user(GETSTATUSESCHKGREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusESchKgRequest" element
     */
    public void setGetStatusESchKgRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest getStatusESchKgRequest)
    {
        generatedSetterHelperImpl(getStatusESchKgRequest, GETSTATUSESCHKGREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getStatusESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest addNewGetStatusESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgRequest)get_store().add_element_user(GETSTATUSESCHKGREQUEST$0);
            return target;
        }
    }
}
