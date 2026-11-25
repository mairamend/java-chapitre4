public abstract class Forme{
    public abstract double aire();
    public abstract double perimetre();
    public void decrie(){
        System.out.println("Aire : " + aire());
        System.out.println("Perimetre : " + perimetre());
    }
}