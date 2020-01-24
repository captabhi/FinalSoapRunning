package wsdl;

import ch.crif_online.www.webservices.crifsoapservice.v1_00.*;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axis2.AxisFault;

public class SimpleWebShopSolvencyChecker {

    IdentityDescriptor identityDescriptor = IdentityDescriptor.Factory.newInstance();
    Control control = Control.Factory.newInstance();
    int majorVersion = 1;
    int minorVersion = 0;
    CrifSoapServiceV1_0Stub service;
    final String reportType = "CREDIT_CHECK_CONSUMER";

    public SimpleWebShopSolvencyChecker(String URL, String username, String password) throws AxisFault {
        service = new CrifSoapServiceV1_0Stub(URL);
        identityDescriptor = IdentityDescriptor.Factory.newInstance();
        identityDescriptor.setUserName(username);
        identityDescriptor.setPassword(password);
        control.setMajorVersion(majorVersion);
        control.setMinorVersion(minorVersion);
    }

    public boolean isSolvent(AddressDescription address, String refno) throws Exception {

        GetReportRequestDocument req = GetReportRequestDocument.Factory.newInstance();
        TypeGetReportRequest typeGetReportRequest = TypeGetReportRequest.Factory.newInstance();
        typeGetReportRequest.setIdentityDescriptor(identityDescriptor);
        typeGetReportRequest.setControl(control);
        typeGetReportRequest.setReferenceNumber(refno);
        typeGetReportRequest.setReportType(reportType);
        typeGetReportRequest.setSearchedAddress(address);
        req.setGetReportRequest(typeGetReportRequest);

//        System.out.println("SOAP Request: " + req.getOMElement(null, OMAbstractFactory.getOMFactory())
//                .toStringWithConsume());
//
        TypeGetReportResponse response = service.getReport(req).getGetReportResponse();

//        System.out.println("SOAP Response: "
//                + response.getOMElement(null,
//                OMAbstractFactory.getOMFactory())
//                .toStringWithConsume());
//        if (response.isDecisionMatrixSpecified()) {
//            Decision finalDecision = response.getDecisionMatrix()
//                    .getDecision();
//            if (finalDecision == Decision.GREEN)
//                return true;
//        } else
//            throw new Exception(
//                    "Decision Matrix expected, but none was returned");
//        return false;
        return true;
    }

}
