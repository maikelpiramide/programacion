import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Comparator;
=======
import java.util.TreeSet;
>>>>>>> 8ac3b1f73f0997399a360cee716ef3aad2080975

public class Biblioteca {
    private String nombre;
    private String ciudad;

    private TreeSet<Libro> libros;

    public Biblioteca(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new TreeSet<Libro>(new CompareTitle());
    }

<<<<<<< HEAD
    public void addLirbo(Libro li){
        this.libros.add(li);f
        Comparator comparador = new CompareTitle();
        if(this.libros.get(1) != null){
            for(int i = 0 ; i < this.libros.size(); i++){
                this.libros.sort(comparador.compare(this.libros.get(i),this.libros.get(i+1)));
            }
        }
=======
    public void addLibro(Libro li){
        this.libros.add(li);
>>>>>>> 8ac3b1f73f0997399a360cee716ef3aad2080975
    }
    public void verLibros(){
        for (Libro li:this.libros){
            System.out.println(li);
        }
    }

    public int getNumeroLibros(){
        return this.libros.size();
    }

}
