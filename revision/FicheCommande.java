package revision;

import java.util.Scanner;

public class FicheCommande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom complet : ");
        String nom = sc.nextLine();
        System.out.print("Quantié :");
        int quantite = sc.nextInt();
        System.out.print("Prix unitaire Ht :");
        long prixUnitaire = sc.nextLong();
        String maj = nom.toUpperCase();
        System.out.printf("Nom : %s (%d caractères)%n",maj,nom.length());
        
        int  pos = nom.indexOf(' ');
        System.out.printf("Initiales : %c%c%n",maj.charAt(0),maj.charAt(pos + 1));
        long montantHt = prixUnitaire * quantite;
        long tva = Math.round(montantHt * 0.18);
        long ttc = montantHt + tva;
        System.out.printf("%-12s %10d FCFA%n","Montant HT",montantHt);
        System.out.printf("%-12s %10d FCFA%n", "TVA (18%)",tva);
        System.out.printf("%-12s %10d FCFA%n","Montant TTC",ttc);
    }
}
