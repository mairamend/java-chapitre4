import java.util.List;

public class DemoPaiements {
    public static void main(String[] args) { 
        // polymorphisme : type commun 
        List<Paiement> paiements = List.of( 
            new PaiementWave(18_500, "77 123 45 67"), 
            new PaiementOrangeMoney(5_000, "78 000 11 22"), 
            new PaiementEspeces(12_000, 15_000), 
            new PaiementEspeces(9_000, 5_000) 
        ); 
        Notificateur sms = new NotificateurSms(); 
        long totalEncaisse = 0; 
        for (Paiement p : paiements) { 
            try { 
                System.out.println(p.traiter()); 
            // liaison dynamique 
            totalEncaisse += p.getMontant(); if (p instanceof PaiementMobile pm) { 
                // test de type + transtypage 
                sms.confirmerPaiement(pm.telephone, p); 
            } 
        } catch (IllegalStateException e) { 
            System.out.println("ÉCHEC " + p.getReference() + " : " + e.getMessage()); 
        
        }
     }
      System.out.println("Total encaissé : " + totalEncaisse + " FCFA");
Notificateur console = new Notificateur() {
     @Override 
     public void envoyer(String destinataire, String message) 
     { 
        System.out.println(" [LOG] " + destinataire + " : " + message);
     }
     }; 
console.envoyer("admin", "Fin du traitement"); 
// Lambda (chapitre 12) : Notificateur n'a qu'une méthode abstraite
 Notificateur whatsapp = (dest, msg) -> System.out.println(" [WhatsApp -> " + dest + "] " + msg);
  whatsapp.envoyer("771234567", "Votre colis arrive !"); 
}
}