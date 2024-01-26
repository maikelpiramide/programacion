import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {
    private String nombre;
    private String ciudad;

    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new ArrayList<>();
    }

    public void addLirbo(Libro li){
        this.libros.add(li);f
        Comparator comparador = new CompareTitle();
        if(this.libros.get(1) != null){
            for(int i = 0 ; i < this.libros.size(); i++){
                this.libros.sort(comparador.compare(this.libros.get(i),this.libros.get(i+1)));
            }
        }
    }
}
