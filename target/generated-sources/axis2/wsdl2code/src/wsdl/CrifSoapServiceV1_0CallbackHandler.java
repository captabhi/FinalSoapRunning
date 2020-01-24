/**
 * CrifSoapServiceV1_0CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package wsdl;


/**
 *  CrifSoapServiceV1_0CallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class CrifSoapServiceV1_0CallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public CrifSoapServiceV1_0CallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public CrifSoapServiceV1_0CallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getArchivedReport method
     * override this method for handling normal response from getArchivedReport operation
     */
    public void receiveResultgetArchivedReport(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetArchivedReportResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getArchivedReport operation
     */
    public void receiveErrorgetArchivedReport(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDataIssueStatus method
     * override this method for handling normal response from getDataIssueStatus operation
     */
    public void receiveResultgetDataIssueStatus(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDataIssueStatusResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDataIssueStatus operation
     */
    public void receiveErrorgetDataIssueStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cancelDataIssue method
     * override this method for handling normal response from cancelDataIssue operation
     */
    public void receiveResultcancelDataIssue(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.CancelDataIssueResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cancelDataIssue operation
     */
    public void receiveErrorcancelDataIssue(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getStatusESchKg method
     * override this method for handling normal response from getStatusESchKg operation
     */
    public void receiveResultgetStatusESchKg(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetStatusESchKgResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getStatusESchKg operation
     */
    public void receiveErrorgetStatusESchKg(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkOfflineReportOffice method
     * override this method for handling normal response from checkOfflineReportOffice operation
     */
    public void receiveResultcheckOfflineReportOffice(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.CheckOfflineReportOfficeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkOfflineReportOffice operation
     */
    public void receiveErrorcheckOfflineReportOffice(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getListOfReadyOfflineReports method
     * override this method for handling normal response from getListOfReadyOfflineReports operation
     */
    public void receiveResultgetListOfReadyOfflineReports(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetListOfReadyOfflineReportsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getListOfReadyOfflineReports operation
     */
    public void receiveErrorgetListOfReadyOfflineReports(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitDataIssue method
     * override this method for handling normal response from submitDataIssue operation
     */
    public void receiveResultsubmitDataIssue(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.SubmitDataIssueResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitDataIssue operation
     */
    public void receiveErrorsubmitDataIssue(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLastDocumentESchKg method
     * override this method for handling normal response from getLastDocumentESchKg operation
     */
    public void receiveResultgetLastDocumentESchKg(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetLastDocumentESchKgResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastDocumentESchKg operation
     */
    public void receiveErrorgetLastDocumentESchKg(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addressInvestigation method
     * override this method for handling normal response from addressInvestigation operation
     */
    public void receiveResultaddressInvestigation(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.AddressInvestigationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addressInvestigation operation
     */
    public void receiveErroraddressInvestigation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createJobESchKg method
     * override this method for handling normal response from createJobESchKg operation
     */
    public void receiveResultcreateJobESchKg(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.CreateJobESchKgResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createJobESchKg operation
     */
    public void receiveErrorcreateJobESchKg(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pollOfflineReportResponse method
     * override this method for handling normal response from pollOfflineReportResponse operation
     */
    public void receiveResultpollOfflineReportResponse(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.PollOfflineReportResponseResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pollOfflineReportResponse operation
     */
    public void receiveErrorpollOfflineReportResponse(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDebtDetails method
     * override this method for handling normal response from getDebtDetails operation
     */
    public void receiveResultgetDebtDetails(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetDebtDetailsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDebtDetails operation
     */
    public void receiveErrorgetDebtDetails(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for orderOfflineReport method
     * override this method for handling normal response from orderOfflineReport operation
     */
    public void receiveResultorderOfflineReport(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.OrderOfflineReportResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from orderOfflineReport operation
     */
    public void receiveErrororderOfflineReport(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getReport method
     * override this method for handling normal response from getReport operation
     */
    public void receiveResultgetReport(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetReportResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getReport operation
     */
    public void receiveErrorgetReport(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for identifyAddress method
     * override this method for handling normal response from identifyAddress operation
     */
    public void receiveResultidentifyAddress(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.IdentifyAddressResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from identifyAddress operation
     */
    public void receiveErroridentifyAddress(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWebAccessTokenESchKg method
     * override this method for handling normal response from getWebAccessTokenESchKg operation
     */
    public void receiveResultgetWebAccessTokenESchKg(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.GetWebAccessTokenESchKgResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWebAccessTokenESchKg operation
     */
    public void receiveErrorgetWebAccessTokenESchKg(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for idVerification method
     * override this method for handling normal response from idVerification operation
     */
    public void receiveResultidVerification(
        ch.crif_online.www.webservices.crifsoapservice.v1_00.IdVerificationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from idVerification operation
     */
    public void receiveErroridVerification(java.lang.Exception e) {
    }
}
