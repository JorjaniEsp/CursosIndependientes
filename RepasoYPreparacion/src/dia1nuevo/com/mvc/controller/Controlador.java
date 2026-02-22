package dia1nuevo.com.mvc.controller;

import dia1nuevo.com.mvc.model.Puntuacion;
import dia1nuevo.com.mvc.view.Vista;

public class Controlador {
    private Puntuacion model;
    private Vista vista;
    private boolean running;

    public Controlador( Puntuacion model, Vista vista){
        this.vista = vista;
        this.model = model;
        running = true;
    }

    public void iniciar(){
        while (running) {
            vista.mostrarMenu();
            int opcion = vista.leerInput();
            procesarOpcion(opcion);
        }
    }

    private void procesarOpcion(int opcion){
        switch (opcion){
            case 1 -> sumar();
            case 2 -> restar();
            case 3 -> verPuntos();
            case 4 -> salir();
            default -> vista.mostrar("Opcion incorrecta...");
        }

    }

    private void sumar(){
        vista.mostrar("Ingrese el punataje: ");
        model.sumar(vista.leerPuntos());
        vista.mostrar("Agredado con exito!");
    }

    private void restar(){
        vista.mostrar("Ingrese el punataje: ");
        model.restar(vista.leerPuntos());
        vista.mostrar("Agredado con exito!");
    }

    private void verPuntos(){
        vista.mostrar(model.getPuntuacion());
    }

    private void salir(){
        vista.mostrar("Saliendo...");
        running = false;
    }

}
