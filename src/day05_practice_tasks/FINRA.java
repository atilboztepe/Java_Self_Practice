package day05_practice_tasks;

public class FINRA {
    public static void main(String[] args) {
        int givenNumber = 100;
        int x = 0;

        while (x < givenNumber) {
            x++;
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("FINRA ");
            } else if (x % 3 == 0) {
                System.out.print("FIN ");
            } else if (x % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(x + " ");
            }
        }
    }
}
