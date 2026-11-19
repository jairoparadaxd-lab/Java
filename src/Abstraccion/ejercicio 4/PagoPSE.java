public class PagoPSE extends MedioPago {
    private String banco;

    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Redirigiendo al portal de " + banco + "...");
        System.out.println("Esperando confirmacion del banco...");
        // Simulacion: se muestra una confirmacion ficticia.
        System.out.println("Resultado: pago aprobado por PSE.");
    }
}
