class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido.");
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void perseguirCola() {
        System.out.println(nombre + " persigue su cola.");
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " ronronea felizmente.");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void volar() {
        System.out.println(nombre + " esta volando.");
    }
}

public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        Pajaro piolin = new Pajaro("Piolin", 1);

        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

        System.out.println("---");
        michi.dormir();
        michi.hacerSonido();
        michi.ronronear();

        System.out.println("---");
        piolin.comer();
        piolin.hacerSonido();
        piolin.volar();
    }
}
