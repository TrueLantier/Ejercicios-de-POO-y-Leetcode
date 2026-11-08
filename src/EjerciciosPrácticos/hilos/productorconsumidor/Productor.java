package EjerciciosPrácticos.hilos.productorconsumidor;

/*
  18. Productor-consumidor con buffer de un único slot: `poner()` y `tomar()` sincronizados con espera.
  19. Productor-consumidor con buffer acotado (tu propia cola sobre `LinkedList`, capacidad N), varios
  productores y varios consumidores. Usa `notifyAll()` y demuestra con un caso concreto por qué `notify()`
  simple puede dejar hilos dormidos para siempre.

 */

public class Productor implements Runnable{
    Thread thread;

    public Productor() {
        thread = new Thread(this, "Productor");
    }

    @Override
    public void run() {

    }

    public void poner() {
        ++Cliente.num;
        Cliente.estado = "Puesto";
    }
}
