package dia3.mvc.model;

import java.io.*;
import java.util.List;

public class Persistencia {
    private File carpeta;
    private File archivo;
    private BaseDatos baseDatos;
    private static Persistencia instance;

    public Persistencia(BaseDatos baseDatos) {
        this.carpeta = new File("data");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        this.archivo = new File(carpeta, "ListJugadores");
        this.baseDatos = BaseDatos.getInstance();
    }

    public void guardarDatos() throws IOException {
        List<Jugador> lista = baseDatos.verJugadores();
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, false))) {
            for (Jugador jugador : lista) {
                escritor.write(jugador.toString());
                escritor.newLine();
            }
        } catch (IOException e) {
            throw new IOException("Error: " + e.getMessage());
        }
    }

    public void cargarDatos() throws IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split("\\|");
                String nombre = datos[0].trim();
                int nivel = Integer.parseInt(datos[1].trim());
                String numeroCamisa = datos[2].trim();
                baseDatos.agregarJugador(new Jugador(nombre, nivel, numeroCamisa));
            }
        } catch (IOException e) {
            throw new IOException("Error: " + e.getMessage());
        }
    }

}
