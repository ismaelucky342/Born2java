# Proyecto ex02: Sincronización de Hilos en Java

## Descripción del Proyecto
El proyecto **ex02** demuestra cómo crear y manejar múltiples hilos en Java, y cómo utilizar el método `join` para sincronizar la ejecución de estos hilos. El programa mide y muestra el tiempo total de ejecución de los hilos.

---

## Estructura del Proyecto
El proyecto contiene dos clases principales:

1. **Clase Principal (`ex02`)**: Contiene el método `main` donde se crean y gestionan las instancias de los hilos.
2. **Clase `Process`**: Hereda de `Thread` y representa un proceso que se ejecuta en paralelo.

---

## Clases y Métodos

### Clase Principal (`ex02`)
#### Método `main`:
- Crea cinco instancias de la clase `Process`, cada una representando un hilo con un nombre específico.
- Inicia cada uno de los hilos.
- Utiliza el método `join` para asegurarse de que todos los hilos terminen su ejecución antes de continuar.
- Mide y muestra el tiempo total de ejecución en milisegundos.

---

### Clase `Process`
#### Atributos:
- `nameProceso`: Nombre del hilo.

#### Constructor:
- Inicializa el nombre del proceso.

#### Método `run`:
- Imprime mensajes en la consola indicando el estado del hilo (en ejecución, durmiendo, y finalizado).
- Simula una pausa de 500 ms utilizando `Thread.sleep`.

---

## Explicación del Método `join`
El método `join` es utilizado para sincronizar la ejecución de hilos. Cuando un hilo llama a `join` en otro hilo, el hilo actual se pausa y espera hasta que el hilo en el que se invocó `join` termine su ejecución.

- Asegura que un hilo específico complete su tarea antes de que el hilo actual continúe su ejecución.

### Uso en `ex02`
En el programa `ex02`, `join` se utiliza para esperar a que cada uno de los hilos (por ejemplo, `proceso_sara`, `proceso_isma`, `proceso_paula`, `proceso_celta`, y `proceso_lucia`) termine su ejecución antes de calcular el tiempo total de ejecución. Esto garantiza que el tiempo mostrado incluye la ejecución de todos los hilos.

---

## Ejecución del Proyecto
### Compilar:
Compila las clases `ex02` y `Process`.

### Ejecutar:
Ejecuta la clase `ex02`. El programa:
1. Iniciará los hilos.
2. Esperará a que todos terminen.
3. Mostrará el tiempo total de ejecución.
