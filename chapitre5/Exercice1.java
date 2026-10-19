import java.util.Scanner;

public class Exercice1
 {
    static  Scanner sc = new Scanner(System.in);
    
    public static void  saisir(int[] nombres){
        
        
        
        for (int i = 0; i < nombres.length; i++){
            System.out.print("Entrez le " +(i+1) +"em nombre :");
            nombres[i] = sc.nextInt();

        }
    }
    public   static int maximum(int[] nombres){
        int max = nombres[0];
        for (int i = 1; i < nombres.length; i++){
            if(nombres[i] > max ){
                max = nombres[i];
            }
        }
        return  max;
    }
    public static int minimum(int[] nombres){
        int min = nombres[0];
        for (int i = 1; i < nombres.length; i++){
            if(nombres[i] < min ){
               min = nombres[i];
            }
        }
        return min;
        
    }
   public  static double moyenne(int[] nombres){
        int s = 0;
        for (int i = 0; i < nombres.length; i++){
             s  += nombres[i];
        }
        return (double) s / nombres.length ;
    }
   public static void main(String[] args) {
        System.out.println("Entrer le nombre d'entier que vous  allez saisir");
        int n;
        while (true) {
            n = sc.nextInt();
            if( n > 0 ) break;
            System.out.println("Le nombre doit être superieur à 0");
            
        }
        
        int[] nombres = new int[n];
        saisir(nombres);
        System.out.println("Le maximum est "+maximum(nombres));
        System.out.println("Le minimum est "+minimum(nombres));
        System.out.println("Le moyenne est "+moyenne(nombres));
        System.out.print("Les nombres superieurs à la moyenne sont : ");
        for(int i = 0; i < nombres.length;i++){
            if(nombres[i] > moyenne(nombres)){
                    System.out.print(nombres[i]+",");
            }
        }
        
   }
}
