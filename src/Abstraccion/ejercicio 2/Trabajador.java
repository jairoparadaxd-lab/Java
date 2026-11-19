public abstract class Trabajador {
    protected String nombre;
    protected String documento;

    public Trabajador(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    // Metodo abstracto: cada tipo de trabajador calcula su pago a su manera
    public abstract double calcularPago();

    // Metodo concreto: lo heredan todas las hijas
    public void mostrarRecibo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Pago del mes: $" + calcularPago());
    }
}