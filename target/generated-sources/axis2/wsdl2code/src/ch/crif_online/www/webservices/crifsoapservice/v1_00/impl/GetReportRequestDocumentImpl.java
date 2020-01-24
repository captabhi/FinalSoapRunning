/*
 * An XML document type.
 * Localname: getReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetReportRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetReportRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetReportRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetReportRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREPORTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getReportRequest");
    
    
    /**
     * Gets the "getReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest getGetReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest)get_store().find_element_user(GETREPORTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getReportRequest" element
     */
    public void setGetReportRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest getReportRequest)
    {
        generatedSetterHelperImpl(getReportRequest, GETREPORTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest addNewGetReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportRequest)get_store().add_element_user(GETREPORTREQUEST$0);
            return target;
        }
    }
}
