package vista;

import modelo.CuerpoTecnico;
import modelo.Entrenamiento;
import modelo.Jugador;

import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class VistaConsola implements VistaEntrenamiento {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public int mostrarMenuPrincipal() {
        String menu = "╔══════════════════════════════════════╗\n" +
                "║   SISTEMA DE ENTRENAMIENTOS FUTBOL    ║\n" +
                "╠══════════════════════════════════════╣\n" +
                "  1. Ver todos los entrenamientos\n" +
                "  2. Agregar nuevo entrenamiento\n" +
                "  3. Ver detalle de entrenamiento\n" +
                "  4. Ver todos los jugadores\n" +
                "  5. Ver cuerpo técnico\n" +
                "  6. Agregar jugador a entrenamiento\n" +
                "  7. Agregar cuerpo técnico a entrenamiento\n" +
                "  8. Eliminar entrenamiento\n" +
                "  0. Salir\n" +
                "╚══════════════════════════════════════╝\n" +
                "Seleccione una opción:";

        String input = JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.QUESTION_MESSAGE);
        try {
            return (input == null) ? 0 : Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @Override
    public void mostrarEntrenamientos(List<Entrenamiento> entrenamientos) {
        String lista = "════════════════════════════════════════\n";
        lista += "        LISTA DE ENTRENAMIENTOS\n";
        lista += "════════════════════════════════════════\n\n";

        if (entrenamientos.isEmpty()) {
            lista += "No hay entrenamientos registrados.";
        } else {
            for (Entrenamiento e : entrenamientos) {
                lista += "ID: " + e.getId() + " | Fecha: " + e.getFecha().format(formatter) +
                        " | Tipo: " + e.getTipo() + " | Duración: " + e.getDuracion() + " min\n";
                lista += "   Descripción: " + e.getDescripcion() + "\n";
                lista += "   Asistentes: " + e.getJugadoresAsistentes().size() + " jugadores\n";
                lista += "   Cuerpo Técnico: " + e.getIntegranteCT().size() + " integrantes\n";
                lista += "────────────────────────────────────────\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    @Override
    public void mostrarDetalleEntrenamiento(Entrenamiento entrenamiento) {
        if (entrenamiento == null) {
            JOptionPane.showMessageDialog(null, "Entrenamiento no encontrado.");
            return;
        }

        String detalle = "════════════════════════════════════════\n";
        detalle += "     DETALLE DE ENTRENAMIENTO #" + entrenamiento.getId() + "\n";
        detalle += "════════════════════════════════════════\n";
        detalle += "Fecha: " + entrenamiento.getFecha().format(formatter) + "\n";
        detalle += "Tipo: " + entrenamiento.getTipo() + "\n";
        detalle += "Duración: " + entrenamiento.getDuracion() + " minutos\n";
        detalle += "Descripción: " + entrenamiento.getDescripcion() + "\n\n";

        // Sección Jugadores
        detalle += " JUGADORES ASISTENTES:\n";
        List<Jugador> jugadores = entrenamiento.getJugadoresAsistentes();
        if (jugadores.isEmpty()) {
            detalle += "  • No hay jugadores registrados.\n";
        } else {
            for (Jugador j : jugadores) {
                detalle += "  • " + j.toString() + "\n";
            }
        }

        // Sección Cuerpo Técnico
        detalle += "\n CUERPO TÉCNICO ASIGNADO:\n";
        List<CuerpoTecnico> ctList = entrenamiento.getIntegranteCT();
        if (ctList.isEmpty()) {
            detalle += "  • No hay cuerpo técnico asignado.\n";
        } else {
            for (CuerpoTecnico ct : ctList) {
                detalle += "  • " + ct.getFullNombre() + " (" + ct.getTipo() + ")\n";
            }
        }

        detalle += "────────────────────────────────────────";
        JOptionPane.showMessageDialog(null, detalle);
    }

    @Override
    public void mostrarJugadores(List<Jugador> jugadores) {
        String lista = "════════════════════════════════════════\n";
        lista += "         LISTA DE JUGADORES\n";
        lista += "════════════════════════════════════════\n\n";

        if (jugadores.isEmpty()) {
            lista += "No hay jugadores registrados.";
        } else {
            for (Jugador j : jugadores) {
                lista += "ID: " + j.getId() + " | " + j.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    @Override
    public void mostrarCuerpoTecnico(List<CuerpoTecnico> integrantes) {
        String lista = "════════════════════════════════════════\n";
        lista += "         CUERPO TÉCNICO DISPONIBLE\n";
        lista += "════════════════════════════════════════\n\n";

        if (integrantes.isEmpty()) {
            lista += "No hay integrantes registrados.";
        } else {
            for (CuerpoTecnico ct : integrantes) {
                lista += "ID: " + ct.getId() + " | " + ct.getFullNombre() + " (" + ct.getTipo() + ")\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, "✓ " + mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, "✗ ERROR: " + error, "Error", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public int leerOpcion() {
        // En Swing, esta lógica suele estar integrada en mostrarMenuPrincipal
        return 0;
    }

    @Override
    public String leerCadena(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    @Override
    public int leerEntero(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, mensaje);
            if (input == null) return -1; // Si el usuario cancela
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }

    @Override
    public void limpiarPantalla() {
        // No es necesario en JOptionPane ya que cada ventana es nueva
    }
}