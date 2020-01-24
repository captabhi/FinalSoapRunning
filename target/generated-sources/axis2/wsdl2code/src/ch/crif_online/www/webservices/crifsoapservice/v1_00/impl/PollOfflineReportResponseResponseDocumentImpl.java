/*
 * An XML document type.
 * Localname: pollOfflineReportResponseResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PollOfflineReportResponseResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one pollOfflineReportResponseResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class PollOfflineReportResponseResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PollOfflineReportResponseResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PollOfflineReportResponseResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLLOFFLINEREPORTRESPONSERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "pollOfflineReportResponseResponse");
    
    
    /**
     * Gets the "pollOfflineReportResponseResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse getPollOfflineReportResponseResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse)get_store().find_element_user(POLLOFFLINEREPORTRESPONSERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pollOfflineReportResponseResponse" element
     */
    public void setPollOfflineReportResponseResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse pollOfflineReportResponseResponse)
    {
        generatedSetterHelperImpl(pollOfflineReportResponseResponse, POLLOFFLINEREPORTRESPONSERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pollOfflineReportResponseResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse addNewPollOfflineReportResponseResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypePollOfflineReportResponseResponse)get_store().add_element_user(POLLOFFLINEREPORTRESPONSERESPONSE$0);
            return target;
        }
    }
}
