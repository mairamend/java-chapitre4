package chapitre7.Exercice211;

import java.util.Arrays;

public class Elu extends Personne {
    public Personne[] assistants;
    private int i ;
    private int nbEmbauche ;
    public Elu(String nom,String prenom){
        super(nom, prenom); 
        assistants = new Personne[100];
        i = 1;
        nbEmbauche = 5;

    }
    public void embaucher(Personne p){
        
        if (i > nbEmbauche ){
           System.out.println("Nombre d'embauche atteint");
        }else if (Arrays.stream(assistants).anyMatch(a -> a == p)){
            System.out.println("Cette personne est déja Embauché");
        }else{
             
            assistants[i-1] = p;
            i++;
        }
            
    }
    public void licencier(Personne p){
        for(int j = 0 ; j < i - 1; j++){
            if (assistants[j] == p){
                assistants[j] = assistants[i - 2];
                assistants[i - 2 ] = null;
                i--;
                break;
            }
        }
    //      System.out.println("Cette personne ne fait pas partie de la liste des embauchés de cette élu");
    }
    public void afficherAssistants(){
        for (int j = 0; j < i - 1; j++) {
            System.out.println(assistants[j].prenom +" "+assistants[j].nom);
        }
    }
    public void distribuerDotation(int montant){
        int dotation = montant / (i -1);
        for (int j = 0 ; j < i - 1; j++ ){
            assistants[j].addSous(dotation);
        }
    }
    
}
