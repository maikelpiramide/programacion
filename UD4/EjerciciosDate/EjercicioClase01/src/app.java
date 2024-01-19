import javax.swing.*;
import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class app {
    public static void main(String[] args) {
        long numdias  = Integer.parseInt(JOptionPane.showInputDialog("numero de dias"));
        long numMeses = Integer.parseInt(JOptionPane.showInputDialog("numero de meses"));
        long numAnnos = Integer.parseInt(JOptionPane.showInputDialog("numero de años"));
        LocalDate fechaNow = LocalDate.now();


        JOptionPane.showMessageDialog(null,fechaNow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String calculo = fechaNow.plusDays(numdias).format(formatter);
        LocalDate prueba = fechaNow.plusDays(numdias).plusMonths(numMeses).plusYears(numAnnos);

        LocalDateTime pruebaTime = prueba.atTime(20,16);
        JOptionPane.showMessageDialog(null,"dias calculo " + pruebaTime);




    }
}
