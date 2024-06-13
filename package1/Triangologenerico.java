package package1;
import java.util.Objects;

public class Triangologenerico implements Figurageometrica {
    protected int l1;
     int l2;
    public int l3;

    public Triangologenerico(int lato1, int lato2, int lato3){
        l1 = lato1;
        l2 = lato2;
        l3 = lato3;

    }

    public int getlato1(){
        return l1;
    }

    public int getlato2(){
        return l2;
    }

    public int getlato3(){
        return l3;
    }


    @Override
    public float area() {
        return (float) Math.sqrt(semip()*(semip()-l1)*(semip()-l2)*(semip()-l3));
    }

    private float semip(){
        return perimetro()/2;
    }

    @Override
    public float perimetro() {
        return l1+l2+l3;
    }

    @Override
    public boolean equals(Object obj) {
        Objects.requireNonNull(obj, "Non puoi passare un oggetto nullo da confrontare");
        if (!(obj instanceof Triangologenerico)) return false;
        Triangologenerico temp = (Triangologenerico) obj;
        if (l1==temp.getlato1() && l2==temp.getlato2() && l3==temp.getlato3()) return true;
        else return false;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("Sono un triangologenerico");
        result.append(" e ho i tre lati che misurano: ");
        result.append(l1).append(l2).append(l3);
        return result.toString();
    }
    
}
