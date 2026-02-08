import java.io.*;

import javax.swing.JOptionPane;

public class Ejemplo {
    static File archivoNombres = new File("nombres.txt");

    public static void guardarNombre(String nombre){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNombres, true))){
            writer.write(nombre);
            writer.newLine();
        }catch(IOException e){
            e.getMessage();
        }
    }

    public static void leerNombre(){

        String line = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(archivoNombres))){
            while ((line = reader.readLine()) != null) {
                System.out.println("Nombre: " + line);
            }
        }catch(IOException e){
            e.getMessage();
        }
    }


    public static void main (String[] args){

        int cantNombres = Integer.parseInt(
            JOptionPane.showInputDialog(null,"Ingrese la cantidad de nombre a mostrar"));
        
        for (int i = 0; i < cantNombres; i++){
            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
            Ejemplo.guardarNombre(nombre);
        }

        Ejemplo.leerNombre();

    }
}