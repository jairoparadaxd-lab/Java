class UsuarioPlataforma {
    protected String nombre;
    protected String correo;

    public UsuarioPlataforma(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void iniciarSesion() {
        System.out.println("Bienvenido, " + nombre);
    }
}

class Estudiante extends UsuarioPlataforma {
    private int cursosInscritos;

    public Estudiante(String nombre, String correo, int cursos) {
        super(nombre, correo);
        this.cursosInscritos = cursos;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Tienes " + cursosInscritos + " cursos disponibles para estudiar.");
    }
}

class Instructor extends UsuarioPlataforma {
    private String especialidad;

    public Instructor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Panel del instructor de " + especialidad + " listo. Revisa tus estudiantes.");
    }
}

class Administrador extends UsuarioPlataforma {
    private String nivelPermiso; // "TOTAL" o "PARCIAL"

    public Administrador(String nombre, String correo, String nivelPermiso) {
        super(nombre, correo);
        this.nivelPermiso = nivelPermiso;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Panel de administración con permisos: " + nivelPermiso);
    }
}

public class MainPlataforma {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Carlos Vega", "carlos@ejemplo.edu.co", 5);
        Instructor i = new Instructor("Marta Soto", "marta@ejemplo.edu.co", "Java");
        Administrador a = new Administrador("Julia Mora", "julia@ejemplo.edu.co", "TOTAL");

        e.iniciarSesion();
        System.out.println("---");
        i.iniciarSesion();
        System.out.println("---");
        a.iniciarSesion();
    }
}
