/*
 * An XML document type.
 * Localname: submitDataIssueResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SubmitDataIssueResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one submitDataIssueResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class SubmitDataIssueResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SubmitDataIssueResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitDataIssueResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITDATAISSUERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "submitDataIssueResponse");
    
    
    /**
     * Gets the "submitDataIssueResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse getSubmitDataIssueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse)get_store().find_element_user(SUBMITDATAISSUERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "submitDataIssueResponse" element
     */
    public void setSubmitDataIssueResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse submitDataIssueResponse)
    {
        generatedSetterHelperImpl(submitDataIssueResponse, SUBMITDATAISSUERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "submitDataIssueResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse addNewSubmitDataIssueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueResponse)get_store().add_element_user(SUBMITDATAISSUERESPONSE$0);
            return target;
        }
    }
}
