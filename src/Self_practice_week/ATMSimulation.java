package Self_practice_week;

import java.util.Scanner;

public class ATMSimulation {


        private static final int CORRECT_PIN = 3535;
        private static double accountBalance = 1234.5;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            for (int attempts = 0; attempts < 3; attempts++) {
                System.out.print("Enter your pin number: ");
                int enteredPin = scanner.nextInt();

                if (enteredPin == CORRECT_PIN) {
                    handleOptions(scanner);
                    break;
                } else {
                    System.out.println("Incorrect Pin Number. Please re-enter.");
                }

                if (attempts == 2) {
                    System.out.println("Your card is locked. Please contact your local bank.");
                    System.exit(0);
                }
            }

            scanner.close();
        }

        private static void handleOptions(Scanner scanner) {
            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
            }
        }

        private static void checkBalance() {
            System.out.println("Your current balance: $" + accountBalance);
        }

        private static void depositMoney(Scanner scanner) {
            System.out.print("Enter the amount to deposit: $");
            double depositAmount = scanner.nextDouble();

            if (depositAmount <= 0) {
                System.out.println("Depositing amount cannot be zero or negative. Exiting the ATM.");
                System.exit(0);
            }

            accountBalance += depositAmount;
            System.out.println("New balance after deposit: $" + accountBalance);
        }

        private static void withdrawMoney(Scanner scanner) {
            System.out.print("Enter the amount to withdraw: $");
            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount <= 0) {
                System.out.println("Cannot withdraw zero or negative amount. Exiting the ATM.");
                System.exit(0);
            }

            if (withdrawAmount > accountBalance) {
                System.out.println("Insufficient funds. Withdrawal failed. Exiting the ATM.");
                System.exit(0);
            }

            accountBalance -= withdrawAmount;
            System.out.println("New balance after withdrawal: $" + accountBalance);
        }
    }

