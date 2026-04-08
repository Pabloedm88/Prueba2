package com.lab.logica;

import com.lab.datos.ArchivoDatos; 
import com.lab.entidades.Usuario;
import com.lab.entidades.Acceso;
import java.time.LocalDateTime;

public class Controlador { 
    private ArchivoDatos archivo = new ArchivoDatos();

    public void registrarNuevoUsuario(String id, String nombre, String rol) throws Exception {
        if (id == null || id.trim().isEmpty() || nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("ERROR: El ID y el Nombre son obligatorios.");
        }
        Usuario nuevo = new Usuario(id, nombre, rol);
        archivo.guardarUsuario(nuevo);
    }

    public void registrarEntrada(String idUsuario) throws Exception {
        Acceso entrada = new Acceso(idUsuario, LocalDateTime.now());
        archivo.registrarAcceso(entrada);
    }
}
