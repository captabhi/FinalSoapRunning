/*
 * An XML document type.
 * Localname: getListOfReadyOfflineReportsRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetListOfReadyOfflineReportsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getListOfReadyOfflineReportsRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetListOfReadyOfflineReportsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetListOfReadyOfflineReportsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfReadyOfflineReportsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFREADYOFFLINEREPORTSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getListOfReadyOfflineReportsRequest");
    
    
    /**
     * Gets the "getListOfReadyOfflineReportsRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest getGetListOfReadyOfflineReportsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest)get_store().find_element_user(GETLISTOFREADYOFFLINEREPORTSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getListOfReadyOfflineReportsRequest" element
     */
    public void setGetListOfReadyOfflineReportsRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest getListOfReadyOfflineReportsRequest)
    {
        generatedSetterHelperImpl(getListOfReadyOfflineReportsRequest, GETLISTOFREADYOFFLINEREPORTSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getListOfReadyOfflineReportsRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest addNewGetListOfReadyOfflineReportsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetListOfReadyOfflineReportsRequest)get_store().add_element_user(GETLISTOFREADYOFFLINEREPORTSREQUEST$0);
            return target;
        }
    }
}
