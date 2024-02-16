package day09_practice_tasks;

public class ArrayElements {

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[100];

        int lengthOfArray = numbers.length;
        System.out.println("lengthOfArray = " + lengthOfArray);

        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int[] reversedArray = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = numbers[i];

            System.out.print(reversedArray[j] + " ");
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}