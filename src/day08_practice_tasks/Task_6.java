package day08_practice_tasks;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanMe = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanMe.next();

        System.out.println("Enter your last name");
        String lastName = scanMe.next();

        scanMe.close();

        System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " "
                + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());


    }
}