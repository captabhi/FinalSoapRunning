/*
 * An XML document type.
 * Localname: orderOfflineReportResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrderOfflineReportResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one orderOfflineReportResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class OrderOfflineReportResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OrderOfflineReportResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderOfflineReportResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDEROFFLINEREPORTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderOfflineReportResponse");
    
    
    /**
     * Gets the "orderOfflineReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse getOrderOfflineReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse)get_store().find_element_user(ORDEROFFLINEREPORTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orderOfflineReportResponse" element
     */
    public void setOrderOfflineReportResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse orderOfflineReportResponse)
    {
        generatedSetterHelperImpl(orderOfflineReportResponse, ORDEROFFLINEREPORTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderOfflineReportResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse addNewOrderOfflineReportResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportResponse)get_store().add_element_user(ORDEROFFLINEREPORTRESPONSE$0);
            return target;
        }
    }
}
