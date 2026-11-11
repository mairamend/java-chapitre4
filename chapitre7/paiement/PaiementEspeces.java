public class PaiementEspeces extends Paiement{
     private final long montantRecu; 
     public PaiementEspeces(long montant, long montantRecu) { 
        super(montant);
         this.montantRecu = montantRecu; 
        }
         @Override 
         public String libelleMode() {
             return "Espèces"; } 
             @Override protected long frais() {
                 return 0; } 
                 @Override 
                 protected void verifier() {
                     super.verifier(); 
                     // appel de la version parente 
                     if (montantRecu < montant) {
                         throw new IllegalStateException("Montant reçu insuffisant : " + montantRecu); 
                        } 
                        System.out.println(" -> monnaie à rendre : " + (montantRecu - montant) + " FCFA"); 
                    }
}
