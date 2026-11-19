public class MainNotificaciones {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail(
                "carlos@sena.edu.co", "Su matricula fue aprobada.");

        NotificacionSMS sms = new NotificacionSMS(
                "3001234567", "Su pedido esta en camino.");

        NotificacionWhatsApp whatsapp = new NotificacionWhatsApp(
                "3109876543", "Su compra ha sido confirmada.");

        email.enviar();
        System.out.println("---");
        sms.enviar();
        System.out.println("---");
        whatsapp.enviar();
    }
}
