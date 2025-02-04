package edu.neu.csye7374;

public class TechStock extends StockAPI {
    private int metric;
    
    public TechStock(String ID, double price, String description) {
        super(ID, price, description);
        this.metric = 0;
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(getPrice() * (1 + bidValue / 100)); // Increase price based on bid percentage
        metric += (bidValue > 0) ? 10 : -10; // Performance metric logic
    }

    @Override
    public int getMetric() {
        return metric;
    }
}
