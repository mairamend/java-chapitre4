public class SaisieRobuste {
    static int lireQuantite(String saisie) {
        try {
            int q = Integer.parseInt(saisie.strip());
            if (q <= 0 || q > 100) {
                throw new IllegalArgumentException("Quantité hors limites (1 à 100) : " + q);
            }
            return q;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("« " + saisie + " » n'est pas un nombre", e);
        } finally {
            System.out.println(" (saisie analysée : " + saisie + ")");
        }
    }

    public static void main(String[] args) {
        String[] saisies = { "3", " 12 ", "douze", "0", "250" };
        for (String s : saisies) {
            try {
                System.out.println("Quantité acceptée : " + lireQuantite(s));
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }
}