package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorEntrenamientos {
    private List<Entrenamiento> entrenamientos;
    private List<Jugador> jugadores;
    private List<CuerpoTecnico> integrantes;
    private int proximoIdEntrenamiento;

    public GestorEntrenamientos() {
        this.entrenamientos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.integrantes = new ArrayList<>();
        this.proximoIdEntrenamiento = 1;
        inicializarDatosEjemplo();
    }

    private void inicializarDatosEjemplo() {
        // Crear jugadores de ejemplo
        jugadores.add(new Jugador(1, "Lionel Messi", "Delantero", 10));
        jugadores.add(new Jugador(2, "Sergio Ramos", "Defensa", 4));
        jugadores.add(new Jugador(3, "Manuel Neuer", "Portero", 1));
        jugadores.add(new Jugador(4, "Kevin De Bruyne", "Mediocampista", 17));
        jugadores.add(new Jugador(4, "Keylor Navas", "Portero", 25));

        //crear integrantes del cuerpo tecnico de ejemplo
        integrantes.add(new CuerpoTecnico(1,"Juan Lopez", CuerpoTecnico.tipo.DIRECTOR_TECNICO));
        integrantes.add(new CuerpoTecnico(2,"Carlos Muñoz", CuerpoTecnico.tipo.ASISTENTE_TECNICO));
        integrantes.add(new CuerpoTecnico(3,"Ferdando Dereira", CuerpoTecnico.tipo.PREPARADOR_FISICO));
        integrantes.add(new CuerpoTecnico(4,"Petro Gonzales", CuerpoTecnico.tipo.MEDICO));


        // Crear entrenamientos de ejemplo
        agregarEntrenamiento(new Entrenamiento(
                proximoIdEntrenamiento++,
                LocalDate.now().minusDays(2),
                "Técnica",
                90,
                "Ejercicios de control y pase"
        ));

        agregarEntrenamiento(new Entrenamiento(
                proximoIdEntrenamiento++,
                LocalDate.now().minusDays(1),
                "Táctica",
                120,
                "Estrategias de ataque organizado"
        ));

        // Asignar jugadores a entrenamientos
        entrenamientos.get(0).agregarJugador(jugadores.get(0));
        entrenamientos.get(0).agregarJugador(jugadores.get(3));
        entrenamientos.get(1).agregarJugador(jugadores.get(1));
        entrenamientos.get(1).agregarJugador(jugadores.get(2));
        entrenamientos.get(1).agregarJugador(jugadores.get(3));

        // Asignar integrantes del cuerpo técnico
        entrenamientos.get(0).addIntegranteCT(integrantes.getFirst());
        entrenamientos.get(0).addIntegranteCT(integrantes.get(1));
        entrenamientos.get(0).addIntegranteCT(integrantes.get(2));
        entrenamientos.get(0).addIntegranteCT(integrantes.get(3));

        entrenamientos.get(1).addIntegranteCT(integrantes.get(0));
        entrenamientos.get(1).addIntegranteCT(integrantes.get(1));
        entrenamientos.get(1).addIntegranteCT(integrantes.get(2));
        entrenamientos.get(1).addIntegranteCT(integrantes.get(3));


    }

    // Métodos CRUD para entrenamientos
    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.add(entrenamiento);
    }

    public boolean eliminarEntrenamiento(int id) {
        return entrenamientos.removeIf(e -> e.getId() == id);
    }

    public Entrenamiento buscarEntrenamientoPorId(int id) {
        return entrenamientos.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Entrenamiento> obtenerEntrenamientosPorFecha(LocalDate fecha) {
        return entrenamientos.stream()
                .filter(e -> e.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }

    public List<Entrenamiento> obtenerTodosEntrenamientos() {
        return new ArrayList<>(entrenamientos);
    }

    public List<Jugador> obtenerTodosJugadores() {
        return new ArrayList<>(jugadores);
    }

    public List<CuerpoTecnico> getIntegrantesCT() {
        return new ArrayList<>(integrantes);
    }

    public Jugador buscarJugadorPorId(int id) {
        return jugadores.stream()
                .filter(j -> j.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public CuerpoTecnico buscarIntegranteCTPorId(int id) {
        return integrantes.stream()
                .filter(j -> j.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int obtenerProximoId() {
        return proximoIdEntrenamiento++;
    }
}