package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        double n = max(10.5, 30.2);
        System.out.println(n);

        int m = min(100, 200);
        System.out.println(m);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (b > a) {
            return a;
        } else {
            return b;
        }
    }

    public static double min(double a, double b) {
        if (b > a) {
            return a;
        } else {
            return b;
        }
    }
}
