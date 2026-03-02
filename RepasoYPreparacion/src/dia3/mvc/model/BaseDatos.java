package dia3.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Jugador> jugadores;
    private static BaseDatos instance;

    private BaseDatos(){
        jugadores = new ArrayList<>();
    }

    public static synchronized BaseDatos getInstance(){
        if (instance == null){
            instance = new BaseDatos();
        }
        return instance;
    }

    public boolean agregarJugador(Jugador jugador){
        if(jugador != null){
            jugadores.add(jugador);
            return true;
        }
        return false;
    }

    public List<Jugador> verJugadores(){
        return jugadores;
    }

    public List<Jugador> verMejoresJugadores(){
       return jugadores.stream().filter(jugador -> jugador.getNivel() >= 7).toList();
    }

}
