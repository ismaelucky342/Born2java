# Proyecto ex01: Sincronización de Hilos con Semaphore en Java

## Descripción del Proyecto
El proyecto **ex01** demuestra cómo utilizar la clase `Semaphore` para gestionar la sincronización entre varios hilos en Java. El programa crea dos hilos que acceden de manera controlada a un recurso compartido.

---

## Estructura del Proyecto
El proyecto contiene tres clases principales:

1. **Clase Principal (ex01):** Contiene el método `main` donde se crean y gestionan las instancias de los hilos.
2. **Clase Process:** Hereda de `Thread` y representa un proceso que se ejecuta en paralelo.
3. **Clase laGuerra:** Simula un recurso compartido al que los hilos acceden de manera controlada.

---

## Clases y Métodos

### Clase Principal (ex01)
#### Método `main`:
- Crea una instancia de `Semaphore` con un único permiso, lo que permite que solo un hilo acceda al recurso compartido a la vez.
- Crea dos instancias de la clase `Process`, cada una representando un hilo con un nombre específico.
- Inicia los hilos llamando al método `start`.

---

### Clase Process
#### Atributos:
- `semaforo`: Objeto de la clase `Semaphore` utilizado para controlar el acceso al recurso compartido.
- `nombreProceso`: Nombre del hilo.

#### Constructor:
- Inicializa los atributos `semaforo` y `nombreProceso`.

#### Método `run`:
- Crea una instancia de la clase `laGuerra`, pasando el objeto `Semaphore`.
- Ejecuta un bucle donde cada hilo realiza 5 ejecuciones, invocando el método `entrarGuerra` de la clase `laGuerra` para cada iteración.
- Imprime mensajes en la consola indicando el estado del hilo (inicio y fin de ejecución).

---

### Clase laGuerra
#### Atributos:
- `semaforo`: Objeto de la clase `Semaphore` utilizado para controlar el acceso al recurso compartido.

#### Constructor:
- Inicializa el atributo `semaforo`.

#### Método `entrarGuerra`:
- Intenta adquirir un permiso del semáforo para acceder al recurso compartido.
- Si se adquiere el permiso, simula la entrada a una "guerra" imprimiendo un mensaje en la consola.
- Libera el permiso del semáforo después de un breve retraso, permitiendo que otros hilos accedan al recurso.

---

## Explicación del Uso de Semaphore
La clase `Semaphore` es una herramienta de sincronización utilizada para controlar el acceso a un recurso compartido por múltiples hilos. Un semáforo mantiene un contador de permisos disponibles, y los hilos deben adquirir un permiso antes de acceder al recurso. Si no hay permisos disponibles, el hilo se bloquea hasta que se libere un permiso.

### Conceptos Clave
1. **Inicialización del Semáforo:**
    - El semáforo se inicializa con un número de permisos. En este proyecto, se utiliza un semáforo con un único permiso, lo que significa que solo un hilo puede acceder al recurso compartido a la vez.

2. **Adquisición de Permisos:**
    - Los hilos deben llamar a `semaforo.acquire()` para adquirir un permiso antes de acceder al recurso. Si no hay permisos disponibles, el hilo se bloquea hasta que se libere un permiso.

3. **Liberación de Permisos:**
    - Una vez que el hilo ha terminado de usar el recurso, debe llamar a `semaforo.release()` para liberar el permiso y permitir que otros hilos accedan al recurso.

### Uso en ex01
En el programa **ex01**, se utiliza un semáforo para controlar el acceso de dos hilos (`proceso_sara` y `proceso_isma`) a un recurso compartido simulado por la clase `laGuerra`.

Cada hilo intenta acceder al recurso cinco veces, y el semáforo garantiza que solo un hilo puede acceder al recurso en un momento dado, evitando problemas de sincronización.

---

## Ejecución del Proyecto
### Compilar:
- Compila las clases `ex01`, `Process`, y `laGuerra`.

### Ejecutar:
- Ejecuta la clase `ex01`. El programa iniciará los hilos y gestionará su acceso al recurso compartido utilizando el semáforo.
