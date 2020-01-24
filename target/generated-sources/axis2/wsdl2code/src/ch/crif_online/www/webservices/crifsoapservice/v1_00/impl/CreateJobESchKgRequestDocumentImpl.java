/*
 * An XML document type.
 * Localname: createJobESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CreateJobESchKgRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one createJobESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class CreateJobESchKgRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CreateJobESchKgRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateJobESchKgRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEJOBESCHKGREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "createJobESchKgRequest");
    
    
    /**
     * Gets the "createJobESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest getCreateJobESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest)get_store().find_element_user(CREATEJOBESCHKGREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "createJobESchKgRequest" element
     */
    public void setCreateJobESchKgRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest createJobESchKgRequest)
    {
        generatedSetterHelperImpl(createJobESchKgRequest, CREATEJOBESCHKGREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "createJobESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest addNewCreateJobESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeCreateJobESchKgRequest)get_store().add_element_user(CREATEJOBESCHKGREQUEST$0);
            return target;
        }
    }
}
