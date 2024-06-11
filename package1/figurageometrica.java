package package1;
public interface figurageometrica {

    /**
     * Metodo che restituisce l'area della figura geometrica
     * @return l'area di this
     */
    float area();

    /**
     * Metodo che restituisce il perimetro della figura geometrica
     * @return il perimetro di this
     */
    float perimetro();

    default float cippolo(){
        return area()+perimetro();
    }

}