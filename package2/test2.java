package package2;

import package1.Figurageometrica;
import package1.Triangoloequilatero;
import package1.Triangologenerico;

public class test2 {
    public static void main(String[] args) {
        Triangologenerico f = new Triangologenerico(3, 4, 5);
        
        Triangoloequilatero luzzi = new Triangoloequilatero(3);
        Figurageometrica fontana = new Triangologenerico(3, 3, 3);
        
        System.out.println(luzzi.equals(fontana));

        System.out.println(luzzi.perimetro());
    }
}
