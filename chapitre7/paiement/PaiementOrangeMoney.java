public class PaiementOrangeMoney extends PaiementMobile{
    public PaiementOrangeMoney(long montant, String telephone) 
    { 
        super(montant, telephone); 
    } 
    @Override 
    public String libelleMode() 
    { return "Orange Money"; 

    } 
    //  1,5 %, min 100 
    @Override 
    protected long frais() {
         return Math.max(100, montant * 15 / 1000); 
        }
}
