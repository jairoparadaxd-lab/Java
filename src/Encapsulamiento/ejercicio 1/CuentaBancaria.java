public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    // Retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    // Transferir dinero
    public void transferir(CuentaBancaria destino, double cantidad) {
        if (destino == null) {
            System.out.println("Error: la cuenta destino no existe.");
        } else if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para transferir.");
        } else {
            saldo -= cantidad;
            destino.saldo += cantidad;

            System.out.println("Transferencia exitosa de $" + cantidad);
            System.out.println("Cuenta destino: " + destino.getNumeroCuenta());
        }
    }
}
