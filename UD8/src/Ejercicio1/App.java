package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de triángulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,300);

        JLabel nivel = new JLabel("Pruebas de texto");


        JButton boton = new JButton("pruebas");
        boton.setBounds(10,10,100,20);
        frame.add(nivel);
        frame.add(boton);
        frame.setVisible(true);
    }
}
