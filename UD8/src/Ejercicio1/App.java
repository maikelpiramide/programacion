package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de triángulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,150);
        frame.setResizable(false);

        JLabel nivel = new JLabel("base");
        JTextField base = new JTextField(20);
        JLabel nivAltura = new JLabel("Altura");
        JTextField altura = new JTextField(20);
        JButton boton = new JButton("Calcular");
        JLabel resultado = new JLabel("");
        JPanel panel = new JPanel();
        panel.add(nivel);
        panel.add(base);
        panel.add(nivAltura);
        panel.add(altura);
        panel.add(boton);
        panel.add(resultado);
        frame.add(panel);
        frame.setVisible(true);

        boton.addActionListener(new Escuchador(base,altura,resultado));
    }
}
