package Ejercicio4;

import java.io.FileReader;

/*Escribe un programa que contenga un método que reciba por parámetro el nombre de un fichero de texto (que habrás creado con anterioridad) y lo muestre por pantalla sin espacios en blanco.*/
public class App {
    public static void main(String[] args) {
        String fichero = "src/Ejercicio4/palabras.txt";
        leerFichero(fichero);
    }
    public static void leerFichero(String fichero){

        try(FileReader lector = new FileReader(fichero)){
            int caracter;
            while ((caracter = lector.read()) != -1){
                char car = (char)caracter;
                if(car != ' ' && caracter != -1){
                    System.out.print(car);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
