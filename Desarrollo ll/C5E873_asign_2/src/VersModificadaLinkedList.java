import java.util.LinkedList;

public class VersModificadaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> listaNumeros = new LinkedList<>(); // Crear una LinkedList
        listaNumeros.add(1); // Añade al final
        listaNumeros.addFirst(2); // Añade al principio
        listaNumeros.add(3); // Añade al final
        listaNumeros.remove(2); // borrar una posición
        System.out.println(listaNumeros.size()); // obtener el tamaño
        System.out.println(listaNumeros.get(1));
        System.out.println(listaNumeros); // Salida: [Banana, Manzana, Cereza]
        listaNumeros.add(2, 8); // otra forma de agregar elementos

        // Recorrer usando un iterador bidireccional
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
