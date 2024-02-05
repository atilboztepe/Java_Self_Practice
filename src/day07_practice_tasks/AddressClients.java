package day07_practice_tasks;

public class AddressClients {

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = "22012";

        System.out.println(address1);

        System.out.println("-------------------------");

        Address address2 = new Address();
        address2.buildingNumber = 987;
        address2.street = "Kobe Bryant";
        address2.city = "New York";
        address2.state = "NY";
        address2.zipCode = "10020";

        System.out.println(address2);
    }

}
