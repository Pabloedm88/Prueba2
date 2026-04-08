# Registro de Uso de Inteligencia Artificial

### 1. Prompts (Instrucciones) Utilizados
* **Diseño:** "Diseñar una arquitectura de 4 capas (Entidades, Datos, Proceso y Presentación) para un sistema de control de acceso en Java."
* **Estructura:** "Generar las clases POJO para Usuario (ID, nombre, rol) y Acceso (ID, entrada, salida)."
* **Persistencia:** "¿Cómo escribir en un archivo .txt en Java sin borrar el contenido anterior usando BufferedWriter?"
* **Lógica:** "Crear un menú de consola con switch-case que conecte la capa de presentación con la de lógica."

### 2. Qué parte resolvió la IA
* **Arquitectura:** La IA sugirió la separación de carpetas y responsabilidades para cumplir con el estándar de capas solicitado.
* **Código Base:** Generó la estructura inicial de los modelos (Getters/Setters) y los métodos básicos de escritura de archivos.
* **Validaciones:** Proporcionó ejemplos de cómo validar campos vacíos y manejar excepciones con `try-catch`.

### 3. Ajustes realizados manualmente (Muy importante)
* **Nomenclatura:** Se cambiaron los nombres de las carpetas de inglés (`logic`) a español (`proceso`) para adaptarlo a la preferencia del proyecto.
* **Personalización:** Se ajustó el formato de guardado en los archivos `.txt` usando separadores específicos (`|` y `,`) para evitar redundancia.
* **Manejo de Fechas:** Se configuró manualmente el uso de `LocalDateTime` para asegurar que las marcas de tiempo fueran precisas.

4.Se solicita ayuda para crear interfaz grafica.
