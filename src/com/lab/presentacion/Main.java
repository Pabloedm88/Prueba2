package com.lab.presentacion;

import com.lab.proceso.Controlador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controlador logica = new Controlador();
        Scanner sn = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- SISTEMA DE CONTROL DE ACCESO ---");
            System.out.println("1. Registrar Nuevo Usuario");
            System.out.println("2. Registrar Entrada al Laboratorio");
            System.out.println("3. Registrar Salida del Laboratorio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(sn.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.print("ID: "); String id = sn.nextLine();
                        System.out.print("Nombre: "); String nom = sn.nextLine();
                        System.out.print("Rol (Estudiante/Docente): "); String rol = sn.nextLine();
                        logica.registrarNuevoUsuario(id, nom, rol);
                        System.out.println("Usuario registrado con exito.");
                        break;
                    case 2:
                        System.out.print("Ingrese ID para ENTRADA: ");
                        logica.registrarEntrada(sn.nextLine());
                        System.out.println("Entrada registrada.");
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
