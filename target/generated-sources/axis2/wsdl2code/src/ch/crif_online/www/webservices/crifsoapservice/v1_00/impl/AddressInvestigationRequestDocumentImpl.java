/*
 * An XML document type.
 * Localname: addressInvestigationRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressInvestigationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one addressInvestigationRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class AddressInvestigationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressInvestigationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressInvestigationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSINVESTIGATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "addressInvestigationRequest");
    
    
    /**
     * Gets the "addressInvestigationRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest getAddressInvestigationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest)get_store().find_element_user(ADDRESSINVESTIGATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addressInvestigationRequest" element
     */
    public void setAddressInvestigationRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest addressInvestigationRequest)
    {
        generatedSetterHelperImpl(addressInvestigationRequest, ADDRESSINVESTIGATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addressInvestigationRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest addNewAddressInvestigationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeAddressInvestigationRequest)get_store().add_element_user(ADDRESSINVESTIGATIONREQUEST$0);
            return target;
        }
    }
}
