/*
 * An XML document type.
 * Localname: getWebAccessTokenESchKgResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetWebAccessTokenESchKgResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getWebAccessTokenESchKgResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetWebAccessTokenESchKgResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetWebAccessTokenESchKgResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetWebAccessTokenESchKgResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEBACCESSTOKENESCHKGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getWebAccessTokenESchKgResponse");
    
    
    /**
     * Gets the "getWebAccessTokenESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse getGetWebAccessTokenESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse)get_store().find_element_user(GETWEBACCESSTOKENESCHKGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWebAccessTokenESchKgResponse" element
     */
    public void setGetWebAccessTokenESchKgResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse getWebAccessTokenESchKgResponse)
    {
        generatedSetterHelperImpl(getWebAccessTokenESchKgResponse, GETWEBACCESSTOKENESCHKGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getWebAccessTokenESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse addNewGetWebAccessTokenESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgResponse)get_store().add_element_user(GETWEBACCESSTOKENESCHKGRESPONSE$0);
            return target;
        }
    }
}
