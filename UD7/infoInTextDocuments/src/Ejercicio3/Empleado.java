package Ejercicio3;

public class Empleado {
    private int id;
    private String apellido;
    private int dep;
    private double salario;

    Empleado(int id, String apellido, int dep, double salario){
        this.id = id;
        this.apellido = apellido;
        this.dep = dep;
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", dep=" + dep +
                ", salario=" + salario +
                '}';
    }
}
