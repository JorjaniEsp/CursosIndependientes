public abstract class Cuenta {
    private String nombre;
    private String numeroCedula;
    private String numeroCuenta;

    public Cuenta(String nombre, String numeroCedula, String numeroCuenta) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {this.nombre = nombre; }

    public String getNumeroCedula() { return numeroCedula; }

    public void setNumeroCedula(String numeroCedula) { this.numeroCedula = numeroCedula;}

    public String getNumeroCuenta() { return numeroCuenta; }

    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public abstract void calcularInteres();

}
