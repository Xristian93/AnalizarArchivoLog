import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

public class Instituto
{
    private ArrayList<Alumno> listaAlumnos;
    // El ultimo idetificador de alumno adjudicado.
    private int idActual;

    /**
     * Constructor
     */
    public Instituto()
    {
        idActual = 0; 
        listaAlumnos = new ArrayList<Alumno>();
    }

    /**
     * Constructor que lee los datos del un archivo
     */
    public Instituto(String nombreArchivoALeer)
    {
        this();

        try {
            File archivo = new File(nombreArchivoALeer);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] arrayDeString = linea.split(" # ");
                agregarAlumno(arrayDeString[0], Integer.parseInt(arrayDeString[1]), arrayDeString[2]);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    
    /**
     * Agrega un nuevo alumno al instituto.
     * El metodo se encarga de anadir un id unico a cada nuevo alumno.
     * @param fechaNacimiento La fecha de nacimiento en formato [aaaa-mm-dd].
     */
    public void agregarAlumno(String nombre, int nota, String fechaNacimiento)
    {
        listaAlumnos.add(new Alumno(nombre, nota, LocalDate.parse(fechaNacimiento), idActual));
        idActual++;
    }

    /**
     * Muestra un listado de los alumnos
     */
    public void mostrarListadoAlumnos()
    {
        for (Alumno alumnoActual : listaAlumnos){
            System.out.println(alumnoActual);
        }
    }

    /**
     * Modifica la nota del alumno indicado por su id.
     */
    public void cambiarNota(int id, int nota)
    {
        int contador = 0;
        boolean seCambioLaNota = false;
        while(contador < listaAlumnos.size() && !seCambioLaNota) {
            if(listaAlumnos.get(contador).getId() == id){
                listaAlumnos.get(contador).setNota(nota);
                seCambioLaNota = true;
            }
            contador++;
        }

    }

    /**
     * Permite eliminar los alumnos que tienen menos de un 5 en la nota
     */
    public void eliminarAlumnosSuspensos()
    {
        Iterator<Alumno> it = listaAlumnos.iterator(); 
        while(it.hasNext()){
            Alumno alumnoActual = it.next();
            if(alumnoActual.getNota() < 5){
                it.remove();    
            }
        }
    }

    /**
     * A partir de un arraylist busca el mayor objeto, lo imprime y lo devuelve sin ese elemento
     */
    public ArrayList<Alumno> localizaMayorLoImprimeYLoBorra(ArrayList<Alumno> coleccion)
    {
        Alumno alumnoConMayorNota = null;
        int posicionAlumnoConMayorNota = -1;
        int notaReferencia = 0;

        int posicion = 0;
        for (Alumno alumno : listaAlumnos){
            if (alumno.getNota() >= notaReferencia){
                notaReferencia = alumno.getNota();
                alumnoConMayorNota = alumno;
                posicionAlumnoConMayorNota = posicion;
            }
            posicion++;
        }

        System.out.println(alumnoConMayorNota);
        coleccion.remove(posicionAlumnoConMayorNota);
        return coleccion;
    }

    /**
     * Muestra los alumnos ordenados por nota
     */
    public void mostrarAlumnosPorNota()
    {
        ArrayList<Alumno> copiaListadoAlumnos = new ArrayList(listaAlumnos);

        while (copiaListadoAlumnos.size() > 0) {
            copiaListadoAlumnos = localizaMayorLoImprimeYLoBorra(copiaListadoAlumnos);
        }
    }

    /**
     * Muestra los alumnos agrupados por nota (version HashSet)
     */
    public void mostrarAlumnosAgrupadosPorNota()
    {
        HashSet<Integer> notasExistentes = new HashSet<>();
        for(Alumno alumno : listaAlumnos) {
            notasExistentes.add(alumno.getNota());
        }
        for(Integer nota: notasExistentes){
            System.out.println(nota + ":");
            for(int i=0; i < listaAlumnos.size(); i++){
                Alumno alumnoActual = listaAlumnos.get(i);
                if(alumnoActual.getNota() == nota) {
                    System.out.println(alumnoActual);
                }
            }
            System.out.println("");
        }
    }

    /**
     * Muestra los alumnos agrupados por nota (version HashMap)
     */
    public void mostrarAlumnosAgrupadosPorNotaV2()
    {
        HashMap<Integer, ArrayList<Alumno>> mapa = new HashMap<>();
        for (Alumno alumnoActual : listaAlumnos){
            int notaAlumnoActual = alumnoActual.getNota();
            if(mapa.containsKey(notaAlumnoActual)){
                // El mapa ya tiene la nota actual como clave
                mapa.get(notaAlumnoActual).add(alumnoActual);
            }
            else {
                //El mapa no contiene la nota actual como clave
                ArrayList<Alumno> nuevoArray = new ArrayList<>();
                nuevoArray.add(alumnoActual); 
                mapa.put(notaAlumnoActual, nuevoArray);
            }
        }
        for(Integer nota : mapa.keySet()){
            System.out.println(nota + ":");
            for(Alumno alumno : mapa.get(nota)){
                System.out.println(alumno);
            }
        } 
    }

    /**
     * Muestra los alumnos agrupados por nota y ordenados en cada agrupación por nombre con la clase collections y comparator
     */
    public void mostrarAlumnosAgrupadosPorNotaV3(){
        Collections.sort(listaAlumnos, new Comparator<Alumno>(){
                public int compare(Alumno alumno1, Alumno alumno2){
                    return alumno1.getNombre().compareTo(alumno2.getNombre());
                }
            });
        mostrarAlumnosAgrupadosPorNota();
    }
}
