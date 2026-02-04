package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    private int id;
    private LocalDate fecha;
    private String tipo; // "Técnica", "Táctica", "Física"
    private int duracion; // en minutos
    private String descripcion;
    private List<Jugador> jugadoresAsistentes;
    private List<CuerpoTecnico> intengrantesCuerpoTecnico;

    public Entrenamiento(int id, LocalDate fecha, String tipo, int duracion, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.jugadoresAsistentes = new ArrayList<>();
        this.intengrantesCuerpoTecnico = new ArrayList<>();
    }

    // Métodos para gestionar jugadores
    public void agregarJugador(Jugador jugador) {
        if (!jugadoresAsistentes.contains(jugador)) {
            jugadoresAsistentes.add(jugador);
        }
    }

    public void removerJugador(Jugador jugador) {
        jugadoresAsistentes.remove(jugador);
    }

    public List<Jugador> getJugadoresAsistentes() {
        return new ArrayList<>(jugadoresAsistentes);
    }

    // Metodos para gestionar cuerpo tecnico
    public void addIntegranteCT(CuerpoTecnico integrante) {
        if (!intengrantesCuerpoTecnico.contains(integrante)) {
            intengrantesCuerpoTecnico.add(integrante);
        }
    }

    public void removerIntegranteCT(CuerpoTecnico integrante) {
        intengrantesCuerpoTecnico.remove(integrante);
    }

    public List<CuerpoTecnico> getIntegranteCT() {
        return new ArrayList<>(intengrantesCuerpoTecnico);
    }



    // Getters y Setters
    public int getId() { return id; }
    public LocalDate getFecha() { return fecha; }
    public String getTipo() { return tipo; }
    public int getDuracion() { return duracion; }
    public String getDescripcion() { return descripcion; }

    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Entrenamiento #" + id + " - " + fecha +
                " [" + tipo + "] - " + duracion + " min";
    }
}