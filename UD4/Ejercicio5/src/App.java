public class App {
    public static void main(String[] args) {
        CD cd1 = new CD();
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Cancion2","poloG");
        Cancion cancion3 = new Cancion("Cancion3","poloG");
        Cancion cancion4 = new Cancion("Cancion4","poloG");
        Cancion cancion5 = new Cancion("Cancion5","poloG");

        cancion1.dameTitulo();
        cancion1.dameAutor();

        cancion2.dameTitulo();
        cancion2.dameAutor();

        cancion1.ponAutor("prueba");
        cancion1.ponTitulo("Cancion1");


        cd1.numeroCanciones();
        cd1.dameCancion(2);
        cd1.agregaCancion(cancion1);
        cd1.agregaCancion(cancion2);
        cd1.agregaCancion(cancion3);
        cd1.agregaCancion(cancion4);
        cd1.agregaCancion(cancion5);
        cd1.numeroCanciones();
        cd1.dameCancion(1);
        cd1.dameCancion(2);
        System.out.println();
        System.out.println("ver canciones 1");
        cd1.verTodasCanciones();
        System.out.println("elimino cancion");
        cd1.elimina(2);
        System.out.println("ver canciones despues de eliminar");
        cd1.verTodasCanciones();
    }
}
