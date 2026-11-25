 

public class PatternMaching {
    /* Réécrivez la méthode suivante avec un switch à motifs, des gardes et des record patterns. Déclarez les
types nécessaires sous forme d'une interface scellée et de records. */
sealed interface  Forme
    permits Cercle , Rectangle , Triangle{

    };
public  record  Cercle(double rayon) implements Forme {}
public record Rectangle(double largeur, double hauteur )implements Forme {}
public record Triangle(double base , double hauteur) implements Forme{}
    static double aire(Forme forme) {
        return switch (forme){
            case Cercle  c -> Math.PI * c.rayon() * c.rayon();
            case Rectangle r when r.largeur() == r.hauteur() -> {
            System.out.println("C'est un carré");
            yield r.largeur() * r.hauteur();
            }
            case Rectangle r -> r.largeur() * r.hauteur();
            case Triangle t  -> t.base() * t.hauteur() / 2;
           
        };

}
}