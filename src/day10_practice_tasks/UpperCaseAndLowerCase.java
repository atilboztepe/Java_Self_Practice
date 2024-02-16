package day10_practice_tasks;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)){
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
        }
        boolean result = upperCase == lowerCase;
        System.out.println(result);
    }

}
