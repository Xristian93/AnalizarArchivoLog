import java.util.ArrayList;

class EjercicioR677
{
    public ArrayList<String> devolverPalabraMasLarga(ArrayList<String> palabras)
    {
        ArrayList<String> palabraMasLarga = new ArrayList<>();
        int x = 0;
        if (palabras.size() > 0){
            String palabraLarga = palabras.get(0);
            
            for(String palabra: palabras){
                if(palabra.length() >= palabraLarga.length())
                {
                    x = palabra.length();
                    palabraLarga = palabra;
                }
            }
            
            for(String palabra: palabras){
                if(palabra.length() == x)
                {
                    palabraMasLarga.add(palabra);
                }
            }
        }
        return palabraMasLarga;
    }

}