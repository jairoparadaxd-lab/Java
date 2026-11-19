public class Agua extends ServicioPublico {
    private final double TARIFA_M3 = 3500;
    private final double CARGO_FIJO = 8000;

    public Agua(String numeroContrato, String titular, double consumoM3) {
        super("Agua", numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        return (consumo * TARIFA_M3) + CARGO_FIJO;
    }
}