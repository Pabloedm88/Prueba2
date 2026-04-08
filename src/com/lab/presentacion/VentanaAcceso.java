package com.lab.presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.lab.proceso.ControladorLaboratorio;

public class VentanaAcceso extends JFrame {
    private Controlador controlador = new Controlador();
    private JTextField txtIdUsuario;
    private JTextArea areaReporte;

    public VentanaAcceso() {
        // 1. Configuración básica de la ventana
        setTitle("Sistema de Control de Acceso");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setLayout(new BorderLayout(10, 10));

        // 2. Panel Superior (Ingreso de datos)
        JPanel panelSuperior = new JPanel(new GridLayout(2, 2, 5, 5));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Registro de Acceso"));
        
        panelSuperior.add(new JLabel(" ID de Usuario:"));
        txtIdUsuario = new JTextField();
        panelSuperior.add(txtIdUsuario);

        JButton btnEntrada = new JButton("Registrar ENTRADA");
        JButton btnSalida = new JButton("Registrar SALIDA");
        panelSuperior.add(btnEntrada);
        panelSuperior.add(btnSalida);

        // 3. Panel Central (Reportes)
        areaReporte = new JTextArea();
        areaReporte.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaReporte);
        scroll.setBorder(BorderFactory.createTitledBorder("Historial de Movimientos"));

        // 4. Acciones de los botones
        btnEntrada.addActionListener(e -> {
            try {
                String id = txtIdUsuario.getText();
                controlador.registrarEntrada(id);
                areaReporte.append("ENTRADA registrada: " + id + "\n");
                txtIdUsuario.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        // Agregar componentes al JFrame
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        // Esto permite ejecutar la ventana directamente
        new VentanaAcceso();
    }
}
