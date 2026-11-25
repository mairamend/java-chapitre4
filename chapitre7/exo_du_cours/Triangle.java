public class Triangle extends Forme {

    private double a , b , c;
   
    public Triangle(double a, double b, double c) {
        if( a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Ce triangle est impossible.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double aire() {
        // Using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimetre() {
        return a + b + c;
    }
}

