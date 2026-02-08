package com.ejemplo.controller;

import com.ejemplo.model.RepositoryProducto;
import com.ejemplo.persistencia.PersistenciaProductos;
import com.ejemplo.view.ViewMain;

public class ControllerMain {
    private RepositoryProducto model;
    private ViewMain vista;
    private boolean running;
    private PersistenciaProductos datos;

    public ControllerMain(RepositoryProducto model, ViewMain vista){
        this.datos = new PersistenciaProductos();
        this.model = model;
        this.vista = vista;
        this.running = true;
    }

    public void iniciarApp(){
        datos.cargarDatos();
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

        String mensaje = model.agregarProducto(id,nombre,precio,cantidad);
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


}