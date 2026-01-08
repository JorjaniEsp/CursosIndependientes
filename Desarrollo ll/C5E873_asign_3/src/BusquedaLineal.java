import java.util.Arrays;

public class BusquedaLineal {
    public static int buscar(char[] arreglo, char elemento) {
        int n = arreglo.length; // Obtener la longitud del array
        // Iterar sobre cada elemento del array
        for (int i = 0; i < n; i++) {
            // Si el elemento actual es igual al objetivo
            if (arreglo[i] == elemento){
                return i; // Devolver el índice donde se encontró
            }
        }
        return -1; // Si el bucle termina, el elemento no fue encontrado
    }
    public static void main(String[] args) {
        char[] caracteres = {'a', 'c', 'b', 'd', 'z', 'f', 'k'};
        char objetivo = 'b';
        int indice = buscar(caracteres, objetivo); // Llamar al método de búsqueda

        if (indice != -1) {
            System.out.println("El elemento " + objetivo + " está presente en el índice: " + indice);
        } else {
            System.out.println("El elemento " + objetivo + " no está presente en el array.");
        }

        objetivo = 'z'; // Otro elemento a buscar
        indice = buscar(caracteres, objetivo);
        if (indice != -1) {
            System.out.println("El elemento " + objetivo + " está presente en el índice: " + indice);
        } else {
            System.out.println("El elemento " + objetivo + " no está presente en el array.");
        }
    }
}

