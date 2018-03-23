import java.util.ArrayList;
/**
 * Write a description of class class1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EjercicioR207
{
    // instance variables - replace the example below with your own
    private String x;

    /**
     * Constructor for objects of class class1
     */
    public EjercicioR207()
    {
        // initialise instance variables
        x = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        String palabraADevolver = "";
        int palabraLargaMasCercana = -1;
        int letrasPalabraMasLarga = 0;
        for (String listaActual : palabras){
            if(listaActual.length() >= 0) {
                if (listaActual.length() > palabraLargaMasCercana){
                    palabraLargaMasCercana = listaActual.length();
                    letrasPalabraMasLarga = listaActual.length();
                }                  
            }
        }
        while (letrasPalabraMasLarga > 0){
            for (int i = palabras.size()-1; i>=0; i--){
                if (palabras.get(i).length() == letrasPalabraMasLarga){
                    palabraADevolver += palabras.get(i) + ",";
                }
            }
            letrasPalabraMasLarga--;
        }
        if (palabraADevolver != ""){
            palabraADevolver = palabraADevolver.substring(0,palabraADevolver.length()-1);
        }
        return palabraADevolver;  
    }

    public String devolverEnOrden2(ArrayList<String> palabras)
    {
        String resultado = "";

        while (palabras.size() > 0) {
            String letrasPalabraMasLarga = "";
            int posicionletrasPalabraMasLarga = -1;
            int i = 0;
            while (i < palabras.size()) {
                if (palabras.get(i).length() >= letrasPalabraMasLarga.length()) {
                    letrasPalabraMasLarga = palabras.get(i);
                    posicionletrasPalabraMasLarga = i;
                }
                i++;
            }
            resultado += "," + letrasPalabraMasLarga;
            palabras.remove(posicionletrasPalabraMasLarga);
        }

        if (resultado.length() > 0) {
            resultado = resultado.substring(1, resultado.length());
        }

        System.out.println(resultado);
        return resultado;

    }
    
    public String devolverEnOrden3(ArrayList<String> palabras)
  {
    String aDevolver = "";
    //Repetir tantas veces como elementos tenga "palabras" originalmente
    while(palabras.size() > 0) {
      //Repetir tantas veces como elementos tenga palabras
      //Busco la mayor, la añado a un variable y la borro de la colección
      String palabraMayorLongitud = "";
      for(String palabraActual : palabras) {
        if(palabraActual.length() >=  palabraMayorLongitud.length()){
          palabraMayorLongitud = palabraActual;
        }
      }
      aDevolver += palabraMayorLongitud    ;
      palabras.remove(palabraMayorLongitud);
      if (palabras.size() > 0) {
        aDevolver += ",";
      }
    }
    return aDevolver;
  }
}
