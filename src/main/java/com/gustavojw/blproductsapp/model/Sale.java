package com.gustavojw.blproductsapp.model;

import java.util.Date;

public class Sale {

    private long id;
    private Product soldProduct;
    private Date saleDate;
    private String clientName;

    public Sale() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getSoldProduct() {
        return soldProduct;
    }

    public void setSoldProduct(Product soldProduct) {
        this.soldProduct = soldProduct;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", soldProduct=" + soldProduct +
                ", saleDate=" + saleDate +
                ", clientName='" + clientName + '\'' +
                '}';
    }
    
}
