import java.util.ArrayList;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public ArrayList<String> test()
    {
        EjercicioR677 objeto = new EjercicioR677();
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Adios");
        palabras.add("MuyLarga");
        palabras.add("Corta");
        return objeto.devolverPalabraMasLarga(palabras);
    }
}
