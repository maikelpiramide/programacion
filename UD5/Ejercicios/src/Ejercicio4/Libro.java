package Ejercicio4;

public class Libro extends Contenido implements Prestable{
    private boolean prestado;
    Libro(String codigo,String titulo,int annoPublicacion){
        super(codigo,titulo,annoPublicacion);
        this.prestado = false;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        if(this.prestado)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "prestado: " + this.prestado;
    }
}
