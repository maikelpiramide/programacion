package Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Escuchador implements ActionListener {
    private JTextField base;
    private JTextField altura;
    private JLabel resultado;
    Escuchador(JTextField base, JTextField altura,JLabel resultado){
        this.base = base;
        this.altura = altura;
        this.resultado = resultado;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        try{
            double base = Double.parseDouble(this.base.getText());
            double altura = Double.parseDouble(this.altura.getText());
            double respuesta = (base * altura)/2;
            System.out.println(respuesta);
            this.resultado.setText("Area = " + String.valueOf(respuesta));
        }catch(Exception ex){
            this.resultado.setText("<html><span style='color:red;'>Introduce valores corresctos.<br>Como enteros o decimales </span></html>");
        }
    }
}
