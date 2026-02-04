package controlador;

import modelo.*;
import vista.VistaEntrenamiento;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ControladorEntrenamiento {
    private GestorEntrenamientos modelo;
    private VistaEntrenamiento vista;

    public ControladorEntrenamiento(GestorEntrenamientos modelo, VistaEntrenamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean ejecutando = true;

        while (ejecutando) {

            int opcion = vista.mostrarMenuPrincipal();

            switch (opcion) {
                case 1:
                    mostrarTodosEntrenamientos();
                    break;
                case 2:
                    agregarNuevoEntrenamiento();
                    break;
                case 3:
                    mostrarDetalleEntrenamiento();
                    break;
                case 4:
                    mostrarTodosJugadores();
                    break;
                case 5:
                    mostrarCT();
                    break;
                case 6:
                    agregarJugadorAEntrenamiento();
                    break;
                case 7:
                    agregarCuerpoTecnicoAEntrenamiento();
                    break;
                case 8:
                    eliminarEntrenamiento();
                    break;
                case 0:
                    ejecutando = false;
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarError("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void mostrarTodosEntrenamientos() {
        vista.mostrarEntrenamientos(modelo.obtenerTodosEntrenamientos());
    }

    private void agregarNuevoEntrenamiento() {
        vista.limpiarPantalla();
        vista.mostrarMensaje("NUEVO ENTRENAMIENTO");

        try {
            // Leer datos del entrenamiento
            int id = modelo.obtenerProximoId();

            String fechaStr = vista.leerCadena("Fecha (YYYY-MM-DD): ");
            LocalDate fecha = LocalDate.parse(fechaStr);

            String tipo = vista.leerCadena("Tipo (Técnica/Táctica/Física): ");
            int duracion = vista.leerEntero("Duración (minutos): ");
            String descripcion = vista.leerCadena("Descripción: ");

            // Crear y agregar el entrenamiento
            Entrenamiento nuevo = new Entrenamiento(id, fecha, tipo, duracion, descripcion);
            modelo.agregarEntrenamiento(nuevo);

            vista.mostrarMensaje("Entrenamiento agregado exitosamente con ID: " + id);

        } catch (DateTimeParseException e) {
            vista.mostrarError("Formato de fecha incorrecto. Use YYYY-MM-DD");
        } catch (Exception e) {
            vista.mostrarError("Error al agregar entrenamiento: " + e.getMessage());
        }
    }

    private void mostrarDetalleEntrenamiento() {
        int id = vista.leerEntero("Ingrese el ID del entrenamiento: ");
        Entrenamiento entrenamiento = modelo.buscarEntrenamientoPorId(id);
        vista.mostrarDetalleEntrenamiento(entrenamiento);
    }

    private void mostrarTodosJugadores() {
        vista.mostrarJugadores(modelo.obtenerTodosJugadores());
    }

    private void mostrarCT() {
        vista.mostrarCuerpoTecnico(modelo.getIntegrantesCT());
    }

    private void agregarJugadorAEntrenamiento() {
        vista.limpiarPantalla();
        vista.mostrarMensaje("AGREGAR JUGADOR A ENTRENAMIENTO");

        // Mostrar entrenamientos disponibles
        vista.mostrarEntrenamientos(modelo.obtenerTodosEntrenamientos());

        int idEntrenamiento = vista.leerEntero("ID del entrenamiento: ");
        Entrenamiento entrenamiento = modelo.buscarEntrenamientoPorId(idEntrenamiento);

        if (entrenamiento == null) {
            vista.mostrarError("Entrenamiento no encontrado.");
            return;
        }

        // Mostrar jugadores disponibles
        vista.mostrarJugadores(modelo.obtenerTodosJugadores());

        int idJugador = vista.leerEntero("ID del jugador a agregar: ");
        Jugador jugador = modelo.buscarJugadorPorId(idJugador);

        if (jugador == null) {
            vista.mostrarError("Jugador no encontrado.");
            return;
        }

        // Agregar jugador al entrenamiento
        entrenamiento.agregarJugador(jugador);
        vista.mostrarMensaje("Jugador " + jugador.getNombre() +
                " agregado al entrenamiento #" + entrenamiento.getId());
    }

    private void agregarCuerpoTecnicoAEntrenamiento() {
        int idEnt = vista.leerEntero("ID del entrenamiento:");
        Entrenamiento ent = modelo.buscarEntrenamientoPorId(idEnt);

        if (ent == null) {
            vista.mostrarError("Entrenamiento no encontrado.");
            return;
        }

        vista.mostrarCuerpoTecnico(modelo.getIntegrantesCT());
        int idCT = vista.leerEntero("ID del integrante del cuerpo técnico:");
        CuerpoTecnico ct = modelo.buscarIntegranteCTPorId(idCT);

        if (ct != null) {
            ent.addIntegranteCT(ct);
            vista.mostrarMensaje(ct.getFullNombre() + " asignado al entrenamiento " + idEnt);
        } else {
            vista.mostrarError("Integrante no encontrado.");
        }
    }

    private void eliminarEntrenamiento() {
        int id = vista.leerEntero("Ingrese el ID del entrenamiento a eliminar: ");
        boolean eliminado = modelo.eliminarEntrenamiento(id);

        if (eliminado) {
            vista.mostrarMensaje("Entrenamiento eliminado exitosamente.");
        } else {
            vista.mostrarError("No se encontró el entrenamiento con ID: " + id);
        }
    }
}