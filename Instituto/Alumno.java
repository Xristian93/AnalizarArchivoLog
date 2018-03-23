import java.time.LocalDate;

public class Alumno
{
    private String nombre;
    private int nota;
    private LocalDate fechaNacimiento;
    private int id;
    
    
    /**
     * Constructor
     */
    public Alumno(String nombre, int nota, LocalDate fechaNacimiento, int id)
    {
        this.nombre = nombre;
        this.nota = nota;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
    }
    
    /**
     * Metodos setter y getter
     */
    //nombre setter
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.equals("")){
            nombre = nuevoNombre;
        }
    }
    
    //nombre getter
    public String getNombre() {
        return nombre;
    }
    
    //nota setter
    public void setNota(int nota){
        if(nota>=0 && nota<=10){
            this.nota = nota;
        }
    }
    
    //nota getter
    public int getNota(){
        return nota;
    }
    
    //fechaNacimiento setter
    public void fechaNacimiento(LocalDate fechaNacimiento)
    {
        if(fechaNacimiento != null){
            this.fechaNacimiento = fechaNacimiento;
        }
    }
    
    //fechaNacimiento getter
    public LocalDate fechaNacimiento()
    {
        return fechaNacimiento;   
    }
    
    
    //id getter
    public int getId()
    {
        return id;
    }
    
    
    /**
     * Metodo que devuelve los detalles del alumno
     */
    public String toString() {
        String detallesAlumno = "";
        detallesAlumno = "Nombre: " + nombre + ". Nota: " + nota + ". Fecha de nacimiento: " + fechaNacimiento + ". ID: " + id;
        return detallesAlumno;
    }
    
    
    
}