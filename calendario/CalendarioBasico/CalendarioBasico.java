
/**
 * This is a normal calendar
 */
public class CalendarioBasico
{
    // the dia of the calendar
    private int dia;
    // the mes of the calendar
    private int mes;
    // the ano of the calendar
    private int ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    /**
     * Set the calendar date
     */
    public void fijarFecha(int actualdia, int actualmes, int actualano)
    {
        if (actualdia > 0 & actualmes > 0 & actualano >0){
            dia = actualdia;
            mes = actualmes;
            ano = actualano;
        }
        else{
            System.out.println ("You have to input a correct date");
        }
    }

    /**
     * Print calendar date
     */
    public String obtenerFecha()
    {
        String date;
        String diaString;
        String mesString;
        String anoString;
        diaString = String.valueOf(dia);
        mesString = String.valueOf(mes);
        anoString = String.valueOf(ano);
        if (diaString.length() == 1){
            diaString = "0" + diaString;
        }
        if (mesString.length() == 1){
            mesString = "0" + mesString;
        }
        if (anoString.length() == 1){
            anoString = "0" + anoString;
        }
        date = diaString + ("-") + mesString + ("-") + anoString;
        return date;
    }

    /**
     * Advance one dia in the calendar
     */
    public void avanzarFecha()
    {
        if (dia == 30 & mes == 12 & ano == 99){
            dia = 1;
            mes = 1;
            ano = 1;
        }
        else if (dia == 30 & mes == 12){
            dia = 1;
            mes = 1;
            ano += 1;
        }
        else if (dia == 30){
            dia = 1;
            mes += 1;
        }
        else{
            dia += 1;
        }
    }

    /**
     * Get a 8 characters string of the date
     */
    public String getString()
    {
        String date;
        String diaString;
        String mesString;
        String anoString;
        diaString = String.valueOf(dia);
        mesString = String.valueOf(mes);
        anoString = String.valueOf(ano);
        if (diaString.length() == 1){
            diaString = "0" + diaString;
        }
        if (mesString.length() == 1){
            mesString = "0" + mesString;
        }
        if (anoString.length() == 1){
            anoString = "0" + anoString;
        }
        date = diaString + ("-") + mesString + ("-") + ("20") + anoString;
        return date;
    }
}
