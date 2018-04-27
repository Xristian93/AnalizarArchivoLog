import java.util.Scanner;
import java.lang.Math;

public class EjercicioR535
{
    public void calcularNumeroDePizzas()
    {
        Scanner entradaEscaner = new Scanner (System.in);
        //Introduce el numero de casos
        int numCasos = Integer.parseInt(entradaEscaner.nextLine());
        if (numCasos <= 100 && numCasos > 0){
            for (int i = 0; i < numCasos; i++){
                //Introduce el numero de personas
                String numPersonas = entradaEscaner.nextLine();
                //Introduce el numero de porciones de cada asistente
                String numPorciones = entradaEscaner.nextLine();
                numPorciones = numPorciones.replace(" ","");
                //Bucle para sumar los diferentes numeros de porciones
                int sumaPorciones = 0;
                for (int x = 0; x < numPorciones.length(); x++){
                    sumaPorciones += Integer.parseInt(numPorciones.substring(x,x+1));
                }
                //Imprime el numero de pizzas necesarias por cada caso
                double numPizzas = (double) sumaPorciones/8;
                numPizzas = Math.ceil(numPizzas);
                int intValor = (int) numPizzas;
                System.out.println("Caso #" + (i+1) + ": " + intValor); 
            }
        }
    }
}