/*
 * An XML document type.
 * Localname: checkOfflineReportOfficeRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CheckOfflineReportOfficeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one checkOfflineReportOfficeRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CheckOfflineReportOfficeRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CheckOfflineReportOfficeRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckOfflineReportOfficeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOFFLINEREPORTOFFICEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "checkOfflineReportOfficeRequest");
    
    
    /**
     * Gets the "checkOfflineReportOfficeRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest getCheckOfflineReportOfficeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest)get_store().find_element_user(CHECKOFFLINEREPORTOFFICEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkOfflineReportOfficeRequest" element
     */
    public void setCheckOfflineReportOfficeRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest checkOfflineReportOfficeRequest)
    {
        generatedSetterHelperImpl(checkOfflineReportOfficeRequest, CHECKOFFLINEREPORTOFFICEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "checkOfflineReportOfficeRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest addNewCheckOfflineReportOfficeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCheckOfflineReportOfficeRequest)get_store().add_element_user(CHECKOFFLINEREPORTOFFICEREQUEST$0);
            return target;
        }
    }
}
