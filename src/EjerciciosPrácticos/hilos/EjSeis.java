package EjerciciosPrácticos.hilos;

public class EjSeis implements Runnable{
    Thread thread;

    public EjSeis() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Hilo " + Thread.currentThread().getName() + " terminó.");
        } catch (InterruptedException e) {
            System.out.println("Error en hilo: " + thread.getName());
        }
    }
}

/**
 *
 EjSeis ej = new EjSeis();

 ej.thread.start();

 try {
 Thread.currentThread().join(2000);
 } catch (InterruptedException e) {
 throw new RuntimeException(e);
 }

 if (ej.thread.isAlive()) {
 System.out.println("El hilo " + ej.thread.getName() + " sigue ejecutándose.");
 }
 */