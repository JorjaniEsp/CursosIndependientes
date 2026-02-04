import modelo.GestorEntrenamientos;
import vista.VistaConsola;
import controlador.ControladorEntrenamiento;
import vista.VistaSwuing;

public class MainApp {
    public static void main(String[] args) {
        // Crear los componentes del MVC
        GestorEntrenamientos modelo = new GestorEntrenamientos();
        VistaSwuing vista = new VistaSwuing();
        ControladorEntrenamiento controlador = new ControladorEntrenamiento(modelo, vista);

        // Iniciar la aplicación
        System.out.println("Iniciando Sistema de Gestión de Entrenamientos...");
        controlador.iniciar();
    }
}
