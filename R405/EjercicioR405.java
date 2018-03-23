import java.util.ArrayList;

class EjercicioR405
{
    public String encontrarPalabraRepetida(ArrayList<String> palabras) 
    {
        String palabraABuscar = null;
        boolean buscando = true;
        int cont = 0;
        int cont2 = 0;
        int vecesRepetida = 0;
        while (buscando && cont < palabras.size()){
            palabraABuscar = palabras.get(cont);
            while (buscando && cont2 < palabras.size()){
                if (palabraABuscar == palabras.get(cont2)){
                    vecesRepetida++;
                    if (vecesRepetida > 1){
                        buscando = false;
                    }
                }
                cont2++;
            }
            cont++;
            cont2 = 0;
            if (vecesRepetida < 2){
                vecesRepetida = 0;
            }
        }
        if (vecesRepetida < 2){
            palabraABuscar = null;
        }
        return palabraABuscar;
    }

    public String encontrarPalabraRepetida2(ArrayList<String> palabras) 
    {
        String palabraRepetida = null;
        int contador1 = 0;
        while (contador1 < palabras.size() && palabraRepetida == null) {
            int contador2 = contador1 + 1;
            while (contador2 < palabras.size() && palabraRepetida == null) {
                if (palabras.get(contador1).equalsIgnoreCase(palabras.get(contador2))) {            
                    palabraRepetida = palabras.get(contador1);
                }            
                contador2++;
            }
            contador1++;
        }
        return palabraRepetida;    
    }

    public String encontrarPalabraRepetida3(ArrayList<String> palabras){
        String palabraDevolver = null;
        while(palabras.size() > 0 && palabraDevolver == null){
            String palabra = palabras.get(0);
            palabras.remove(palabra);
            if (palabras.contains(palabra)){
                palabraDevolver = palabra;
            }
        }
        return palabraDevolver;
    }
}