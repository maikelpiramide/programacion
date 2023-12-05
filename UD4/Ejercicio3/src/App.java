import java.util.Scanner;

public class App {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Zona salaPrincipal = new Zona("salaPrincipal",1000);
        Zona compraVenta = new Zona("compraVenta", 200);
        Zona zonaVIP = new Zona("zonaVIP",25);

        salaPrincipal.verEntradas();
        compraVenta.verEntradas();
        zonaVIP.verEntradas();

    }
}
