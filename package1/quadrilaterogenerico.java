package package1;
public class quadrilaterogenerico implements figurageometrica {
    private float l1;
    private float l2;


    public quadrilaterogenerico(){
        
    }

    public quadrilaterogenerico(float lato1, float lato2) {
        l1 = lato1;
        l2 = lato2;

    }

    @Override
    public float area() {
       return l1*l2;
    }

    @Override
    public float perimetro() {
       return 2*(l1+l2);
    }

    @Override
    public String toString() {
        String rest = "";
        rest +=     "il lato l1 misura " + l1 + 
                    "\nil lato l2 misura " + l2 +
                    "\n\n"; 
        return rest;
    }
    
}
