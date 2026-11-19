public class TrabajadorFreelance extends Trabajador {
    private int proyectosTerminados;
    private double pagoPorProyecto;

    public TrabajadorFreelance(String nombre, String documento, int proyectos, double pagoPorProyecto) {
        super(nombre, documento);
        this.proyectosTerminados = proyectos;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        return proyectosTerminados * pagoPorProyecto;
    }
}