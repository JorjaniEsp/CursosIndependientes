import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>(); // Crear una LinkedList
        frutas.add("Manzana"); // Añade al final
        frutas.addFirst("Banana"); // Añade al principio
        frutas.add("Cereza"); // Añade al final

        System.out.println(frutas); // Salida: [Banana, Manzana, Cereza]

        // Recorrer usando un iterador bidireccional
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}