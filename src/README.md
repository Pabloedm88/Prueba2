# Prueba #2 #Sistema de Control de Acceso a Laboratorio

### 1. Descripción del Proyecto
Este sistema es una aplicación desarrollada en **Java** utilizando una **arquitectura por capas**. Su objetivo es gestionar el registro de usuarios (Estudiantes y Docentes) y controlar sus tiempos de entrada y salida de un laboratorio técnico, asegurando que se cumplan las reglas de permanencia.

### 2. Requerimientos Funcionales Implementados
* **Gestión de Usuarios:** Registro de ID, Nombre y Rol.
* **Registro de Accesos:** Captura de fecha y hora de entrada y salida.
* **Persistencia:** Almacenamiento de datos en archivos `.txt` (`usuarios.txt` y `accesos.txt`).
* **Reportes:** Visualización del historial de movimientos.

### 3. Estructura del Proyecto (Arquitectura)
El proyecto sigue una estructura de 4 capas para separar responsabilidades:
* **`com.lab.entidades`**: Contiene las clases de datos (`Usuario`, `Acceso`).
* **`com.lab.datos`**: Maneja la lectura y escritura de archivos de texto.
* **`com.lab.proceso`**: Contiene la lógica de negocio y validaciones.
* **`com.lab.presentacion`**: Interfaz de usuario por consola (`Main`).

### 4. Tecnologías Utilizadas
* **Lenguaje:** Java 17+
* **IDE:** VS Code / GitHub Web
* **Control de Versiones:** Git & GitHub

### 5. Cómo Ejecutar el Proyecto
1. Clonar el repositorio o descargar el código.
2. Compilar los archivos `.java` desde la carpeta `src`.
3. Ejecutar la clase `Main.java` ubicada en el paquete de presentación.

### 6. Diagrama de Arquitectura
![Diagrama de Capas](diagrama.png)

###7. Se puede ejecutar la interfaz grafica.
