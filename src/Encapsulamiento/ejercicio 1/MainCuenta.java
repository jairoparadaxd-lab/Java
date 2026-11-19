public class MainCuenta {

    public static void main(String[] args) {

        // Crear dos cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria cuenta2 = new CuentaBancaria("002-6789", "Ernesto cables");

        // Depositar dinero
        cuenta1.depositar(500000);
        cuenta2.depositar(200000);

        // Mostrar saldos iniciales
        // System.out.println("\n--- SALDOS INICIALES ---");
        System.out.println(cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + ": $" + cuenta2.getSaldo());

        // Transferir dinero
        System.out.println("\n--- TRANSFERENCIA ---");
        cuenta1.transferir(cuenta2, 150000);

        // Mostrar saldos finales
        System.out.println("\n--- SALDOS FINALES ---");
        System.out.println(cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + ": $" + cuenta2.getSaldo());

        // Probar validación de saldo insuficiente
        System.out.println("\n--- PRUEBA DE VALIDACION ---");
        cuenta1.transferir(cuenta2, 1000000);
    }
}
