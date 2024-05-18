
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {
    private List<String> users;  // Lista para almacenar los usuarios

    public App() {
        users = new ArrayList<>();

        // Configuración de la ventana principal
        setTitle("Aplicación de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear las pestañas
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panel para ingresar datos de usuario
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();
        JButton addButton = new JButton("Agregar Usuario");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(new JLabel());  // Espacio vacío
        inputPanel.add(addButton);

        // Acción del botón para agregar usuario
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameField.getText();
                if (!userName.isEmpty()) {
                    users.add(userName);
                    nameField.setText("");  // Limpiar el campo de texto
                    JOptionPane.showMessageDialog(null, "Usuario agregado: " + userName);
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
                }
            }
        });

        // Panel para mostrar usuarios
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());

        JTextArea userTextArea = new JTextArea();
        userTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(userTextArea);
        displayPanel.add(scrollPane, BorderLayout.CENTER);

        // Botón para actualizar la lista de usuarios
        JButton refreshButton = new JButton("Actualizar Lista");
        displayPanel.add(refreshButton, BorderLayout.SOUTH);

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTextArea.setText("");  // Limpiar el área de texto
                for (String user : users) {
                    userTextArea.append(user + "\n");
                }
            }
        });

        // Añadir los paneles al tabbedPane
        tabbedPane.addTab("Ingresar Datos", inputPanel);
        tabbedPane.addTab("Mostrar Usuarios", displayPanel);

        // Añadir el tabbedPane a la ventana principal
        add(tabbedPane);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}

