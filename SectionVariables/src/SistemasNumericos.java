import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binadrio de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b1111010101;
        System.out.println("numeroBinario = " + numeroBinario);


        System.out.println("numeroDecimal + =  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;


    }
}
