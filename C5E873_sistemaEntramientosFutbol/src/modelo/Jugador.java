package modelo;
public class Jugador {
    private int id;
    private String nombre;
    private String posicion;
    private int numero;

    public Jugador(int id, String nombre, String posicion, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPosicion() { return posicion; }
    public int getNumero() { return numero; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public String toString() {
        return "Jugador #" + numero + ": " + nombre + " (" + posicion + ")";
    }
}