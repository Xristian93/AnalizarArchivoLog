
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
        int metabolismoBasal = 0;
        metabolismoBasal = (10 * pesoKg) + (6 * alturaCm) + (5 * edad) + 5;
        if (caloriasIngeridas < metabolismoBasal){
            caloriasIngeridas += nombreComida.getCalorias();
            haComido = nombreComida.getCalorias();
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
}
