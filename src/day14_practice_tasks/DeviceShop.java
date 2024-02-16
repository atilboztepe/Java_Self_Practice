package day14_practice_tasks;

public class DeviceShop {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop("Apple", "a3", 900, "Grey", "3''", true, true);
        System.out.println(desktop1);
        desktop1.work();
        desktop1.turnOff();
        desktop1.turnOn();
        Laptop laptop1 = new Laptop("Samsung", "b4", 500, "Silver", "2''", true, true);
        System.out.println(laptop1);
        laptop1.work();
        laptop1.turnOff();
        laptop1.turnOn();
        Google google1 = new Google("Google","h7", 800, "White", "1''", true, true);
        System.out.println(google1);
        google1.call(123456789);
        google1.text(123456789);
        google1.downloadApp();
        google1.turnOff();
        google1.turnOff();
        Samsung samsung1 = new Samsung("Samsung","z4", 4000, "Red", "4''", true, true);
        System.out.println(samsung1);
        samsung1.call(123456789);
        samsung1.text(123456789);
        samsung1.downloadApp();
        samsung1.turnOff();
        samsung1.turnOff();
    }
}
