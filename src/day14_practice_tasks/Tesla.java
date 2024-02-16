package day14_practice_tasks;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla is being auto park");

    }

    @Override
    public void start() {
        System.out.println("Tesla started");

    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");

    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is being self drive");

    }
}