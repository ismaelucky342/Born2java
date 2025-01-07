/* Programa que recibe numero de philos, tiempo de vida, para comer, para dormir y numero de comidas
* Numero de filosofos: Validar que sea positivo y menor de 200.
* Tiempo de vida: Validar que sea positivo
* Tiempo de comer: Validar que sea positivo y menor que el tiempo de vida
* Tiempo de dormir: Validar que sea positivo y menor que el tiempo de vida
* Numero de comidas: Validar que sea positivo
*/
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class mini_philo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int aux_tiempoVida = 0;
        int aux_numeroFilosofos = 0;
        int aux_numeroComidas = 0;
        int aux_tiempoDormir = 0;
        int aux_tiempoComer = 0;

        while (true){
            System.out.println("Introduce un numero de filosofos: ");
            int numeroFilosofos = scanner.nextInt();

            if((numeroFilosofos > 0) && (numeroFilosofos < 200)){
                aux_numeroFilosofos = numeroFilosofos;
                break;
            } else {
                System.out.println("Debe ser un numero positivo y menor a 200 ");
            }
        }
        while (true){
            System.out.println("Introduce tiempo de vida: ");
            int tiempoVida = scanner.nextInt();

            if(tiempoVida > 0){
                tiempoVida = aux_tiempoVida;
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }
        while (true){
            System.out.println("Introduce tiempo para comer: ");
            int tiempoComer = scanner.nextInt();

            if((tiempoComer > 0)){
                aux_tiempoComer = tiempoComer;
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }
        while (true){
            System.out.println("Introduce tiempo para dormir: ");
            int tiempoDormir = scanner.nextInt();

            if((tiempoDormir > 0)){
                aux_tiempoDormir = tiempoDormir;
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }

        while (true){
            System.out.println("Introduce un numero de comidas: ");
            int numeroComidas = scanner.nextInt();

            if(numeroComidas > 0){
                aux_numeroComidas = numeroComidas;
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }

        //Semaforo
        Semaphore[] tenedores = new Semaphore[aux_numeroFilosofos];
        for(int i = 0; i  < aux_numeroFilosofos; i++){
            tenedores[i] = new Semaphore(1);
        }
        //crear los filosofos
        Philosopher[] philosopher = new Philosopher[aux_numeroFilosofos];
        for (int i = 0; i < aux_numeroFilosofos; i++) {
            philosopher[i] = new Philosopher(i, aux_tiempoComer, aux_tiempoDormir, aux_tiempoVida, aux_numeroComidas, tenedores);
            philosopher[i].start();
        }

        // Esperar a que todos los filósofos terminen
        for (int i = 0; i < aux_numeroFilosofos; i++) {
            try {
                philosopher[i].join();  // Esperamos a que cada filósofo termine
            } catch (InterruptedException e) {
                System.out.println("ERROR: El programa ha fallado");
            }
        }

        scanner.close(); // Cerrar el escáner después de su uso

    }
}
