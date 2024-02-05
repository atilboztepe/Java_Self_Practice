package day05_practice_tasks;

public class FactorialNumber {
    public static void main(String[] args) {
        int givenNumber = 5;
        int factorial = 1;
        int x = 1;

        while (x <= givenNumber) {
            factorial *= x;
            x++;
        }
        System.out.println(factorial);


    }
}
