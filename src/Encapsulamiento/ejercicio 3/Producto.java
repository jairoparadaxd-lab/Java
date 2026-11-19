public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Validar precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio invalido. No puede ser negativo.");
        }
    }

    // Validar stock
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock invalido. No puede ser negativo.");
        }
    }

    // Vender productos
    public void vender(int unidades) {
        if (unidades <= 0) {
            System.out.println("Cantidad invalida.");
        } else if (unidades > stock) {
            System.out.println("Sin stock suficiente. Disponible: " + stock);
        } else {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidades.");
        }
    }

    // Reabastecer productos
    public void reabastecer(int unidades) {
        if (unidades > 0) {
            stock += unidades;
            System.out.println("Stock actualizado. Nuevo stock: " + stock);
        } else {
            System.out.println("Cantidad invalida para reabastecer.");
        }
    }

    // Aplicar descuento al precio
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            precio -= precio * (porcentaje / 100);
            System.out.println("Descuento del " + porcentaje + "% aplicado.");
        } else {
            System.out.println("Porcentaje invalido. Debe estar entre 0 y 100.");
        }
    }

    // Verificar si hay productos disponibles
    public boolean hayStock() {
        return stock > 0;
    }
}
