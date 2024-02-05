package Self_practice_week;

    import java.util.Scanner;

    public class CoffeeOrderApp {
        private double blackCoffeePrice = 4.5;
        private double lattePrice = 6.0;
        private double cappuccinoPrice = 6.5;
        private double totalPrice = 0.0;

        public static void main(String[] args) {
            CoffeeOrderApp coffeeOrderApp = new CoffeeOrderApp();
            coffeeOrderApp.runCoffeeOrderApp();
        }

        public void runCoffeeOrderApp() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Coffee Order App!");
            System.out.print("Would you like to order coffee? (yes/no): ");
            String orderChoice = scanner.nextLine().toLowerCase();

            while (true) {
                if (orderChoice.equals("yes")) {
                    displayCoffeeOptions();

                    int coffeeChoice = getUserInput(scanner, "Pick a coffee (1-3): ", 1, 3);

                    processCoffeeChoice(coffeeChoice);

                    System.out.print("Do you want another order? (yes/no): ");
                    String anotherOrderChoice = scanner.nextLine().toLowerCase();

                    if (anotherOrderChoice.equals("no")) {
                        System.out.println("Your total is: $" + totalPrice);
                        System.out.println("Thanks for using our service!");
                        break;
                    } else if (!anotherOrderChoice.equals("yes")) {
                        System.out.println("Invalid entry. Please try again.");
                    }
                } else if (orderChoice.equals("no")) {
                    System.out.println("Thanks for using our service!");
                    break;
                } else {
                    System.out.println("Invalid entry. Please enter 'yes' or 'no'.");
                }

                System.out.print("Would you like to order coffee? (yes/no): ");
                orderChoice = scanner.nextLine().toLowerCase();
            }

            scanner.close();
        }

        private void displayCoffeeOptions() {
            System.out.println("\nCoffee Options:");
            System.out.println("1. Black Coffee - $" + blackCoffeePrice);
            System.out.println("2. Latte - $" + lattePrice);
            System.out.println("3. Cappuccino - $" + cappuccinoPrice);
        }

        private int getUserInput(Scanner scanner, String prompt, int min, int max) {
            int userInput;

            while (true) {
                try {
                    System.out.print(prompt);
                    userInput = Integer.parseInt(scanner.nextLine());

                    if (userInput >= min && userInput <= max) {
                        return userInput;
                    } else {
                        System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }

        private void processCoffeeChoice(int choice) {
            switch (choice) {
                case 1:
                    System.out.println("Added Black Coffee to Your Order.");
                    totalPrice += blackCoffeePrice;
                    break;
                case 2:
                    System.out.println("Added Latte to Your Order.");
                    totalPrice += lattePrice;
                    break;
                case 3:
                    System.out.println("Added Cappuccino to Your Order.");
                    totalPrice += cappuccinoPrice;
                    break;
            }
        }
    }
