public class MainIPS {
    public static void main(String[] args) {
        Medico medico = new Medico("1001", "Dra. Sofia Rojas", 3000000, "Pediatria", 20);
        Enfermero enfermero = new Enfermero("1002", "Andres Pardo", 1800000, "noche");
        Administrativo admin = new Administrativo("1003", "Marta Diaz", 1500000, "facturacion");

        medico.registrarAsistencia();
        medico.mostrarInfo();
        System.out.println("---");
        enfermero.mostrarInfo();
        System.out.println("---");
        admin.mostrarInfo();
    }
}
