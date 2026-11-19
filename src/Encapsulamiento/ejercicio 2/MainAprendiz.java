public class MainAprendiz {

    public static void main(String[] args) {

        // Crear aprendiz
        Aprendiz a = new Aprendiz("1090123456", "Laura Gomez");

        // Asignar edad y nota
        a.setEdad(19);
        a.setNotaFinal(4.2);

        // Probar una nota invalida
        a.setNotaFinal(7.0);

        // Probar un correo invalido y uno valido
        a.setCorreoInstitucional("lauragomez.sena.edu.co");
        a.setCorreoInstitucional("laura.gomez@soy.sena.edu.co");

        // Mostrar informacion
        System.out.println("\n--- DATOS DEL APRENDIZ ---");
        System.out.println("Documento: " + a.getDocumento());
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota final: " + a.getNotaFinal());
        System.out.println("Correo institucional: " + a.getCorreoInstitucional());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}

