package com.example.pp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.pp.mvc.ProductoController;
import com.example.pp.mvc.ProductoModel;
import com.example.pp.mvc.ProductoView;
import com.example.pp.recyclerview.ProductoAdapter;

public class EditProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_producto);

        ActionBar toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);


        ProductoModel p = new ProductoModel(
                getIntent().getStringExtra("NOMBRE"),
                getIntent().getStringExtra("CANTIDAD"),
                getIntent().getStringExtra("PRECIO")
        );
        Log.d("PRODUCTO EN EDIT ", p.toString());
        Log.d("INDEX EN EDIT ", getIntent().getStringExtra("INDEX"));
        ProductoController controller = new ProductoController();
        controller.setModel(p);
        ProductoView view = new ProductoView(this, controller, p);
        controller.setView(view);
        controller.setActivity(this);
        controller.setIndex(getIntent().getStringExtra("INDEX"));
    }
}
