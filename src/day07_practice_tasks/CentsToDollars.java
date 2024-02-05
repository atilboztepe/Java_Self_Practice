package day07_practice_tasks;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cents:");
        int cents = scan.nextInt();
        int dollars = (int) (cents * 0.01);
        int remCents = cents % 100;
        System.out.println(cents + " cents is equal to " + dollars + " dollars and " + remCents + " cents");
        scan.close();
    }
}
