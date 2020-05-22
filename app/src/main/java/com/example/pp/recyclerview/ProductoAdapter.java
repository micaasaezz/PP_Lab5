package com.example.pp.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pp.R;
import com.example.pp.mvc.ProductoController;
import com.example.pp.mvc.ProductoModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoViewHolder> implements View.OnClickListener {
    private List<ProductoModel> list;
    private final ProductoController mOnClickListener = new ProductoController();
    private View.OnClickListener listener;

    public ProductoAdapter(List<ProductoModel> personList) {
        this.list = personList;
    }

    public void setPersonList(List<ProductoModel> list) {
        this.list.addAll(list);
    }
    public List<ProductoModel> getPersonList() {
        return this.list;
    }

    public void setProductEdited(ProductoModel p, int index) {
        this.list.set(index, p);
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_producto, parent, false);
        ProductoViewHolder pvh = new ProductoViewHolder(view);
        view.setOnClickListener(this);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        ProductoModel p = this.list.get(position);
        holder.txtPrecio.setText(p.getPrecio());
        holder.txtCantidad.setText(p.getCantidad());
        holder.txtName.setText(p.getNombre());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    @Override
    public void onClick(View v) {
        if (this.listener != null) {
            this.listener.onClick(v);
        }
    }
    public void setOnClickListener(View.OnClickListener l) {
        this.listener = l;
    }
}
