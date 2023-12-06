import java.util.Scanner;

public class App {
    static Scanner scn = new Scanner(System.in);
    static Zona salaPrincipal = new Zona("salaPrincipal",1000);
    static Zona compraVenta = new Zona("compraVenta", 200);
    static Zona zonaVIP = new Zona("zonaVIP",25);
    public static void main(String[] args) {

        menu();

    }
    public static void menu(){
        int res;
        boolean exit = false;
        do {
            System.out.println("1 - ver numero de entradas disponibles");
            System.out.println("2 - vender entradas");
            System.out.println("3 - salir");
            res = scn.nextInt();
            if (res == 1){
                verEntradas();
            }else if(res == 2){
                venderEntradas();
            }else if(res == 3){
                exit = true;
            }
        }while(!exit);
    }

    public static void verEntradas(){
        System.out.println();
        System.out.println("-------------------------");
        salaPrincipal.verEntradas();
        compraVenta.verEntradas();
        zonaVIP.verEntradas();
        System.out.println("--------------------------");
        System.out.println();
    }
    public static void venderEntradas(){
        int res;
        int num;
        boolean error = false;
        do {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("1 - Sala Principal");
            System.out.println("2 - Sala Compra-Venta");
            System.out.println("3 - Zona VIP");
            System.out.println("4 - Menu inicio");
            res = scn.nextInt();
            System.out.println("---------------------------");
            try {
                if (res == 1) {

                    System.out.println("Ingresa el numero de entradas a vender");
                    num = scn.nextInt();
                    System.out.println("----------------------------------------");
                    salaPrincipal.venderEntradas(num);
                } else if (res == 2) {

                    System.out.println("Ingresa el numero de entradas a vender");
                    num = scn.nextInt();
                    System.out.println("----------------------------------------");
                    compraVenta.venderEntradas(num);
                } else if (res == 3) {

                    System.out.println("Ingresa el numero de entradas a vender");
                    num = scn.nextInt();
                    System.out.println("----------------------------------------");
                    zonaVIP.venderEntradas(num);
                } else if (res == 4) {
                    menu();
                } else{
                    throw new Exception("Ingrese un numero correcto");
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                error = true;
            }
        }while (error);

        
    }
}
