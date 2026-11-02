package chapitre7;

public class Toto {
  int x;
  Toto(int k){
    x = k;

  }
  int ajoute(int a){
    return x + a;
  }
  public void moi(){
    System.out.println("x = "+x);
  }
}
