package Ejercicio2;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Introduce año"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce mes"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce dia"));
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce horas"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduce minutos"));
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduce segundos"));

        LocalDateTime fecha = LocalDateTime.of(anno,mes,dia,hora,minutos,segundos);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
        JOptionPane.showMessageDialog(null,"la fecha es " + fecha.format(formato));
    }
}
