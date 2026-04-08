package com.lab.datos;

import com.lab.entidades.Usuario;
import com.lab.entidades.Acceso;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoDatos {
    private final String FILE_USUARIOS = "usuarios.txt";
    private final String FILE_ACCESOS = "accesos.txt";

    public void guardarUsuario(Usuario u) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_USUARIOS, true))) {
            bw.write(u.getId() + "," + u.getNombre() + "," + u.getRol());
            bw.newLine();
        }
    }

    // Guarda un registro de entrada o salida
    public void registrarAcceso(Acceso a) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_ACCESOS, true))) {
            String salida = (a.getFechaSalida() != null) ? a.getFechaSalida().toString() : "PENDIENTE";
            bw.write(a.getIdUsuario() + "|" + a.getFechaEntrada() + "|" + salida);
            bw.newLine();
        }
    }

public void mostrarHistorial() throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_ACCESOS))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }
}

    
}
