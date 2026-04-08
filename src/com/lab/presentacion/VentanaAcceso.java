package com.lab.presentacion;

import javax.swing.*;
import java.awt.*;
import com.lab.logica.Controlador; // Ajustado a tu carpeta 'logica' y archivo 'Controlador.java'

public class VentanaAcceso extends JFrame {
    private Controlador controlador = new Controlador();
    private JTextField txtIdUsuario;
    private JTextArea areaReporte;

    public VentanaAcceso() {
        setTitle("Sistema de Control de Acceso - Laboratorio");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel de entrada
        JPanel panelSuperior = new JPanel(new GridLayout(2, 2, 5, 5));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Registro"));
        
        panelSuperior.add(new JLabel(" ID Usuario:"));
        txtIdUsuario = new JTextField();
        panelSuperior.add(txtIdUsuario);

        JButton btnEntrada = new JButton("Registrar Entrada");
        panelSuperior.add(btnEntrada);

        // Área de texto para ver qué pasa
        areaReporte = new JTextArea();
        areaReporte.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaReporte);

        // Lógica del botón
        btnEntrada.addActionListener(e -> {
            try {
                String id = txtIdUsuario.getText();
                // Asegúrate que tu clase Controlador tenga el método registrarEntrada
                controlador.registrarEntrada(id); 
                areaReporte.append("EXITO: Entrada registrada para " + id + "\n");
                txtIdUsuario.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaAcceso();
    }
}
