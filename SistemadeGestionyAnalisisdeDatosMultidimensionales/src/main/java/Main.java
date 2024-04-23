
import GestionDatosDinamicos.InterfazUsuarioInteractiva;
import GestionDatosDinamicos.ListaDatos;
import GestionDatosDinamicos.Pareja;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        InterfazUsuarioInteractiva interfaz = new InterfazUsuarioInteractiva();
        interfaz.iniciarInterfaz();

        JFrame frame = new JFrame("Interfaz de Usuario Interactiva");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

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

        JTextField textFieldDato = new JTextField();
        JTextArea textAreaDatos = new JTextArea();

        menuItemAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datoStr = JOptionPane.showInputDialog(panelPrincipal, "Ingrese el dato:");
                if (datoStr != null) {
                    textAreaDatos.append(datoStr + "\n");
                    JOptionPane.showMessageDialog(panelPrincipal, "Dato agregado: " + datoStr, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    textFieldDato.setText("");
                }
            }
        });

        menuItemModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datoModificar = JOptionPane.showInputDialog(panelPrincipal, "Ingrese el dato que desea modificar");
                if (datoModificar != null && !datoModificar.isEmpty()) {
                    String nuevoValor = JOptionPane.showInputDialog(panelPrincipal, "Ingrese el nuevo valor:");
                    if (nuevoValor != null) {
                        String textoActual = textAreaDatos.getText();
                        String nuevoTexto = textoActual.replaceFirst(datoModificar, nuevoValor);
                        textAreaDatos.setText(nuevoValor);
                        JOptionPane.showMessageDialog(panelPrincipal, "Dato modificado: " + nuevoValor, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                          }
                     }
                }
            });

        menuItemEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datoAEliminar = JOptionPane.showInputDialog(panelPrincipal, "Ingrese el dato a eliminar:");
                if (datoAEliminar != null) {
                    textAreaDatos.setText("");
                    JOptionPane.showMessageDialog(panelPrincipal, "Dato eliminado: " + datoAEliminar, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
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

        JPanel panelTextField = new JPanel();
        panelTextField.add(textFieldDato);
        panelComponentes.add(panelTextField);

        panelComponentes.add(textFieldDato);

        JButton buttonAgregarDato = new JButton("Agregar");
        panelComponentes.add(buttonAgregarDato);

         JScrollPane scrollPane = new JScrollPane(textAreaDatos);
         panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
            }
        }