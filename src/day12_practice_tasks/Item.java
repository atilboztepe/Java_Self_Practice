package day12_practice_tasks;

public class Item {
    private String name;
    private double unitPrice;
    private double quantity;
    public String getName(){

        if (name == ""){
            System.err.println("Name cant contain special chars or digits");
            System.exit(1);
        }
        return name;
    }
    public void setName(String name){

        this.name= name;
    }
    public double getUnitPrice(){
        if (unitPrice < 0){
            System.err.println("Unit Price can not be negative");
            System.exit(1);
        }
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){

        this.unitPrice= unitPrice;
    }
    public double getQuantity(){
        if (quantity <0){
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }
        return quantity;
    }
    public void setQuantity(double quantity){

        this.quantity= quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
