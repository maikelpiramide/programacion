package Ejercicio7;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String fecha = "1 de enero de 2024";
        registrarDatos(fecha);
    }
    public static void registrarDatos(String fecha){
        File fichero = new File("src/Ejercicio7/datos.txt");

        try{
            fichero.createNewFile();
            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))){

                dos.writeUTF(fecha);
                //crear random para que en el bucle de 24 horas inserte hora/temperatura
                double random;
                for (int i = 0 ; i < 24; i++){
                    random = Math.random() * 50;
                    dos.writeInt(i);
                    dos.writeDouble(random);
                }


            }catch(Exception ex){
                ex.printStackTrace();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
