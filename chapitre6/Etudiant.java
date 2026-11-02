public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private double[] notes = new double[5];
    private  static int nbEtudiants = 0;
    private int nbNotes = 0;
    public Etudiant(String nom , String prenom ){
        Etudiant.nbEtudiants++;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = "ISEP-2026-" + String.format("%03d", Etudiant.nbEtudiants);
    }
    public void ajouterNote(int indice ,double note) {
       
        if(indice < 0 || indice >= this.notes.length){
            System.out.println("Indice invalide. L'indice doit être compris entre 0 et " + (this.notes.length - 1) + ".");
            return;
        }
       if(note < 0 || note > 20){
            System.out.println("Note invalide. La note doit être comprise entre 0 et 20.");
            return;
        }
        this.notes[indice] = note;
        this.nbNotes++;
    }
    public double moyenne(){
        double somme = 0;
       
        for (double note : this.notes) {
            if (note > 0) {
                somme += note;
               
            }
        }
        if (nbNotes == 0) {
            return 0;
        }
        return somme / nbNotes;
    }
    public String mention(){
        double moyenne = this.moyenne();
        if (moyenne < 10) {
            return "Insuffisant";
        } else if (moyenne < 12) {
            return "Passable";
        } else if (moyenne < 14) {
            return "Assez bien";
        } else if (moyenne < 16) {
            return "Bien";
        } else {
            return "Très bien";
        }
    }
    public static int getNbEtudiants() {
        return Etudiant.nbEtudiants;
    }
    @Override 
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", notes=" + java.util.Arrays.toString(notes) +
                '}';
    }
    public static void main(String[] args) {
        Etudiant e = new Etudiant("Ba", "Aminata");
        e.ajouterNote(0, 15);
         System.out.println(e);
    }
}
