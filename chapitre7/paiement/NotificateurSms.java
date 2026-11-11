public class NotificateurSms implements Notificateur {
    @Override
    public void envoyer(String destinataire, String message) {
        System.out.println(" [SMS -> " + destinataire + "] " + message);
    }
}
