package day14_practice_tasks;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi is being auto park");
    }

    @Override
    public void start() {
        System.out.println("Audi started");

    }
    @Override
    public void drive() {
        System.out.println("Audi is driving");

    }
}