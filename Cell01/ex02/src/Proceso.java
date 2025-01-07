class Process extends Thread {
    private String nameProceso;

    public Process(String nameProceso) {
        this.nameProceso = nameProceso;
    }

     @Override
    public void run() {

        System.out.println(nameProceso + " está ejecutandose ");

        try {
            System.out.println(nameProceso + " está durmiendo ");
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println("El proceso" + nameProceso + " ha muerto");
        }
        System.out.println(nameProceso + " ha terminado de ejecutarse ");
         long end = System.currentTimeMillis();
    }
}