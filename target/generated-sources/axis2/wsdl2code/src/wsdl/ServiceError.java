/**
 * ServiceError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package wsdl;

public class ServiceError extends java.lang.Exception {
    private static final long serialVersionUID = 1579865817224L;
    private ch.crif_online.www.webservices.crifsoapservice.v1_00.ErrorDocument faultMessage;

    public ServiceError() {
        super("ServiceError");
    }

    public ServiceError(java.lang.String s) {
        super(s);
    }

    public ServiceError(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public ServiceError(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.ErrorDocument msg) {
        faultMessage = msg;
    }

    public ch.crif_online.www.webservices.crifsoapservice.v1_00.ErrorDocument getFaultMessage() {
        return faultMessage;
    }
}
