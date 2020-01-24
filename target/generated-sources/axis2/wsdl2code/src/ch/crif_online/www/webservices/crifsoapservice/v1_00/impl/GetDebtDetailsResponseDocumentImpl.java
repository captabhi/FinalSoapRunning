/*
 * An XML document type.
 * Localname: getDebtDetailsResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDebtDetailsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getDebtDetailsResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetDebtDetailsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDebtDetailsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDebtDetailsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEBTDETAILSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getDebtDetailsResponse");
    
    
    /**
     * Gets the "getDebtDetailsResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse getGetDebtDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse)get_store().find_element_user(GETDEBTDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDebtDetailsResponse" element
     */
    public void setGetDebtDetailsResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse getDebtDetailsResponse)
    {
        generatedSetterHelperImpl(getDebtDetailsResponse, GETDEBTDETAILSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDebtDetailsResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse addNewGetDebtDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsResponse)get_store().add_element_user(GETDEBTDETAILSRESPONSE$0);
            return target;
        }
    }
}
