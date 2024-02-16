package day14_practice_tasks;

public class Iphone extends Phone implements Downloadable, AppleApps {

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void downloadApp() {
        System.out.println("Iphone is downloading...");
    }

    public String OS() {
        return "IOS";
    }


    @Override
    public String AppStoreName() {
        return "App Store";
    }
}