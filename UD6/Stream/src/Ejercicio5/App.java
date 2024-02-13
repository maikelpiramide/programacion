package Ejercicio5;
/*Escribe un programa que pida al usuario una cadena de caracteres y la guarde al revés en un archivo de texto cuyo nombre se pasará como segundo argumento.*/

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Escribe una cadena de caracteres");
        String fichero = JOptionPane.showInputDialog("Escribe el nombre del fichero");
        crearFichero(cadena,fichero);
    }
    public static void crearFichero(String cadena,String fichero){
        File file = new File("src/Ejercicio5/"+fichero);

        try(FileWriter fw = new FileWriter(file)){

            for (int i = cadena.length() -1 ; i >= 0;i--){
                fw.write(cadena.charAt(i));
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
