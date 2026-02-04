package vista;

import modelo.Entrenamiento;
import modelo.Jugador;
import modelo.CuerpoTecnico;
import java.util.List;

public interface VistaEntrenamiento {
    int mostrarMenuPrincipal();
    void mostrarEntrenamientos(List<Entrenamiento> entrenamientos);
    void mostrarDetalleEntrenamiento(Entrenamiento entrenamiento);
    void mostrarJugadores(List<Jugador> jugadores);
    void mostrarMensaje(String mensaje);
    void mostrarError(String error);

    void mostrarCuerpoTecnico(List<CuerpoTecnico> integrantes);

    // Métodos para entrada de datos
    int leerOpcion();
    String leerCadena(String mensaje);
    int leerEntero(String mensaje);
    void limpiarPantalla();
}