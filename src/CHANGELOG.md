# Sistema de Control de Acceso a Laboratorio

### Descripción
Este sistema permite gestionar de manera eficiente el ingreso y salida de usuarios (Estudiantes y Docentes) a un laboratorio técnico, asegurando que se cumplan las normas de permanencia.

### Tecnologías Utilizadas
* **Lenguaje:** Java 17+
* **Persistencia:** Archivos de texto plano (.txt)
* **Arquitectura:** Por capas (N-Tier)
* **Control de Versiones:** Git / GitHub

### Estructura del Proyecto
* `com.lab.entidades`: Definición de objetos de negocio.
* `com.lab.data`: Manejo de lectura y escritura de archivos.
* `com.lab.logic`: Validaciones y reglas de negocio.
* `com.lab.presentation`: Interfaz de usuario por consola.
* 
## [1.0.0] - 2026-04-07
### Añadido
- Inicialización del repositorio en GitHub.
- Creación de la estructura de paquetes `src/com/lab`.
- Implementación de entidades base: `Usuario.java` y `Acceso.java`.
- Creación de archivos de documentación obligatorios.

## [1.1.0] - 2026-04-07
### Añadido
- Creación de la carpeta `datos`.
- Implementación de `ArchivoDatos.java` para manejo de persistencia.
- Métodos para escritura en archivos de texto plano.
