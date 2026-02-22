package dia1nuevo.com.mvc;

import dia1nuevo.com.mvc.controller.Controlador;
import dia1nuevo.com.mvc.model.Puntuacion;
import dia1nuevo.com.mvc.view.Vista;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {
        Puntuacion model = new Puntuacion();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(model,vista);

        controlador.iniciar();
    }
}
