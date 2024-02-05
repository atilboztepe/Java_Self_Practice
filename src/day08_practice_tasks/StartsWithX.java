package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String answer = input.next();
        input.close();
        if (answer.contains("x")){
            answer=answer.replaceFirst("x","a");
        }

        System.out.println(answer);
    }
}
