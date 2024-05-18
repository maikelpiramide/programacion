package Prueba01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz extends JFrame {
    public Interfaz() {
        //configuracion basica del frame
        this.setTitle("Prueba01");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);


        //set del panel para el menú
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel setDatos = new JPanel();
        setDatos.setLayout(null);
        JLabel labelSetData = new JLabel("Set Data");
        labelSetData.setBounds(10, 20, 100, 20);
        setDatos.add(labelSetData);

        JPanel getData = new JPanel();
        getData.setLayout(new BorderLayout());
        JLabel labelGetData = new JLabel("Get Data");

        getData.add(labelGetData);

        JTextArea userTextArea = new JTextArea();
        userTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(userTextArea);
        getData.add(scrollPane, BorderLayout.CENTER);


        ArrayList<Integer> listado = new ArrayList<>();
        listado.add(1);
        listado.add(2);
        listado.add(3);
        listado.add(4);
        listado.add(5);
        listado.add(6);
        listado.add(7);
        listado.add(8);
        listado.add(9);
        listado.add(10);
        listado.add(11);
        listado.add(12);
        listado.add(13);
        listado.add(14);
        listado.add(15);
        listado.add(16);
        listado.add(17);
        listado.add(18);
        listado.add(19);
        listado.add(20);

        for (Integer i : listado) {
            userTextArea.append(i + "\n");

        }


        tabbedPane.addTab("SetData", setDatos);
        tabbedPane.addTab("GetData", getData);

        this.add(tabbedPane);
        this.setVisible(true);
    }
}
