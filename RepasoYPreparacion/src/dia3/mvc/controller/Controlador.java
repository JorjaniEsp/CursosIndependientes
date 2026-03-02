package dia3.mvc.controller;

import dia3.mvc.model.BaseDatos;
import dia3.mvc.model.Jugador;
import dia3.mvc.model.Persistencia;
import dia3.mvc.vista.Vista;

import java.io.IOException;
import java.util.List;

public class Controlador {
    private BaseDatos modelo;
    private Persistencia persistencia;
    private Vista vista;
    private boolean run;

    public Controlador(BaseDatos modelo, Persistencia persistencia, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.persistencia = persistencia;
        this.run = true;
    }

    public void inicar(){
        try {
            persistencia.cargarDatos();
            while (run){
                int opc = vista.mostrarMenu();
                procesarOpcion(opc);
            }
            persistencia.guardarDatos();
        } catch (Exception e){
            vista.mostrarMensaje(e.getMessage());
        }

    }

    private void procesarOpcion(int opc){
        switch (opc){
            case 0 -> agregarJugador();
            case 1 -> verJugadores();
            case 2 -> verMejoresJugadores();
            case 3 -> salir();
        }

    }

    private void agregarJugador(){
        String nombre = vista.solicitarDato("Ingrese el nombre: ");
        int nivel = Integer.parseInt(vista.solicitarDato("Ingrese el nivel en una escala del 0 al 7"));
        String numeroCamisa = vista.solicitarDato("Ingrese el numero de camisa: (De no tener continue)");
        if (numeroCamisa == null) {
            modelo.agregarJugador(new Jugador(nombre,nivel));
        }else{
            modelo.agregarJugador(new Jugador(nombre,nivel,numeroCamisa.trim()));
        }
    }

    private void verJugadores(){
        vista.mostrarMensaje("Jugador", modelo.verMejoresJugadores());
    }

    private void verMejoresJugadores(){
        vista.mostrarMensaje("Jugadores de elite", modelo.verMejoresJugadores());
    }

    private void salir(){
        run = false;
        vista.mostrarMensaje("Saliendo...");
    }

}
