import java.util.Scanner;

/*Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro:
título, autor (usa la clase Persona), ISBN, páginas, edición, editorial, lugar (ciudad y país) y fecha de edición (usa la clase Fecha).
La clase debe proporcionar los siguientes servicios: getters y setters, método para leer la información y método para mostrar la información.
 Este último método mostrará la información del libro con el siguiente formato:*/
public class App {
    static Scanner scn = new Scanner(System.in);
    static ArrayListLibros biblioteca = new ArrayListLibros("BB01");
    public static void main(String[] args) {
        Libro libro1 = new Libro("El mono con botas",new Persona("Maikel"),"x-1231234-f",100,"3 edicion","la casa",new Lugar("Huesca","huescounsing"),new Fecha("martes 16 de enero de 1993"));
        Libro libro2 = new Libro("Albin y las ardillas",new Persona("Maikel"),"x-1231234-f",600,"3 edicion","la casa",new Lugar("Huesca","huescounsing"),new Fecha("martes 16 de enero de 1993"));
        Libro libro3 = new Libro("Abelardo",new Persona("Maikel"),"x-1231234-f",520,"3 edicion","la casa",new Lugar("Huesca","huescounsing"),new Fecha("martes 16 de enero de 1993"));

        biblioteca.insertar(libro1);
        biblioteca.insertar(libro2);
        biblioteca.insertar(libro3);

        System.out.println(biblioteca.buscarLibro("Albin y las ardillas"));

        biblioteca.ordenarPorTitulo();
        System.out.println();
        biblioteca.ordenarPorPaginas();

    }

}
