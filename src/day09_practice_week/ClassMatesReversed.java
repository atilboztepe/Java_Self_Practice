package day09_practice_week;
import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classmates = {"Adam Bo", "Lebron James", "Jo Ko",
                "Brendan Lee", "Brayn Devis", "Sian Lee", "Laforest Sylavin",
                "Irwina Xx", "Macias Francisco", "Danny Gingras"};

        String[] classmatesReversed = new String[classmates.length];

        for (int i = 0, j = 0; i < classmates.length; i++, j++) {

            classmatesReversed[j] = classmates[i].substring(classmates[i].indexOf(" ")) + " " + classmates[i].substring(0, classmates[i].indexOf(" "));
            System.out.println(classmatesReversed[i]);

        }
    }
}