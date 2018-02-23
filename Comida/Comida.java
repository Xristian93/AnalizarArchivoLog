
/**
 * Write a description of class Comida here.
 *
 * @author (Cristian de la Fuente García)
 * @version (23/02/2018)
 */
public class Comida
{
    // instance variables
    private String nombre;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombre, int calorias)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.calorias = calorias;
    }
    
    /**
     * Metódo que se utiliza para saber el nombre de la comida
     *
     * @param     ninguno
     * @return    devuelve el nombre de la comida.
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Metódo que se utiliza para saber las calorias
     *
     * @param     ninguno
     * @return    devuelve un entero de las calorias de la comida.
     */
    public int getCalorias()
    {
        return calorias;
    }
}
