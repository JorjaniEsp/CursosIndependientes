package ProgramacionFuncionalTodoCode.expresionesLamdbaEinterfacesFuncionales;

import ProgramacionFuncionalTodoCode.expresionesLamdbaEinterfacesFuncionales.logica.Mensajero;

public class Main {
    static void main(String[] args){

        // sin parametro
        //Mensajero lambdaMensaje = () -> { System.out.println("Hola desde lambda");};

        //con parametro            puedo ponerlo sin nombre, por que el compilador ya sabe desde la interface creada el parametro firmado
        Mensajero lambdaMensaje = (nombre, edad) -> { System.out.println("Hola desde lambda, " + nombre);
            System.out.println("Su edad es " + edad);
        };
        lambdaMensaje.emitirMensaje("Juan", 8);

    }
}
