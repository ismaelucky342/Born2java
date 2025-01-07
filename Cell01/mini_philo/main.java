/* Programa que recibe numero de philos, tiempo de vida, para comer, para dormir y numero de comidas
* Numero de filosofos: Validar que sea positivo y menor de 200.
* Tiempo de vida: Validar que sea positivo
* Tiempo de comer: Validar que sea positivo y menor que el tiempo de vida
* Tiempo de dormir: Validar que sea positivo y menor que el tiempo de vida
* Numero de comidas: Validar que sea positivo
*/
import java.util.Scanner;

public class mini_philo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Introduce un numero de filosofos: ");
            int numeroFilosofos = scanner.nextInt();

            if((numeroFilosofos > 0) && (numeroFilosofos < 200)){
                break;
            } else {
                System.out.println("Debe ser un numero positivo y menor a 200 ");
            }
        }

        while (true){
            System.out.println("Introduce tiempo de vida: ");
            int tiempoVida = scanner.nextInt();

            if(tiempoVida > 0){
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }

        while (true){
            System.out.println("Introduce tiempo para comer: ");
            int tiempoComer = scanner.nextInt();

            if((tiempoComer > 0) && (tiempoComer < tiempoVida)){
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }
        while (true){
            System.out.println("Introduce tiempo para dormir: ");
            int tiempoDormir = scanner.nextInt();

            if((tiempoDormir > 0) && (tiempoDormir < tiempoVida)){
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }

        while (true){
            System.out.println("Introduce un numero de comidas: ");
            int numeroComidas = scanner.nextInt();

            if(numeroComidas > 0){
                break;
            } else {
                System.out.println("Debe ser un numero positivo");
            }
        }

//crear los filosofos
        Philosopher[] philosopher = new Philosopher[numeroFilosofos]
        for (int i = 0; i < numeroFilsofos; i++){

        }

    }
}
