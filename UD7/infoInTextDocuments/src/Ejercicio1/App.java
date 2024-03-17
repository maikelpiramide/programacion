package Ejercicio1;
/*
Utilizando expresiones regulares, realiza los siguientes procedimientos para validar strings que se leerán por teclado:
        Validar un número de teléfono nacional sin espacios: ej 974283921
        Validar un número de teléfono internacional: ej (+34)974283921
        Validar un código postal
        Validar una fecha en formato dd/mm/aaaa
        Validar un DNI que pueda contener o no los puntos y el -, y la letra en mayúscula o minúscula
*/

import javax.swing.*;
import java.util.regex.*;
public class App {
    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog(null,"numero de telefono");
        //System.out.println(telefono(res));
        //System.out.println(telefonoInter(res));
        //System.out.println(validarCp(res));
        System.out.println(fecha(res));

    }
    public static boolean telefono(String res){
        Pattern pat = Pattern.compile("[^\s0-9]{9}");
        Matcher mat = pat.matcher(res);
        return mat.matches();
    }
    public static boolean telefonoInter (String res){
        Pattern pat = Pattern.compile("^\\(\\+[0-9]{2}\\)[0-9]{9}$");
        Matcher mat = pat.matcher(res);
        return mat.matches();
    }
    public static boolean validarCp(String res){

        Pattern pat = Pattern.compile("\\d{5}");
        Matcher mat = pat.matcher(res);
        return mat.matches();
    }
    public static boolean fecha(String res){
        Pattern pat = Pattern.compile("\\d{2}\\/\\d{2}\\/\\d{4}");
        Matcher mat = pat.matcher(res);
        return  mat.matches();
    }
}
