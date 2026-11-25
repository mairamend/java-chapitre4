public class Gerant extends Employe{
    private long prime;
    public Gerant(String matricule, String nom, long salaireDebase) {
        super(matricule, nom, salaireDebase);
        this.prime = 100000;
    }
    public long getPrime() {
        return prime;
    }
    @Override
    public long salaireMensuel() {
        return this.getSalaireDebase() + this.getPrime();
    }
    
}
