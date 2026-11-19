public class MainHistoriaClinica {

    public static void main(String[] args) {
        // Clave que usa el personal médico (en un sistema real vendría de un login seguro).
        final String claveCorrecta = "MED-2026";

        System.out.println("=== IPS - Módulo de Historia Clínica ===\n");

        // 1. Crear paciente
        Paciente paciente = new Paciente("1020304050", "Laura Gómez", 34, "O+");
        paciente.actualizarDiagnostico(claveCorrecta, "Hipertensión arterial leve");

        // 2. Consulta con clave incorrecta
        System.out.println("Consulta con clave incorrecta:");
        System.out.println("  -> " + paciente.consultarDiagnostico("1234"));

        // 3. Consulta con clave correcta
        System.out.println("\nConsulta con clave correcta:");
        System.out.println("  -> " + paciente.consultarDiagnostico(claveCorrecta));

        // 4. Agregar 2 alergias
        paciente.agregarAlergia("Penicilina");
        paciente.agregarAlergia("Polen");

        // 5. Información pública
        System.out.println("\nInformación pública del paciente:");
        paciente.mostrarInformacionPublica();

        // Validaciones
        System.out.println("\nPruebas de validación:");
        try {
            paciente.setEdad(150);
        } catch (IllegalArgumentException e) {
            System.out.println("  -> " + e.getMessage());
        }
        try {
            paciente.setTipoSangre("C+");
        } catch (IllegalArgumentException e) {
            System.out.println("  -> " + e.getMessage());
        }
    }
}
