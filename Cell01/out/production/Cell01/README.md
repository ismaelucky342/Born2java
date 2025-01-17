# Proyecto mini_philo

## Descripción General

El proyecto **mini_philo** es una simulación del clásico problema de los filósofos comensales. Este problema plantea cómo un grupo de filósofos (representados por hilos) comparte recursos limitados (tenedores) de manera sincronizada para evitar conflictos y condiciones de carrera.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases principales:

- **mini_philo:** Contiene el método principal para inicializar y gestionar la simulación.
- **Philosopher:** Representa a cada filósofo como un hilo, modelando su comportamiento de pensar, comer y dormir.

## Detalles del Código

### Clase mini_philo

#### Método `main`

1. Solicita al usuario los parámetros necesarios para configurar la simulación:
    - Número de filósofos (positivo y menor que 200).
    - Tiempo de vida de los filósofos (positivo).
    - Tiempo para comer (positivo y menor que el tiempo de vida).
    - Tiempo para dormir (positivo y menor que el tiempo de vida).
    - Número de comidas requeridas (positivo).

2. Valida las entradas proporcionadas.
3. Inicializa los recursos compartidos (tenedores) como un arreglo de semáforos.
4. Crea y ejecuta los hilos correspondientes a los filósofos.
5. Espera a que todos los hilos terminen antes de finalizar.

### Clase Philosopher

#### Atributos

- `id`: Identificador único del filósofo.
- `tiempoVida`, `tiempoComer`, `tiempoDormir`, `numeroComidas`: Configuración del filósofo.
- `tenedores`: Semáforos que representan los tenedores compartidos.
- `contador`: Lleva el registro de comidas realizadas por el filósofo.

#### Constructor

Inicializa los atributos del filósofo con los valores proporcionados.

#### Método `run`

Define el comportamiento del filósofo:

1. **Pensar:** Simula el estado de pensamiento por un tiempo fijo.
2. **Comer:**
    - Intenta adquirir los semáforos de los tenedores adyacentes.
    - Si los tenedores están disponibles, incrementa el contador de comidas y libera los semáforos tras comer.
3. **Dormir:** Simula el estado de descanso por un tiempo fijo.
4. Finaliza cuando el filósofo ha completado las comidas requeridas o su tiempo de vida se agota.

## Explicación del Uso de Semáforos

### Inicialización

- Se crea un arreglo de semáforos, cada uno representando un tenedor.
- Cada semáforo se inicializa con un valor de 1, indicando que está disponible.

### Adquisición y Liberación de Semáforos

- **Adquirir:** Los filósofos llaman al método `acquire()` para intentar usar los tenedores.
- **Liberar:** Los filósofos llaman al método `release()` para liberar los tenedores tras comer.

### Gestión de Tenedores

```java
int tenedorDerecho = (id + 1) % tenedores.length;
```
Esta línea calcula el índice del tenedor derecho utilizando el operador módulo para garantizar que el último filósofo también pueda acceder al primer tenedor.

## Uso

### Compilar el Proyecto

1. Abre tu IDE o terminal.
2. Compila las clases `mini_philo` y `Philosopher`.

### Ejecutar el Proyecto

1. Ejecuta la clase `mini_philo`.
2. Proporciona los valores solicitados cuando se te pidan:
    - Número de filósofos.
    - Tiempo de vida.
    - Tiempo para comer.
    - Tiempo para dormir.
    - Número de comidas.

## Conceptos Clave

- **Sincronización con semáforos:**
    - Controla el acceso concurrente a recursos compartidos.
    - Evita condiciones de carrera.

- **Estrategias de asignación:**
    - Cada filósofo necesita dos tenedores para comer.
    - Los tenedores se comparten entre los filósofos de forma eficiente.

## Limitaciones y Mejoras

- El proyecto puede ser optimizado para manejar configuraciones más grandes.
- Se puede implementar un mecanismo para detectar bloqueos y evitarlos.
