import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EjemploNIO {
    private Path rutaArchivo = Paths.get("lista_productos.txt");

    public static void main(String[] args) {
        EjemploNIO ej = new EjemploNIO();
        List<String> estudiantes = new ArrayList<>();

        estudiantes.add("Pedro");
        estudiantes.add("Pedra");
        estudiantes.add("Pedre");

        ej.guardarDatos(estudiantes);
        ej.leerYMostrar();

    }

    public  void guardarDatos(List<String> datos) {
        try {
            Files.write(rutaArchivo, datos);
            System.out.println("Archivo creado y datos guardados en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error guardando: " + e.getMessage());
        }
    }

    public void leerYMostrar() {
        try {
            List<String> contenido = Files.readAllLines(rutaArchivo);
            for (String linea : contenido) {
                System.out.println("Estudiante: " + linea);
            }
        } catch (IOException e) {
            System.err.println("Error leyendo: " + e.getMessage());
        }
    }
}
