package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro("libro1","libro1",2020);
        Libro libro2 = new Libro("libro2","libro2",1920);
        Revista revista1 = new Revista("revista1","revista1",2000,1234);
        Revista revista2 = new Revista("revista2","revista2",1890,5678);

        ArrayList<Contenido> elementos = new ArrayList<>();
        elementos.add(libro1);
        elementos.add(libro2);
        elementos.add(revista2);
        elementos.add(revista1);
        libro1.prestar();
        libro2.prestar();
        System.out.println("numero de libros prestados: " + cuentaPrestados(elementos));

        System.out.println("numero de publicaciones anteriores a " + 2020 + ": " +  publicacionesAnteriores(elementos,1980 ));

    }
    public static int cuentaPrestados(ArrayList<Contenido> elementos){
        int count = 0;
        Iterator iterador = elementos.iterator();

        for(Contenido co:elementos){
            if(co instanceof Libro)
                if( ((Libro) co).prestado() )
                    count++;
        }

        for(int i = 0 ; i < elementos.size();i++){
            if(iterador.hasNext()){
                System.out.println(iterador.next());
            }
        }

        return count;
    }
    public static int publicacionesAnteriores(ArrayList<Contenido> elementos,int anno){
        int count = 0;
        for (Contenido co:elementos){
            int annoElemento = co.getAnnoPublicacion();
            if(annoElemento < anno)
                count++;
        }
        return count;
    }
}
