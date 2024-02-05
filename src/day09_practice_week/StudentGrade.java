package day09_practice_week;
import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 100 || scores[i] < 0) {
                System.err.println("Invalid score: " + scores[i]);
                return;
            }
            if (scores[i] > 89)
                grades[i] = 'A';
            else if (scores[i] > 79)
                grades[i] = 'B';
            else if (scores[i] > 69)
                grades[i] = 'C';
            else if (scores[i] > 59)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        System.out.println("grades = " + Arrays.toString(grades));

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }

    }
}
