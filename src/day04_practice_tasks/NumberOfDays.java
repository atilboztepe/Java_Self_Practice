package day04_practice_tasks;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 5;

        String result = "";

        switch(month){
            case 1 , 3 , 5 ,7 , 8 , 10 ,12 :
                result = "31 days";
                break;
            case 4 , 6 , 9 ,11 :
                result = "30 days";
                break;
            case 2:
                result = "28 days";
                break;
            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);
    }
}
