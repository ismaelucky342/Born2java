import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private final int id;
    private final int tiempoVida;
    private final int tiempoComer;
    private final int tiempoDormir;
    private final int numeroComidas;
    private int Contador = 0;
    private final Semaphore[] tenedores;

    //Constructorcillo
    public Philosopher(int id, int tiempoVida, int tiempoComer, int tiempoDormir, int numeroComidas, Semaphore[] tenedores){
        this.id = id;
        this.tiempoVida = tiempoVida;
        this.tiempoComer = tiempoComer;
        this.tiempoDormir = tiempoDormir;
        this.numeroComidas = numeroComidas;
        this.tenedores = tenedores;
    }

    @Override
    public void run(){
    long comienzo = System.currentTimeMillis();

  while(Contador < numeroComidas && (System.currentTimeMillis() - comienzo)  < tiempoVida){

        //pensar con sleep 1000
        System.out.println("[" + System.currentTimeMillis() + "]" + "Filosofo " + id + " esta pensando.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("El Filosofo " + id + " se ha muerto :C ");
        }

        int tenedorIzquierdo = id;
        int tenedorDerecho = (id + 1) % tenedores.length;

        //comer con tiempoComer
        try {
            tenedores[tenedorIzquierdo].acquire();
            tenedores[tenedorDerecho].acquire();
            System.out.println("[" + System.currentTimeMillis() + "]" + "Filosofo " + id + " esta comiendo." );
            Thread.sleep(tiempoComer);
            Contador++;
            tenedores[tenedorIzquierdo].release();
            tenedores[tenedorDerecho].release();
        } catch (InterruptedException e) {
                System.out.println("Filosofo " + id + "no pudo comer");
        }
        //dormir con tiempoDormir
        System.out.println("[" + System.currentTimeMillis() + "]" + "Filosofo " + id + " esta durmiendo.");
        try {
            Thread.sleep(tiempoDormir);
        } catch (InterruptedException e) {}
    }
    System.out.println("Filosofo " + id + " ha terminado.");
    }
}