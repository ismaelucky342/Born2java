
public class ex02 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();

        Process proceso_sara = new Process("hilo_sara");
        Process proceso_isma = new Process("hilo_isma");
        Process proceso_celta = new Process("hilo_celta");
        Process proceso_paula = new Process("hilo_paula");
        Process proceso_lucia = new Process("hilo_lucia");

        proceso_sara.start();  // Iniciamos el hilo
        proceso_isma.start();
        proceso_paula.start();
        proceso_celta.start();
        proceso_lucia.start();

        try {
            proceso_sara.join();
            proceso_isma.join();
            proceso_paula.join();
            proceso_celta.join();
            proceso_lucia.join();
            long end = System.currentTimeMillis();
            System.out.println("Execution time: " + (end - start) + "ms");

        } catch (InterruptedException e){
            System.out.println("El proceso no ha completado su ejecucción");
        }
    }
}
