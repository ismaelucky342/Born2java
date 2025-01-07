
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
