package org.example.model;

public class Coke extends ProductForSale{
    private double acidityLevel;

    public Coke(String type, double price, String description){
        super(type, price, description);
    }


    public double getAcidityLevel() {
        return acidityLevel;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: ₺" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Acidity Level: " + acidityLevel);
    }
}