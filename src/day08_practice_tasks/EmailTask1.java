package day08_practice_tasks;

public class EmailTask1 {

    public static void main(String[] args) {

        mail("mike_tyson@gmail.com");

    }

    public static void mail(String email) {
        String result;
        int indexOfUnderscore = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");

        if (email.contains("_")) {
            String firstName = email.substring(0, indexOfUnderscore);
            String lastName = email.substring(indexOfUnderscore + 1, indexOfAtSign);
            String mail = lastName + "_" + firstName + email.substring(indexOfAtSign);

            result = mail;

        } else {
            result = email;
        }
        System.out.println(result);

    }

}
