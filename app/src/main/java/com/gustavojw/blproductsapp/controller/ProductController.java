package com.gustavojw.blproductsapp.controller;

import com.gustavojw.blproductsapp.DAO.ProductDAO;
import com.gustavojw.blproductsapp.dbHelper.ConnectionSQLite;
import com.gustavojw.blproductsapp.model.Product;

public class ProductController {

    private final ProductDAO productDAO;

    public ProductController(ConnectionSQLite pConnection){
        productDAO = new ProductDAO(pConnection);
    }

    public long saveProductController(Product product) {
        return this.productDAO.saveProductDAO(product);
    }

}
