# Proyecto ex00: Sincronización de Hilos con synchronized en Java

## Descripción del Proyecto
El proyecto **ex00** simula una situación en la que varios hilos acceden a un recurso compartido de manera sincronizada. La palabra clave `synchronized` se utiliza para evitar condiciones de carrera, asegurando que solo un hilo pueda acceder al método sincronizado a la vez.

---

## Estructura del Proyecto
El proyecto contiene tres clases principales:

1. **Clase Principal (`ex00`)**: Contiene el método `main` donde se crean y gestionan las instancias de los hilos.
2. **Clase `VariableCompartida`**: Representa el recurso compartido al que los hilos acceden.
3. **Clase `Hilo`**: Hereda de `Thread` y representa un proceso que se ejecuta en paralelo.

---

## Explicación del Uso de `synchronized`
La palabra clave `synchronized` en Java se utiliza para controlar el acceso a un método o bloque de código por parte de múltiples hilos, asegurando que solo un hilo pueda ejecutarlo a la vez. Esto evita **condiciones de carrera**, donde múltiples hilos acceden y modifican un recurso compartido de manera concurrente, causando resultados inesperados.

### Conceptos Clave
- **Método Sincronizado:**
    - Cuando un método está marcado como `synchronized`, un hilo debe adquirir el bloqueo (lock) del objeto antes de poder ejecutarlo.
    - Si otro hilo intenta acceder al mismo método sincronizado del mismo objeto mientras el primer hilo aún está en ejecución, el segundo hilo se bloqueará hasta que el primer hilo libere el bloqueo.

- **Evitar Condiciones de Carrera:**
    - La sincronización garantiza que solo un hilo a la vez pueda acceder al recurso compartido, evitando modificaciones concurrentes que podrían llevar a resultados incorrectos.

### Uso en `ex00`
En el programa `ex00`, el método `acceso` de la clase `VariableCompartida` está sincronizado. Esto significa que cuando un hilo llama a este método, adquiere el bloqueo del objeto `VariableCompartida` y otros hilos deben esperar hasta que el bloqueo sea liberado.

Los hilos (`hilo_sara` y `hilo_isma`) intentan acceder al método sincronizado `acceso`, pero gracias a `synchronized`, solo uno puede hacerlo a la vez, garantizando un acceso seguro al recurso compartido.

---

## Ejecución del Proyecto

### Compilar:
Compila las clases `ex00`, `VariableCompartida`, y `Hilo`.

### Ejecutar:
Ejecuta la clase `ex00`. El programa iniciará los hilos y gestionará su acceso al recurso compartido utilizando el método sincronizado.
