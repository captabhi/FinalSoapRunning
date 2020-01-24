package wsdl;


import ch.crif_online.www.webservices.crifsoapservice.v1_00.Location;
import ch.crif_online.www.webservices.crifsoapservice.v1_00.PersonAddressDescription;

public class RunSimpleSolvancyChecker {
    private final static String serviceURL = "https://preprodservices.crif-online.ch/CrifSS/CrifSoapServiceV1";
    private final static String username = "CRS_SHARD_GROUP_AG";
    private final static String password = "V!y$@aL6XNkV";

    public static void main(String[] args) {

        try {
            SimpleWebShopSolvencyChecker solvencyChecker = new SimpleWebShopSolvencyChecker(serviceURL, username, password);
            Location location = Location.Factory.newInstance();
            location.setStreet("Hardstrasse");
            location.setHouseNumber("73");
            location.setZip("5430");
            location.setCity("Wettingen");
            location.setCountry("CHE");

            PersonAddressDescription address = PersonAddressDescription.Factory.newInstance();
            address.setLocation(location);
            address.setFirstName("Anna");
            address.setLastName("Test");
            address.setBirthDate("1911-11-11");
            String refno = "123456";

            boolean checkResult = solvencyChecker.isSolvent(address, refno);
            if (checkResult)
                System.out.println("Anna Test is solvent");
            else
                System.out.println("Anna Test is not solvent");
        } catch (ServiceError e2) {
            String error = "Fault Code: " + e2.getMessage();
            error += ", Fault String: " + e2.getFaultMessage().getError().getMessageText();
            System.out.println("Error: " + error);
            e2.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

