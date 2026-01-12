import java.util.Scanner;
import java.util.logging.SocketHandler;

public class PruebaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese una palabra: ");
        String str = sc.nextLine();
        int opcion = 0;
        String str2;

        do {

            System.out.println("Menu de opciones");
            System.out.println("1.Concatenar con +");
            System.out.println("2.Concatenar con .concat");
            System.out.println("3.Obtener el tamaño del string con .length()");
            System.out.println("4.Acceder a un caracter con charAt(posicion)");
            System.out.println("5.Buscar la primera aparicion con indexOf()");
            System.out.println("6.Extrae segmento con subString()");
            System.out.println("7.Remplazar caracteres con replace()");
            System.out.println("8.Convertir a minuscula con toLowerCase()");
            System.out.println("9.Convertir a mayuscula con toUpperCase()");
            System.out.println("10.Eliminar espacios en blanco con trim()");
            System.out.println("11.Comparar con .equals()");
            System.out.println("12.Comparar con .compareTo()");
            System.out.println("12.Comparar con .equalsIgnoreCase(otraCadena)");
            System.out.println("0. salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("EL textor que deseo concatenar: ");
                    str2 = sc.nextLine();
                    System.out.println(str + " " +str2);
                    break;
                case 2:
                    System.out.println("EL textor que deseo concatenar: ");
                    str2 = sc.nextLine();
                    System.out.println(str.concat(str2));
                    break;
                case 3:
                    System.out.println("El tamaño es " + str.length());
                    break;
                case 4:
                    int posicion = 0;
                    System.out.println("Que posicion desea ver: ");
                    posicion = sc.nextInt();
                    System.out.println(str.charAt(posicion));
                    break;
                case 5:
                    System.out.println("Que cadena dese buscar dentro del string");
                    str2 = sc.nextLine();
                    System.out.println(str.indexOf(str2));
                    break;
                case 6:
                    System.out.println("La posicion 1");
                    int posicio1 = sc.nextInt();
                    System.out.println("La posicion 2");
                    int posicio2 = sc.nextInt();
                    System.out.println(str.substring(posicio1, posicio2));
                    break;
                case 7:
                    System.out.println("La letra que va introducir");
                    String remplazo = sc.nextLine();
                    System.out.println("La letra que desea remplazar");
                    String porRemplazar = sc.nextLine();
                    System.out.println(str.replace(remplazo, porRemplazar));
                    break;
                case 8:
                    System.out.println(str.toLowerCase());
                    break;
                case 9:
                    System.out.println(str.toUpperCase());
                    break;
                case 10:
                    System.out.println("Ingrese la cadena con la que desea comparar: ");
                    str2 = sc.nextLine();
                    System.out.println(str.equals(str2));
                    break;
                case 11:
                    System.out.println("Ingrese la cadena con la que desea comparar: ");
                    str2 = sc.nextLine();
                    System.out.println(str.compareTo(str2));
                    break;
                case 12:
                    System.out.println("Ingrese la cadena con la que desea comparar: ");
                    str2 = sc.nextLine();
                    System.out.println(str.equalsIgnoreCase(str2));
                    break;
                default:
                    System.out.println("Eleccion incorrecta");
            }
        }while (opcion != 0);



    }
}