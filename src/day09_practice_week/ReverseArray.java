package day09_practice_week;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = reverseArray(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseArray (int[] array){

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i-- , j++) {
            reverseArray[j] = array[i];
        }
        return reverseArray;
    }
}
