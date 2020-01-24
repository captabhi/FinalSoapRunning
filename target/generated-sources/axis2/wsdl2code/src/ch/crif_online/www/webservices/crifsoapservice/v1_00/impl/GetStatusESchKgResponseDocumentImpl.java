/*
 * An XML document type.
 * Localname: getStatusESchKgResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetStatusESchKgResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getStatusESchKgResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetStatusESchKgResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetStatusESchKgResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetStatusESchKgResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSESCHKGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getStatusESchKgResponse");
    
    
    /**
     * Gets the "getStatusESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse getGetStatusESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse)get_store().find_element_user(GETSTATUSESCHKGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getStatusESchKgResponse" element
     */
    public void setGetStatusESchKgResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse getStatusESchKgResponse)
    {
        generatedSetterHelperImpl(getStatusESchKgResponse, GETSTATUSESCHKGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getStatusESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse addNewGetStatusESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetStatusESchKgResponse)get_store().add_element_user(GETSTATUSESCHKGRESPONSE$0);
            return target;
        }
    }
}
