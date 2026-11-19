
public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");

        System.out.println("--- DATOS DEL VEHICULO ---");
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());

        System.out.println("\n--- ACELERANDO ---");
        v.acelerar();
        v.acelerar();
        v.acelerar();

        System.out.println("\n--- FRENANDO ---");
        v.frenar();

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Velocidad final: " + v.getVelocidad() + " km/h");
        System.out.println("Kilometraje total: " + v.getKilometrajeTotal() + " km");

        System.out.println("\n--- REINICIANDO ---");
        v.reset();
        System.out.println("Velocidad despues del reset: " + v.getVelocidad() + " km/h");
        System.out.println("Kilometraje conservado: " + v.getKilometrajeTotal() + " km");
    }
}
