package org.fastTrackIT;

public class AnimalFood {
            String name;
    double price;
    double quantity;
    double expirationDate;
    double stockAvailability;
    boolean before;

    public AnimalFood(String name, double price, double quantity, double expirationDate,
                      double stockAvailability, boolean before) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stockAvailability = stockAvailability;
        this.before = before;
    }
}
