package Ejercicio8;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String fecha = "1 de enero de 2024";
        registrarDatos(fecha);
    }
    public static void registrarDatos(String fecha){
        File fichero = new File("src/Ejercicio8/datos.txt");

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
                leerFichero(fichero);

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void leerFichero(File fichero){
        try(DataInputStream dis = new DataInputStream(new FileInputStream(fichero))){

            String fecha = dis.readUTF();

            System.out.println(fecha);
            //usamos un for del mismo modo que lo hemos usado para introducir los datos ya que en cada iteracion, metemos un entero y un doble, así que en la iteración de leer, sabemos cuantas veces se va a leer un entero y un doble por cada iteración
            for(int i = 0; i < 24; i++){
                String text = String.format("H %d - %.2f˚C",dis.readInt(),dis.readDouble());
                System.out.println(text);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
