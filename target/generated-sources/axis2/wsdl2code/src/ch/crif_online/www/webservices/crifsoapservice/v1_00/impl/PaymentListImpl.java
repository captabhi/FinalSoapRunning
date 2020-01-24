/*
 * XML Type:  paymentList
 * Namespace: http://www.crif-online.ch/webservices/crifsoapservice/v1.00
 * Java type: ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList
 *
 * Automatically generated - do not modify.
 */
package ch.crif_online.www.webservices.crifsoapservice.v1_00.impl;
/**
 * An XML paymentList(@http://www.crif-online.ch/webservices/crifsoapservice/v1.00).
 *
 * This is a complex type.
 */
public class PaymentListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.crif_online.www.webservices.crifsoapservice.v1_00.PaymentList
{
    private static final long serialVersionUID = 1L;
    
    public PaymentListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCHKGPAYMENTDATA$0 = 
        new javax.xml.namespace.QName("http://www.crif-online.ch/webservices/crifsoapservice/v1.00", "eSchKgPaymentData");
    
    
    /**
     * Gets array of all "eSchKgPaymentData" elements
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData[] getESchKgPaymentDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESCHKGPAYMENTDATA$0, targetList);
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData[] result = new ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eSchKgPaymentData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData getESchKgPaymentDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData)get_store().find_element_user(ESCHKGPAYMENTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eSchKgPaymentData" element
     */
    public int sizeOfESchKgPaymentDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESCHKGPAYMENTDATA$0);
        }
    }
    
    /**
     * Sets array of all "eSchKgPaymentData" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setESchKgPaymentDataArray(ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData[] eSchKgPaymentDataArray)
    {
        check_orphaned();
        arraySetterHelper(eSchKgPaymentDataArray, ESCHKGPAYMENTDATA$0);
    }
    
    /**
     * Sets ith "eSchKgPaymentData" element
     */
    public void setESchKgPaymentDataArray(int i, ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData eSchKgPaymentData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData)get_store().find_element_user(ESCHKGPAYMENTDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eSchKgPaymentData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eSchKgPaymentData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData insertNewESchKgPaymentData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData)get_store().insert_element_user(ESCHKGPAYMENTDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eSchKgPaymentData" element
     */
    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData addNewESchKgPaymentData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData target = null;
            target = (ch.crif_online.www.webservices.crifsoapservice.v1_00.ESchKgPaymentData)get_store().add_element_user(ESCHKGPAYMENTDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "eSchKgPaymentData" element
     */
    public void removeESchKgPaymentData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESCHKGPAYMENTDATA$0, i);
        }
    }
}
