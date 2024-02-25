package Ejercicio7;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String fecha = "1 de enero de 2024";
        registrarDatos(fecha);
        leerFichero();
    }
    public static void registrarDatos(String fecha){
        File fichero = new File("src/Ejercicio7/datos.txt");

        try{
            fichero.createNewFile();
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))){

                dos.writeUTF(fecha + "\n");
                //crear random para que en el bucle de 24 horas inserte hora/temperatura
                double random;
                for (int i = 0 ; i < 24; i++){
                    random = Math.random() * 50;
                    dos.writeInt(i);
                    dos.writeDouble(random);
                    dos.writeChars("\n");

                }

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void leerFichero(){
        File fichero = new File("src/Ejercicio7/datos.txt");
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fichero))){


            System.out.println("read");
            System.out.println(dis.readUTF());
            int hora;
            double temperatura;
            System.out.println(dis.readInt());
            while ((hora = dis.readInt()) != ){
                System.out.println(dis.readInt());
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
