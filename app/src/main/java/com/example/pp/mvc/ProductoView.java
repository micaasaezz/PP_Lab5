package com.example.pp.mvc;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.pp.R;

public class ProductoView {
    public EditText edName;
    public EditText edCantidad;
    public EditText edPrecio;
    public Button btnSave;
    private ProductoModel model;
    private Activity activity;

    public ProductoView(Activity activity, ProductoController controller, ProductoModel model) {
        this.activity = activity;
        this.model = model;
        this.btnSave = this.activity.findViewById(R.id.btnSave);
        this.btnSave.setOnClickListener(controller);
    }

    public void loadViews() {
        this.edName = activity.findViewById(R.id.edName);
        this.edPrecio = activity.findViewById(R.id.edPrecio);
        this.edCantidad = activity.findViewById(R.id.edCantidad);
    }

    public void saveModel() {
        this.model.setNombre(this.edName.getText().toString());
        this.model.setCantidad(this.edCantidad.getText().toString());
        this.model.setPrecio(this.edPrecio.getText().toString());
    }
}
