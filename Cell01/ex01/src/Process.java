import java.util.concurrent.Semaphore;

public class Process extends Thread {
    private Semaphore semaforo;
    private String nombreProceso;

    public Process (Semaphore semaforo, String nombreProceso){ //constructor

        this.semaforo = semaforo;
        this.nombreProceso = nombreProceso;
    }

    public void run() {
        laGuerra liarlaParda = new laGuerra(semaforo);
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombreProceso + " esta en la ejecución " + i);
            liarlaParda.entrarGuerra(nombreProceso);
        }
        System.out.println(nombreProceso + " ha terminado.");
    }
}