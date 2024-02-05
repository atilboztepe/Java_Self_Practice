package day03_practice_tasks;

public class Grade {
    public static void main(String[] args) {

        double math = 60.0;
        double chemistry = 50.0;
        double biology = 70.0;

        double average = ( math + chemistry + biology) / 3;

        if (average >= 90 && average <= 100) {
            System.out.println("Average is" + average);
            System.out.println("Grade is A");
        }else if ( average >= 80 && average < 90) {
            System.out.println("Average is" + average);
            System.out.println("Grade is B");
        }else if ( average >= 70 && average < 80) {
        System.out.println("Average is" + average);
        System.out.println("Grade is C");
    }else if ( average >= 60 && average < 70) {
        System.out.println("Average is" + average);
            System.out.println("Grade is D");
}else if ( average >= 0 && average < 60) {
            System.out.println("Average is" + average);
            System.out.println("Grade is E");
        }}}