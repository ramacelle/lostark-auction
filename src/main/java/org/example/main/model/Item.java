package org.example.main.model;

public class Item {
    String title;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Item (String title, double price){
        this.title = title;
        this.price = price;
    }
}
