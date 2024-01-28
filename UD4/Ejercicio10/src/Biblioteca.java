
import java.util.Locale;
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

    public void eliminarLibro(int pos){
        int aux = 0;
        for (Libro li : this.libros) {
            aux++;
            if(aux == pos){
                this.libros.remove(li);
                break;
            }
        }
    }

    public void getLibro(int pos){
        int aux = 0;
        for (Libro li : this.libros) {
            aux++;
            if(aux == pos){
                System.out.println(li);
                break;
            }
        }
    }

    public int buscarLibro(String title){
        String titulo = title.toLowerCase();
        int cont = 0;
        for (Libro li: this.libros){
            cont ++;
            if(li.getTitulo().toLowerCase().contains(titulo)){
                System.out.println(li);
                System.out.print("posicion del libro = " + cont + "\n");
                //return cont;
            }
        }
        return -1;
    }

}
