public abstract class PaiementMobile extends Paiement {
 protected final String telephone; 
 protected PaiementMobile(long montant, String telephone) {
     String t = telephone.replaceAll("\\s", ""); 
     // prologue avant super(...) : Java 25 
     if (!t.matches("7[05678]\\d{7}")) { 
        throw new IllegalArgumentException("Numéro invalide : " + telephone); 
    } 
    super(montant); 
    this.telephone = t; 
}
@Override 
protected void verifier() 
{ 
    System.out.println(" -> code de confirmation envoyé au " + telephone);
 }  

}
    

