import java.util.Scanner;

/*Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro:
título, autor (usa la clase Persona), ISBN, páginas, edición, editorial, lugar (ciudad y país) y fecha de edición (usa la clase Fecha).
La clase debe proporcionar los siguientes servicios: getters y setters, método para leer la información y método para mostrar la información.
 Este último método mostrará la información del libro con el siguiente formato:*/
public class App {
    static Scanner scn = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {
        //Libro libro1 = new Libro("El mono con botas",new Persona("Maikel"),"x-1231234-f",100,"3 edicion","la casa",new Lugar("Huesca","huescounsing"),new Fecha("martes 16 de enero de 1993"));
        //libro1.getDatos();

        menu();
    }
    public static void menu(){
        int res;
        boolean aux = true;
        do {
            System.out.println("1 - Introducir nuevo libro");
            System.out.println("2 - ver informacion de libro");
            System.out.println("3 - salir");
            res = scn.nextInt();
            if (res == 1) {
                introducirLibro();
            } else if (res == 2) {
                int pos;
                System.out.println("posicion del libro");
                pos = scn.nextInt();
                //String limpiaScanner = scn.nextLine();
                verInfoLibro(pos);
            } else {
                aux = false;
            }
        }while(aux);
    }

    public static void introducirLibro(){
        String titulo;
        Persona autor;
        String isbn;
        int paginas;
        String edicion;
        String editorial;
        Lugar lugar;
        Fecha fechaEdicion;

        System.out.println("Titulo");
        String limpiarScanner = scn.nextLine();
        titulo = scn.nextLine();
        System.out.println("Autor");
        autor = new Persona(scn.nextLine());
        System.out.println("ISBN");
        isbn = scn.nextLine();
        System.out.println("Numero de paginas");
        paginas = scn.nextInt();
        String limpieza = scn.nextLine();
        System.out.println("Edicion");
        edicion = scn.nextLine();
        System.out.println("Editorial");
        editorial = scn.nextLine();
        System.out.println("Pais");
        String auxLugar = scn.nextLine();
        System.out.println("Ciudad");
        String auxLugar2 = scn.nextLine();
        lugar = new Lugar(auxLugar,auxLugar2);
        System.out.println("Fecha formato: 'lunes 16 de marzo de 2023'");
        fechaEdicion = new Fecha(scn.nextLine());
        Libro libroNuevo = new Libro(titulo,autor,isbn,paginas,edicion,editorial,lugar,fechaEdicion);
        biblioteca.meterLibro(libroNuevo);
    }
    public static void verInfoLibro(int pos){
        Libro librover = biblioteca.getLibro(pos);
        librover.getDatos();
        System.out.println();
    }

}
