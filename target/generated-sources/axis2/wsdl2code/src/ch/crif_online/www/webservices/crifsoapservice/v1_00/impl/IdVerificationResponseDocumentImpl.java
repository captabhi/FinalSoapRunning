/*
 * An XML document type.
 * Localname: idVerificationResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one idVerificationResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class IdVerificationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDVERIFICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationResponse");
    
    
    /**
     * Gets the "idVerificationResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse getIdVerificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse)get_store().find_element_user(IDVERIFICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idVerificationResponse" element
     */
    public void setIdVerificationResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse idVerificationResponse)
    {
        generatedSetterHelperImpl(idVerificationResponse, IDVERIFICATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "idVerificationResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse addNewIdVerificationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationResponse)get_store().add_element_user(IDVERIFICATIONRESPONSE$0);
            return target;
        }
    }
}
