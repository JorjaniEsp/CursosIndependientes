package com.ejemplo.model;

import com.ejemplo.persistencia.PersistenciaProductos;

import java.util.ArrayList;
import java.util.List;

public class RepositoryProducto {
    private List<Producto> productos;
    PersistenciaProductos dataBase;
    private static RepositoryProducto instance;

    private RepositoryProducto(){
        this.productos = new ArrayList<>();
        this.dataBase = new PersistenciaProductos();

//        productos.add(new Producto(1,"Arroz", 1500,2));
//        productos.add(new Producto(2,"Frijoles", 2500,3));
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
        return producto.toString();
    }

    public String verProductos(){
        String lista = "";
        if (productos.isEmpty()){
            return "No hay productos agregados aun!";
        } else{
            for (Producto producto : productos){
                lista += "\nID: " + producto.getIdProduct() +
                         "\nNombre: " + producto.getNombre() +
                        "\nPrecio: " + producto.getPrecio() +
                        "\nStock: " + producto.getStock() +
                        "\n--------------------------------";
            }
        }
        return lista;
    }
}