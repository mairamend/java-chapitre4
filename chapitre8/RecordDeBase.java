public class RecordDeBase {
    record Montant(long valeur, String devise){
        Montant{
            if(valeur < 0)
                throw new IllegalArgumentException("Le montant ne peut pas être négatif : " + valeur);
            if(devise == null || devise.isBlank())
                throw new IllegalArgumentException("La devise est obligatoire");
            devise = devise.toUpperCase();
        }
        
        Montant plus(Montant autre){
            if(!this.devise.equals(autre.devise))
                throw new IllegalArgumentException("Les devises doivent être identiques");
            return new Montant(this.valeur + autre.valeur, this.devise);
        }
        Montant fois(int n){
            if(n < 0)
                throw new IllegalArgumentException("Le multiplicateur ne peut pas être négatif ");
            return new Montant(this.valeur * n, this.devise);
        }
    }
    record Periode(int anneeDebut, int anneeFin){
        Periode{
            if(anneeDebut < 0 || anneeFin < 0)
                throw new IllegalArgumentException("Les années doivent être positives");
            if(anneeFin < anneeDebut)
                throw new IllegalArgumentException("L'année de fin doit être supérieure à l'année de début");
        }
        int duree(){
            return anneeFin - anneeDebut;
        }
        boolean contient(int annee){
            return annee >= anneeDebut && annee <= anneeFin;
        }
    }
    public static void main(String[] args) {
        Montant m1 = new Montant(100, "eur");
        Montant m2 = new Montant(200, "eur");
        System.out.println(m1);
        System.out.println(m1.equals(m2));
        System.out.println("Hashcode de m1 : " + m1.hashCode());
        Periode p = new Periode(2020, 2025);
        Periode p2 = new Periode(2020, 2025);
        System.out.println("Durée de la période : " + p.duree() + " ans");
        System.out.println("Contient l'année 2023 ? " + p.contient(2023));
        System.out.println("Contient l'année 2026 ? " + p.contient(2026));
        System.out.println("Les périodes sont-elles égales ? " + p.equals(p2));
        System.out.println("Hashcode de la période : " + p.hashCode());
    }
}
