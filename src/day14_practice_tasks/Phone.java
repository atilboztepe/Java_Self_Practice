package day14_practice_tasks;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting " + phoneNumber);

    }
    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off");

    }

    @Override
    public String toString() {
        return "Phone{" +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}';
    }
}