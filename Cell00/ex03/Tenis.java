package bonr2java.Cell00.ex03;

public class Tenis {
    private int puntosP1 = 0;
    private int puntosP2 = 0;

    private String[] puntuaciones = {"Love", "15", "30", "40"};
    private boolean ventajaP1 = false;
    private boolean ventajaP2 = false;

    public void puntoPara(String jugador) {
        
        if (jugador.equals("P1")) {
            if (ventajaP2) {
                ventajaP2 = false;
            } else if (puntosP1 == 3 && puntosP2 == 3) {
                ventajaP1 = true;
            } else if (ventajaP1) {
                System.out.println("Ha ganado el P1");
                reset();
            } else {
                puntosP1++;
            }
        } else if (jugador.equals("P2")) {
            if (ventajaP1) {
                ventajaP1 = false;
            } else if (puntosP1 == 3 && puntosP2 == 3) {
                ventajaP2 = true;
            } else if (ventajaP2) {
                System.out.println("Ha ganado el P2");
                reset();
            } else {
                puntosP2++;
            }
        }
        mostrarPuntuacion();
    }

    private void mostrarPuntuacion() {
        if (puntosP1 >= 3 && puntosP2 >= 3) {
            if (ventajaP1) {
                System.out.println("Ventaja P1");
            } else if (ventajaP2) {
                System.out.println("Ventaja P2");
            } else if (puntosP1 == puntosP2) {
                System.out.println("Deuce");
            } else {
                System.out.println(puntuaciones[puntosP1] + " - " + puntuaciones[puntosP2]);
            }
        } else {
            System.out.println(puntuaciones[puntosP1] + " - " + puntuaciones[puntosP2]);
        }
    }

    private void reset() {
        puntosP1 = 0;
        puntosP2 = 0;
        ventajaP1 = false;
        ventajaP2 = false;
    }

    public static void main(String[] args) {
        Tenis juego = new Tenis();
        String[] secuenciaPuntos = {"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
        for (String punto : secuenciaPuntos) {
            juego.puntoPara(punto);
        }
    }
}