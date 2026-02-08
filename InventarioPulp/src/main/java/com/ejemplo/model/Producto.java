package com.ejemplo.model;

public class Producto {

    private int idProduct;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int idProduct, String nombre, double precio, int stock) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return idProduct +"|" + nombre + "|"+ precio + "|" + stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}