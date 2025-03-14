package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("Dark Chocolate", 5.0, "Rich and dark chocolate");
        ProductForSale coke = new Coke("Coke", 1.5, "Refreshing cola drink");
        ProductForSale bread = new Bread("Bread", 2.0, "Freshly baked bread");

        ProductForSale[] products = {chocolate, coke, bread};

        Store store = new Store();
        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }
}