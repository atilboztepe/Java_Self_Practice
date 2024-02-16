package day12_practice_tasks;

public class Rectangle {
    private double width;
    private double length;
    public double getWidth(){
        if (width <= 0){
            System.err.println("Width can not be zero or negative");
            System.exit(1);
        }
        return width;
    }
    public void setWidth(double width){

        this.width= width;
    }
    public double getLength(){
        if (length <= 0){
            System.err.println("Length can not be zero or negative");
            System.exit(1);
        }
        return length;
    }
    public void setLength(double length){

        this.length= length;
    }
    public double calcArea(){
        return length*width;
    }
    public double calcPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
