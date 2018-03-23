import java.util.ArrayList;

class EjercicioR399
{
    public String encontrarPalabraConMasAes(ArrayList<String> palabras) 
    {
        String palabraConMasAes = null;
        int cont = 0;
        int numMaxAes = 1;
        while (cont < palabras.size()) {
            int numAes = 0;
            for(int i=0; i < palabras.get(cont).length(); i++) {
                if ((palabras.get(cont).charAt(i) == 'a')){
                    numAes++;
                }
            }
            if(numAes >= numMaxAes){
                numMaxAes = numAes;
                palabraConMasAes = palabras.get(cont);
            }
            cont++;
        }
        return palabraConMasAes;
    }
}