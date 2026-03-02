package dia3.mvc.model;

public class Jugador {
    private String nombre;
    private int nivel;
    private String numeroCamiseta;

    public Jugador(String nombre, int edad, String numeroCamiseta) {
        this.nombre = nombre;
        this.nivel = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    public Jugador(String nombre, int edad) {
        this(nombre, edad, "Sin difinir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return nombre + " | " + nivel + " | " + numeroCamiseta;
    }
}
