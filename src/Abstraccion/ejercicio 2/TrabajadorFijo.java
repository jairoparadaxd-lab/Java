public class TrabajadorFijo extends Trabajador {
    private double salarioMensual;

    public TrabajadorFijo(String nombre, String documento, double salarioMensual) {
        super(nombre, documento);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}