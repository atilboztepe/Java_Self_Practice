package day06_practice_tasks;


public class OddAndEven {
    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println(result);

        result = isEven(100);
        System.out.println(result);
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}