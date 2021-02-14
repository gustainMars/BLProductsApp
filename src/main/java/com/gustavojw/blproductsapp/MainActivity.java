package com.gustavojw.blproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gustavojw.blproductsapp.activities.SaleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSaleActivity(View view) {
        Intent sale = new Intent(this, SaleActivity.class);
        startActivity(sale);
    }
}