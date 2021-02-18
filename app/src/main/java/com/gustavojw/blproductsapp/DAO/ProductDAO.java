package com.gustavojw.blproductsapp.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.gustavojw.blproductsapp.dbHelper.ConnectionSQLite;
import com.gustavojw.blproductsapp.model.Product;

public class ProductDAO {

    private final ConnectionSQLite connectionSQLite;

    public ProductDAO(ConnectionSQLite connectionSQLite) {
        this.connectionSQLite = connectionSQLite;
    }

    public long saveProductDAO(Product product){

        SQLiteDatabase dataBase = connectionSQLite.getWritableDatabase();

        try{

            ContentValues values = new ContentValues();
            values.put("barCode", product.getbarCode());
            values.put("name", product.getName());
            values.put("quantityInStock", product.getStockQuantity());
            values.put("price", product.getPrice());

            long insertedProductId = dataBase.insert("product", null, values);
            return insertedProductId;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;

    }
}
