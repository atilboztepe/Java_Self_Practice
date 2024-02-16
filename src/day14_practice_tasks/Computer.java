package day14_practice_tasks;

public abstract class Computer extends Device {
    public Computer(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, String.valueOf(size), hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return "Computer{" +
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