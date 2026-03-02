package dia3.mvc.vista;

import dia3.mvc.model.Jugador;

import javax.swing.*;
import java.util.List;

public class Vista {
    public int mostrarMenu(){
        String[] opciones = {"Agregar jugador", "Ver la lista de jugadores", "Ver los mejores jugadores", "Salir"};
        return JOptionPane.showOptionDialog(
                null,                // 1. Componente padre
                "¿Qué acción desea realizar?",      // 2. Mensaje
                "Menú de Inventario",               // 3. Título de la ventana
                JOptionPane.DEFAULT_OPTION,         // 4. Tipo de opción
                JOptionPane.INFORMATION_MESSAGE,    // 5. Tipo de mensaje
                null,                               // 6. Icono personalizado
                opciones,                           // 7. Arreglo de botones
                opciones[0]                         // 8. Opción por defecto
        );
    }

    public String solicitarDato(String mensaje){
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarMensaje(String titulo, List<Jugador> jugadores){
        if (!jugadores.isEmpty()) {
            for (Jugador jugador : jugadores) {
                JOptionPane.showMessageDialog(null, jugador.toString(), titulo, JOptionPane.PLAIN_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "No hay jugadores registrados");
        }
    }
}
