public class PruebaEmpresa {
    public static void main(String[] args) {
        TrabajadorFijo tf = new TrabajadorFijo("Ana Rios", "1111", 2200000);
        TrabajadorPorHoras th = new TrabajadorPorHoras("Luis Mora", "2222", 80, 15000);
        TrabajadorFreelance tfl = new TrabajadorFreelance("Sara Gomez", "3333", 3, 500000);
        TrabajadorFreelance tfl0 = new TrabajadorFreelance("Pedro Diaz", "4444", 0, 500000);

        tf.mostrarRecibo();
        System.out.println("---");
        th.mostrarRecibo();
        System.out.println("---");
        tfl.mostrarRecibo();
        System.out.println("---");
        tfl0.mostrarRecibo();
    }
}