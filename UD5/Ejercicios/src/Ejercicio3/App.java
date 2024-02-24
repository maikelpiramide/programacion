package Ejercicio3;

import Ejercicio3.Ejercicio5.DiscoPrestable;

public class App {
    public static void main(String[] args) {
        /*ListaMultimedia lista = new ListaMultimedia();
        Disco disco01 = new Disco("disco01","maikel","mp3",3.24,"trap");
        Disco disco02 = new Disco("disco02","pepe","mp3",2.50,"Rock");
        Disco disco03 = new Disco("disco03","manolo","mp3",4.32,"rock");
        Pelicula peli01 = new Pelicula("peli01","maikel","mp4",90.67,null,"albaricoque");
        Pelicula peli02 = new Pelicula("peli02","juan","mp4",90.67,"Manolo",null);
        Pelicula peli03 = new Pelicula("peli03","felisa","mp4",90.67,"maikel",null);
        System.out.println("peliculas");
        System.out.println(peli01);
        System.out.println(peli02);
        System.out.println(peli03);
        System.out.println();
        System.out.println("Discos");
        System.out.println(disco01);
        System.out.println(disco02);
        System.out.println(disco03);

        lista.addItem(disco01);
        lista.addItem(disco02);
        lista.addItem(disco03);
        lista.addItem(peli01);
        lista.addItem(peli02);
        lista.addItem(peli03);

        System.out.println();
        System.out.println("prueba de iterator");
        lista.getItems();
        System.out.println();
        System.out.println("duraciones Acumuladas");
        System.out.println(lista.getDuraciones());
        System.out.println("");
        System.out.println("nuemros de rock");
        System.out.println(lista.getDiscosRock());
        System.out.println();
        System.out.println("peliculas sin actriz");
        System.out.println(lista.getPelisSinActriz());*/

        DiscoPrestable disco1 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable disco2 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable disco3 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable disco4 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable disco5 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable disco6 = new DiscoPrestable("disco1","autor1","mp3",3.45,"disco1");
        DiscoPrestable[] discosPrestables = new DiscoPrestable[3];
        discosPrestables[0] = disco1;
        discosPrestables[1] = disco2;
        discosPrestables[2] = disco3;

        discosPrestables[1].prestar();
        discosPrestables[2].prestar();
        System.out.println(DiscoPrestable.cuentaPrestados());


    }
}
