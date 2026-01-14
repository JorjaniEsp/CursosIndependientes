public class CuentaCorriente extends Cuenta{

    private double capitalInicial;
    private double tasaInteresAnual;
    private double interesPorAno;
    private double tiempoAnos;

    public CuentaCorriente(String nombre, String numeroCedula, String numeroCuenta, double capitalInicial, double tasaInteresAnual, double interesPorAno, double tiempoAnos) {
        super(nombre, numeroCedula, numeroCuenta);
        this.capitalInicial = capitalInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesPorAno = interesPorAno;
        this.tiempoAnos = tiempoAnos;
    }

    public double getCapitalInicial() { return capitalInicial; }

    public void setCapitalInicial(double capitalInicial) { this.capitalInicial = capitalInicial; }

    public double getTasaInteresAnual() { return tasaInteresAnual; }

    public void setTasaInteresAnual(double tasaInteresAnual) { this.tasaInteresAnual = tasaInteresAnual; }

    public double getInteresPorAno() { return interesPorAno; }

    public void setInteresPorAno(double interesPorAno) { this.interesPorAno = interesPorAno; }

    public double getTiempoAnos() { return tiempoAnos; }

    public void setTiempoAnos(double tiempoAnos) { this.tiempoAnos = tiempoAnos; }

    @Override
    public void calcularInteres() {
        double montoFinal = capitalInicial * Math.pow((1 + tasaInteresAnual/interesPorAno),(interesPorAno*tiempoAnos));
    }
}
