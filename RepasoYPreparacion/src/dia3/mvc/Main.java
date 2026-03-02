package dia3.mvc;

import dia3.mvc.controller.Controlador;
import dia3.mvc.model.BaseDatos;
import dia3.mvc.model.Persistencia;
import dia3.mvc.vista.Vista;

public class Main {
    static void main() {
        BaseDatos modelo = BaseDatos.getInstance();
        Persistencia datos = new Persistencia(modelo);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo,datos,vista);

        controlador.inicar();

    }
}
