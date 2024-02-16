package day14_practice_tasks;

public class Google extends Phone implements Downloadable, AndroidApps{

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("Google is downloading...");

    }

    @Override
    public String AppStoreName() {
        return "Google Play";
    }

    @Override
    public String OS() {
        return "Android";
    }
}