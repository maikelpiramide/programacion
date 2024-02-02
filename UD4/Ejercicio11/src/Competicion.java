import java.util.*;
import java.util.Map.Entry;

public class Competicion{
    private String nombre;
    private HashMap<Alumno,Equipo> participantes;
    private TreeSet<Equipo> equiposOrdenados;
    public Competicion(String nombre){
        this.nombre = nombre;
        this.participantes = new HashMap<>();
        this.equiposOrdenados = new TreeSet<>();
    }

    public void addParticipante(Alumno alumno,Equipo equipo){
        this.participantes.put(alumno,equipo);
    }
    public void verSize(){
        System.out.println(this.participantes.size());
    }
    public void verParticipante(Alumno alumno){

        System.out.println(alumno.toString() + this.participantes.get(alumno));

    }
    public void pruebas(){
        Collection<Equipo> prueba = this.participantes.values();
        System.out.println(prueba);

        System.out.println("bucle equipos ordenados");
        this.equiposOrdenados.addAll(this.participantes.values());
        for(Equipo equi:this.equiposOrdenados){
            System.out.println(equi);
            for (Entry<Alumno, Equipo> entry:this.participantes.entrySet()){
                if(entry.getValue() == equi){
                    System.out.println(entry.getKey());
                }
            }
        }

    }

}
