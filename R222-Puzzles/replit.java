import java.lang.Math;
import java.util.Scanner;

public class replit
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class replit
     */
    public replit()
    {

    }

    /**
     * Metodo que obtiene el producto con los numeros mas cercanos de un puzzle que se le pasa por scanner
     */
    public static void calcularDimensiones() {
        Scanner entradaEscaner = new Scanner (System.in);
        //Introduce un numero
        int num = Integer.parseInt(entradaEscaner.nextLine());
        int alto = 0;
        int ancho = 0;
        //Bucle para encontrar el producto con la distancia minima
        while(num != 0){
            for (int i = num/2, j = 1; j < Math.sqrt(num); i--){
                if ((num % i == 0) && (num % j == 0) && (i * j == num)){
                    ancho = i;
                    alto = j;
                }
                if (i == 1){
                    i = num;
                    j++;
                }
            }
            System.out.println(ancho + " " + alto);
            //Introduce otro numero
            num = Integer.parseInt(entradaEscaner.nextLine());
        }
    }
}
