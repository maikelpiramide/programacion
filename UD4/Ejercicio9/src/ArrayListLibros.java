import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListLibros {
    private String nombre;
    private ArrayList<Libro> libros;
    public ArrayListLibros(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void insertar(Libro li){
        this.libros.add(li);
    }

    public int numLibros(){
        return this.libros.size();
    }

    public void eliminarLibro(int position){
        this.libros.remove(position);
    }

    public String obtenerLibro(int position){
        return this.libros.get(position).toString();
    }

    public int buscarLibro(String titulo){
        for(Libro li : libros){
            if(titulo.equalsIgnoreCase(li.getTitulo())){
                return libros.indexOf(li);
            }
        }
        return -1;
    }

    public void ordenarPorTitulo(){
        TituloComparator tituloComparator = new TituloComparator();
        
        this.libros.sort(tituloComparator);
        for(Libro li : this.libros){
            System.out.println(li);
        }
    }

    public void ordenarPorPaginas(){
        PaginasComparator paginasComparator = new PaginasComparator();
        this.libros.sort(paginasComparator);
        for(Libro li: this.libros){
            System.out.println(li);
        }
    }




}
