package com.lab.entidades;

import java.time.LocalDateTime;

public class AccesoDatos {
    private String idUsuario;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    public AccesoDatos(String idUsuario, LocalDateTime fechaEntrada) {
        this.idUsuario = idUsuario;
        this.fechaEntrada = fechaEntrada;
    }

    // Getters y Setters
    public String getIdUsuario() { return idUsuario; }
    public LocalDateTime getFechaEntrada() { return fechaEntrada; }
    public LocalDateTime getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(LocalDateTime fechaSalida) { this.fechaSalida = fechaSalida; }
}
