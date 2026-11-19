public abstract class ServicioPublico {
    protected String numeroContrato;
    protected String titular;
    protected double consumo;
    protected String tipo;

    public ServicioPublico(String tipo, String numeroContrato, String titular, double consumo) {
        this.tipo = tipo;
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumo = consumo;
    }

    // Metodo abstracto: cada servicio cobra a su manera
    public abstract double calcularFactura();

    // Metodo concreto: usa calcularFactura() internamente
    public void emitirRecibo() {
        System.out.println("Servicio: " + tipo);
        System.out.println("Contrato: " + numeroContrato);
        System.out.println("Titular: " + titular);
        System.out.println("Consumo: " + consumo);
        System.out.println("Total a pagar: $" + calcularFactura());
    }
}