package EjerciciosPrácticos.hilos.productorconsumidor;

/*
  18. Productor-consumidor con buffer de un único slot: `poner()` y `tomar()` sincronizados con espera.
  19. Productor-consumidor con buffer acotado (tu propia cola sobre `LinkedList`, capacidad N), varios
  productores y varios consumidores. Usa `notifyAll()` y demuestra con un caso concreto por qué `notify()`
  simple puede dejar hilos dormidos para siempre.

 */

public class Productor implements Runnable{
    public Thread thread;

    public Productor() {
        thread = new Thread(this, "Productor");
    }

    @Override
    public void run() {


        for (int i = 0; i < 5; i++) {
            poner();
            System.out.println("Hilo " + thread.getName() + " " + i + " " + Cliente.num);
            System.out.println(Cliente.estado);

            notify();
            while (Cliente.estado.equals("Puesto")) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Error en el hilo " + thread.getName());
                }
            }
        }

    }

    public void poner() {
        ++Cliente.num;
        Cliente.estado = "Puesto";
    }
}
