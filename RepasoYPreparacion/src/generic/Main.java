package generic;

import generic.logic.Caja;

public class Main {
    static void main() {

        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("guardo un string");
        String contenido = cajaString.obtenerAlgo();
        System.out.println("contenido = " + contenido);

        Caja<Integer> cajaInteger= new Caja<>();
        cajaInteger.ponerAlgo(8);
        Integer numero = cajaInteger.obtenerAlgo();
        System.out.println("numero = " + numero);

    }
}
