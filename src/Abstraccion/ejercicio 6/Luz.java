public class Luz extends ServicioPublico {
    private final double TARIFA_KWH = 650;
    private final double CARGO_FIJO = 12000;

    public Luz(String numeroContrato, String titular, double consumoKwh) {
        super("Luz", numeroContrato, titular, consumoKwh);
    }

    @Override
    public double calcularFactura() {
        return (consumo * TARIFA_KWH) + CARGO_FIJO;
    }
}