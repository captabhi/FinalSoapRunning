/*
 * An XML document type.
 * Localname: getLastDocumentESchKgResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetLastDocumentESchKgResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getLastDocumentESchKgResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetLastDocumentESchKgResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetLastDocumentESchKgResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLastDocumentESchKgResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTDOCUMENTESCHKGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getLastDocumentESchKgResponse");
    
    
    /**
     * Gets the "getLastDocumentESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse getGetLastDocumentESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse)get_store().find_element_user(GETLASTDOCUMENTESCHKGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLastDocumentESchKgResponse" element
     */
    public void setGetLastDocumentESchKgResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse getLastDocumentESchKgResponse)
    {
        generatedSetterHelperImpl(getLastDocumentESchKgResponse, GETLASTDOCUMENTESCHKGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getLastDocumentESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse addNewGetLastDocumentESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgResponse)get_store().add_element_user(GETLASTDOCUMENTESCHKGRESPONSE$0);
            return target;
        }
    }
}
