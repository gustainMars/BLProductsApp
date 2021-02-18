package com.gustavojw.blproductsapp.model;

public class Product {

    private int barCode;
    private String name;
    private int stockQuantity;
    private float price;

    public Product() {

    }

    public int getbarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Bar Code =" + barCode +
                ", Name ='" + name + '\'' +
                ", Quantity in Stock =" + stockQuantity +
                ", Price =" + price +
                '}';
    }

}
