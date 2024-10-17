package Pruebasejercicio2;
import java.util.Queue;
import java.util.LinkedList;

public class P2 {
    public static <T> void invertir(Queue<T> cola) {
        if (cola.isEmpty()) {
            return;
        }

        T elemento = cola.poll();
        invertir(cola);
        cola.offer(elemento);
    }

    public static void main(String[] args) {
        // Prueba 2: cola vacía
        Queue<Integer> colaVacia = new LinkedList<>();
        System.out.println("Cola original: " + colaVacia);
        invertir(colaVacia);
        System.out.println("Cola invertida: " + colaVacia);
    }
}