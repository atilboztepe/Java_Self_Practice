package day04_practice_tasks;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 14;
        int b = 15;
        int c = 12;
        int result;

        if(a>b) {
            if(b>c) {
                result = b;   // a>b>c
            } else if (c>a) { // c>a>b
                result = a;
            } else {
                result = c;   // a>c>b
            }
        } else if (a>c) {     //  b>a>c
            result = a;
        } else if (b>c) {     //  b>a c>a , b>c>a
            result = c;
        } else {
            result = b;
        }
        System.out.println(result);
    }


}
