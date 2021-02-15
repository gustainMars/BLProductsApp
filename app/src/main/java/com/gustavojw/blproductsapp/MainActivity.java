package com.gustavojw.blproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gustavojw.blproductsapp.activities.SaleActivity;
import com.gustavojw.blproductsapp.dbHelper.ConnectionSQLite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionSQLite sqLite = ConnectionSQLite.getInstance(this);

    }

    public void openProductActivity(View view) {
        Intent product = new Intent(this, SaleActivity.class);
        startActivity(product);
    }
}