package package1;


import java.util.Scanner;

public class TestInput {
    

    public static void main(String[] args) {
        //List<String> lista_di_parole = new ArrayList<>();

        Figurageometrica figura;
        System.out.println("PRENDO UNA FIGURA E TI DIRò L'AREA");
        System.out.println("QUALE FIGURA GEOMETRICA DESIDERI CREARE? Quadrato, Rettangolo o Triangolo?");
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine())
               try  {
                switch (in.next()) {
                    case "Q":
                        System.out.println("inserisci il lato del quadrato: ");
                        figura = new Quadrato(in.nextFloat());
                        break;
                    case "R":
                        System.out.println("inserisci il lato1 e lato2 del rettangolo: ");
                        figura = new Rettangolo(in.nextFloat(), in.nextFloat());
                        break;
                    default:
                        figura = new Triangoloequilatero(0);

                    
                }

                System.out.println("l'area calcolata è di: ");
                System.out.println(figura.area());

               // if (linea_di_testo.next().equals("ESCI")) break;
               // while (linea_di_testo.hasNext())
               //     lista_di_parole.add(linea_di_testo.next());
              
              } catch (Exception e) {
                // TODO: handle exception
              }

                
          }


        
          

          /*
        System.out.println("-------- STAMPO IL CONTENUTO CHE HO LETTO ------------------");
          
        for (String elemento : lista_di_parole) {
            System.out.println(elemento);
        }

        System.out.println("------- SENZA ITERATORE ---------");
        // qui sotto da 27 a 29 è lo stesso delle linee sopra da 21 a 23
        for (int i = 0; i < lista_di_parole.size(); i++)
            System.out.println(lista_di_parole.get(i));
    */
    
            }
}
