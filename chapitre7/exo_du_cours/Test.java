public class Test {
    private Employe[] employes = new Employe[3];
    public long calculerMasseSalariale() {
        long masseSalariale = 0;
        for (Employe employe : employes) {
            masseSalariale += employe.salaireMensuel();
        }
        return masseSalariale;
    }
    public static void main(String[] args) {
        Employe vendeur = new Vendeur("V001", "Alice", 2000, 50000);
        Employe gerant = new Gerant("G001", "Bob", 3000);
        Employe livreur = new Livreur("L001", "Charlie", 1500, 20);
        Test test = new Test();
        test.employes[0] = vendeur;
        test.employes[1] = gerant;
        test.employes[2] = livreur;
        System.out.println("Masse salariale totale : " + test.calculerMasseSalariale());
        for (Employe employe : test.employes) {
            System.out.println(employe+ ", salaire mensuel : " + employe.salaireMensuel());
        }
        
    }
}
