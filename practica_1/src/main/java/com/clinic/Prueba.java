package com.clinic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Alberto");
        nombres.add("Maira");

        List<String> nombresInicianConA = nombres.stream().filter(nombreQueInicianA -> nombreQueInicianA.startsWith("A")).toList();
        System.out.println("nombresInicianConA = " + nombresInicianConA);

        int[] notas = {85, 42, 90, 31, 75};
        int[] notasMayores70 = Arrays.stream(notas).filter(mayor70 -> mayor70 > 70).toArray();
        for ( int notas70 : notasMayores70){
            System.out.println(notas70);
        }

    }
}
