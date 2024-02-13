package Ejercicio2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Escribe un programa que contenga un método que reciba por parámetro el nombre de un fichero de texto que contiene varias líneas con un número decimal en cada una de ellas (que habrás creado con anterioridad con un editor de texto plano), y calcula su suma y su media. Incluye el tratamiento de excepciones.*/
public class App {
    public static void main(String[] args) {
        String fichero = "src/Ejercicio2/numeros.txt";

        sumaDigitos(fichero);
    }
    public static void sumaDigitos(String fich){
        int cont = 0;
        int suma = 0;
        double media = 0;
        try{
            FileReader fr = new FileReader(fich);
            BufferedReader bf = new BufferedReader(fr);

            String number = "";
            while((number = bf.readLine()) != null){
                //System.out.println(number);
                cont++;
                int num = Integer.parseInt(number);
                suma += num;
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }
        media = suma / (double)cont;
        System.out.println("Suma: " + suma + " Media:" + media );
    }
}

