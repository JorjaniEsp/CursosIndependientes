package generic;

import java.util.ArrayList;
import java.util.List;

public class Calculadora <K, V extends Number>{
    private K clave;
    private V value;

    public Calculadora(K clave, V value){
        this.clave = clave;
        this.value = value;
    }

    public double doblevalor(){
        return value.doubleValue() * 2;
    }

    public void mostarContenido(){
        System.out.println( clave +" ("+ clave.getClass().getName() +")" + ": " + value +" ("+ value.getClass().getName() +")");
    }

    public static double sumaTotal(List<? extends Number> lista){
       double total = 0;
        for (Number number : lista) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void agregarDiez(List<? super Integer> lista){
        lista.add(10);
    }

    static void main() {
        Calculadora<String,Integer> ej = new Calculadora<>("ID",8);
        System.out.println(ej.doblevalor());
        ej.mostarContenido();

        List<Integer> enteros = new ArrayList<>();
        enteros.add(8);
        enteros.add(15);
        System.out.println(sumaTotal(enteros));

        List<Number> numeros = new ArrayList<>();
        numeros.add(78);

        List<Object> objetos = new ArrayList<>();
        objetos.add(79);

        agregarDiez(objetos);
        agregarDiez(numeros);

    }
}
