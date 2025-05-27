import java.util.ArrayList;

public class Main {

    static void bubbleSort(ArrayList<InventoryItem> array) {
        InventoryItem temp;
        boolean sorted;
        for (int i = 0; i < array.size() - 1; i++) {
            sorted = false;
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j).getPrice() < array.get(j + 1).getPrice()) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    sorted = true;
                }
            }
            if (!sorted) break;
        }
        for (InventoryItem inventoryItem : array) {
            System.out.println(inventoryItem);
        }
    }

    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        inventory.add(new Automobile("Toyota", "Corolla", 2019, 20000, 24.5));
        inventory.add(new Automobile("Lexus", "LX", 2021, 32000, 19.8));
        inventory.add(new Automobile("Audi", "A6", 2017, 14500, 22.6));
        inventory.add(new Motorcycle("Harley-Davidson", "Road Glide", 2015, 25000.0, "V-Twin"));
        inventory.add(new Motorcycle("Kawasaki", "Z100", 2010, 999.99, "1000cc 4-cycle"));
        inventory.add(new Motorcycle("Ducati", "Panigale V4", 2024, 40000.0, "Desmosedici Stradale V4"));

        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem);
        }
        ((Automobile)inventory.get(2)).setMpg(20.2);
        System.err.println(inventory.get(2)); //prints updated vehicle at the end of the terminal window.
        inventory.get(4).setYear(2006);
        System.err.println(inventory.get(4)); //prints updated vehicle at the end of the terminal window.
        System.out.println("-----------------");
        bubbleSort(inventory);  //bubbleSort from BubbleSort assignment, modified for rearranging Objects in descending order.
    }
}
