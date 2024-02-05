package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int quantityOfPpl = scanner.nextInt();
        if (quantityOfPpl < 3 && quantityOfPpl >= 0) {
            System.out.println("Live with less than three people.");
        } else if (quantityOfPpl >= 3 && quantityOfPpl <= 6) {
            System.out.println("Live with 3 - 6 people.");
        } else if (quantityOfPpl > 6) {
            System.out.println("Live with more than six people.");
        } else {
            System.out.println("Enter a valid number");
        }
        scanner.close();
    }

}
