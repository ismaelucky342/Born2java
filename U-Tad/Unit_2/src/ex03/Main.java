package ex03;

public class Main {
    public static void main(String[] args) {
        // Usar el constructor por defecto
        Miclase objeto1 = new Miclase();
        System.out.println("Valor inicial con constructor por defecto: " + objeto1.getEntero());

        // Usar el constructor con un entero
        Miclase objeto2 = new Miclase(10);
        System.out.println("Valor inicial con constructor de un entero: " + objeto2.getEntero());

        // Usar el constructor con un double
        Miclase objeto3 = new Miclase(12.5);
        System.out.println("Valor inicial con constructor de un double: " + objeto3.getEntero());

        // Usar el constructor con dos enteros
        Miclase objeto4 = new Miclase(3, 4);
        System.out.println("Valor inicial con constructor de dos enteros: " + objeto4.getEntero());

        // Modificar el valor usando el setter
        objeto1.setEntero(5);
        System.out.println("Valor modificado con setter: " + objeto1.getEntero());
    }
}
