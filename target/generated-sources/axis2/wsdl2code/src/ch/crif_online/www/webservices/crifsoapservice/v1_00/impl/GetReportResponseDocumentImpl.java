/*
 * An XML document type.
 * Localname: getReportResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetReportResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getReportResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetReportResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetReportResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetReportResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREPORTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getReportResponse");
    
    
    /**
     * Gets the "getReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse getGetReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse)get_store().find_element_user(GETREPORTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getReportResponse" element
     */
    public void setGetReportResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse getReportResponse)
    {
        generatedSetterHelperImpl(getReportResponse, GETREPORTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse addNewGetReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetReportResponse)get_store().add_element_user(GETREPORTRESPONSE$0);
            return target;
        }
    }
}
