package EjerciciosPrácticos.hilos.productorconsumidor;

public class Consumidor implements Runnable{
    public Thread thread;

    public Consumidor() {
        thread = new Thread(this, "Consumidor");
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            tomar();
            System.out.println("Hilo " + thread.getName() + " " + i + " " + Cliente.num);
            System.out.println(Cliente.estado);

            notify();
            while (Cliente.estado.equals("Tomado")) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error en el hilo " + thread.getName());
                }
            }
        }
    }

    public synchronized void tomar() {
        --Cliente.num;
        Cliente.estado = "Tomado";
    }
}
