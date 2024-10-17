package Pruebasejercicio1;

import java.util.Stack;

public class P2 {
    public static int elementoMaximo(Stack<Integer> stack) throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("La pila está vacía");
        }

        int max = stack.peek();
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int element = stack.pop();
            tempStack.push(element);
            if (element > max) {
                max = element;
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        return max;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        try {
            int max = elementoMaximo(stack);
            System.out.println("El valor máximo es: " + max);
            System.out.println("La pila contiene los siguientes elementos: " + stack);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
