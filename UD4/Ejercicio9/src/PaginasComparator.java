import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro>{

    @Override
    public int compare(Libro l1, Libro l2) {
        return (l1.getPaginas() - l2.getPaginas());
    }
}
