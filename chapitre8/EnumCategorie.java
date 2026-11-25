/**
 * Créez un enum Categorie (ALIMENTAIRE, TEXTILE, ARTISANAT, COSMETIQUE) avec un libellé et un taux
de TVA (alimentaire de base : 0 % ; autres : 18 %). Ajoutez une méthode long prixTtc(long prixHt).
Utilisez EnumMap<Categorie, Long> pour cumuler le chiffre d'affaires par catégorie d'une liste de ventes.
 
 */
public class EnumCategorie {
    public enum Categorie {
        ALIMENTAIRE("produits alimentaires",0.0),
        TEXTILE("produits textiles",0.18),
        ARTISANAT("produits artisannaux",0.18),
        COSMETIQUE("produits cosmetiques",0.18);
        
        private final String libelle ;
        private final double tauxTva;

        Categorie(String libelle , double tauxTva){
            this.libelle = libelle;
            this.tauxTva = tauxTva;
        }
        public  long prixTtc(long prixHt){
            if (prixHt <= 0) {
                throw new IllegalArgumentException("Prix invalide ");
            }
            return prixHt + Math.round(prixHt * this.tauxTva);
        }
        public String getLibelle(){
            return  libelle;
        }
        public double getTauxTva(){
            return  tauxTva;
        }
        
    }
    public static  void  main(String[] args){
        Categorie c1 = Categorie.COSMETIQUE;
        System.out.println("prix ttc :"+c1.prixTtc(13000));
    }
}
