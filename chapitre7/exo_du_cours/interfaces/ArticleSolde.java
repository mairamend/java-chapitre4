package interfaces;

public class ArticleSolde implements Taxable , Remisable {
    private final long prix;
    private final int taux;
    public ArticleSolde(long prix, int taux) {
        if (prix <= 0 || taux < 0 || taux > 100) {
            throw new IllegalArgumentException("Prix ou taux invalide.");
        }
        this.prix = prix;
        this.taux = taux;
    }
    public long montantHt() {
        return prix - Remisable.super.remise(prix);
    }
    public int tauxRemise() {
        return taux;
    } 
    @Override 
    public String description() {
        return Taxable.super.description() + " , " + Remisable.super.description();
        
    }   
}
