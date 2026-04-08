package com.lab.logica;

import com.lab.data.ArchivoDatos;
import com.lab.entidades.Usuario;
import com.lab.entidades.Acceso;
import java.time.LocalDateTime;

public class ControladorLaboratorio {
    private ArchivoDatos archivo = new ArchivoDatos();

    // Regla: Registrar usuario validando que no existan datos vacíos
    public void registrarNuevoUsuario(String id, String nombre, String rol) throws Exception {
        if (id == null || id.trim().isEmpty() || nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("ERROR: El ID y el Nombre son obligatorios.");
        }
        Usuario nuevo = new Usuario(id, nombre, rol);
        archivo.guardarUsuario(nuevo);
    }

    // Regla: Registrar entrada (aquí se llamará a ArchivoDatos)
    public void registrarEntrada(String idUsuario) throws Exception {
        // En una versión completa, aquí buscaríamos si el ID existe
        Acceso entrada = new Acceso(idUsuario, LocalDateTime.now());
        archivo.registrarAcceso(entrada);
    }
}
