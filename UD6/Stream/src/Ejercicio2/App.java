package Ejercicio2;

import java.io.*;

/*Escribe un programa que contenga un método que reciba por parámetro el nombre de un fichero de texto que contiene varias líneas con un número decimal en cada una de ellas (que habrás creado con anterioridad con un editor de texto plano), y calcula su suma y su media. Incluye el tratamiento de excepciones.*/
public class App {
    public static void main(String[] args) {
        String file = "src/ejercicio2/numeros.txt";
        sumaDigitos(file);
    }
    public static void sumaDigitos(String fich){
        int cont = 0;
        int suma = 0;
        int media = 0;
        try{
            FileReader fr = new FileReader(fich);
            int read = fr.read();
            while(read != -1){
                read = fr.read();
                char prueba = (char)read;
                String num = String.valueOf(prueba);
                cont++;
                //suma += Integer.parseInt(num);
                System.out.println("numero");
                System.out.println(num);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        media = suma / cont;
        System.out.println("Suma: " + suma + " Media:" + media );
    }
}

