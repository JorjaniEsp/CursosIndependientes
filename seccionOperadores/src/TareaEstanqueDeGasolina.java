import javax.swing.*;

public class TareaEstanqueDeGasolina {
    public static void main(String[] args) {

        /*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y muestre el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad real del estanque puede ser en tipo double, para una mejor precisión, pero también puede ser del tipo int.

Si la capacidad real es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque 3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente

Preguntas para esta tarea
Envía tu código fuente y solución, aquí.*/

        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad actual de gasolina: "));

        if (cantidad == 70d){
            JOptionPane.showMessageDialog(null, "Estanque lleno");
        } else if (cantidad >= 60d && cantidad < 70d) {
            JOptionPane.showMessageDialog(null, "Estanque casi lleno");
        } else if (cantidad >= 40d && cantidad < 60d) {
            JOptionPane.showMessageDialog(null, "Estanque 3/4");
        } else if (cantidad >= 35d && cantidad < 40d) {
            JOptionPane.showMessageDialog(null, "Medio estanque");
        } else if (cantidad >= 20d && cantidad < 35d) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (cantidad >= 1 && cantidad < 20){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad ingresada es incorrecta o sobre pasa el rango maximo de 70.0 L.");


        }

    }
}