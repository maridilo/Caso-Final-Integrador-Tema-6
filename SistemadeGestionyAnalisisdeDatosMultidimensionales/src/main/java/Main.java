import GestionDatosDinamicos.InterfazUsuarioInteractiva;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        InterfazUsuarioInteractiva interfaz = new InterfazUsuarioInteractiva();

        JFrame frame = new JFrame("Interfaz de Usuario Interactiva");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        frame.add(panelPrincipal);

        // Menú desplegable
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem menuItemAgregar = new JMenuItem("Agregar Dato");
        JMenuItem menuItemModificar = new JMenuItem("Modificar Dato");
        JMenuItem menuItemEliminar = new JMenuItem("Eliminar Dato");
        JMenuItem menuItemOrdenar = new JMenuItem("Ordenar Datos");
        JMenuItem menuItemLimpiar = new JMenuItem("Limpiar Datos");

        menuItemAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar datos
                JOptionPane.showMessageDialog(panelPrincipal, "Función de agregar aún no implementada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        menuItemModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar datos
                JOptionPane.showMessageDialog(panelPrincipal, "Función de modificación aún no implementada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        menuItemEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar datos
                JOptionPane.showMessageDialog(panelPrincipal, "Función de eliminación aún no implementada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        menuItemOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para ordenar datos
                JOptionPane.showMessageDialog(panelPrincipal, "Función de ordenación aún no implementada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        menuItemLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para limpiar datos
                JOptionPane.showMessageDialog(panelPrincipal, "Función de limpieza aún no implementada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        menuOpciones.add(menuItemAgregar);
        menuOpciones.add(menuItemModificar);
        menuOpciones.add(menuItemEliminar);
        menuOpciones.add(menuItemOrdenar);
        menuOpciones.add(menuItemLimpiar);
        menuBar.add(menuOpciones);
        frame.setJMenuBar(menuBar);

        JPanel panelComponentes = new JPanel();
        panelComponentes.setLayout(new GridLayout(6, 1, 5, 5));
        panelPrincipal.add(panelComponentes, BorderLayout.CENTER);

        JLabel labelDato = new JLabel("Ingrese un dato:");
        panelComponentes.add(labelDato);

        JTextField textFieldDato = new JTextField();
        panelComponentes.add(textFieldDato);

        JButton buttonAgregarDato = new JButton("Agregar");
        panelComponentes.add(buttonAgregarDato);

        buttonAgregarDato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = textFieldDato.getText();
                JOptionPane.showMessageDialog(panelPrincipal, "Dato agregado: " + dato, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
