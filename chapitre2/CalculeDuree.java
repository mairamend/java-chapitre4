import java.util.Scanner;
public class CalculeDuree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int duree;
       do {
            System.out.print("Entrez la durée de la tournée en secondes : ");
             duree = sc.nextInt(); 
        }while(duree < 0);
      
        int heure = duree / 3600;
        int minutes = (duree % 3600)/ 60;
        int secondes = duree % 60; 
        System.out.printf("%d h %d min %d s %n",heure,minutes,secondes);
        
    }
}
