public class App {
    public static void main(String[] args) {

        Biblioteca biblioteca01 = new Biblioteca("Biblioteca01","Huesca");

        Libro libro01 = new Libro("maikel","maikel",2);
        Libro libro02 = new Libro("Aladin","maikel",100);
        Libro libro03 = new Libro("Calina","maikel",400);
        Libro libro04 = new Libro("calina","pedro",400);

        biblioteca01.addLibro(libro01);
        biblioteca01.addLibro(libro02);
        biblioteca01.addLibro(libro03);
        biblioteca01.addLibro(libro04);

        biblioteca01.verLibros();



    }
}