import javax.swing.*;
import java.util.Scanner;

public class PruebaString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = JOptionPane.showInputDialog(null,"Ingrese un saludo");
        int opcion = 0;
        String str2;
        String menu = "Menú de opciones\n"
                + "1. Concatenar con +\n"
                + "2. Concatenar con .concat\n"
                + "3. Obtener el tamaño del string con .length()\n"
                + "4. Acceder a un caracter con charAt(posicion)\n"
                + "5. Buscar la primera aparición con indexOf()\n"
                + "6. Extraer segmento con substring()\n"
                + "7. Reemplazar caracteres con replace()\n"
                + "8. Convertir a minúscula con toLowerCase()\n"
                + "9. Convertir a mayúscula con toUpperCase()\n"
                + "10. Eliminar espacios en blanco con trim()\n"
                + "11. Comparar con .equals()\n"
                + "12. Comparar con .compareTo()\n"
                + "13. Comparar con .equalsIgnoreCase()\n"
                + "0. Salir\n\n"
                + "Seleccione una opción:";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcion){
                case 1:
                    str2 = JOptionPane.showInputDialog(null,"Ingrese el texto que desea concatenetar");
                    JOptionPane.showMessageDialog(null,str + " " +str2);
                    break;
                case 2:
                    str2 = JOptionPane.showInputDialog(null,"EL texto que deseo concatenar: ");
                    JOptionPane.showMessageDialog(null,str.concat(str2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,str.length());
                    break;
                case 4:
                    int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion que desea extraer"));
                    JOptionPane.showMessageDialog(null, str.charAt(posicion));
                    break;
                case 5:
                    str2 = JOptionPane.showInputDialog(null,"Que cadena dese buscar dentro del string");
                    JOptionPane.showMessageDialog(null, str.indexOf(str2));
                    break;
                case 6:
                    int posicio1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición de inicio"));
                    int posicio2 =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición de fin"));
                    JOptionPane.showMessageDialog(null, str.substring(posicio1,posicio2));
                    break;
                case 7:
                    String remplazo = JOptionPane.showInputDialog(null, "Ingrese la letra que desea introducir");
                    String porRemplazar = JOptionPane.showInputDialog(null, "Ingrese la letra que desea cambiar de la cadena");
                    JOptionPane.showMessageDialog(null,str.replace(remplazo, porRemplazar));
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,str.toLowerCase());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,str.toUpperCase());
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, str.trim());
                    break;
                case 11:
                    str2 =JOptionPane.showInputDialog(null, "Ingrese la cadena que desea comparar");
                    JOptionPane.showMessageDialog(null, str.equals(str2));
                    break;
                case 12:
                    str2 = JOptionPane.showInputDialog(null, "Ingrese la cadena que desea comparar");
                    JOptionPane.showMessageDialog(null,str.compareTo(str2));
                    break;
                case 13:
                    str2 = JOptionPane.showInputDialog(null, "Ingrese la cadena que desea comparar");
                    JOptionPane.showMessageDialog(null,str.equalsIgnoreCase(str2));
                    break;
                default:
                   JOptionPane.showMessageDialog(null, "Elección incorrecta");
            }
        }while (opcion != 0);
    }
}