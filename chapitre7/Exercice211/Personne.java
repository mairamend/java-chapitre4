package chapitre7.Exercice211;

public class Personne {
    String nom,prenom;
    int compteBancaire;
    Personne(String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaire = 0;
    }
    public void addSous(int montant){
        this.compteBancaire += montant; 
    }
}
