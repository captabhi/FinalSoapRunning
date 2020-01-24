/*
 * An XML document type.
 * Localname: checkOfflineReportOfficeResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CheckOfflineReportOfficeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one checkOfflineReportOfficeResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CheckOfflineReportOfficeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CheckOfflineReportOfficeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckOfflineReportOfficeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOFFLINEREPORTOFFICERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checkOfflineReportOfficeResponse");
    
    
    /**
     * Gets the "checkOfflineReportOfficeResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse getCheckOfflineReportOfficeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse)get_store().find_element_user(CHECKOFFLINEREPORTOFFICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkOfflineReportOfficeResponse" element
     */
    public void setCheckOfflineReportOfficeResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse checkOfflineReportOfficeResponse)
    {
        generatedSetterHelperImpl(checkOfflineReportOfficeResponse, CHECKOFFLINEREPORTOFFICERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkOfflineReportOfficeResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse addNewCheckOfflineReportOfficeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeResponse)get_store().add_element_user(CHECKOFFLINEREPORTOFFICERESPONSE$0);
            return target;
        }
    }
}
