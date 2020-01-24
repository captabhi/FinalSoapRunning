/*
 * An XML document type.
 * Localname: getDataIssueStatusRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDataIssueStatusRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getDataIssueStatusRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetDataIssueStatusRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDataIssueStatusRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataIssueStatusRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATAISSUESTATUSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getDataIssueStatusRequest");
    
    
    /**
     * Gets the "getDataIssueStatusRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest getGetDataIssueStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest)get_store().find_element_user(GETDATAISSUESTATUSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDataIssueStatusRequest" element
     */
    public void setGetDataIssueStatusRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest getDataIssueStatusRequest)
    {
        generatedSetterHelperImpl(getDataIssueStatusRequest, GETDATAISSUESTATUSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDataIssueStatusRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest addNewGetDataIssueStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDataIssueStatusRequest)get_store().add_element_user(GETDATAISSUESTATUSREQUEST$0);
            return target;
        }
    }
}
