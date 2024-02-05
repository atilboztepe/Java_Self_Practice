package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 2.0;
        rectangle1.length = 7.0;

        double area = rectangle1.calculateArea(rectangle1.width, rectangle1.length);
        System.out.println(area);
        double perimeter = rectangle1.calculatePerimeter(rectangle1.width, rectangle1.length);
        System.out.println(perimeter);
        System.out.println(rectangle1);


        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 12;
        rectangle2.length = 8;

        area = rectangle2.calculateArea(rectangle2.width, rectangle2.length);
        System.out.println(area);
        perimeter = rectangle2.calculatePerimeter(rectangle2.width, rectangle2.length);
        System.out.println(perimeter);
        System.out.println(rectangle2);

    }
}