public class Aprendiz {

    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String correoInstitucional;

    public Aprendiz(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.notaFinal = 0.0;
        this.correoInstitucional = "";
    }

    // Getters
    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    // Validar edad
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 100.");
        }
    }

    // Validar nota final
    public void setNotaFinal(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaFinal = nota;
        } else {
            System.out.println("Nota invalida. Debe estar entre 0.0 y 5.0.");
        }
    }

    // Validar correo institucional
    public void setCorreoInstitucional(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correoInstitucional = correo;
            System.out.println("Correo institucional asignado correctamente.");
        } else {
            System.out.println("Correo invalido. Debe contener el simbolo @.");
        }
    }

    // Comprobar si aprobo
    public boolean aprobo() {
        return notaFinal >= 3.5;
    }
}
