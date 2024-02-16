package day14_practice_tasks;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Yaris", 2023, 25000.0, "Grey");
        Honda honda = new Honda("Honda", "Civic", 2024, 30000.0, "Black");
        BMW bmw = new BMW("BMW", "X5", 2022, 60000.0, "Black");
        Audi audi = new Audi("Audi", "A6", 2022, 85000.0, "White");
        Mercedes mercedes = new Mercedes("Mercedes","E", 2020, 80000.0, "Silver");
        Tesla tesla = new Tesla("Tesla", "S", 2024, 100000.0, "Grey");
        Nio nio = new Nio("Nio", "ES8", 2021, 60000.0, "Green");
        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Cydeo", 2024, 70000.0, "Blue");

        carFunctions(toyota);
        carFunctions(honda);
        carFunctions(bmw);
        carFunctions(audi);
        carFunctions(mercedes);
        carFunctions(tesla);
        carFunctions(nio);
        carFunctions(cydeoCar);

    }
    public static void carFunctions(Car car) {
        System.out.println("Testing " + car.getMake() + " " + car.getModel() + ":");
        car.start();
        car.drive();
        car.stop();
        if (car instanceof AutoPark) {
            ((AutoPark) car).autoPark();
        }
        if (car instanceof AutoPilot) {
            ((AutoPilot) car).selfDrive();
        }
        if (car instanceof Flyable) {
            ((Flyable) car).fly();
        }
        System.out.println();
    }
}