/*
 * Modela objetos Acceso. 
 * Los objetos Acceso controlan todos los datos relativos a fecha y hora de una conexion al servidor.
 * 
 * @author DAM2017-2018
 * @version 2018/02/28
 */
public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    /*
     * Construye objetos Acceso.
     * @param ano El ano en que se produce el acceso.
     * @param mes El mes en el que se produce el acceso.
     * @param dia El dia en el que se produce el acceso.
     * @param hora La hora en la que se produce el acceso.
     * @param minutos El minuto en el que se produce el acceso.
     */
    public Acceso(int ano, int mes, int dia, int hora, int minutos)
    {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    /*
     * Devuelve el ano en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getAno() 
    {
        return ano;
    }
    
     /*
     * Devuelve el mes en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getMes()
    {
        return mes;
    }
    
     /*
     * Devuelve el dia en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getDia()
    {
        return dia;
    }
    
     /*
     * Devuelve la hora en la que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getHora()
    {
        return hora;
    }
    
     /*
     * Devuelve el minuto en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getMinutos()
    {
        return minutos;
    }    
    
}