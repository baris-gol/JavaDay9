package org.example.model;

public class Bread extends ProductForSale {
    private String breadType;

    public Bread(String type, double price, String description){
        super(type, price, description);
    }

    public String getBreadType(){
        return breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType());
        System.out.println("Price: ₺" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Bread Type: " + breadType);
    }
}