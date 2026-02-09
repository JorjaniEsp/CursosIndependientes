package com.ejemplo.persistencia;

import com.ejemplo.model.Producto;
import com.ejemplo.model.RepositoryProducto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaProductos {
    File carpeta = new File("data");
    File listaProductos;
    boolean creada = false;

    public PersistenciaProductos(){
        if (!carpeta.exists()){
            creada = carpeta.mkdir();
        }
        listaProductos = new File(carpeta,"Lista_Productos.txt");
    }

    public String guardarProducto(String infoProducto){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(listaProductos,true))){
            escritor.write(infoProducto);
            escritor.newLine();
            return "Agregado exitosamente!";
        } catch (IOException e){
            return e.getMessage();
        }
    }

    public List<String> leerArchivo() {
        List<String> lineas = new ArrayList<>();

        if (!listaProductos.exists()) {
            return lineas;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(listaProductos))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        return lineas;
    }

}
