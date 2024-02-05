package day10_practice_week;

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
