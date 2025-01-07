
class VariableCompartida {
    public synchronized void acceso(String nameHilo){
        System.out.println(nameHilo + " está usando el recurso.");
        try {
            System.out.println(nameHilo + " se va a dormir");
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            exception.getStackTrace();
        }
        System.out.println(nameHilo + " está saliendo del proceso");
    }
}

class Hilo extends Thread {
    private VariableCompartida casa;

    public Hilo(VariableCompartida casa) { // constructor
        this.casa = casa;
    }

 //   @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            casa.acceso(Thread.currentThread().getName()); // apunta al hilo que se está usando
        }
    }
}

