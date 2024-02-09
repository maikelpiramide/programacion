package Ejercicio1;

import java.io.FileReader;
import java.io.InputStreamReader;

/*Escribe un programa que contenga un método que reciba por parámetro el nombre de un fichero de texto (que habrás creado con anterioridad)
 y cuente las vocales (tanto mayúsculas como minúsculas) que aparecen en él.*/
public class App {
    public static void main(String[] args) {
        String fichero = "C:\\Users\\srill\\Documents\\Clase\\ProgramacionGitHub\\programacion\\UD6\\Stream\\src\\Ejercicio1\\Fichero.txt";
        contarVocales(fichero);
    }
    public static void contarVocales(String fichero){
        int contador = 0;
        try {
            InputStreamReader sr = new FileReader(fichero);
            int content = sr.read();
            while(content != -1){
                content = sr.read();
                char letra = Character.toLowerCase((char)content);
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                    contador += 1;
            }
            System.out.println(contador);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
