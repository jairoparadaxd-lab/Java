public class Gas extends ServicioPublico {
    private final double TARIFA_M3 = 2100;
    private final double CARGO_FIJO = 5000;

    public Gas(String numeroContrato, String titular, double consumoM3) {
        super("Gas", numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        return (consumo * TARIFA_M3) + CARGO_FIJO;
    }
}