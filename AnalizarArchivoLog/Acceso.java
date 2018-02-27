
/**
 * Write a description of class Acceso here.
 *
 * @author (Cristian de la Fuente Garcia)
 * @version (23/02/2018)
 */
public class Acceso
{
    // instance variables - el año, el mes, el dia, la hora y los minutos.
    private int año;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int año, int mes, int dia, int hora, int minutos)
    {
        // initialise instance variables
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora ;
        this.minutos = minutos;
    }

    /**
     * Indica la hora de acceso
     *
     * @param  ninguno
     * @return    la hora de acceso
     */
    public int getHoraAcceso()
    {
        return hora;
    }
}
