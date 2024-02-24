package Ejercicio4;

public class Contenido {
    private String codigo;
    private String titulo;
    private int annoPublicacion;
    Contenido(String codigo,String titulo,int annoPublicacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        String texto = String.format("codigo: %s , titulo: %s , año de publicación: %s ,",this.codigo,this.titulo,this.annoPublicacion);
        return texto;
    }
}
