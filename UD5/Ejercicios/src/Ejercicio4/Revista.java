package Ejercicio4;

public class Revista extends Contenido {
    private int numero;
    Revista(String codigo,String titulo,int annoPublicacion,int numero){
        super(codigo,titulo,annoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "numero: " + this.numero;
    }
}
