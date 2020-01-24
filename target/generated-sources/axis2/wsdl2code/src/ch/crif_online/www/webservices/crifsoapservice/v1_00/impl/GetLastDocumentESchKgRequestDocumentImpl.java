/*
 * An XML document type.
 * Localname: getLastDocumentESchKgRequest
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.GetLastDocumentESchKgRequestDocument
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * A document containing one getLastDocumentESchKgRequest(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00) element.
 *
 * This is a complex type.
 */
public class GetLastDocumentESchKgRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.GetLastDocumentESchKgRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLastDocumentESchKgRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTDOCUMENTESCHKGREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "getLastDocumentESchKgRequest");
    
    
    /**
     * Gets the "getLastDocumentESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest getGetLastDocumentESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest)get_store().find_element_user(GETLASTDOCUMENTESCHKGREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLastDocumentESchKgRequest" element
     */
    public void setGetLastDocumentESchKgRequest(ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest getLastDocumentESchKgRequest)
    {
        generatedSetterHelperImpl(getLastDocumentESchKgRequest, GETLASTDOCUMENTESCHKGREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getLastDocumentESchKgRequest" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest addNewGetLastDocumentESchKgRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.TypeGetLastDocumentESchKgRequest)get_store().add_element_user(GETLASTDOCUMENTESCHKGREQUEST$0);
            return target;
        }
    }
}
