import java.util.ArrayList;

/**
 * Clase persona.
 *
 * @author (Cristian de la Fuente García)
 * @version (23/02/2018)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean hombre;
    private int pesoKg;
    private int alturaCm;
    private int edad;
    private int caloriasIngeridas;
    private ArrayList<Comida> arrayComidas;

    /**
     * Constructor de la clase persona
     */
    public Persona(String nombre, boolean hombre, int pesoKg, int alturaCm, int edad)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.hombre = hombre;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
        this.edad = edad;
        caloriasIngeridas = 0;
        arrayComidas = new ArrayList<>();
    }

    /**
     * Metódo que se utiliza para dar de comer a la persona 
     *
     * @param     el nombre de la comida a ingerir
     * @return    devuelve un entero de las calorias ingeridas si la persona lo come o -1 en caso de que no la coma.
     */
    public int comer(Comida nombreComida)
    {
        int haComido = -1;
        if (!sobrepasadoMetabolismoBasal()){
            caloriasIngeridas += nombreComida.getCalorias();
            haComido = nombreComida.getCalorias();
            arrayComidas.add(nombreComida);
        }
        return haComido;
    }
    
    /**
     * Metódo que se utiliza para saber las calorias ingeridas de una persona
     *
     * @param     ninguno
     * @return    devuelve un entero de las calorias ingeridas por la persona.
     */
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    /**
     * Metódo que devuelve true si la persona ha sobrepasado su metabolismo basal y no si no lo ha hecho
     *
     * @param     ninguno
     * @return    devuelve un booleano indicando si la persona sobrepasa el metabolismo basal
     */
    public boolean sobrepasadoMetabolismoBasal()
    {
        boolean haSobrepasadoMetabolismo = false;
        int metabolismoBasal = 0; 
        if (hombre){
            metabolismoBasal = (10 * pesoKg) + (6 * alturaCm) + (5 * edad) + 5;
        }
        else{
            metabolismoBasal = (10 * pesoKg) + (6 * alturaCm) + (5 * edad) - 161;
        }
        if (caloriasIngeridas > metabolismoBasal){
            haSobrepasadoMetabolismo = true;
        }
        return haSobrepasadoMetabolismo;
    }
    
    /**
     * Metódo que contesta 
     *
     * @param     la pregunta a la persona
     * @return    devuelve la respuesta de la persona
     */
    public String contestar(String pregunta)
    {
        String respuesta = "NO";
        if (sobrepasadoMetabolismoBasal() || pregunta.contains(nombre)){
            respuesta = pregunta.toUpperCase();
            }
        else if (!sobrepasadoMetabolismoBasal() && (pregunta.length() % 3) == 0){
            respuesta = "SI";
        }
        System.out.println(respuesta);
        return respuesta;
    }
    
    /**
     * Metódo que devuelve la comida mas calorica consumida
     *
     * @param     ninguno
     * @return    devuelve la comida mas calorica consumida
     */
    public String getAlimentoMasCaloricoConsumido()
    {
        String comidaMasCalorica = null;
        ArrayList<Comida> copiaArrayComidas = new ArrayList<>(arrayComidas);
        if (arrayComidas.size() > 0){
            comidaMasCalorica = localizaMayorLoImprimeYLoBorra(copiaArrayComidas);
        }
        return comidaMasCalorica;
    }
    
    /**
     * A partir de un arraylist busca la comida ingerida mas calorica, la imprime y la borra
     */
    public String localizaMayorLoImprimeYLoBorra(ArrayList<Comida> coleccion)
    {
        String comidaMasCalorica = null;
        int posicionComidaMasCalorica = -1;
        int comidaReferencia = 0;

        int posicion = 0;
        for (Comida comida : coleccion){
            if (comida.getCalorias() >= comidaReferencia){
                comidaReferencia = comida.getCalorias();
                comidaMasCalorica = comida.getNombre();
                posicionComidaMasCalorica = posicion;
            }
            posicion++;
        }

        System.out.println(comidaMasCalorica);
        coleccion.remove(posicionComidaMasCalorica);
        return comidaMasCalorica;
    }
}
