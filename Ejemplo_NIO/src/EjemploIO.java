import java.io.*; // Importamos todo io
import java.util.ArrayList;
import java.util.List;

public class EjemploIO {

    private File archivo = new File("lista_productos_io.txt");

    public static void main(String[] args) {
        EjemploIO ej = new EjemploIO();
        List<String> estudiantes = new ArrayList<>();

        estudiantes.add("Pedro");
        estudiantes.add("Pedra");
        estudiantes.add("Pedre");

        ej.guardarDatos(estudiantes);
        ej.leerYMostrar();
    }

    public void guardarDatos(List<String> datos) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

            for (String estudiante : datos) {
                writer.write(estudiante);
                writer.newLine();
            }
            System.out.println("Archivo IO creado: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error guardando: " + e.getMessage());
        }
    }

    public void leerYMostrar() {

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Estudiante : " + linea);
            }

        } catch (IOException e) {
            System.err.println("Error leyendo: " + e.getMessage());
        }
    }
}