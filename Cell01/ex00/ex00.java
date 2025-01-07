//package Cell01;

/*
 * Crear un programa en el 2 hilos intentan entrar a una variable compartida ()
 * usar sincronización para que un hilo pueda acceder al recurso una vez y tenga que finalizar
 * Posibles problemas:
 * starvation: que este colapsado ya de por si y uno nunca pueda ejecutarse
 * condicion de carrera (data race): 2 hilos intententan entrar al recurso a la vez. para evitarlo -- synchronized
 */
class VariableCompartida {
    public synchronized void acceso(String nameHilo){
        System.out.println(nameHilo + "está usando el recurso. ");
        try{
            System.out.println(nameHilo + "se va a dormir");
            Thread.sleep(500);
        } catch (InterruptedException exception){
            exception.getStackTrace(); 
        }
        System.out.println(nameHilo + "esta saliendo del proceso");
    }
}

class Hilo extends Thread {
    private VariableCompartida casa; 

    public Hilo(VariableCompartida casa) { //constructor
        this.casa = casa; 
    }
    public void UsarRecurso() {
        int i = 1; 
        while (i <= 5){
            casa.acceso(Thread.currentThread().getName()); //apunta al hilo que se está usando
            i++;
        }
    }
    
}

public class ex00{
    public static void main(String[] args) {

        VariableCompartida casa = new VariableCompartida();

        Hilo hilo_sara = new Hilo(casa);
        hilo_sara.setName("hilo_sara");

        Hilo hilo_isma = new Hilo(casa);
        hilo_isma.setName("hilo_isma");

        hilo_isma.start(); // start inicia el hilo 
        hilo_sara.start();

    }

}

