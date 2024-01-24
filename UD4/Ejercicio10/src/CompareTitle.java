import java.util.Comparator;

public class CompareTitle implements Comparator<Libro> {

    @Override
    public int compare(Libro li1, Libro li2) {
        return li1.getTitulo().compareToIgnoreCase(li2.getTitulo());
    }
}
