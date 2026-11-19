public class TrabajadorPorHoras extends Trabajador {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public TrabajadorPorHoras(String nombre, String documento, int horas, double tarifa) {
        super(nombre, documento);
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}