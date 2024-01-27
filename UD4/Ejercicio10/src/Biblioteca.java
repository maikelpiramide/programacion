
import java.util.TreeSet;

public class Biblioteca {
    private String nombre;
    private String ciudad;

    private TreeSet<Libro> libros;

    public Biblioteca(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new TreeSet<>();
    }

    public void addLibro(Libro li){
        this.libros.add(li);
    }
    public void verLibros(){
        for (Libro li :this.libros){
            System.out.println(li);
        }
    }

    public int getNumeroLibros(){
        return this.libros.size();
    }

}
