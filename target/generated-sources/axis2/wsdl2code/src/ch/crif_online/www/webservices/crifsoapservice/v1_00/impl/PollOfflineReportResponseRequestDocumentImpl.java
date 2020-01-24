/*
 * An XML document type.
 * Localname: pollOfflineReportResponseRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PollOfflineReportResponseRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one pollOfflineReportResponseRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class PollOfflineReportResponseRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PollOfflineReportResponseRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public PollOfflineReportResponseRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLLOFFLINEREPORTRESPONSEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "pollOfflineReportResponseRequest");
    
    
    /**
     * Gets the "pollOfflineReportResponseRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest getPollOfflineReportResponseRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest)get_store().find_element_user(POLLOFFLINEREPORTRESPONSEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pollOfflineReportResponseRequest" element
     */
    public void setPollOfflineReportResponseRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest pollOfflineReportResponseRequest)
    {
        generatedSetterHelperImpl(pollOfflineReportResponseRequest, POLLOFFLINEREPORTRESPONSEREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pollOfflineReportResponseRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest addNewPollOfflineReportResponseRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseRequest)get_store().add_element_user(POLLOFFLINEREPORTRESPONSEREQUEST$0);
            return target;
        }
    }
}
