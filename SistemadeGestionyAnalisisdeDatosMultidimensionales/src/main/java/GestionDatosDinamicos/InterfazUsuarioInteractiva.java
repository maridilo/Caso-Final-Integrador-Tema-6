package GestionDatosDinamicos;
import java.io.*;
import java.util.Collections;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;


public class InterfazUsuarioInteractiva {

    private ListaDatos listaDatos;
    private JTextArea textAreaDatos;


    public InterfazUsuarioInteractiva() {
        this.listaDatos = new ListaDatos();
    }

    public void iniciarInterfaz() {
        JFrame frame = new JFrame("Interfaz de Usuario Interactiva");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        textAreaDatos = new JTextArea(20, 40);
        textAreaDatos.setEditable(false);

        // Menú de opciones
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem menuItemAgregar = new JMenuItem("Agregar Dato");
        JMenuItem menuItemModificar = new JMenuItem("Modificar Dato");
        JMenuItem menuItemEliminar = new JMenuItem("Eliminar Dato");
        JMenuItem menuItemOrdenar = new JMenuItem("Ordenar Datos");
        JMenuItem menuItemLimpiar = new JMenuItem("Limpiar Datos");


        // Acciones del menú
        menuItemAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementación para agregar un dato
            }
        });

        // Agregar más acciones para los otros elementos del menú

        menuOpciones.add(menuItemAgregar);
        menuOpciones.add(menuItemModificar);
        menuOpciones.add(menuItemEliminar);
        menuOpciones.add(menuItemOrdenar);
        menuOpciones.add(menuItemLimpiar);
        menuBar.add(menuOpciones);
        frame.setJMenuBar(menuBar);

        // Panel de entrada de datos
        JPanel panelEntrada = new JPanel();
        JTextField textFieldDato = new JTextField(20);
        JButton buttonAgregar = new JButton("Agregar");
        panelEntrada.add(new JLabel("Ingrese un dato:"));
        panelEntrada.add(textFieldDato);
        panelEntrada.add(buttonAgregar);

        // Panel de visualización de datos
        JTextArea textAreaDatos = new JTextArea(20, 40);
        textAreaDatos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaDatos);

        // Implementación del menú de opciones
        menuItemOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaDatos.ordenarDatosReales();
            }
        });

        // Implementación del menú de opciones
        menuItemEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarDato();
            }
        });


        // Evento para agregar un dato
        buttonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = textFieldDato.getText();
                if (!dato.isEmpty()) {
                    listaDatos.agregarDatoReal(dato);
                    actualizarTextArea(textAreaDatos, listaDatos.getListaDatosReales());
                    textFieldDato.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Error: El campo está vacío", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Añadir componentes al frame
        frame.add(panelEntrada, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }


    private void eliminarDato() {
        String datoAEliminar = JOptionPane.showInputDialog(null, "Ingrese el dato a eliminar:");
        if (datoAEliminar != null) {
            listaDatos.eliminarDatoReal(Double.parseDouble(datoAEliminar));
            actualizarTextArea(textAreaDatos, listaDatos.getListaDatosReales());
            JOptionPane.showMessageDialog(null, "Dato eliminado: " + datoAEliminar, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para actualizar el JTextArea con los datos actuales
    private void actualizarTextArea(JTextArea textArea, java.util.List<String> datos) {
        textArea.setText("");
        for (String dato : datos) {
            textArea.append(dato + "\n");
        }
    }

    public static void main(String[] args) {
        InterfazUsuarioInteractiva interfaz = new InterfazUsuarioInteractiva();
        interfaz.iniciarInterfaz();
    }



}
