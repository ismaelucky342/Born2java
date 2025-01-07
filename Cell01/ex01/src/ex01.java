// hilo -> memoria compartida
// proceso -> su propio trozo de memoria
// problemas: sincronización, falta de comunicación
import java.util.concurrent.Semaphore;

public class ex01 {
    public static void main(String[] args){

        Semaphore semaforo = new Semaphore(1);

        Process proceso_sara = new Process(semaforo, "proceso_sara"); 
        Process proceso_isma = new Process(semaforo, "proceso_isma"); 

        proceso_sara.start(); 
        proceso_isma.start();
    }
}
