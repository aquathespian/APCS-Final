public class Automobile extends InventoryItem {
    private double mpg;

    public Automobile(String manufacturer, String model, int year, double price, double mpg) {
        super(manufacturer, model, year, price);
        this.mpg = mpg;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public String toString() {
        return "\n\nType: Automobile\nManufacturer: " + getManufacturer() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nMiles per Gallon: " + getMpg();
    }
}