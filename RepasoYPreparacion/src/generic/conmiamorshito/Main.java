package generic.conmiamorshito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main  {
    static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4));

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        numeros.forEach(System.out::println);

    }
}
