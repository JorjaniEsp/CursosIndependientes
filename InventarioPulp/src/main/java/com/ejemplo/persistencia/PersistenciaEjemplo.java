package com.ejemplo.persistencia;

import javax.swing.*;
import java.io.*;

public class PersistenciaEjemplo {
    File archivo = new File("productos.txt");

    public void guardarNombre(String nombre) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
            escritor.write("Nombre: " + nombre);
            escritor.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerArchivo() throws FileNotFoundException {
        String linea = "";
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){

            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        PersistenciaEjemplo ejemplo = new PersistenciaEjemplo();
        int cantNombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de nombres a inrgresar"));
        for (int i = 0; i < cantNombre; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
            ejemplo.guardarNombre(nombre);
        }

        ejemplo.leerArchivo();
    }



}