package com.example.pp.recyclerview;

import android.view.View;
import android.widget.TextView;

import com.example.pp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoViewHolder extends RecyclerView.ViewHolder {
    public TextView txtName;
    public TextView txtPrecio;
    public TextView txtCantidad;
    public View view;

    public ProductoViewHolder(@NonNull View itemView) {
        super(itemView);
        this.view = itemView;
        this.txtName = this.view.findViewById(R.id.txtName);
        this.txtPrecio = this.view.findViewById(R.id.txtPrecio);
        this.txtCantidad = this.view.findViewById(R.id.txtCantidad);
    }

}
