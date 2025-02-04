package edu.neu.csye7374;

import java.util.Arrays;
import java.util.List;

public class Stock {
    public static void demo() {
        System.out.println("===== Stock Trading Simulation Start =====\n");

        TechStock techStock = new TechStock("AAPL", 150.0, "Apple Inc. Tech Stock");
        PharmaStock pharmaStock = new PharmaStock("PFE", 100.0, "Pfizer Inc. Pharma Stock");

        List<String> bids = Arrays.asList("5", "-3", "7", "-4", "6", "-2"); // 6 bids

        System.out.println("Before Bids:");
        System.out.println(techStock);
        System.out.println(pharmaStock);
        System.out.println();

        for (String bid : bids) {
            techStock.setBid(bid);
            pharmaStock.setBid(bid);
            System.out.println("After bid " + bid + "%:");
            System.out.println("Tech Stock: " + techStock + ", Metric: " + techStock.getMetric());
            System.out.println("Pharma Stock: " + pharmaStock + ", Metric: " + pharmaStock.getMetric());
            System.out.println();
        }

        System.out.println("===== Stock Trading Simulation End =====");
    }
}
