public class WhatsappNotification extends NotificationService<String> {
    @Override
    protected String createNotification(String message) {
        String beginOfMessage = "Mensagem Destinada para o WhatsApp";
        beginOfMessage = beginOfMessage.concat(message);

    }
}
