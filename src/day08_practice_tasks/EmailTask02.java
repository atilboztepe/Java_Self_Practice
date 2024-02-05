package day08_practice_tasks;

public class EmailTask02 {
    public static void main(String[] args) {

        userInformation("craig_federighi@apple.com");

    }


    public static void userInformation(String email) {

        int indexOfUnderscore = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");


        String firstName = email.substring(0, indexOfUnderscore);
        String lastName = email.substring(indexOfUnderscore + 1, indexOfAtSign);
        String domain = email.substring(indexOfAtSign + 1, indexOfDot);

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


        System.out.println("\tFirst name: " + firstName + "\n\tLast name: " + lastName + "\n\tDomain: " + domain);


    }

}