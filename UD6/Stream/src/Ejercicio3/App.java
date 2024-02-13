package Ejercicio3;
/*Escribe programa que contenga un método que reciba por parámetro el nombre de un fichero de texto (que habrás creado con anterioridad) y cuente el número de palabras que contiene.*/


import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        String fichero = "src/Ejercicio3/palabras.txt";
        leerPalabras(fichero);
    }
    public static void leerPalabras(String fichero) {
        int cont = 0;
        try (FileReader reader = new FileReader(fichero)) {

            int text;
            while ((text = reader.read()) != -1) {
                char caracter = (char) text;
                if (caracter != ' ' && text != -1)
                    cont++;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("El numero de palabras es " + cont);
    }
}
