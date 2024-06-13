package package1;

public class Quadrato extends Quadrilaterogenerico {
    
    public Quadrato(float lato){
        super(lato, lato);
    }

    @Override
    public float area() {
        return (float) Math.pow(super.l1, 2);
    }

    @Override
    public float perimetro() {
        return super.l2*4;
    }
}
