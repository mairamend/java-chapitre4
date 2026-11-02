package chapitre7;

public class Essai {
    public static void main(String[] args) {
        int a = 2;
        Toto p = new Toto(3);
        p.moi();
        System.out.println(" ajoute(" + a + ") = " + p.ajoute(a));
        Titi e1 = new Titi(3, 4);
        e1.moi();
        System.out.println(" ajoute(" + a + ") = " + e1.ajoute(a));
        e1 = new Tutu(3, 4, 5);
        e1.moi();
        System.out.println(" ajoute(" + a + ") = " + e1.ajoute(a));
    }
}
