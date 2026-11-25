package interfaces;

public interface Taxable {
    long montantHt();
    default long tva(){
        return  Math.round(montantHt() * 18 / 100.0);
    }
    default String description(){
        return "Montant HT : " + montantHt() + " , TVA : " + tva();
    }

}
