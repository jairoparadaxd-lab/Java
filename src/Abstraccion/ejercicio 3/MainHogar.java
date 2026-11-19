public class MainHogar {
    public static void main(String[] args) {

        Televisor tv = new Televisor("LG");
        Nevera nv = new Nevera("Samsung");
        Lavadora lv = new Lavadora("Whirlpool");

        // Probar el televisor.
        tv.encender();
        tv.funcionPrincipal();
        tv.apagar();

        System.out.println("---");

        // Probar la nevera.
        nv.funcionPrincipal();
        nv.encender();
        nv.funcionPrincipal();
        nv.apagar();

        System.out.println("---");

        // Probar la lavadora.
        lv.encender();
        lv.funcionPrincipal();
        lv.centrifugar();
        lv.apagar();
    }
}
