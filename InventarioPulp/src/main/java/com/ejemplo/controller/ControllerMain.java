package com.ejemplo.controller;

import com.ejemplo.model.RepositoryProducto;
import com.ejemplo.persistencia.PersistenciaProductos;
import com.ejemplo.view.ViewMain;

import java.util.List;

public class ControllerMain {
    private RepositoryProducto model;
    private ViewMain vista;
    private boolean running;
    private PersistenciaProductos datos;

    public ControllerMain(RepositoryProducto model, ViewMain vista, PersistenciaProductos datos){
        this.datos = datos;
        this.model = model;
        this.vista = vista;
        this.running = true;
    }

    public void iniciarApp(){
        cargarDatos();
        while (running) {
            int seleccion = vista.mostrarMenu();
            gestorOpciones(seleccion);
        }
    }

    private void gestorOpciones(int seleccion){
        switch (seleccion){
            case 0 -> aniadirProducto();
            case 1 -> mostrarProductos();
            case 2 -> cerrar();
        }
    }

    private void aniadirProducto(){
        int id = vista.obtenerIdProducto();
        String nombre = vista.obtenerNombreProducto();
        double precio = vista.obtenerPrecioProducto();
        int cantidad = vista.obtenerCantProducto();

        String datosProducto = model.agregarProducto(id,nombre,precio,cantidad);
        String mensaje = datos.guardarProducto(datosProducto);
        vista.mostrarMensaje(mensaje);
    }

    private void mostrarProductos(){
        String lista = model.verProductos();
        vista.mostrarMensaje(lista);
    }

    private void cerrar(){
        vista.mostrarMensaje("Cerrando sesión");
        running = false;
    }

    private void cargarDatos(){

        List<String> lineas = datos.leerArchivo();

        for (String linea : lineas) {
            try {
                // CORRECCIÓN IMPORTANTE: Escapar el pipe con \\|
                String[] partes = linea.split("\\|");

                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    int stock = Integer.parseInt(partes[3]);

                    // Agregamos al modelo (ignoramos el return string aquí)
                    model.agregarProducto(id, nombre, precio, stock);
                }
            } catch (Exception e) {
                System.out.println("Error procesando línea: " + linea);
            }
        }

    }

}