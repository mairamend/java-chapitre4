package chapitre7;

public class Tutu extends Titi {
    int z;
    Tutu(int k, int l, int m){
        super(k,l);
        z = m;
    }
    int ajoute(int a){
        return x + 3 * a;
    }   
    public void moi(){
        super.moi();
        System.out.println(" z = "+z);
    }
    
}
