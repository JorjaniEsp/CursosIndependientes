package modelo;

public class CuerpoTecnico {
    private int id;
    private String fullNombre;
    enum tipo {
        DIRECTOR_TECNICO,
        PREPARADOR_FISICO,
        MEDICO,
        ASISTENTE_TECNICO
    }
    private tipo tipo;

    public CuerpoTecnico(int id, String fullNombre, tipo tipo) {
        this.id = id;
        this.fullNombre = fullNombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullNombre() {
        return fullNombre;
    }

    public void setFullNombre(String fullNombre) {
        this.fullNombre = fullNombre;
    }

    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cuerpo tecnico:" + "\n" +
                "ID:" + id + "\n" +
                "Nombre: " + fullNombre  + "\n" +
                "Categoria: " + tipo ;
    }
}
