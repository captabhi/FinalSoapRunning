/*
 * An XML document type.
 * Localname: getArchivedReportResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetArchivedReportResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getArchivedReportResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetArchivedReportResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetArchivedReportResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetArchivedReportResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARCHIVEDREPORTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getArchivedReportResponse");
    
    
    /**
     * Gets the "getArchivedReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse getGetArchivedReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse)get_store().find_element_user(GETARCHIVEDREPORTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getArchivedReportResponse" element
     */
    public void setGetArchivedReportResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse getArchivedReportResponse)
    {
        generatedSetterHelperImpl(getArchivedReportResponse, GETARCHIVEDREPORTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getArchivedReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse addNewGetArchivedReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetArchivedReportResponse)get_store().add_element_user(GETARCHIVEDREPORTRESPONSE$0);
            return target;
        }
    }
}
