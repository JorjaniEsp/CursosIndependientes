package dia1nuevo.com.mvc.model;

public class Puntuacion {
    double puntuacion;

    public Puntuacion(){
    }

    public void sumar(double puntos){
        puntuacion += puntos;
    }

    public void restar(double puntos){
        puntuacion -= puntos;
    }

    public double getPuntuacion() {
        return puntuacion;
    }
}
