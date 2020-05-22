package com.example.pp.mvc;

import java.util.Objects;

public class ProductoModel {
    private String nombre;
    private String cantidad;
    private String precio;

    public ProductoModel(){

    }
    public ProductoModel(String nombre, String cantidad, String precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoModel{" +
                "nombre='" + nombre + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoModel that = (ProductoModel) o;
        return nombre.equals(that.nombre) &&
                precio.equals(that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
}
