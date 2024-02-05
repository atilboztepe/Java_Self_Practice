package day07_practice_tasks;

public class Rectangle {

    public double width;
    public double length;

    public double calculateArea(double width, double length) {

        double area = width * length;

        return area;


    }

    public double calculatePerimeter(double width, double length) {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

}
