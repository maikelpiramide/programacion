import java.util.ArrayList;


public class Biblioteca extends CompareTitle {
    private String nombre;
    private String ciudad;

    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new ArrayList<>();
    }

    public void addLirbo(Libro li){
        this.libros.add(li);
    }
}
