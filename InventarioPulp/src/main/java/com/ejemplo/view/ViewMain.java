package com.ejemplo.view;

import javax.swing.*;

public class ViewMain {

    public ViewMain(){
    }

    public int mostrarMenu(){
        String[] opciones = {"Agregar Producto", "Ver inventario","Salir"};
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

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Gestion inventario", JOptionPane.PLAIN_MESSAGE);
    }

    public int obtenerIdProducto(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ID del producto"));
    }

    public String obtenerNombreProducto(){
        return JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
    }

    public double obtenerPrecioProducto(){
        return Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el nombre del producto"));
    }

    public int obtenerCantProducto(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del prodcuto"));
    }


}