public class CompteMobile {
    private final String numero;
    private String titulaire;
    private long solde;
    private static final long MAX_FRAIS = 5000;
    private static final  long SEUIL_FRAIS = 700;
    private static final  long FRAIS_FIXE = 5;
    public CompteMobile(String numero, String titulaire ) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = 0;
    }
    public void deposer(long montant) {
       if (montant > 0) {
            this.solde += montant;
        }else {
            System.out.println("Le montant à déposer doit être positif.");
        }
    }
    public void retirer(long montant) {
        if (montant > 0 ) {
            if (montant > this.solde) {
                System.out.println("Solde insuffisant pour effectuer le retrait.");
                return;
            }
            this.solde -= montant;
        } else {
            System.out.println("Le montant à retirer doit être positif.");
        }
    }
    public void transferer(CompteMobile destinataire, long montant) {
        if (destinataire  ==null) {
            System.out.println("Le destinataire ne peut pas être null.");
            return;
        }
        if(destinataire == this){
            System.out.println("Vous ne pouvez pas transférer de l'argent à votre propre compte.");
            return;
        }
        if (montant > 0 ) {
            long frais;
            if (montant < SEUIL_FRAIS) {
                frais = FRAIS_FIXE;
            } else {
                frais = (long) (montant / 100);
            }
            if(frais > MAX_FRAIS){
                frais = MAX_FRAIS;
            }
            long total = montant + frais;
            if (total > this.solde) {
                System.out.println("Solde insuffisant pour effectuer le transfert.");
                return;
            }
            this.retirer(total);
            destinataire.deposer(montant);
        }
         else {
            System.out.println("Le montant à transférer doit être positif.");
        }

    }
    @Override
    public String toString() {
        return "CompteMobile{" +
                "numero='" + numero + '\'' +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }
    public static void main(String[] args) {
        CompteMobile compte1 = new CompteMobile("768560978", "Aminata Ba");
        CompteMobile compte2 = new CompteMobile("768560979", "Moussa Diop");
        compte2.deposer(50000);
        compte2.transferer(compte1, 10000);
        System.out.println(compte1);
        System.out.println(compte2);
        compte2.transferer(null, 10000);
        compte2.transferer(compte1, 50);
        compte2.transferer(compte1,700);
        compte2.deposer(2_000_000);
        compte2.transferer(compte1, 1_000_000);
          System.out.println(compte1);
        System.out.println(compte2);
    }
}
