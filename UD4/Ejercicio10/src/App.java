public class App {
    public static void main(String[] args) {

        Biblioteca biblioteca01 = new Biblioteca("Biblioteca01","Huesca");

        Libro libro01 = new Libro("maikel","maikel",2);
        Libro libro02 = new Libro("maikel","pepa",100);
        Libro libro03 = new Libro("dos","maikel",400);
        Libro libro04 = new Libro("calina","pedro",400);
        Libro libro05 = new Libro("Abelardo","pedro",300);

        biblioteca01.addLibro(libro01);
        biblioteca01.addLibro(libro02);
        biblioteca01.addLibro(libro03);
        biblioteca01.addLibro(libro04);
        biblioteca01.addLibro(libro05);


        System.out.println("antes de eliminar");
        System.out.println();
        biblioteca01.verLibros();

        biblioteca01.eliminarLibro(2);
        System.out.println();
        System.out.println("despus de eliminar");
        System.out.println();
        biblioteca01.verLibros();

        System.out.println();
        System.out.println("ver libro position");
        biblioteca01.getLibro(1);

        System.out.println();
        System.out.println("buscar por titulo");
        biblioteca01.buscarLibro("maik");


    }
}