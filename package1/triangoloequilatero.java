package package1;

public class triangoloequilatero extends triangologenerico {

    public triangoloequilatero(int lato1) {
        super(lato1, lato1, lato1);
    }
    
    @Override
    public float area() {
        return ( super.l1 * altezza() ) / 2;
    }
    
    private float altezza(){
        return (float) Math.sqrt(Math.pow(super.l1, 2) - Math.pow(super.l1/2, 2));
    }
}
