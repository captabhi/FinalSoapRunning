/*
 * An XML document type.
 * Localname: getDataIssueStatusResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDataIssueStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getDataIssueStatusResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetDataIssueStatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDataIssueStatusResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataIssueStatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATAISSUESTATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getDataIssueStatusResponse");
    
    
    /**
     * Gets the "getDataIssueStatusResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse getGetDataIssueStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse)get_store().find_element_user(GETDATAISSUESTATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDataIssueStatusResponse" element
     */
    public void setGetDataIssueStatusResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse getDataIssueStatusResponse)
    {
        generatedSetterHelperImpl(getDataIssueStatusResponse, GETDATAISSUESTATUSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDataIssueStatusResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse addNewGetDataIssueStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusResponse)get_store().add_element_user(GETDATAISSUESTATUSRESPONSE$0);
            return target;
        }
    }
}
