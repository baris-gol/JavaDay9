package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaType;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public String getCocoaType() {
        return cocoaType;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: ₺" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Content: " + cocoaType);
    }
}