package day06_practice_tasks;

public class DayAndMonth {
    public static void day(int dayNumber) {
        String[] daysOfWeek = {"Invalid Number", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(daysOfWeek[dayNumber]);
        } else {
            System.out.println("Invalid Number");
        }
    }
    public static void monthName(int monthNumber) {
        String[] months = {"Invalid Number", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber]);
        } else {
            System.out.println("Invalid Number");
        }
    }
    public static void daysInMonth(int monthNumber) {
        String[] months = {"Invalid Number", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber] + " has " + daysInMonth[monthNumber] + " days");
        } else {
            System.out.println("Invalid Number");
        }
    }
    public static void main(String[] args) {

        day(5);
        monthName(6);
        daysInMonth(6);


    }
}
