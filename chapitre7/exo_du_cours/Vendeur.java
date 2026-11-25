public class Vendeur extends Employe {
    private long chiffreAffaire;
    public Vendeur(String matricule, String nom, long salaireDebase, long chiffreAffaire) {
        super(matricule, nom, salaireDebase);
        this.chiffreAffaire = chiffreAffaire;
    }
    public long getChiffreAffaire() {
        return chiffreAffaire;  
    }
    @Override
    public long salaireMensuel() {
        return this.getSalaireDebase() + (this.getChiffreAffaire() * 3 / 100);
    
    }
}    
