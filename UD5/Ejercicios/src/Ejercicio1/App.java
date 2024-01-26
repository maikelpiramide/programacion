package Ejercicio1;
import javax.swing.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*Realiza un procedimiento que a partir de un día, mes y año introducido por el teclado,
indique el día de la semana al que corresponde y que fecha será cuando hayan transcurrido 100 días.*/
public class App {
    public static void main(String[] args) {
        int dia =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
        int mes =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));

        LocalDate fecha = LocalDate.of(anno,mes,dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaFormateada = fecha.format(formato);
        String fechaSumada = fecha.plusDays(100).format(formato);


        JOptionPane.showMessageDialog(null,"La fecha insertada es " + fechaFormateada + " y pasados 100 días será el " + fechaSumada);



    }
}
