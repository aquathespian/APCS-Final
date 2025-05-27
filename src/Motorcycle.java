public class Motorcycle extends InventoryItem {
    private String engine;

    public Motorcycle(String manufacturer, String model, int year, double price, String engine) {
        super(manufacturer, model, year, price);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String toString() {
        return "\n\nType: Motorcycle\nManufacturer: " + getManufacturer() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nEngine: " + getEngine();
    }
}
