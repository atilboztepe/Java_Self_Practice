package day07_practice_tasks;

public class Item {

    public String itemName;
    public double unitPrice;
    int quantity;
    double totalCost;


    public double calcCost(double unitPrice, int quantity) {
        totalCost = quantity * unitPrice;
        return totalCost;
    }


    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }

}
