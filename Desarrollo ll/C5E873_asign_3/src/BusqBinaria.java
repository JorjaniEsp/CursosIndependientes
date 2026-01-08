import java.util.Scanner;

public class BusqBinaria{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int tam = sc.nextInt();
        sc.nextLine();

        char[] arreglo = new char[tam];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un caracter para la posición " + i + " del arreglo");
            arreglo[i] = sc.nextLine().toLowerCase().charAt(0);
        }

        System.out.println("Contenido del arreglo:");
        for(int y = 0; y < arreglo.length; y++){
            System.out.println("arreglo["+y+"] = " + arreglo[y]);
        }


        System.out.println("Ingrese el caracter que desea buscar ");
        char charBuscar = sc.nextLine().toLowerCase().charAt(0);
        for(int e = 0; e < arreglo.length; e++){
            if(arreglo[e] == charBuscar) {
                System.out.println("El numero solicitado esta en la posición " + e);
            }
        }
    }

}