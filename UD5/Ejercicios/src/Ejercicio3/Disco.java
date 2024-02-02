package Ejercicio3;

public class Disco extends Multimedia {
    private String genero;
    public Disco(String titulo,String autor,String formato,double duracion,String genero){
        super(titulo,autor,formato,duracion);
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    @Override
    public String toString() {
        String text = super.toString() + "genero: " + this.genero + "}";
        return text;

    }
}
