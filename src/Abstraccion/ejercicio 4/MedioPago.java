public abstract class MedioPago {
    protected double monto;

    public MedioPago(double monto) {
        this.monto = monto;
    }

    // Metodo abstracto: cada medio de pago define su proceso.
    public abstract void procesarPago();

    // Metodo concreto: comun a todos los medios de pago.
    public void mostrarMonto() {
        System.out.println("Monto a pagar: $" + monto);
    }
}
