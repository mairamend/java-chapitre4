public  class Conversions{
    public static void main(String[] args){
        double prixMoyen = 2749.87;
        int arrondiinf = (int) prixMoyen;
        long arrondi = Math.round(prixMoyen);
        System.out.println(arrondiinf + " / " + arrondi);

        int grand = 130; 
        byte petit = (byte) grand;
        System.out.println("130 en byte = " + petit);
        int total = 7 , nbArticles = 2 ;
        System.out.println("7 / 2  = " + (total / nbArticles));
        System.out.println("7 / 2.0 = " + (total / 2.0));
        System.out.println("(double) 7/2 = " + ((double) total / nbArticles));
        System.out.println("(double)(7/2) = " + (double) (total / nbArticles));
    }
}