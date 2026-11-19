public class MainProducto {

    public static void main(String[] args) {

        // Crear producto
        Producto p = new Producto("P-001", "Teclado Mecanico", 180000, 10);

        // Mostrar informacion inicial
        System.out.println("--- PRODUCTO ---");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio: $" + p.getPrecio());
        System.out.println("Stock: " + p.getStock());

        // Probar ventas
        System.out.println("\n--- VENTAS ---");
        p.vender(3);
        p.vender(20); // Debe fallar por falta de stock

        // Reabastecer
        System.out.println("\n--- REABASTECIMIENTO ---");
        p.reabastecer(5);

        // Aplicar descuento del 15%
        System.out.println("\n--- DESCUENTO ---");
        p.aplicarDescuento(15);
        System.out.println("Precio con descuento: $" + p.getPrecio());

        // Verificar disponibilidad
        System.out.println("\n--- DISPONIBILIDAD ---");
        System.out.println("Hay stock? " + (p.hayStock() ? "Si" : "No"));

        // Mostrar stock final
        System.out.println("Stock final: " + p.getStock());
    }
}
