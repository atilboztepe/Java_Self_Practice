package day05_practice_tasks;

public class SumOfNumbers {
    public static void main(String[] args) {
        int givenNumber = 100;
        int sum = 0;
        int x = 1;

        while (x <= givenNumber) {
            sum += x;
            x++;
        }
        System.out.println(sum);

    }
}
