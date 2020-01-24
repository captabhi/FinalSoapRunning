/*
 * XML Type:  CompanyHistoryItemAmount
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemAmount
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML CompanyHistoryItemAmount(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class CompanyHistoryItemAmountImpl extends ch.crif_online.www.webservices.crifsoapservice.v1_00.impl.CompanyHistoryItemImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.CompanyHistoryItemAmount
{
    private static final long serialVersionUID = 1L;
    
    public CompanyHistoryItemAmountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "amount");
    
    
    /**
     * Gets the "amount" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "amount" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.Amount)get_store().add_element_user(AMOUNT$0);
            return target;
        }
    }
}
