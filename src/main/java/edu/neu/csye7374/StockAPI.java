package edu.neu.csye7374;


public abstract class StockAPI implements Tradable {
    private String ID;
    private double price;
    private String description;

    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Stock [ID=" + ID + ", Price=" + price + ", Description=" + description + "]";
    }
}
