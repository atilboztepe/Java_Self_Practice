package day12_practice_tasks;

public class CandyClients {

    public static void main(String[] args) {


        Candy candy1 = new Candy("Oreo", 4, 4.5, false);
        System.out.println(candy1.getBrand());
        System.out.println(candy1.getQuantity());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanuts());
        System.out.println(candy1);

    }
}
