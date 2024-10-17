package Pruebasejercicio2;
import java.util.Queue;
import java.util.LinkedList;

public class P4 {
    public static <T> void invertir(Queue<T> cola) {
        if (cola.isEmpty()) {
            return;
        }

        T elemento = cola.poll();
        invertir(cola);
        cola.offer(elemento);
    }

    public static void main(String[] args) {
        // Prueba 4: cola de un solo elemento
        Queue<Integer> colaUnElemento = new LinkedList<>();
        colaUnElemento.offer(1);
        System.out.println("Cola original: " + colaUnElemento);
        invertir(colaUnElemento);
        System.out.println("Cola invertida: " + colaUnElemento);
    }
}