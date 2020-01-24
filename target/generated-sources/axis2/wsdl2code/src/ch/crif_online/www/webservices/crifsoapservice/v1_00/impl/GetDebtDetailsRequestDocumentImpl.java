/*
 * An XML document type.
 * Localname: getDebtDetailsRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDebtDetailsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getDebtDetailsRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetDebtDetailsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDebtDetailsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDebtDetailsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEBTDETAILSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getDebtDetailsRequest");
    
    
    /**
     * Gets the "getDebtDetailsRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest getGetDebtDetailsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest)get_store().find_element_user(GETDEBTDETAILSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDebtDetailsRequest" element
     */
    public void setGetDebtDetailsRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest getDebtDetailsRequest)
    {
        generatedSetterHelperImpl(getDebtDetailsRequest, GETDEBTDETAILSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getDebtDetailsRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest addNewGetDebtDetailsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetDebtDetailsRequest)get_store().add_element_user(GETDEBTDETAILSREQUEST$0);
            return target;
        }
    }
}
