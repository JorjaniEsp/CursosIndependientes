public class Ejercicio2{

    double precio = 0;

    public void aumentarPreciosSinRetorno(){
        precio += 100;
        System.out.println("precio = " + precio);
    }

    public void aumentarPrecioConParametros(String motivo, int suma){
        precio += suma;
        System.out.println("El precio total es de " + precio + ", porque " + motivo);
    }

    public double aumentarPrecioconRetorno(){
        precio += 2000;
        return precio;
    }

    public double aumentarPrecioconRetornoYparametros(String motivo, int suma){
        precio += suma;
        String mensaje = "EL motivo es el siguiente: " + motivo + "\nEl precio final es de: ";
        System.out.println(mensaje);
        return precio;
    }
    // si trato de usar la variable por fuera del metodo no me lo permite, por que mensaje solo vive dentro del metodo o el lugar
    // donde es creado, ya que el compilador llegar al metodo y leer las llave abre un espacio en memoria donde se ejecuta el codigo
    // entre llaves y al finalizar el metodo desaparece ese espacio en memoria y por ende estas variables desaparecen.

    public void metodosDeJava() {
        String x = Double.toString(precio);
        System.out.println("Utilizo un metodo para convertir el precio tipo double en un string " + x);

        aumentarPrecioconRetorno();
        // no se puede crear metodos anidados, pero si llamar metodos dentro de otro metodo, asi que seria una alternativa
    }

    public static int dificultadExtra(String a, String b){
        int contador = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(a + b);
            } else if (i % 5 == 0){
                System.out.println(b);
            } else if (i % 3 == 0) {
                System.out.println(a);
            }else {
                System.out.println(i);
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Ejercicio2.dificultadExtra(" a ", " b ");
    }
}
