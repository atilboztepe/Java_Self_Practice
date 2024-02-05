package day06_practice_tasks;

public class MathUtility {

    public static int calculate(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return 0;
                }
            default:
                System.out.println("Invalid operator.");
                return 0;
        }
    }
    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0.0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return 0.0;
                }
            default:
                System.out.println("Invalid operator.");
                return 0.0;
        }
    }
    public static int square(int num) {
        return calculate(num, '*', num);
    }

    public static double square(double num) {
        return calculate(num, '*', num);
    }
    public static int cube(int num) {
        return calculate(num, '*', square(num));
    }

    public static double cube(double num) {
        return calculate(num, '*', square(num));
    }

    public static void main(String[] args) {

        int resultInt = calculate(10, '+', 20);
        System.out.println("Result for int: " + resultInt);

        double resultDouble = calculate(2.5, '*', 3.0);
        System.out.println("Result for double: " + resultDouble);

        int squareResultInt = square(8);
        System.out.println("Square for int: " + squareResultInt);

        double squareResultDouble = square(1.5);
        System.out.println("Square for double: " + squareResultDouble);

        int cubeResultInt = cube(3);
        System.out.println("Cube for int: " + cubeResultInt);

        double cubeResultDouble = cube(2.5);
        System.out.println("Cube for double: " + cubeResultDouble);
    }
}