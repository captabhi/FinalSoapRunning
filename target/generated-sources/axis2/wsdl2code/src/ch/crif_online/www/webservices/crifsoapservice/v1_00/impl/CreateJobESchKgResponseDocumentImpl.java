/*
 * An XML document type.
 * Localname: createJobESchKgResponse
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CreateJobESchKgResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one createJobESchKgResponse(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CreateJobESchKgResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CreateJobESchKgResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateJobESchKgResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEJOBESCHKGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "createJobESchKgResponse");
    
    
    /**
     * Gets the "createJobESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse getCreateJobESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse)get_store().find_element_user(CREATEJOBESCHKGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "createJobESchKgResponse" element
     */
    public void setCreateJobESchKgResponse(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse createJobESchKgResponse)
    {
        generatedSetterHelperImpl(createJobESchKgResponse, CREATEJOBESCHKGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "createJobESchKgResponse" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse addNewCreateJobESchKgResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgResponse)get_store().add_element_user(CREATEJOBESCHKGRESPONSE$0);
            return target;
        }
    }
}
