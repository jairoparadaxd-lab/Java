public class Usuario {
    private String nombreUsuario;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;

    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void cambiarPassword(String nueva) {
        if (bloqueado) {
            System.out.println("La cuenta esta bloqueada. No se puede cambiar la contrasena.");
        } else if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contrasena actualizada correctamente.");
        } else {
            System.out.println("Contrasena invalida: minimo 8 caracteres y al menos un numero.");
        }
    }

    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            System.out.println("Cuenta bloqueada. Acceso denegado.");
            return false;
        }

        if (this.password != null && this.password.equals(intento)) {
            intentosFallidos = 0;
            return true;
        }

        intentosFallidos++;
        System.out.println("Contrasena incorrecta. Intentos fallidos: " + intentosFallidos);

        if (intentosFallidos >= 3) {
            bloqueado = true;
            System.out.println("Cuenta bloqueada por demasiados intentos fallidos.");
        }

        return false;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) {
            return false;
        }

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
}