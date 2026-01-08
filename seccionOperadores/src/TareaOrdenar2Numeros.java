import javax.swing.*;
//El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
//Podría ser operador utilizando ternario.
public class TareaOrdenar2Numeros {
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));

        int mayor = Math.max(i, j);
        int menor = Math.min(i,j);
        System.out.println("El orde de mayor a menor:");
        System.out.println(mayor + "\n" + menor);

        /*otra forma
         * mayor = (i > j) ? i : j;
         * menor = (j > i)? j : i;
         */

        /*
        Otra forma y quizas la mas segura

        booleans sonIguales = false;
        try{
            int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        } catch (exeption e){
            sout "eror: el dato ingresado es invalido\nVuelva a intentarlo"
            main(args);
        }

        if (i > j){
            el mayor es i
            el menor es j
        } si no ( j > i) {
            el mayor es j
            el menor es i
        } else{
            sonIguales = true
        }

        if (!sonIngles){
            imprimir el orden
        } else{
            ambos numeros son iguales
        }
        */


    }
}