package day10_practice_tasks;
import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).toLowerCase().charAt(0) == list.get(i).charAt(list.get(i).length() - 1)) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
    }
}