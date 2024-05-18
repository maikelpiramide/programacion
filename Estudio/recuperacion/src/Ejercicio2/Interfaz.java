package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz  extends JFrame {
    public Interfaz(){
        this.setTitle("Dashboard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);

        ArrayList<Producto> productos = new ArrayList<>();

        JTabbedPane tabbedPane = new JTabbedPane();

        //parte de insertar datos
        JPanel setDataPanel = new JPanel();
        setDataPanel.setLayout(new GridLayout(6,2,10,50));
        JLabel codigoBarrasLabel = new JLabel("Codigo de Barras");
        JTextField codigoBarrasValue = new JTextField();

        JLabel nombreLabel = new JLabel("Nombre del producto");
        JTextField nombreValue = new JTextField();

        JLabel materialLabel = new JLabel("Material");
        JTextField materialValue = new JTextField();

        JLabel precioLabel = new JLabel("Percio");
        JTextField precioValue = new JTextField();

        JLabel tallaLabel = new JLabel("Talla");
        JTextField tallaValue = new JTextField();

        JButton guardar = new JButton("Guardar");

        JLabel confirm = new JLabel();

        setDataPanel.add(codigoBarrasLabel);
        setDataPanel.add(codigoBarrasValue);
        setDataPanel.add(nombreLabel);
        setDataPanel.add(nombreValue);
        setDataPanel.add(materialLabel);
        setDataPanel.add(materialValue);
        setDataPanel.add(precioLabel);
        setDataPanel.add(precioValue);
        setDataPanel.add(tallaLabel);
        setDataPanel.add(tallaValue);
        setDataPanel.add(guardar);
        setDataPanel.add(confirm);


        tabbedPane.addTab("Crear producto", setDataPanel);

        //parte de ver datos
        JPanel getDataPanel = new JPanel();
        getDataPanel.setLayout(new BorderLayout());
        JTextArea productosText = new JTextArea();
        productosText.setEditable(false);

        JScrollPane productosScrollPane = new JScrollPane(productosText);
        JButton actualizar = new JButton("Actualizar lista");

        getDataPanel.add(productosScrollPane, BorderLayout.CENTER);
        getDataPanel.add(actualizar,BorderLayout.SOUTH);

        tabbedPane.addTab("Productos", getDataPanel);


        //eventos y ver interfaz

        this.add(tabbedPane);
        this.setVisible(true);

        guardar.addActionListener((e)->{
            Producto producto = new Camiseta(codigoBarrasValue.getText(),nombreValue.getText(),materialValue.getText(),Double.valueOf(precioValue.getText()),tallaValue.getText());
            productos.add(producto);
            confirm.setText("Producto creado y guardado correctamente");
        });

        actualizar.addActionListener((e)->{
           productosText.setText("");
           for(Producto producto: productos){
               productosText.append(producto + "\n");
           }
        });






    }
}
