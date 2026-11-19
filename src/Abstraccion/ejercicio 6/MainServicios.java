public class MainServicios {
    public static void main(String[] args) {
        // ServicioPublico s = new ServicioPublico("X", "000", "Nadie", 10);
        // ERROR: ServicioPublico is abstract; cannot be instantiated

        Agua agua = new Agua("A-001", "Carlos Perez", 15);
        Luz luz = new Luz("L-002", "Carlos Perez", 250);
        Gas gas = new Gas("G-003", "Carlos Perez", 12);

        agua.emitirRecibo();
        System.out.println("---");
        luz.emitirRecibo();
        System.out.println("---");
        gas.emitirRecibo();
    }
}