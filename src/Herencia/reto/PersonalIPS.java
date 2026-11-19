public class PersonalIPS {
    protected String documento;
    protected String nombre;
    protected double salarioBase;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para " + nombre);
    }

    public double calcularSalarioMensual() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario mensual: $" + String.format("%.0f", calcularSalarioMensual()));
    }
}
