import java.util.HashSet;
import java.util.TreeSet;

public class Equipo {
    private String nombre;
    private String emailResponsable;
    private HashSet<Alumno> alumnos;
    public Equipo (String nombre,String emailResponsable){
        this.nombre = nombre;
        this.emailResponsable = emailResponsable;
        this.alumnos = new HashSet<>();
    }
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    public void verEquipo(){
        for(Alumno alu : this.alumnos){
            System.out.println(alu);
        }
    }
}
