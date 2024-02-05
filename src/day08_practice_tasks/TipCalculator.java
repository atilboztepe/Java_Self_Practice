package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)?");
        String splitOrNot = input.next().toLowerCase();

        while (!(splitOrNot.equals("yes") || splitOrNot.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your answer:");
            splitOrNot = input.next().toLowerCase();
        }

        int numberOfPeople = 1;

        if (splitOrNot.equals("yes")) {
            System.out.println("Enter the number of people:");
            numberOfPeople = input.nextInt();
        }

        while (numberOfPeople <= 0) {
            System.err.println("Invalid entry, please re-enter number of people:");
            numberOfPeople = input.nextInt();
        }

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        while (checkAmount < 0) {
            System.err.println("Invalid entry, please re-enter check amount:");
            checkAmount = input.nextInt();
        }
        System.out.println("How was the Service Quality? (Poor/Fair/Good/Great/Excellent)");

        String serviceQuality = input.next();

        while (!((serviceQuality.equalsIgnoreCase("poor")) || (serviceQuality.equalsIgnoreCase("fair")) ||
                (serviceQuality.equalsIgnoreCase("good")) || (serviceQuality.equalsIgnoreCase("great")) ||
                (serviceQuality.equalsIgnoreCase("excellent")))) {
            System.err.println("Invalid entry, please re-enter your answer:");

            serviceQuality = input.next().toLowerCase();
        }

        input.close();

        double totalPay = 0.0;

        if (serviceQuality.equals("poor")) {
            totalPay = (checkAmount * 5 / 100) + checkAmount;
        } else if (serviceQuality.equals("fair")) {
            totalPay = (checkAmount * 10 / 100) + checkAmount;
        } else if (serviceQuality.equals("good")) {
            totalPay = (checkAmount * 15 / 100) + checkAmount;
        } else if (serviceQuality.equals("great")) {
            totalPay = (checkAmount * 20 / 100) + checkAmount;
        } else if (serviceQuality.equals("excellent")) {
            totalPay = (checkAmount * 25 / 100) + checkAmount;
        }

        System.out.println("Number of people entered:" + numberOfPeople);
        System.out.println("Total to pay:" + totalPay);
        System.out.println("Total tip:" + (totalPay - checkAmount));
        System.out.println("Total per person:" + (totalPay / numberOfPeople));
        System.out.println("Tip per person:" + ((totalPay - checkAmount) / numberOfPeople));
    }
}