/*
 * An XML document type.
 * Localname: cancelDataIssueRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CancelDataIssueRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one cancelDataIssueRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CancelDataIssueRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CancelDataIssueRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelDataIssueRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELDATAISSUEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "cancelDataIssueRequest");
    
    
    /**
     * Gets the "cancelDataIssueRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest getCancelDataIssueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest)get_store().find_element_user(CANCELDATAISSUEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelDataIssueRequest" element
     */
    public void setCancelDataIssueRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest cancelDataIssueRequest)
    {
        generatedSetterHelperImpl(cancelDataIssueRequest, CANCELDATAISSUEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cancelDataIssueRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest addNewCancelDataIssueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCancelDataIssueRequest)get_store().add_element_user(CANCELDATAISSUEREQUEST$0);
            return target;
        }
    }
}
