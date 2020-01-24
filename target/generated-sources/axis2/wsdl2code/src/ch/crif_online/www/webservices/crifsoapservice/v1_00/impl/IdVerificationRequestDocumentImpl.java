/*
 * An XML document type.
 * Localname: idVerificationRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one idVerificationRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class IdVerificationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdVerificationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDVERIFICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "idVerificationRequest");
    
    
    /**
     * Gets the "idVerificationRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest getIdVerificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest)get_store().find_element_user(IDVERIFICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idVerificationRequest" element
     */
    public void setIdVerificationRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest idVerificationRequest)
    {
        generatedSetterHelperImpl(idVerificationRequest, IDVERIFICATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "idVerificationRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest addNewIdVerificationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeIdVerificationRequest)get_store().add_element_user(IDVERIFICATIONREQUEST$0);
            return target;
        }
    }
}
