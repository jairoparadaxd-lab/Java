class VehiculoConcesionaria {
    protected String marca;
    protected String modelo;
    protected double precio;

    public VehiculoConcesionaria(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void describir() {
        System.out.println(marca + " " + modelo + " - $" + precio);
    }
}

class Carro extends VehiculoConcesionaria {
    private int numeroPuertas;

    public Carro(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.numeroPuertas = puertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Carro - " + numeroPuertas + " puertas");
    }
}

class Moto extends VehiculoConcesionaria {
    private int cilindraje;

    public Moto(String marca, String modelo, double precio, int cilindraje) {
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Moto - " + cilindraje + " cc");
    }
}

class Camioneta extends VehiculoConcesionaria {
    private double capacidadCarga; // en kg

    public Camioneta(String marca, String modelo, double precio, double capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Camioneta - " + capacidadCarga + " kg de carga");
    }
}

public class MainConcesionaria {
    public static void main(String[] args) {
        Carro c = new Carro("Chevrolet", "Spark", 45000000, 4);
        Moto m = new Moto("Yamaha", "FZ", 12000000, 250);
        Camioneta t = new Camioneta("Toyota", "Hilux", 180000000, 1000);

        c.describir();
        System.out.println("---");
        m.describir();
        System.out.println("---");
        t.describir();
    }
}
