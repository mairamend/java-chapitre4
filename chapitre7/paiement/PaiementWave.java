public class PaiementWave extends PaiementMobile {
    public PaiementWave(long montant, String telephone) { 
        super(montant, telephone); 
    } 
    @Override 
    public String libelleMode() { 
        return "Wave"; 
    } 
    @Override protected long frais() { 
        return montant / 100; 
    }
}
