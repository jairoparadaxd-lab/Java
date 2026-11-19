import java.util.Arrays;

/**
 * Historia clínica de un paciente de la IPS.
 * Datos sensibles (Ley 1581 de 2012): todos los atributos son privados y el
 * diagnóstico NO tiene getter público; solo se accede con la clave del médico.
 */
public class Paciente {

    // La clave vive solo aquí: constante privada, nunca se imprime ni se registra.
    private static final String CLAVE_MEDICO = "MED-2026";
    private static final String[] TIPOS_SANGRE_VALIDOS =
            {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};

    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico;          // sin getter público
    private String[] alergias = new String[0];

    public Paciente(String documento, String nombre, int edad, String tipoSangre) {
        setDocumento(documento);
        setNombre(nombre);
        setEdad(edad);
        setTipoSangre(tipoSangre);
        this.diagnostico = "Sin diagnóstico registrado";
    }

    // ---------- Getters y setters validados ----------
    public String getDocumento() { return documento; }

    public void setDocumento(String documento) {
        if (documento == null || documento.trim().isEmpty()) {
            throw new IllegalArgumentException("El documento no puede estar vacío.");
        }
        this.documento = documento.trim();
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120.");
        }
        this.edad = edad;
    }

    public String getTipoSangre() { return tipoSangre; }

    public void setTipoSangre(String tipoSangre) {
        if (tipoSangre != null) {
            for (String valido : TIPOS_SANGRE_VALIDOS) {
                if (valido.equals(tipoSangre.trim().toUpperCase())) {
                    this.tipoSangre = valido;
                    return;
                }
            }
        }
        throw new IllegalArgumentException(
                "Tipo de sangre inválido. Permitidos: " + Arrays.toString(TIPOS_SANGRE_VALIDOS));
    }

    // ---------- Diagnóstico protegido ----------
    private boolean claveValida(String clave) {
        return CLAVE_MEDICO.equals(clave); // null-safe: no lanza NullPointerException
    }

    public String consultarDiagnostico(String claveMedico) {
        if (claveValida(claveMedico)) {
            return diagnostico;
        }
        return "ACCESO DENEGADO: clave de médico incorrecta."; // no revela ni la clave ni pistas
    }

    public boolean actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (!claveValida(claveMedico)) {
            return false;
        }
        if (nuevoDiagnostico == null || nuevoDiagnostico.trim().isEmpty()) {
            return false;
        }
        this.diagnostico = nuevoDiagnostico.trim();
        return true;
    }

    // ---------- Alergias ----------
    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.trim().isEmpty()) {
            throw new IllegalArgumentException("La alergia no puede estar vacía.");
        }
        alergias = Arrays.copyOf(alergias, alergias.length + 1);
        alergias[alergias.length - 1] = alergia.trim();
    }

    public boolean tieneAlergias() {
        return alergias.length > 0;
    }

    /** Devuelve una copia para que nadie modifique el arreglo interno. */
    public String[] getAlergias() {
        return Arrays.copyOf(alergias, alergias.length);
    }

    // ---------- Información pública (sin diagnóstico) ----------
    public void mostrarInformacionPublica() {
        System.out.println("Documento : " + documento);
        System.out.println("Nombre    : " + nombre);
        System.out.println("Edad      : " + edad + " años");
        System.out.println("Sangre    : " + tipoSangre);
        System.out.println("Alergias  : " + (tieneAlergias() ? String.join(", ", alergias) : "Ninguna"));
    }
}
