package package2;

import package1.figurageometrica;
import package1.triangoloequilatero;
import package1.triangologenerico;

public class test2 {
    public static void main(String[] args) {
        triangologenerico f = new triangologenerico(3, 4, 5);
        
        triangoloequilatero luzzi = new triangoloequilatero(3);
        figurageometrica fontana = new triangologenerico(3, 3, 3);
        
        System.out.println(luzzi.equals(fontana));

        System.out.println(luzzi.perimetro());
    }
}
