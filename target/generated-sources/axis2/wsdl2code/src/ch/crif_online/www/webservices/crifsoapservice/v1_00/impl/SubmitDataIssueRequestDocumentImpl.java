/*
 * An XML document type.
 * Localname: submitDataIssueRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.SubmitDataIssueRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one submitDataIssueRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class SubmitDataIssueRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.SubmitDataIssueRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitDataIssueRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITDATAISSUEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "submitDataIssueRequest");
    
    
    /**
     * Gets the "submitDataIssueRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest getSubmitDataIssueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest)get_store().find_element_user(SUBMITDATAISSUEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "submitDataIssueRequest" element
     */
    public void setSubmitDataIssueRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest submitDataIssueRequest)
    {
        generatedSetterHelperImpl(submitDataIssueRequest, SUBMITDATAISSUEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "submitDataIssueRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest addNewSubmitDataIssueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeSubmitDataIssueRequest)get_store().add_element_user(SUBMITDATAISSUEREQUEST$0);
            return target;
        }
    }
}
