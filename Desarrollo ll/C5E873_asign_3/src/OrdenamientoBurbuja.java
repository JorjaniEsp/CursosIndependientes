import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        boolean swapped; // Optimización: para saber si hubo intercambios
        // Ciclo exterior para las pasadas
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reiniciar bandera en cada pasada
            // Ciclo interior para comparar elementos adyacentes
            // n-i-1 porque los últimos 'i' elementos ya están ordenados
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar los elementos (usando una variable temporal)
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Se realizó un intercambio
                }
            }
            // Si no hubo intercambios en esta pasada, el arreglo ya está ordenado
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        char[] miArray = {'d', 'r', 'd', 'b', 'h', 'm', 'm'};
        System.out.println("Array original: " + Arrays.toString(miArray));

        bubbleSort(miArray);

        System.out.println("Array ordenado: " + Arrays.toString(miArray));
    }
}