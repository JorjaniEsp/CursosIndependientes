package com.ejemplo.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryProducto {
    private List<Producto> productos;
    private static RepositoryProducto instance;

    private RepositoryProducto(){
        this.productos = new ArrayList<>();
    }

    public static synchronized RepositoryProducto getInstance() {
        if (instance == null) {
            instance = new RepositoryProducto();
        }
        return instance;
    }

    public String agregarProducto(int id, String nombre, double precio, int cant){
        Producto producto = new Producto(id,nombre,precio,cant);
        productos.add(producto);
        return "Agregado exitosamente";
    }

    public String verProductos(){
        String lista = "";
        if (productos.isEmpty()){
            return "No hay productos agregados aun!";
        } else{
            for (Producto producto : productos){
                lista += "ID: " + producto.getIdProduct() +
                         "\nNombre: " + producto.getNombre() +
                        "\nPrecio: " + producto.getPrecio() +
                        "\nStock: " + producto.getStock() +
                        "\n--------------------------------";
            }
        }
        return lista;
    }
}