package ProgramacionFuncionalTodoCode.referenciametodos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    static void main() {

        // Referencia a un metodo static
        Function<Integer, String> convertido = String::valueOf;
        String resultado = convertido.apply(8);

        // Referencia a un metodo de instancia de un objeto
        Persona person = new Persona();
        person.nombre = "Jorjanie";

        Runnable saludo = person::saludar;
        saludo.run();



        // referencia a un constructor
        BiFunction<String,Double,Persona> crearPersona = Persona::new;
        Persona p = crearPersona.apply("Juan",18.5);
        System.out.println(p.toString());

        //Referencia a un metodo de instancia de un objeto arbitrario
        List<Persona> personasList = new ArrayList<>();
        personasList.add(new Empleado());
        personasList.add(new Empleado());
        personasList.add(new Gerente());
        personasList.add(new Gerente());

        personasList.forEach(Persona::saludar);


    }
}
