package day14_practice_tasks;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar is being auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar is being self drive");

    }

    @Override
    public void start() {
        System.out.println("CydeoCar started");

    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving");

    }

    @Override
    public void fly() {
        System.out.println("CydeoCar is not flying");
    }
}