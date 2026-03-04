package ProgramacionFuncionalTodoCode.expresionesLamdbaEinterfacesFuncionales;

import ProgramacionFuncionalTodoCode.expresionesLamdbaEinterfacesFuncionales.logica.*;

public class Main {
    static void main(String[] args){

//        // sin parametro
//        //Mensajero lambdaMensaje = () -> { System.out.println("Hola desde lambda");};
//
//        //con parametro            puedo ponerlo sin nombre, por que el compilador ya sabe desde la interface creada el parametro firmado
//        Mensajero lambdaMensaje = (nombre, edad) -> { System.out.println("Hola desde lambda, " + nombre);
//            System.out.println("Su edad es " + edad);
//        };
//        lambdaMensaje.emitirMensaje("Juan", 8);

        CondicionEst condicionEst = (int edad) -> {
            return edad >= 18;
        };

        System.out.println(condicionEst.test(19));

        Transformador transformador = text -> {
            return text.toUpperCase();
        };

        System.out.println(transformador.formatear("hola"));

        CalculadoraImpuesto cal = (double salario) -> {
            if (salario <= 0){
                return salario;
            }
            return salario - (salario * 0.10);
        };

        System.out.println(cal.calcular(15.0));


        CreadorUserName createUsername = (String nombre, int anno) -> {
            return nombre.concat(Integer.toString(anno)).toLowerCase();
        };

        System.out.println(createUsername.crear("Jorjanie",2006));
    }
}
