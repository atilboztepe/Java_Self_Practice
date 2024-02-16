package day10_practice_tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        List<String> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.print("list ==> {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\"" + list.get(i) + "\"");
            if (i < list.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}