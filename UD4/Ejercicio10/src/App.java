public class App {
    public static void main(String[] args) {

        Biblioteca biblioteca01 = new Biblioteca("Biblioteca01","Huesca");

        Libro libro01 = new Libro("maikel","maikel",2);
        Libro libro02 = new Libro("maikel","pepa",100);
        Libro libro03 = new Libro("dos","maikel",400);
        Libro libro04 = new Libro("calina","pedro",400);
        Libro libro05 = new Libro("cuatro","pedro",400);

        biblioteca01.addLibro(libro01);f
        biblioteca01.addLibro(libro02);
        biblioteca01.addLibro(libro03);
        biblioteca01.addLibro(libro04);
        biblioteca01.addLibro(libro05);


        biblioteca01.verLibros();



    }
}