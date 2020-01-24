/*
 * An XML document type.
 * Localname: orderOfflineReportRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.OrderOfflineReportRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one orderOfflineReportRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class OrderOfflineReportRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.OrderOfflineReportRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderOfflineReportRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDEROFFLINEREPORTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "orderOfflineReportRequest");
    
    
    /**
     * Gets the "orderOfflineReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest getOrderOfflineReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest)get_store().find_element_user(ORDEROFFLINEREPORTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orderOfflineReportRequest" element
     */
    public void setOrderOfflineReportRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest orderOfflineReportRequest)
    {
        generatedSetterHelperImpl(orderOfflineReportRequest, ORDEROFFLINEREPORTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "orderOfflineReportRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest addNewOrderOfflineReportRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeOrderOfflineReportRequest)get_store().add_element_user(ORDEROFFLINEREPORTREQUEST$0);
            return target;
        }
    }
}
