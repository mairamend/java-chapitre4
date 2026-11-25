package interfaces;

public interface Remisable {
    int tauxRemise();
    default long remise(long montant){
        return Math.round(montant * tauxRemise() / 100.0);
    }
    default String description(){
        return "Taux de remise : " + tauxRemise(); 
    }
}
