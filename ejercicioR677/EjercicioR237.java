class EjercicioR237
{
    public int puntuacionPalabra(String palabra)
    {
        int puntuacion = 0;
        for (int i=0; i<palabra.length(); i++){
            if (palabra.toLowerCase().substring(i,i+1).equals("a") || palabra.toLowerCase().substring(i,i+1).equals("e")
            || palabra.toLowerCase().substring(i,i+1).equals("i") || palabra.toLowerCase().substring(i,i+1).equals("o")
            || palabra.toLowerCase().substring(i,i+1).equals("u") || palabra.toLowerCase().substring(i,i+1).equals("l")
            || palabra.toLowerCase().substring(i,i+1).equals("n") || palabra.toLowerCase().substring(i,i+1).equals("r")
            || palabra.toLowerCase().substring(i,i+1).equals("s") || palabra.toLowerCase().substring(i,i+1).equals("t")){
                puntuacion++;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("d") || palabra.toLowerCase().substring(i,i+1).equals("g")){
                puntuacion = puntuacion + 2;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("b") || palabra.toLowerCase().substring(i,i+1).equals("c")
            || palabra.toLowerCase().substring(i,i+1).equals("m") || palabra.toLowerCase().substring(i,i+1).equals("p")){
                puntuacion = puntuacion + 3;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("f") || palabra.toLowerCase().substring(i,i+1).equals("h")
            || palabra.toLowerCase().substring(i,i+1).equals("v") || palabra.toLowerCase().substring(i,i+1).equals("w")
            || palabra.toLowerCase().substring(i,i+1).equals("y")){
                puntuacion = puntuacion + 4;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("k")){
                puntuacion = puntuacion + 5;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("j") || palabra.toLowerCase().substring(i,i+1).equals("x")){
                puntuacion = puntuacion + 8;
            }
            if (palabra.toLowerCase().substring(i,i+1).equals("q") || palabra.toLowerCase().substring(i,i+1).equals("z")){
                puntuacion = puntuacion + 10;
            }
        }
        return puntuacion;
    }
}