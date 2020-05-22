package com.example.pp.mvc;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ProductoList {
    public static List<ProductoModel> getList(Activity a) {
        List<ProductoModel> lista = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            ProductoModel model = new ProductoModel(
                    "nombre".concat(String.valueOf(i)),
                    "cantidad".concat(String.valueOf(i)),
                    "precio".concat(String.valueOf(i))
            );
            lista.add(model);
        }
        return lista;
    }
}
