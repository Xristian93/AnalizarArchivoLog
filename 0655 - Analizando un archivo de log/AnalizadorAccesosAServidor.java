import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class AnalizadorAccesosAServidor 
{
    private HashMap<Integer, Integer> numeroAccesosPorHora;
    
    
    /**
     * Constructor
     */
    public AnalizadorAccesosAServidor() 
    {
        numeroAccesosPorHora = new HashMap<>();
    }
    
    
    /* 
     * Analiza un fichero de log con el formato (AAAA MM DD hh mm).
     * @param archivoALeer la ruta, relativa o absoluta, incluyendo la extension del archivo. 
     */
    public void analizarArchivoDeLog(String archivoALeer) 
    {
        numeroAccesosPorHora.clear();
        
        File archivo = new File(archivoALeer);
        try {
            Scanner canalDeEntrada = new Scanner(archivo);
            while(canalDeEntrada.hasNextLine()){
                String linea = canalDeEntrada.nextLine();
                String[] elementos = linea.split(" ");
                int horaAccesoActual = Integer.parseInt(elementos[3]);
                Integer numeroAccesos = numeroAccesosPorHora.get(horaAccesoActual);
                if(numeroAccesos == null) {
                    numeroAccesosPorHora.put(horaAccesoActual,1);
                }
                else {
                    numeroAccesosPorHora.put(horaAccesoActual,numeroAccesos+1);
                }

            }
            canalDeEntrada.close();
        }
        catch (Exception excepcion) {
            System.out.println("Ocurrio algun tipo de problema!");
            
        }
    } 
    
    
    /**
     * Devuelve la hora con mas accesos y la muestra por pantalla.
     * @return Devuelve la hora con mas accesos, si no hay accesos devuelve -1.
     */
    public int obtenerHoraMasAccesos()
    {
        int horaMasAccesos = -1;
        int totalAccesos = 0;
        if (numeroAccesosPorHora.values().size() > 0){
            for (Integer accesoActual : numeroAccesosPorHora.values()){
                if (accesoActual >= totalAccesos && accesoActual.get(0).getHora() > horaMasAccesos){
                    horaMasAccesos = accesoActual.get(0).getHora();
                    totalAccesos = accesoActual.size();
                }
            }
        }
        return horaMasAccesos;
    }
    
    
    
    
    
    
}