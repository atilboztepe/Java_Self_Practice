package day04_practice_tasks;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String result;

        if(grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'E') {
            result = "Failed";
        } else {
            result = "Invalid Grade";
        }
        System.out.println(result);


    }
}
