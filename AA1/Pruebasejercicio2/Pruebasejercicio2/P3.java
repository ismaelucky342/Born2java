package Pruebasejercicio2;
import java.util.Queue;
import java.util.LinkedList;

public class P3 {
    public static <T> void invertir(Queue<T> cola) {
        if (cola.isEmpty()) {
            return;
        }

        T elemento = cola.poll();
        invertir(cola);
        cola.offer(elemento);
    }

    public static void main(String[] args) {
        // Prueba 3: cola de cadenas
        Queue<String> colaCadenas = new LinkedList<>();
        colaCadenas.offer("hola");
        colaCadenas.offer("mundo");
        colaCadenas.offer("!");
        System.out.println("Cola original: " + colaCadenas);
        invertir(colaCadenas);
        System.out.println("Cola invertida: " + colaCadenas);
    }
}