package conPaola;

public class triangologenerico implements figurageometrica{
    private float lato1;
    private float lato2;
    private float lato3;


    public float area() {
        return 0;
    }

    public float area(int a){
        return 5;
    }

    public float area(String a){
        return 10;
    }


    @Override
    public float perimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimetro'");
    }
    
}
