public interface Notificateur {
    void envoyer(String destinataire, String message);

    default void confirmerPaiement(String destinataire, Paiement p) {
        envoyer(destinataire, "Paiement " + p.getReference() + " de " + p.getMontant() + " FCFA reçu. Merci !");
    }
}
