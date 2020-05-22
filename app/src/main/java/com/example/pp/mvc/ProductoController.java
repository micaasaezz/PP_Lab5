package com.example.pp.mvc;

import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.pp.MainActivity;
import com.example.pp.R;
import com.example.pp.recyclerview.ProductoAdapter;

import java.net.Inet4Address;

import androidx.recyclerview.widget.RecyclerView;

public class ProductoController implements View.OnClickListener {
    private ProductoView view;
    private ProductoModel model;
    private String index;
    Activity a;

    public ProductoController() {}
    public void setModel(ProductoModel model) {
        this.model = model;
    }

    public void setIndex(String i) {
        this.index = i;
    }
    public void setActivity(Activity a) {
        this.a = a;
    }

    public void setView(ProductoView view) {
        this.view = view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSave) {
            this.view.loadViews();
            this.view.saveModel();
            Log.d("Saved", this.model.toString());
            final int index = Integer.parseInt(this.index);
            MainActivity.adapter.setProductEdited(this.model, index);
            MainActivity.adapter.notifyItemChanged(index);
            this.a.finish();
        }
    }

}
