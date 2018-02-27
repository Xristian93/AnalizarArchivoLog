import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
/**
 * Write a description of class AnalizadorAccesosAServidor here.
 *
 * @author (Cristian de la Fuente Garcia)
 * @version (23/02/2018)
 */
public class AnalizadorAccesosAServidor
{
    ArrayList<Acceso> arrayAccesos;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        arrayAccesos = new ArrayList<>();
    }

    /**
     * Este método lee el archivo y lo analiza
     */
    public void analizarArchivoDeLog (String nombreArchivo)
    {
        try {
            File archivo = new File(nombreArchivo);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayStrings = sc.nextLine().split(" ");
                int año = Integer.parseInt(arrayStrings[0]);
                int mes = Integer.parseInt(arrayStrings[1]);
                int dia = Integer.parseInt(arrayStrings[2]);
                int hora = Integer.parseInt(arrayStrings[3]);
                int minutos = Integer.parseInt(arrayStrings[4]);
                arrayAccesos.add(new Acceso(año,mes,dia,hora,minutos));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Este método devuelve la hora a la que se producen mas accesos al servidor.
     * 
     * @param  ninguno
     * @return    la hora a la que se producen mas accesos
     */
    public int obtenerHoraMasAccesos()
    {
        int horaMasAccesos = -1;
        int totalAccesos = 0;
        HashSet<Integer> coleccionHoras = new HashSet<>();
        HashMap<Integer, ArrayList<Acceso>> coleccionMap = new HashMap<>();
        if (arrayAccesos.size() > 0){
            for (Acceso accesoActual : arrayAccesos){
                coleccionHoras.add(accesoActual.getHoraAcceso());
            }
            for (int horaActual : coleccionHoras){
                ArrayList<Acceso> arrayMap = new ArrayList<>();
                for (int i = 0; i < arrayAccesos.size(); i++){
                    if(horaActual == arrayAccesos.get(i).getHoraAcceso()){
                        arrayMap.add(arrayAccesos.get(i));
                    }
                }
                coleccionMap.put(horaActual, arrayMap);
            }
            for (ArrayList<Acceso> accesoActual : coleccionMap.values()){
                if (accesoActual.size() >= totalAccesos && accesoActual.get(0).getHoraAcceso() > horaMasAccesos){
                    horaMasAccesos = accesoActual.get(0).getHoraAcceso();
                    totalAccesos = accesoActual.size();
                }
            }
        }
        return horaMasAccesos;
    }
}
