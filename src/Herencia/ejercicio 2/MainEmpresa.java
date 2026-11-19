class Empleado {
    protected String nombre;
    protected String documento;
    protected double salarioBase;

    public Empleado(String nombre, String documento, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario a pagar: $" + calcularSalario());
    }
}

class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, String documento, double salarioBase, double comision) {
        super(nombre, documento, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}

class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, String documento, double salarioBase, double bonificacion) {
        super(nombre, documento, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }
}

// Gana el 50% del salario base como apoyo de sostenimiento
class AprendizEjemplo extends Empleado {

    public AprendizEjemplo(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5;
    }
}

public class MainEmpresa {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Ana Lopez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Ruiz", "5678", 3000000, 800000);
        AprendizEjemplo a = new AprendizEjemplo("Luis Perez", "9012", 1500000);

        v.mostrarInfo();
        System.out.println("---");
        g.mostrarInfo();
        System.out.println("---");
        a.mostrarInfo();
    }
}
