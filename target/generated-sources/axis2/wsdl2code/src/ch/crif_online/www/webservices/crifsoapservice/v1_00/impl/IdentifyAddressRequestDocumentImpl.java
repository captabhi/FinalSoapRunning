/*
 * An XML document type.
 * Localname: identifyAddressRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifyAddressRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one identifyAddressRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class IdentifyAddressRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifyAddressRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifyAddressRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFYADDRESSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "identifyAddressRequest");
    
    
    /**
     * Gets the "identifyAddressRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest getIdentifyAddressRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest)get_store().find_element_user(IDENTIFYADDRESSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifyAddressRequest" element
     */
    public void setIdentifyAddressRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest identifyAddressRequest)
    {
        generatedSetterHelperImpl(identifyAddressRequest, IDENTIFYADDRESSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifyAddressRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest addNewIdentifyAddressRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdentifyAddressRequest)get_store().add_element_user(IDENTIFYADDRESSREQUEST$0);
            return target;
        }
    }
}
