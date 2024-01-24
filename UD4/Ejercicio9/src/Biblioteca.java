public class Biblioteca {
    Libro[] libros;
    public Biblioteca(){
        this.libros = new Libro[10];
    }

    public void meterLibro(Libro libro){
        for (int i = 0 ; i < this.libros.length; i++){
            if (this.libros[i] == null){
                this.libros[i] = libro;
                break;
            }
        }
    }
    public Libro getLibro(int pos){
        return this.libros[pos-1];
    }
}
