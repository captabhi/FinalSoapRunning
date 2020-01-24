/*
 * An XML document type.
 * Localname: getWebAccessTokenESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetWebAccessTokenESchKgRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getWebAccessTokenESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetWebAccessTokenESchKgRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetWebAccessTokenESchKgRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetWebAccessTokenESchKgRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEBACCESSTOKENESCHKGREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getWebAccessTokenESchKgRequest");
    
    
    /**
     * Gets the "getWebAccessTokenESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest getGetWebAccessTokenESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest)get_store().find_element_user(GETWEBACCESSTOKENESCHKGREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWebAccessTokenESchKgRequest" element
     */
    public void setGetWebAccessTokenESchKgRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest getWebAccessTokenESchKgRequest)
    {
        generatedSetterHelperImpl(getWebAccessTokenESchKgRequest, GETWEBACCESSTOKENESCHKGREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getWebAccessTokenESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest addNewGetWebAccessTokenESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetWebAccessTokenESchKgRequest)get_store().add_element_user(GETWEBACCESSTOKENESCHKGREQUEST$0);
            return target;
        }
    }
}
