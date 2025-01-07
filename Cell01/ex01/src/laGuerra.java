import java.util.concurrent.Semaphore;

public class laGuerra {
    private Semaphore semaforo;

    public laGuerra(Semaphore semaforo) {
        this.semaforo = semaforo;
    }

    public void entrarGuerra(String nombreProceso) {

        try{
            semaforo.acquire(); //abres el semaforo
            System.out.println(nombreProceso + " esta ejecutandose");

            try {
                System.out.println(nombreProceso + " esta se va a dormir");
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println ("El proceso " + nombreProceso + " fue interrumpido: " + e.getMessage());
            }
        } catch (InterruptedException e){
                System.out.println ("El proceso " + nombreProceso + " fue interrumpido: " + e.getMessage());
        } finally {
            semaforo.release(); //liberamos el semaforo
        }

    }
}

