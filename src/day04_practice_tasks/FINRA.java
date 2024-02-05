package day04_practice_tasks;

public class FINRA {
    public static void main(String[] args) {


        int number = 15;
        String result;

        if (number%3 == 0){
            result = "FIN";
            if (number%5 == 0) {
                result = "FINRA";
            }
        } else if (number%5 == 0) {
            result = "RA";
        } else {
            result = "Nothing";
        }
        System.out.println(result);
    }
}

