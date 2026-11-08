package EjerciciosPrácticos.hilos.productorconsumidor;

/*
  18. Productor-consumidor con buffer de un único slot: `poner()` y `tomar()` sincronizados con espera.
 */

public class Productor implements Runnable{
    public Thread thread;

    public Productor() {
        thread = new Thread(this, "Productor");
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            synchronized (Cliente.class) {
                poner();
                System.out.println("Hilo " + thread.getName() + " " + i + " " + Cliente.num);
                System.out.println(Cliente.estado);

                Cliente.class.notify();
                while (Cliente.estado.equals("Puesto")) {
                    try {
                        Cliente.class.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Error en el hilo " + thread.getName());
                    }
                }

            }
        }

//        Cliente.estado = "Puesto";
//        Cliente.class.notify();
    }

    public void iniciar() {
        thread.start();
    }

    public void poner() {
        ++Cliente.num;
        Cliente.estado = "Puesto";

    }
}

/*
        Productor p = new Productor();
        Consumidor c = new Consumidor();

        p.iniciar();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c.iniciar();

        try {

            Thread.sleep(3000);
            System.out.println(p.thread.isAlive());
            System.out.println(c.thread.isAlive());
            // p.thread.join();
            // c.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Error en algún hilo.");
        }

        System.out.println("Main finalizado.");
 */
