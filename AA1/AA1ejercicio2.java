package Funciones;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class AA1ejercicio2 {
    public static <T> void invertir(Queue<T> cola) {
        Stack<T> pilaAux = new Stack<>();

        while (!cola.isEmpty()) {
            T elemento = cola.poll();
            pilaAux.push(elemento);
        }

        while (!pilaAux.isEmpty()) {
            T elemento = pilaAux.pop();
            cola.offer(elemento);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);
        cola.offer(5);

        System.out.println("Cola original: " + cola);

        invertir(cola);

        System.out.println("Cola invertida: " + cola);
    }
}
