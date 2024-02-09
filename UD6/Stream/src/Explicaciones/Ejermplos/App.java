package Explicaciones.Ejermplos;


import java.io.*;

public class App {
    public static void main(String[] args) {
        leer();
    }
    //metodo para leer el fichero
    public static void leer(){

        //tenemos que meter en un ty el filereader porque lanza una excepción
        try{
            //creamos el lector del fichero
            InputStreamReader fr = new FileReader("C:/Users/srill/Documents/Clase/ProgramacionGitHub/programacion/UD6/Stream/src/Explicaciones/Ejermplos/FicheroPrueba.txt");
            int c = fr.read();
                while(c != -1){
                    c=fr.read();
                    char letra = (char)c;

                    System.out.print(letra);
                }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
