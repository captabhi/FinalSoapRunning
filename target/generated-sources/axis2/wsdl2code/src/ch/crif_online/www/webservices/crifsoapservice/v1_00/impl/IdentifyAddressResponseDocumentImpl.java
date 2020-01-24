/*
 * An XML document type.
 * Localname: identifyAddressResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifyAddressResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one identifyAddressResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class IdentifyAddressResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifyAddressResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifyAddressResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFYADDRESSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifyAddressResponse");
    
    
    /**
     * Gets the "identifyAddressResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse getIdentifyAddressResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse)get_store().find_element_user(IDENTIFYADDRESSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifyAddressResponse" element
     */
    public void setIdentifyAddressResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse identifyAddressResponse)
    {
        generatedSetterHelperImpl(identifyAddressResponse, IDENTIFYADDRESSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifyAddressResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse addNewIdentifyAddressResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressResponse)get_store().add_element_user(IDENTIFYADDRESSRESPONSE$0);
            return target;
        }
    }
}
