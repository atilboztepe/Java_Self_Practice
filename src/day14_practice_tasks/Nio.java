package day14_practice_tasks;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is being auto park");

    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is being self drive");

    }

    @Override
    public void start() {
        System.out.println("Nio started");

    }

    @Override
    public void drive() {
        System.out.println("Nio is driving");
    }
}