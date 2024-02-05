package day09_practice_week;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] item : items) {
            for (String item2 : item) {
                System.out.print(item2 + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        for (int i = 2; i >= 0; i--) {
            for (String item : items[i]) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
