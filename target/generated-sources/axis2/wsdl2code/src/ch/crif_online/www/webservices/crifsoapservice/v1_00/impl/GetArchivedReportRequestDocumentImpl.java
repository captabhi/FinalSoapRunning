/*
 * An XML document type.
 * Localname: getArchivedReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetArchivedReportRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getArchivedReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetArchivedReportRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetArchivedReportRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetArchivedReportRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARCHIVEDREPORTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getArchivedReportRequest");
    
    
    /**
     * Gets the "getArchivedReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest getGetArchivedReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest)get_store().find_element_user(GETARCHIVEDREPORTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getArchivedReportRequest" element
     */
    public void setGetArchivedReportRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest getArchivedReportRequest)
    {
        generatedSetterHelperImpl(getArchivedReportRequest, GETARCHIVEDREPORTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getArchivedReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest addNewGetArchivedReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportRequest)get_store().add_element_user(GETARCHIVEDREPORTREQUEST$0);
            return target;
        }
    }
}
