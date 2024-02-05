package Self_practice_week;
import java.util.Scanner;

public class RoomReservationApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cydeo Skyline Inn!");

        System.out.print("Would you like to reserve a room? (Yes/No): ");
        String reserveRoomChoice = scanner.nextLine().toLowerCase();

        if (reserveRoomChoice.equals("no")) {
            System.out.println("You have a wonderful day!");
        } else if (reserveRoomChoice.equals("yes")) {
            System.out.print("Please enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Please enter your last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Please enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Here are our available rooms and their prices:");
            System.out.println("King Bed   ===== $160");
            System.out.println("Queen Bed  ===== $120");
            System.out.println("Single Bed ===== $100");

            System.out.print("Which room would you like to reserve? (King/Queen/Single): ");
            String roomType = scanner.nextLine().toLowerCase();

            System.out.print("How many nights would you like to stay? ");
            int nights = Integer.parseInt(scanner.nextLine());

            System.out.print("Are you a veteran? (Yes/No): ");
            String isVeteranChoice = scanner.nextLine().toLowerCase();
            boolean isVeteran = isVeteranChoice.equals("yes");

            double roomPrice = 0.0;
            switch (roomType) {
                case "king":
                    roomPrice = 160.0;
                    break;
                case "queen":
                    roomPrice = 120.0;
                    break;
                case "single":
                    roomPrice = 100.0;
                    break;
            }

            double totalCost = roomPrice * nights;
            double tax = totalCost * 0.08;  // 8% tax

            double seniorDiscount = (age >= 64) ? 0.1 * totalCost : 0.0;
            double veteranDiscount = (isVeteran) ? 0.15 * totalCost : 0.0;

            double grandTotal = totalCost + tax - seniorDiscount - veteranDiscount;

            System.out.println("\nHello " + firstName + ", You have selected " + roomType + " for " + nights + " nights to stay.");
            System.out.println("Room fee: $" + totalCost);
            System.out.println("Tax is: $" + tax);
            System.out.println("Senior discount: $" + seniorDiscount);
            System.out.println("Veterans discount: $" + veteranDiscount);
            System.out.println("\nYour grand total is: $" + grandTotal);
        } else {
            System.out.println("Invalid entry. Please enter 'yes' or 'no'.");
        }

        scanner.close();
    }
}
