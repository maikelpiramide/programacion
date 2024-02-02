public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private String emailResponsable;
    public Equipo (String nombre,String emailResponsable){
        this.nombre = nombre;
        this.emailResponsable = emailResponsable;

    }
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int compareTo(Equipo o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}
