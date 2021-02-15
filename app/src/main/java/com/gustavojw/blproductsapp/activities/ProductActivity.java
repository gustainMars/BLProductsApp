package com.gustavojw.blproductsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.gustavojw.blproductsapp.R;
import com.gustavojw.blproductsapp.model.Product;

public class ProductActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtQuantity;
    private EditText txtPrice;
    private Button btnSave;
    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);

        txtName = (EditText) findViewById(R.id.txtProductName);
        txtQuantity = (EditText) findViewById(R.id.txtQuantity);
        txtPrice = (EditText) findViewById(R.id.txtProductPrice);

        btnSave = (Button) findViewById(R.id.btnSaveProduct);

    }

    private Product getDataProductFromForm(){

        this.product = new Product();

        if (this.txtName.getText().toString().isEmpty() == false)
            this.product.setName(this.txtName.getText().toString());
        else {
            return null;
        }

        if (this.txtQuantity.getText().toString().isEmpty() == false) {
            int productQuantity = Integer.parseInt(this.txtQuantity.getText().toString());
            this.product.setStockQuantity(productQuantity);
        }
        else {
            return null;
        }

        if (this.txtPrice.getText().toString().isEmpty() == false) {
            float productPrice = Float.parseFloat(this.txtName.getText().toString());
            this.product.setPrice(productPrice);
        }
        else {
            return null;
        }

        return product;

    }
}