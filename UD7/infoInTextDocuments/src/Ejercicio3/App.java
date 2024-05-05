package Ejercicio3;

public class App {
    public static void main(String[] args) {
        Lector lec = new Lector("src/Ejercicio3/resources/empleados.xml");
        lec.leerFichero();
    }
}
