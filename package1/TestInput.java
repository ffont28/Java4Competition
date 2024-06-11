package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine())
              try (Scanner linea = new Scanner(in.nextLine())) {
                while (linea.hasNext())
                    lista.add(linea.next());
              }
          }

        System.out.println("-------- STAMPO IL CONTENUTO CHE HO LETTO ------------------");
          
        for (String elemento : lista) {
            System.out.println(elemento);
        }


        // qui sotto da 27 a 29 è lo stesso delle linee sopra da 21 a 23
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
