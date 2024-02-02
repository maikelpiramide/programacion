package Ejercicio3;

public class Multimedia{
    private String titulo;
    private String autor;
    private String formato;
    private double duracion;
    public Multimedia(String titulo,String autor,String formato,double duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getFormato(){
        return this.formato;
    }
    public double getDuracion(){
        return this.duracion;
    }

    @Override
    public String toString() {
        String text = String.format("data{titulo: %s, autor: %s, formato: %s, duracion: %.2f, ",this.titulo,this.autor,this.formato,this.duracion);
        return text;
    }

}
