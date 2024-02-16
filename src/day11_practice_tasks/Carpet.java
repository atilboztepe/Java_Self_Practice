package day11_practice_tasks;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        return (width * length * unitPrice) + (isPersian ? 200 : 0);
    }


    public String toString() {
        return "Carpet: " +
                "width = " + width +
                ", length = " + length +
                ", unit price = " + unitPrice +
                ", persian: " + isPersian +
                ", total cost: $" + calcCost();
    }
}
