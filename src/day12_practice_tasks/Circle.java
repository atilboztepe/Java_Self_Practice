package day12_practice_tasks;

public class Circle {
    private double radius;
    public static final double PI =3.14;
    public double getRadius(){
        if (radius <= 0) {
            System.err.println("Radius can not be zero or negative");
            System.exit(1);
        }
        return radius;

    }
    public void setRadius(double radius){

        this.radius= radius;
    }
    public double calcArea(){
        return radius*radius*PI;
    }
    public double calcPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
