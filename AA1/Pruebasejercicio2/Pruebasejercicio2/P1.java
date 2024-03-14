package Pruebasejercicio2;
import java.util.Queue;
import java.util.LinkedList;

public class P1 {
    public static <T> void invertir(Queue<T> cola) {
        if (cola.isEmpty()) {
            return;
        }

        T elemento = cola.poll();
        invertir(cola);
        cola.offer(elemento);
    }

    public static void main(String[] args) {
        // Prueba 1: cola de enteros
        Queue<Integer> colaEnteros = new LinkedList<>();
        colaEnteros.offer(1);
        colaEnteros.offer(2);
        colaEnteros.offer(3);
        System.out.println("Cola original: " + colaEnteros);
        invertir(colaEnteros);
        System.out.println("Cola invertida: " + colaEnteros);
    }
}