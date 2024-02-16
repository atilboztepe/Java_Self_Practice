package day13_practice_tasks;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple","Iphone 15", "3.5-6.7", 1_500,"White");
        iPhone.call("+15678909");
        iPhone.text("+15678909");
        iPhone.faceTime("+15678909");
        System.out.println(iPhone);

        System.out.println("--------------------------------------");

        Nokia nokia = new Nokia("Nokia","Nokia A", "3-5.6", 999.00,"Red");
        nokia.call("+11236576");
        nokia.text("+11236576");
        nokia.faceTime("+11236576");
        System.out.println(nokia);
    }
}
