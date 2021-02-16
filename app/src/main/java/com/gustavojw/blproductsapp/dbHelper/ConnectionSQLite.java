package com.gustavojw.blproductsapp.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnectionSQLite extends SQLiteOpenHelper {

    private static ConnectionSQLite CONNECTION_INSTANCE;
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "bl_products_app";

    public ConnectionSQLite(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static ConnectionSQLite getInstance(Context context) {
        if(CONNECTION_INSTANCE == null) {
            CONNECTION_INSTANCE = new ConnectionSQLite(context);
        }
        return CONNECTION_INSTANCE;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlProductTable =
                "CREATE TABLE product (" +
                "id INTEGER PRIMARY KEY," +
                "name TEXT," +
                "quantityInStock INTEGER," +
                "price NUMERIC" +
                ")";

        sqLiteDatabase.execSQL(sqlProductTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
