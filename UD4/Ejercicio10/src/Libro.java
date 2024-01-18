public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
