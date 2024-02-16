package day09_practice_tasks;
import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"Lebron James","Joo Lee", "Roberto Carlos","Pablo Escobar", "Andy Bo", "Gobby Leon", "Denis Lon", "Furth Bony", "Honny Lord", "Leo Messi"};
        String[] initials = findIniials(names);
        System.out.println(Arrays.toString(initials));
        for (int i = 0; i < names.length; i++) {
            System.out.println(initials[i]);
        }

    }
    public static String[] findIniials(String[] names){
        String[] initials = new String[names.length];
        for (int i = 0; i < names.length ; i++) {

            initials[i]=names[i].charAt(0)+""+names[i].charAt(names[i].indexOf(" ")+1);
        }
        return initials;
    }
}