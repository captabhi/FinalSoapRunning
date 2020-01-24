/*
 * An XML document type.
 * Localname: cancelDataIssueResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CancelDataIssueResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one cancelDataIssueResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CancelDataIssueResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CancelDataIssueResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelDataIssueResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELDATAISSUERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "cancelDataIssueResponse");
    
    
    /**
     * Gets the "cancelDataIssueResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse getCancelDataIssueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse)get_store().find_element_user(CANCELDATAISSUERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelDataIssueResponse" element
     */
    public void setCancelDataIssueResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse cancelDataIssueResponse)
    {
        generatedSetterHelperImpl(cancelDataIssueResponse, CANCELDATAISSUERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cancelDataIssueResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse addNewCancelDataIssueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueResponse)get_store().add_element_user(CANCELDATAISSUERESPONSE$0);
            return target;
        }
    }
}
