package repasocosillas;

public class Contacto {

    private String nombre;
    private int numero;

    public Contacto(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contacto[" + nombre + numero + "]";
    }
}
