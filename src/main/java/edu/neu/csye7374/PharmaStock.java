package edu.neu.csye7374;

public class PharmaStock extends StockAPI {
    private int metric;

    public PharmaStock(String ID, double price, String description) {
        super(ID, price, description);
        this.metric = 0;
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(getPrice() * (1 + bidValue / 200)); // Smaller bid impact
        metric += (bidValue > 0) ? 5 : -5; // Different performance logic
    }

    @Override
    public int getMetric() {
        return metric;
    }
}
