public class App {
    public static void main(String[] args) {
        CD cd1 = new CD();
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Through da storm","poloG");

        cancion1.dameTitulo();
        cancion1.dameAutor();

        cancion2.dameTitulo();
        cancion2.dameAutor();

        cancion1.ponAutor("Pop smoke");
        cancion1.ponTitulo("Dior");


        cd1.numeroCanciones();
        cd1.dameCancion(2);
        cd1.agregaCancion(cancion2);
        cd1.agregaCancion(cancion1);
        cd1.agregaCancion(cancion2);
        cd1.agregaCancion(cancion2);
        cd1.agregaCancion(cancion2);
        cd1.numeroCanciones();
        cd1.dameCancion(1);
        cd1.dameCancion(2);

    }
}
