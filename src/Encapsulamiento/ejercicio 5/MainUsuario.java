public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");

        System.out.println("--- DATOS DEL USUARIO ---");
        System.out.println("Usuario: " + u.getNombreUsuario());

        System.out.println("\n--- PRUEBA DE CONTRASENA ---");
        u.cambiarPassword("hola"); // Invalida

        System.out.println("\n--- SIMULANDO 3 INTENTOS FALLIDOS ---");
        System.out.println("Intento 1: " + u.verificarPassword("incorrecta1"));
        System.out.println("Intento 2: " + u.verificarPassword("incorrecta2"));
        System.out.println("Intento 3: " + u.verificarPassword("incorrecta3"));

        System.out.println("\n--- VERIFICANDO BLOQUEO ---");
        System.out.println("Cuenta bloqueada? " + u.isBloqueado());

        // Aunque la contrasena sea correcta, la cuenta ya esta bloqueada.
        System.out.println("Login con contrasena correcta: "
                + u.verificarPassword("clave1234"));
    }
}
