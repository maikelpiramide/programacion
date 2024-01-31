public class Alumno {
    Centro centro;
    String dni;
    String nombre;
    String apellido;

    public Alumno(Centro centro,String dni,String nombre,String apellido){
        this.centro = centro;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        return this.dni.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Alumno))
            return false;
        Alumno alu = (Alumno)obj;
        return this.dni.equalsIgnoreCase(alu.dni);
    }

    @Override
    public String toString() {
        String text = String.format("Alumno %s %s del centro %s con dni %s",this.nombre,this.apellido,this.centro,this.dni);
        return text;
    }

}
