package com.ejemplo.persistencia;

import com.ejemplo.model.Producto;
import com.ejemplo.model.RepositoryProducto;

import java.io.*;

public class PersistenciaProductos {
    File carpeta = new File("data");
    File listaProductos;
    RepositoryProducto repo;

    public PersistenciaProductos(){
        repo = RepositoryProducto.getInstance();
        if (!carpeta.exists()){
            boolean creada = carpeta.mkdir();
            if (creada){
                listaProductos = new File(carpeta,"Lista_Productos.txt");
            }
        }
    }

    public void guardarProducto(Producto producto){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(listaProductos,true))){
            escritor.write(producto.toString());
            escritor.newLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void cargarDatos(){
        try(BufferedReader lector = new BufferedReader(new FileReader(listaProductos))){
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] datosProducot = linea.split("|");
                int id = Integer.parseInt(datosProducot[0]);
                String nombre = datosProducot[1];
                double precio = Double.parseDouble(datosProducot[2]);
                int stock = Integer.parseInt(datosProducot[3]);
                repo.agregarProducto(id, nombre, precio, stock);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
