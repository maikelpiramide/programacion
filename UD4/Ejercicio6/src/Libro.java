public class Libro {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int paginas;
    private String edicion;
    private String editorial;
    private Lugar lugar;
    private Fecha fechaEdicion;

    public Libro(String titulo,Persona autor, String isbn, int paginas,String edicion,String editorial,Lugar lugar,Fecha fechaEdicion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fechaEdicion = fechaEdicion;
    }

    public void setAutor(Persona autor){
        this.autor = autor;
    }
    public void getAutor(){
        System.out.println("Autor: " + this.autor);
    }
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    public void getISBN(){
        System.out.println("ISBN: " + this.isbn);
    }
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
    public void getEdicion(){
        System.out.println("Edicion: " + this.edicion);
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public void getEditorial(){
        System.out.println("Editorial: " + this.editorial);
    }

    public void getDatos(){
        System.out.printf("titulo: %s\n%s \nAutor: %s \nISBN: %s \n%s, %s\n%d páginas",this.titulo,this.edicion, this.autor, this.isbn, this.lugar,this.fechaEdicion, this.paginas);
    }
    @Override
    public String toString(){
        String texto = " Titulo: " + this.titulo + "\n Autor: " + this.autor + "\n ISBN: " + this.isbn;
        return texto;

    }

}
