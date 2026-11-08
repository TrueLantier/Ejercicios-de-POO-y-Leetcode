package EjerciciosPrácticos.hilos;

public class EjSiete implements Runnable {
    Thread thread;
    int num;

    public EjSiete() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            num = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo " + thread.getName() + " interrumpido exitosamente.");
                System.out.println(num);
            }
        }
    }
}

/*
  EjSiete ej = new EjSiete();

        ej.thread.start();

        try {
            ej.thread.join(3000);
            System.out.println("Hilo " + Thread.currentThread().getName());
            ej.thread.interrupt();
            System.out.println(ej.thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("Hilo main interrumpido.");
        }

 */
