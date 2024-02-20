package Ejercicio6;
/*
Escribe un método que reciba como argumento el nombre de un fichero de texto (que habrás creado con anterioridad) y convierta a mayúsculas sus caracteres y los vuelque en otro fichero que se pasará como segundo argumento. Utiliza buffering.
*/

import javax.swing.*;
import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;

public class App {
    public static void main(String[] args) {
        String fichero = "src/Ejercicio6/fichero1.txt";
        String ficheroUpper = JOptionPane.showInputDialog("Fichero en el que guardar los datos") ;

        changeUper(fichero,ficheroUpper);

    }
    public static void changeUper(String fichero,String ficheroUpper){

        File file = new File(fichero);
        File fileUpper = new File("src/Ejercicio6/"+ficheroUpper);

        //si se crea el fichero, integramos la lectura de uno y escritura en el creado
        try{
            fileUpper.createNewFile();
            try(BufferedWriter bfw = new BufferedWriter(new FileWriter(fileUpper)) ; BufferedReader bfr = new BufferedReader(new FileReader(file))){

                String texto;
                while ((texto = bfr.readLine()) != null){
                    bfw.write(texto.toUpperCase() + "\n");
                }

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }catch(Exception ex){
           ex.printStackTrace();
        }



    }
}
