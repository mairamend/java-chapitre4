public abstract class Paiement{
    private static int compteur = 0;
    private  final String reference;
    protected  final long montant;
    private boolean effectue;

    protected  Paiement(long montant){
        if (montant <= 0) throw new IllegalArgumentException("Montant invalide : " + montant); 
        this.montant = montant; 
        this.reference = "PAY-" + (++compteur);
    }
    public abstract String libelleMode(); 
    protected abstract long frais(); 
    // Méthode patron : l'algorithme est fixé ici, final pour qu'il ne soit pas modifié 
    public final String traiter() { 
        if (effectue) throw new IllegalStateException("Paiement déjà effectué : " + reference); 
        verifier(); 
        // étape redéfinissable 
        effectue = true; 
        return "%s | %-13s | montant %6d | frais %4d | débité %6d" .formatted(reference, libelleMode(), montant, frais(), montant + frais());
    }
    // Étape optionnelle : par défaut, rien à vérifier
    
    protected void verifier(){} ;
    public long getMontant() {
         return montant; } 
         public boolean isEffectue() 
         { 
            return effectue;
         } 
         public String getReference() { 
            return reference; 
        }


}