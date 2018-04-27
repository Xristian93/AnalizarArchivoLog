import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * Write a description of class EscribirArchivo here.
 *
 * @author (Cristian de la Fuente)
 * @version (27/04/2018)
 */
public class EscribirArchivo
{

    /**
     * Constructor for objects of class EscribirArchivo
     */
    public EscribirArchivo()
    {

    }

    /**
     * Metodo para escribir en un archivo de texto
     */
    public void escribirArchivo()
    {
        Scanner entradaEscaner = new Scanner (System.in);
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("archivo.txt");
            //Escribimos la primera linea del archivo
            String entradaTexto = entradaEscaner.nextLine();
            
            // Escribimos linea a linea en el fichero, finaliza al escribir #
            while (!entradaTexto.equals("#")) {
                fichero.write(entradaTexto + "\r\n");
                entradaTexto = entradaEscaner.nextLine();
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
