class A {
String nom = "A";
A() { afficher(); }
void afficher() { System.out.println("A.afficher " + nom); }
static void statique() { System.out.println("A.statique"); }
}
class B extends A {
String nom = "B";
B() { super(); afficher(); }
@Override void afficher() { System.out.println("B.afficher " + nom); }
static void statique() { System.out.println("B.statique"); }
}
public class Quiz {
public static void main(String[] args) {
A a = new B();
System.out.println(a.nom);
A.statique();
//((B) a).statique();
}
} 
    

