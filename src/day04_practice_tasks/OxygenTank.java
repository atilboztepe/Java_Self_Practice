package day04_practice_tasks;

public class OxygenTank {
    public static void main(String[] args) {

        int oxygenLevel = 15;
        String result;

        if (oxygenLevel >= 50) {
            result = "Be careful, you're at 50%";
            if (oxygenLevel >= 60) {
                result = "Start to head back";
                if (oxygenLevel >= 70) {
                    result = "Don't go too far";
                    if (oxygenLevel >= 80) {
                        result = "Still okay";
                        if (oxygenLevel >= 90) {
                            result = "Your tank is full";
                        }
                    }
                }
            }
        } else {
            result = "See you later";
        }
        System.out.println(result);
    }
}

