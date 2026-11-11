package chapitre7.Exercice211;

public class EluMafieux extends Elu {
    public EluMafieux(String nom, String prenom){
        super(nom, prenom);
    }
    @Override 
    public void embaucher(Personne p){
        if (this.nom.equals(p.nom))
            super.embaucher(p);
        else
            System.out.println("Cette personne fait pas partie de la famille de l'élu");
    }
}
