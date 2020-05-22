package com.example.pp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;

import com.example.pp.mvc.ProductoController;
import com.example.pp.mvc.ProductoList;
import com.example.pp.mvc.ProductoModel;
import com.example.pp.mvc.ProductoView;
import com.example.pp.recyclerview.ProductoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static ProductoAdapter adapter;
    final List<ProductoModel> lista = ProductoList.getList(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView list = (RecyclerView)findViewById(R.id.recyclerList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);
        Log.d("LIST",lista.toString());
        MainActivity.adapter = new ProductoAdapter(lista);
        MainActivity.adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startView(lista.get(list.getChildAdapterPosition(v)));
            }
        });
        list.setAdapter(MainActivity.adapter);
    }

    public void startView(ProductoModel p) {
        Intent intent = new Intent(this, EditProducto.class);
        intent.putExtra("NOMBRE", p.getNombre());
        intent.putExtra("CANTIDAD", p.getCantidad());
        intent.putExtra("PRECIO", p.getPrecio());
        intent.putExtra("INDEX", String.valueOf(lista.indexOf(p)));
        Log.d("INDEX", String.valueOf(lista.indexOf(p)));
        super.startActivity(intent);
    }
}
