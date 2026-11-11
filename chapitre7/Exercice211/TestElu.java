package chapitre7.Exercice211;

public class TestElu {
    public static void main(String[] args) {
        Personne p1 = new  Personne("Ndiath", "Mairame");
        Elu e = new Elu("Fall","Abass" );
        e.embaucher(p1);
        e.embaucher(new Personne("Soung", "Diary"));
        e.embaucher(p1);
        e.afficherAssistants();
        System.out.println("Apres licenciement");
        e.licencier(p1);
        e.afficherAssistants();
        e.embaucher(p1);
         System.out.println("Apres reembauchement");
         e.afficherAssistants();
    }
}
