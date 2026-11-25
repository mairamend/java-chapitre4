public abstract class Employe {
    private String matricule;
    private String nom;
    private long salaireDebase;
    public Employe(String matricule, String nom, long salaireDebase) {
        this.matricule = matricule;
        this.nom = nom;
        this.salaireDebase = salaireDebase;
    }
    public String getMatricule() {
        return matricule;
    }
    public String getNom() {
        return nom;
    }
    public long getSalaireDebase() {
        return salaireDebase;
    }

    public abstract long salaireMensuel();
    @Override 
    public String toString() {
        return   "matricule : " + matricule +
                ", nom : " + nom +
                ", salaireDebase :" + salaireDebase ;
    }
}