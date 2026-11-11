public class DemoPoint {
    public static void main(String[] args) {
     Point p = new Point();
        p.initialise(2,4);
        p.deplace(3, 1);
        System.out.printf("Coordonnée : (%d , %d)%n",p.getX(),p.getY());
        PointA p1 = new PointA();
     
        p1.initialise(0,1);
        
        p1.deplace(2,5);
        p1.affiche();
         
    
   }
}
