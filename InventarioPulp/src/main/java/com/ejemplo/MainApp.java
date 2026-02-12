package com.ejemplo;

import com.ejemplo.controller.ControllerMain;
import com.ejemplo.model.RepositoryProducto;
import com.ejemplo.persistencia.PersistenciaProductos;
import com.ejemplo.view.ViewMain;

public class MainApp{
    public static void main(String[] args) {
        PersistenciaProductos datos = new PersistenciaProductos();
        RepositoryProducto modelo = RepositoryProducto.getInstance();
        ViewMain vista = new ViewMain();

        ControllerMain controlador = new ControllerMain(modelo, vista, datos);

        controlador.iniciarApp();

    }
}