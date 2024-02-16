package day14_practice_tasks;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String model) {
        if (make == null || make.isEmpty() || make.equals(" "))
            System.exit(1);
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.equals(" "))
            System.exit(1);
    }
    public void color(String color){
        if (color == null || color.isEmpty() || color.equals(" "))
            System.exit(1);
    }

    public void setYear(int year){
        if (year < 1986)
            System.exit(1);
    }

    public void price (double price) {
        if (price < 0)
            System.exit(1);

    }

    public abstract void start ();
    public abstract void drive ();



    public void stop (){
        System.out.println("Car is stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}