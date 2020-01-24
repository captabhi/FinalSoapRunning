/*
 * An XML document type.
 * Localname: addressInvestigationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressInvestigationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one addressInvestigationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class AddressInvestigationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressInvestigationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressInvestigationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSINVESTIGATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressInvestigationResponse");
    
    
    /**
     * Gets the "addressInvestigationResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse getAddressInvestigationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse)get_store().find_element_user(ADDRESSINVESTIGATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addressInvestigationResponse" element
     */
    public void setAddressInvestigationResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse addressInvestigationResponse)
    {
        generatedSetterHelperImpl(addressInvestigationResponse, ADDRESSINVESTIGATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressInvestigationResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse addNewAddressInvestigationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationResponse)get_store().add_element_user(ADDRESSINVESTIGATIONRESPONSE$0);
            return target;
        }
    }
}
