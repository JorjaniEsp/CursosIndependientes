package generic.conmiamorshito;

import java.util.List;

public class Calculadora <N extends Number & Comparable<N>, K > {

    private N valor;

    public Calculadora(N valor){
        this.valor = valor;
    }

    public void getContenido() {
        System.out.println(valor + " (valor)");
    }

    public <T> void lista(List<N> listaNumero){
        for (N n : listaNumero) {
            System.out.println(n);
        }
    }

    public void addDiez(List< ? super Integer> lista){
        lista.add(10);
    }

}
