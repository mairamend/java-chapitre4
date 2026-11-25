public class Livreur extends Employe {
    private long livraisonEffectuee;
    public Livreur(String matricule, String nom, long salaireDebase, long livraisonEffectuee) {
        super(matricule, nom, salaireDebase);
        this.livraisonEffectuee = livraisonEffectuee;
    }
    public long getLivraisonEffectuee() {
        return livraisonEffectuee;
    }
    @Override
    public long salaireMensuel() {
        return this.getSalaireDebase() + (this.getLivraisonEffectuee() * 500);
    }       
    
}
