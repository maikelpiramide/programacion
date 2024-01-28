

public class Libro implements Comparable<Libro>{
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

    public String getAutor(){
        return this.autor;
    }
    @Override
    public int compareTo(Libro li){
        int compareTitle = this.titulo.compareToIgnoreCase(li.titulo);
        int compareAutor = this.autor.compareToIgnoreCase(li.autor);
        if(compareTitle == 0)
            return this.autor.compareToIgnoreCase(li.autor);

        return compareTitle;
    }

    @Override
    public int hashCode(){

        return this.titulo.hashCode();
    }
    //le pasamos el objeto
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Libro))
            return false;
        Libro libro = (Libro) o;
        return this.titulo.equalsIgnoreCase(libro.titulo) && this.autor.equalsIgnoreCase(libro.autor);
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
