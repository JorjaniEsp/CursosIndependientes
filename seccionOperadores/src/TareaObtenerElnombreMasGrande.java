import javax.swing.*;

public class TareaObtenerElnombreMasGrande {
    public static void main(String[] args) {
        /*
         *Obtener el nombre más largo de tres personas, según los siguientes requisitos
         * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y el método showInputDialog().
         * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
         * Podría usar .split(" ");el objeto String para separar nombre y apellido en un arreglo, y con el índice cero accederemos al nombre de la persona.
         * Restricción no usar loops en el desarrollo de la tarea.
         * Ejemplo del resultado:"Guillermo Doe tiene el nombre más largo."
         */

        String primero = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String segundo = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String tercero = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");

        String[] nombre1 = primero.split(" ");
        String[] nombre2 = segundo.split(" ");
        String[] nombre3 = tercero.split(" ");

        int nom1 = nombre1[0].length(), nom2= nombre2[0].length(), nom3 = nombre3[0].length();

        if (nom1 > nom2 && nom1 > nom3){
            JOptionPane.showMessageDialog(null, primero + " tiene el nombre más largo");
        } else if(nom2 > nom1 && nom2 > nom3){
            JOptionPane.showMessageDialog(null, segundo + " tiene el nombre más largo");
        } else if(nom3 > nom1 && nom3 > nom2){
            JOptionPane.showMessageDialog(null, tercero + " tiene el nombre más largo");
        } else {
            JOptionPane.showMessageDialog(null, "Alguno de los nombre tiene la misma longitud");
        }

    }
}