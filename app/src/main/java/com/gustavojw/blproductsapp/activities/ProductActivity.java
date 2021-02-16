package com.gustavojw.blproductsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gustavojw.blproductsapp.R;
import com.gustavojw.blproductsapp.controller.ProductController;
import com.gustavojw.blproductsapp.dbHelper.ConnectionSQLite;
import com.gustavojw.blproductsapp.model.Product;

public class ProductActivity extends AppCompatActivity {

    private EditText txtBarCode;
    private EditText txtName;
    private EditText txtQuantity;
    private EditText txtPrice;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        txtBarCode = (EditText) findViewById(R.id.txtProductBarCode);
        txtName = (EditText) findViewById(R.id.txtProductName);
        txtQuantity = (EditText) findViewById(R.id.txtQuantity);
        txtPrice = (EditText) findViewById(R.id.txtProductPrice);

        btnSave = (Button) findViewById(R.id.btnSaveProduct);

        this.clickSaveButtonListener();

    }

    private void clickSaveButtonListener() {

        this.btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Product productToSave = getDataProductFromForm();

                if (productToSave != null) {
                    ProductController productController = new ProductController(ConnectionSQLite.getInstance(ProductActivity.this));
                    long idProduct = productController.saveProductController(productToSave);

                    if (idProduct > 0)
                        Toast.makeText(ProductActivity.this, "Product successfully saved!", Toast.LENGTH_LONG).show();
                    else {
                        Toast.makeText(ProductActivity.this, "An exception occurred while trying to save the product. " +
                                "Remember, all fields are required and with the appropriate data type.", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(ProductActivity.this, "Please, fill in all fields.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private Product getDataProductFromForm(){

        Product product = new Product();

        if (!this.txtBarCode.getText().toString().isEmpty())
            product.setId(Integer.parseInt(this.txtBarCode.getText().toString()));
        else {
            return null;
        }

        if (!this.txtName.getText().toString().isEmpty())
            product.setName(this.txtName.getText().toString());
        else {
            return null;
        }

        if (!this.txtQuantity.getText().toString().isEmpty()) {
            int productQuantity = Integer.parseInt(this.txtQuantity.getText().toString());
            product.setStockQuantity(productQuantity);
        }
        else {
            return null;
        }

        if (!this.txtPrice.getText().toString().isEmpty()) {
            float productPrice = Float.parseFloat(this.txtPrice.getText().toString());
            product.setPrice(productPrice);
        }
        else {
            return null;
        }

        return product;

    }
}