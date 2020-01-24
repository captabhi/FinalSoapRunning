/*
 * An XML document type.
 * Localname: getListOfReadyOfflineReportsResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetListOfReadyOfflineReportsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getListOfReadyOfflineReportsResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetListOfReadyOfflineReportsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetListOfReadyOfflineReportsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfReadyOfflineReportsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFREADYOFFLINEREPORTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getListOfReadyOfflineReportsResponse");
    
    
    /**
     * Gets the "getListOfReadyOfflineReportsResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse getGetListOfReadyOfflineReportsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse)get_store().find_element_user(GETLISTOFREADYOFFLINEREPORTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getListOfReadyOfflineReportsResponse" element
     */
    public void setGetListOfReadyOfflineReportsResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse getListOfReadyOfflineReportsResponse)
    {
        generatedSetterHelperImpl(getListOfReadyOfflineReportsResponse, GETLISTOFREADYOFFLINEREPORTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getListOfReadyOfflineReportsResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse addNewGetListOfReadyOfflineReportsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsResponse)get_store().add_element_user(GETLISTOFREADYOFFLINEREPORTSRESPONSE$0);
            return target;
        }
    }
}
