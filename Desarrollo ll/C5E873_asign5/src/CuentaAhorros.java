public class CuentaAhorros extends Cuenta{

    private double montoPrincipal;
    private double tazaInteres;


    public CuentaAhorros(String nombre, String numeroCedula, String numeroCuenta, double montoPrincipal, double tazaInteres) {
        super(nombre, numeroCedula, numeroCuenta);
        this.montoPrincipal = montoPrincipal;
        this.tazaInteres = tazaInteres;
    }

    public double getMontoPrincipal() { return montoPrincipal; }

    public void setMontoPrincipal(double montoPrincipal) { this.montoPrincipal = montoPrincipal; }

    public double getTazaInteres() { return tazaInteres; }

    public void setTazaInteres(double tazaInteres) { this.tazaInteres = tazaInteres; }

    @Override
    public void calcularInteres() {
        double montoFinal = (tazaInteres * montoPrincipal) / 12;
    }
}
